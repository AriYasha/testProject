package com.controller;

import com.com.mixMindDao.GeoIpImpl;
import com.com.mixMindDao.IGeoIp;
import com.com.mixMindDao.IRoom;
import com.com.mixMindDao.RoomImpl;
import com.entity.RoomsEntity;
import com.webUtils.Data;
import com.webUtils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Servlet {

    @Autowired
    GeoIpImpl geoIp;

    @Autowired
    WebUtils webUtils;

    @Autowired
    RoomImpl room;

   @Autowired
    Data data;




    @RequestMapping(value = "/")
    public String getPage(Model model) {
        List<String> allNamesRooms = room.getAllNamesRooms();
        model.addAttribute("allNamesRooms", allNamesRooms);
        return "index";
    }

    @RequestMapping(value = "/createRoom", method = RequestMethod.GET)
    public String createRoom(Model model) {
        List<String> allCountryNames = geoIp.selectAllCountryNames();
        model.addAttribute("allCountryNames", allCountryNames);
        return "createRoom";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String getWork(@RequestParam("name") String name, @RequestParam("choiceCountry") String choiceCountry, Model model) {
        int idCountry = geoIp.getIdByCountryName(choiceCountry);
        List<String> allNamesRooms = room.getAllNamesRooms();
        if (!allNamesRooms.contains(name)) {
            RoomsEntity roomsEntity = new RoomsEntity(name, idCountry, 0);
            room.insertNewRoom(roomsEntity);
            model.addAttribute("message", "record was added");
        } else {
            model.addAttribute("message", "The name already exists.Try again");
        }
        List<String> allCountryNames = geoIp.selectAllCountryNames();
        model.addAttribute("allCountryNames", allCountryNames);
        return "createRoom";
    }

    @RequestMapping(value = "/seeDetails", method = RequestMethod.GET)
    public String getDetails(@RequestParam("choiceRoom") String nameRoom, Model model) {
        String page = "detailsAboutRoom";
        String message = null;
        String ipAddress = WebUtils.getClientIp();
        System.out.println(ipAddress);
        String countryName = data.getCountryByIp(ipAddress);
        System.out.println(countryName);
        int idCountry = room.getIdCountryByNameRoom(nameRoom);
        String country = geoIp.getNameById(idCountry);
        if (!country.equals(countryName)) {
            page = "index";
            model.addAttribute("access", "you don't have access");
        } else if (room.getStateTheLight(nameRoom) == 1) {
            message = "the light is on";
        } else {
            message = "the light is off";
        }
        model.addAttribute("message", message);
        model.addAttribute("choiceRoom", nameRoom);
        List<String> allNamesRooms = room.getAllNamesRooms();
        model.addAttribute("allNamesRooms", allNamesRooms);
        return page;
    }


    @RequestMapping(value = "/onTheLight", method = RequestMethod.POST)
    public @ResponseBody
    String onTheLight(@RequestParam("nameRoom") String nameRoom) {
        room.setStateTheLight(1, nameRoom);

        String result = "<h3>\"the light is on\"<h3>";
        return result;
    }

    @RequestMapping(value = "/offTheLight", method = RequestMethod.POST)
    public @ResponseBody
    String offTheLight(@RequestParam("nameRoom") String nameRoom) {
        room.setStateTheLight(0, nameRoom);

        String result = "<h3>\"the light is off\"<h3>";
        return result;
    }

    @RequestMapping(value = "/getStateTheLight", method = RequestMethod.POST)
    public @ResponseBody
    String getStateTheLight(@RequestParam("nameRoom") String nameRoom) {
        String result;
        if (room.getStateTheLight(nameRoom) == 1) {
            result = "<h3>\"the light is on\"<h3>";
        } else {
            result = "<h3>\"the light is off\"<h3>";

        }
        return result;
    }

    @RequestMapping(value = "/goBack", method = RequestMethod.GET)
    public String getMainPage(Model model) {
        List<String> allNamesRooms = room.getAllNamesRooms();
        model.addAttribute("allNamesRooms", allNamesRooms);
        return "index";

    }

}

