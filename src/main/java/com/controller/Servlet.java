package com.controller;

import com.com.mixMind.GeoIpImpl;
import com.com.mixMind.RoomImpl;
import com.entity.RoomsEntity;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CountryResponse;
import com.maxmind.geoip2.record.Country;
import com.webUtils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

@Controller
public class Servlet {

    @Autowired
    GeoIpImpl geoIp;

    @Autowired
    WebUtils webUtils;

    @Autowired
    RoomImpl room;



    @RequestMapping(value = "/")
    public  String getPage(Model model){
        System.out.println("dgfrhgf");

        List<String> allCountryNames = geoIp.selectAllCountryNames();
        for(String string:allCountryNames){
        System.out.println(string);}
        String ipAddress= WebUtils.getClientIp();
        System.out.println(ipAddress);
        DatabaseReader reader;
        int i= geoIp.getIdByCountryName("Belarus");
        System.out.println(i);
        RoomsEntity roomsEntity = new RoomsEntity("моя",i,(byte)1);
        room.insertNewRoom(roomsEntity);
        try {
            File dbFile = new File("D:\\Programming Java\\testTask\\src\\main\\resources\\GeoLite2-Country_20200414\\GeoLite2-Country.mmdb");
            reader = new DatabaseReader.Builder(dbFile).build();

            InetAddress ia = InetAddress.getByName("91.149.128.0");
            CountryResponse response = reader.country(ia);

            Country country = response.getCountry();
            String name=country.getName();

            Map<String, String> map = country.getNames();
            for (Map.Entry<String, String> entry:map.entrySet() ) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
            System.out.println(name);
        }
        catch (UnknownHostException ue){
            System.out.println(ue.toString()+"exception in unknown");

        } catch (IOException io){
            System.out.println(io.toString()+"exception in file");
        } catch (GeoIp2Exception ge){
            System.out.println(ge.toString()+"exception in geo");
        }
        model.addAttribute("allCountryNames",allCountryNames);
        return "index";

    }


    @RequestMapping (value = "/richest",method=RequestMethod.POST)
    public String getWork(@RequestParam("choiceCountry") String country){
        System.out.println(country);
        return "index";
    }
}
