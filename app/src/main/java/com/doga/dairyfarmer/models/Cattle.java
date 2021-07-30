package com.doga.dairyfarmer.models;

import android.graphics.fonts.Font;

import java.time.LocalDate;

public class Cattle {
    private long tagNumber;
    private String name;
    private LocalDate birthdate;
    private Cattle mother;
    private Cattle father;
    // isCalf
    // satıldı/kesildi
    // fotoğraf

    public Cattle(){}

    public Cattle(long tagNumber,String name,LocalDate birthdate,Cattle mother,Cattle father) {
        this.tagNumber = tagNumber;
        this.name = name;
        this.birthdate = birthdate;
        this.mother = mother;
        this.father = father;
    }

    public long getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(long tagNumber) {
        this.tagNumber = tagNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Cattle getMother() {
        return mother;
    }

    public void setMother(Cattle mother) {
        this.mother = mother;
    }

    public Cattle getFather() {
        return father;
    }

    public void setFather(Cattle father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Cattle{" +
                "tagNumber=" + tagNumber +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }
}
