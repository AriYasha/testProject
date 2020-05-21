package com.com.mixMindDao;

import com.entity.RoomsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoomImpl implements IRoom {
    @Autowired
    SessionFactory sessionFactory;

    public RoomImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public void insertNewRoom(RoomsEntity roomsEntity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(roomsEntity);
        transaction.commit();
        session.close();

    }

    @Override
    public int getIdCountryByNameRoom(String name) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT idCountry from RoomsEntity where roomName=:name");
        query.setParameter("name", name);
        List list = query.list();
        int id = (int) list.get(0);
        return id;
    }

    @Override
    @Transactional
    public boolean setStateTheLight(int state, String roomName) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("UPDATE  RoomsEntity set state=:state where  roomName=:roomName");
        query.setParameter("state", state);
        query.setParameter("roomName", roomName);
        query.executeUpdate();
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public int getStateTheLight(String roomName) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select state from RoomsEntity where roomName=:roomName");
        query.setParameter("roomName", roomName);
        List list = query.list();
        int state = (int) list.get(0);
        return state;

    }

    @Override
    public List<String> getAllNamesRooms() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("Select roomName FROM RoomsEntity ");
        List results = query.list();
        return results;

    }


}
