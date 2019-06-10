package me.master.springfive.data;

public enum Gender {

    MALE("男"),
    FEMALE("女"),
    UNKNOWN("Unknown");

    private String value;

    Gender(String value) {
        this.value = value;
    }

}
