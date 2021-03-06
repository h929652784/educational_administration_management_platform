package com.qf.model;

public class Student {
    private String stu_id;
    private String stu_name;
    private String stu_birthday;
    private Integer stu_card;
    private String stu_address;
    private Integer stu_phone;
    private Integer stu_number;
    private String stu_class;
    private String stu_major;
    private String stu_pwd;
    private Integer state;
    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_birthday() {
        return stu_birthday;
    }

    public void setStu_birthday(String stu_birthday) {
        this.stu_birthday = stu_birthday;
    }

    public Integer getStu_card() {
        return stu_card;
    }

    public void setStu_card(Integer stu_card) {
        this.stu_card = stu_card;
    }

    public String getStu_address() {
        return stu_address;
    }

    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }

    public Integer getStu_phone() {
        return stu_phone;
    }

    public void setStu_phone(Integer stu_phone) {
        this.stu_phone = stu_phone;
    }

    public Integer getStu_number() {
        return stu_number;
    }

    public void setStu_number(Integer stu_number) {
        this.stu_number = stu_number;
    }

    public String getStu_class() {
        return stu_class;
    }

    public void setStu_class(String stu_class) {
        this.stu_class = stu_class;
    }

    public String getStu_major() {
        return stu_major;
    }

    public void setStu_major(String stu_major) {
        this.stu_major = stu_major;
    }

    public String getStu_pwd() {
        return stu_pwd;
    }

    public void setStu_pwd(String stu_pwd) {
        this.stu_pwd = stu_pwd;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", stu_birthday='" + stu_birthday + '\'' +
                ", stu_card=" + stu_card +
                ", stu_address='" + stu_address + '\'' +
                ", stu_phone=" + stu_phone +
                ", stu_number=" + stu_number +
                ", stu_class='" + stu_class + '\'' +
                ", stu_major='" + stu_major + '\'' +
                ", stu_pwd='" + stu_pwd + '\'' +
                ", state=" + state +
                '}';
    }
}