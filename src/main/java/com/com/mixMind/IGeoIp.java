package com.com.mixMind;

import java.util.List;

public interface IGeoIp {
    List<String> selectAllCountryNames();
    int getIdByCountryName(String nameCountry);
}
