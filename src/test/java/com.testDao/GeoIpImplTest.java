package com.testDao;

import com.com.mixMindDao.IGeoIp;
import com.config.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {Config.class})
@WebAppConfiguration
public class GeoIpImplTest {

    @Autowired
    IGeoIp geoIp;

    @Test
    public void selectAllCountryNames() {
       List<String> allCountryNames = geoIp.selectAllCountryNames();
       String nameCountry = allCountryNames.get(0);
       assertEquals("Rwanda",nameCountry);

    }

    @Test
    public void getIdByCountryName() {
       int id = geoIp.getIdByCountryName("Belarus");
       assertEquals(39,id);
    }

    @Test
    public void getNameById() {
        String nameCountry = geoIp.getNameById(39);
        assertEquals("Belarus",nameCountry);
    }
}