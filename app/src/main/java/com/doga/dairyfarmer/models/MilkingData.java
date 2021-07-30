package com.doga.dairyfarmer.models;

import java.time.LocalDate;

public class MilkingData {
    private Cow cow;
    private LocalDate date;
    private int milkAmount; //in liters

    public MilkingData(){}

    public MilkingData(Cow cow, LocalDate date, int milkAmount) {
        this.cow = cow;
        this.date = date;
        this.milkAmount = milkAmount;
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getMilkAmount() {
        return milkAmount;
    }

    public void setMilkAmount(int milkAmount) {
        this.milkAmount = milkAmount;
    }
}
