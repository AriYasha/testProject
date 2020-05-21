package com.com.mixMindDao;

import com.entity.RoomsEntity;

import java.util.List;

public interface IRoom {
    void insertNewRoom(RoomsEntity roomEntity);

    int getIdCountryByNameRoom(String name);

    boolean setStateTheLight(int state, String roomName);

    int getStateTheLight(String roomName);

    List<String> getAllNamesRooms();


}
