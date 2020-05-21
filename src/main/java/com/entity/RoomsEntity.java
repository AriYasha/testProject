package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rooms", schema = "mixmind", catalog = "")
public class RoomsEntity {
    private int idRoom;
    private String roomName;
    private int state;
    private int idCountry;


    public RoomsEntity() {

    }

    public RoomsEntity(String roomName, int idCountry, int state) {
        this.roomName = roomName;
        this.idCountry = idCountry;
        this.state = state;

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
    @Column(name = "state", nullable = true)
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomsEntity that = (RoomsEntity) o;
        return idRoom == that.idRoom &&
                state == that.state &&
                Objects.equals(roomName, that.roomName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idRoom, roomName, state);
    }


    @JoinColumn(name = "idCountry", referencedColumnName = "id_country", nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }
}
