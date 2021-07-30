package com.doga.dairyfarmer.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cow extends Cattle{
    private boolean isPregnant;
    private LocalDate pregnancyStartDate;
    private List<Cattle> calves;
    // is a Heifer
    private List<LocalDate> inseminationDates;

    public Cow(){}

    public Cow(long tagNumber, String name, LocalDate birthdate, Cattle mother, Cattle father) {
        super(tagNumber,name,birthdate,mother,father);
        this.isPregnant = false;
        this.calves = new ArrayList<Cattle>();
        this.inseminationDates = new ArrayList<LocalDate>();
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    public LocalDate getPregnancyStartDate() {
        return pregnancyStartDate;
    }

    public void setPregnancyStartDate(LocalDate pregnancyStartDate) {
        this.pregnancyStartDate = pregnancyStartDate;
    }

    public List<Cattle> getCalves() {
        return calves;
    }

    public void setCalves(List<Cattle> calves) {
        this.calves = calves;
    }

    public List<LocalDate> getInseminationDates() {
        return inseminationDates;
    }

    public void setInseminationDates(List<LocalDate> inseminationDates) {
        this.inseminationDates = inseminationDates;
    }
}
