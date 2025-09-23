package com.example.uccexample.domain.dto;

public class ReservationDTO {
    
    private String startDate;
    private String endDate;
    private ClientDTO client;
    private RoomDTO room;
    private Long idReservation;
    

    public String getStartDate() {
        return startDate;
    }   
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ClientDTO getClient() {
        return client;
    }
    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public RoomDTO getRoom() {
        return room;
    }
    public void setRoom(RoomDTO room) {
        this.room = room;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }


}
