package com.testDao;

import com.com.mixMindDao.IRoom;
import com.config.Config;
import com.entity.RoomsEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.TestTransaction;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {Config.class})
@WebAppConfiguration

@Transactional
public class RoomImplTest {

    @Autowired
    IRoom room;

    @Test
    @Transactional
    public void insertNewRoom() {
        RoomsEntity roomsEntity = new RoomsEntity("moon",39,0);
        room.insertNewRoom(roomsEntity);
        assertTrue(TestTransaction.isActive());
    }

    @Test
    public void getIdCountryByNameRoom() {
      int idCountry = room.getIdCountryByNameRoom("spring");
      assertEquals(39,idCountry);
    }

    @Test
    @Transactional
    @Rollback
    public void setStateTheLight() {
        boolean state =  room.setStateTheLight(0,"sun");
        System.out.println(state);
        assertTrue(TestTransaction.isFlaggedForRollback ());
    }

    @Test
    public void getStateTheLight() {
        int state = room.getStateTheLight("summer");
        assertEquals(0,state);

    }

    @Test
    public void getAllNamesRooms() {
        List<String> nameRooms = room.getAllNamesRooms();
        String nameRoom = nameRooms.get(0);
        assertEquals("sun",nameRoom);

    }
}