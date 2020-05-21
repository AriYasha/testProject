package com.com.mixMindDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoIpImpl implements IGeoIp {

    public GeoIpImpl(SessionFactory sessionFactory) {
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
    public int getIdByCountryName(String nameCountry) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT idCountry from GeoipEntity where countryName=:nameCountry");
        query.setParameter("nameCountry", nameCountry);
        List list = query.list();
        int id = (int) list.get(0);
        return id;
    }

    @Override
    public String getNameById(int id) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("Select countryName from GeoipEntity where idCountry=:id");
        query.setParameter("id", id);
        List list = query.list();
        String countryName = (String) list.get(0);
        return countryName;
    }
}
