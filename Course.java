package model;

import java.util.Map;
import java.util.HashMap;

public class Course {
    int code;
    String description;
    int credit;
    int ID;
    String name;

    public Course(int code, String description, int credit, int ID, String name) {
        this.code = code;
        this.description = description;
        this.credit = credit;
        this.ID = ID;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args){

    }
}
