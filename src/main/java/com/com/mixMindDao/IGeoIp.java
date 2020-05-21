package com.com.mixMindDao;

import java.util.List;

public interface IGeoIp {
    List<String> selectAllCountryNames();

    int getIdByCountryName(String nameCountry);

    String getNameById(int id);
}
