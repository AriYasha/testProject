package com.com.mixMind;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GeoIpImpl implements  IGeoIp {

    public GeoIpImpl (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<String> selectAllCountryNames() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("Select countryName FROM GeoipEntity ");
        List results = query.list();
        return results;

    }

    @Override
    public int getIdByCountryName(String nameCountry){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT idCountry from GeoipEntity where countryName=:nameCountry");
        query.setParameter("nameCountry", nameCountry);
        List list= query.list();
        int id = (int)list.get(0);
        return  id;
    }
}
