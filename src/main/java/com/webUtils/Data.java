package com.webUtils;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CountryResponse;
import com.maxmind.geoip2.record.Country;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Data {


    public String getCountryByIp(String ipAddress) {
        DatabaseReader reader;
        String nameCountry = null;
        if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
            nameCountry = "Belarus";
        } else {
            try {

                File dbFile = new ClassPathResource("GeoLite2-Country_20200414/GeoLite2-Country.mmdb").getFile();
                reader = new DatabaseReader.Builder(dbFile).build();

                InetAddress ia = InetAddress.getByName(ipAddress);
                CountryResponse response = reader.country(ia);

                Country countryFromDb = response.getCountry();
                nameCountry = countryFromDb.getName();
                System.out.println(nameCountry);
            } catch (UnknownHostException ue) {
                System.out.println(ue.toString() + "exception in unknown");
            } catch (IOException io) {
                System.out.println(io.toString() + "exception in file");
            } catch (GeoIp2Exception ge) {
                System.out.println(ge.toString() + "exception in geo");
            }

        }
        return nameCountry;


    }
}
