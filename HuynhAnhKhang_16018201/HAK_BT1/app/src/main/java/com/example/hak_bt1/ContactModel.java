package com.example.hak_bt1;

public class ContactModel {
    private String name;
    private String phone;
    private int image;

    public ContactModel(String name, String phone, int image) {
        this.phone = phone;
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
