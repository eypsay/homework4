package com.kodlama.io.homework4.entities.concretes;

public class ProgLanguage {
    private int id;
    private String name;

    public ProgLanguage() {
    }

    public ProgLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
