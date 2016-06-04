package com.myCompany;

/**
 * Created by oguzhan on 4.06.2016.
 */
public class MavenTestClass {

    public static final String TEST = "Test is finished successfully";

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getTEST() {

        return TEST;
    }

    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MavenTestClass(String name) {
        this.name = name;
    }
}