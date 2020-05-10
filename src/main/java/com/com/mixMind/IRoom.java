package com.com.mixMind;

import com.entity.RoomsEntity;

public interface IRoom {
    void insertNewRoom(RoomsEntity roomEntity);
    int selectIdCountryByNameRoom(String name);
}
