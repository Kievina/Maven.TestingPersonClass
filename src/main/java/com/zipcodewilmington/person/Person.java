package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private String address;
    private String eyecolor;
    private String username;
    private String height;
    private String cell;
    private int age;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.address = "";
        this.eyecolor = "";
        this.username = "";
        this.height = "";
        this.cell = "";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, String address, String eyecolor, String username, String height, String cell) {
        this.name = name;
        this.address = address;
        this.eyecolor = eyecolor;
        this.username = username;
        this.height = height;
        this.cell = cell;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) { this.address = address;}
    public void setEyeColor(String eyecolor) { this.eyecolor = eyecolor;}
    public void setUsername(String username) { this.username = username;}
    public void setHeight(String height) { this.height = height;}
    public void setCell(String cell) { this.cell = cell;}


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getHeight() {
        return height;
    }


    public String getEyeColor() {
        return eyecolor;
    }

    public String getCell() {
        return cell;
    }
}
