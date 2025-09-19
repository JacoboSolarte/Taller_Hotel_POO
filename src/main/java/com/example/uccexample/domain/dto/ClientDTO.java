package com.example.uccexample.domain.dto;

public class ClientDTO {

    private String name;
    private int identification;
    private int phone;
    private Long id;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   

    public int getIdentification() {
        return identification;
    }
    public void setIdentification(int identification) {
        this.identification = identification;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
}
