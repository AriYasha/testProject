package com.com.mixMind;

import com.entity.RoomsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoomImpl implements IRoom {
    @Autowired
    SessionFactory sessionFactory;

    public RoomImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void insertNewRoom(RoomsEntity roomsEntity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(roomsEntity);
        transaction.commit();
        session.close();

    }

    @Override
    public int selectIdCountryByNameRoom(String name) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT idCountry from RoomsEntity where roomName=:name");
        query.setParameter("name",name);
        List list= query.list();
        int id = (int)list.get(0);
        return id ;
    }

}
