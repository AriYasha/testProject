package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rooms", schema = "mixmind", catalog = "")
public class RoomsEntity {
    private int idRoom;
    private String roomName;
    private byte condition;
    private int idCountry;
   // private GeoipEntity geoipByIdCountry;


    public RoomsEntity(){

    }

    public  RoomsEntity (String roomName, int idCountry, byte condition){
        this.roomName=roomName;
        this.idCountry=idCountry;
        this.condition=condition;

    }
    @Id
    @Column(name = "idRoom", nullable = false)
    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    @Basic
    @Column(name = "roomName", nullable = false, length = 45)
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Basic
    @Column(name = "condition", nullable = false)
    public byte getCondition() {
        return condition;
    }

    public void setCondition(byte condition) {
        this.condition = condition;
    }



//    public int getIdCountry() {
//        return idCountry;
//    }
//
//    public void setIdCountry(int idCountry) {
//        this.idCountry = idCountry;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomsEntity that = (RoomsEntity) o;
        return idRoom == that.idRoom &&
                condition == that.condition &&
                Objects.equals(roomName, that.roomName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idRoom, roomName, condition);
    }

    //@ManyToOne
    @JoinColumn(name = "idCountry", referencedColumnName = "id_country", nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }
}
