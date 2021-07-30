package com.doga.dairyfarmer.models;

import java.time.LocalDate;

public class Bull extends Cattle{
    public Bull(){}

    public Bull(long tagNumber, String name, LocalDate birthdate, Cattle mother, Cattle father) {
        super(tagNumber,name,birthdate,mother,father);
    }
}
