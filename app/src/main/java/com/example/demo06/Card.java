package com.example.demo06;

public class Card {
    String name, address, name1, name2, name3, number1, number2, number3;
    int hinhAnh, nen;
    boolean icon1, icon2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getNumber3() {
        return number3;
    }

    public void setNumber3(String number3) {
        this.number3 = number3;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getNen() {
        return nen;
    }

    public void setNen(int nen) {
        this.nen = nen;
    }

    public boolean isIcon1() {
        return icon1;
    }

    public void setIcon1(boolean icon1) {
        this.icon1 = icon1;
    }

    public boolean isIcon2() {
        return icon2;
    }

    public void setIcon2(boolean icon2) {
        this.icon2 = icon2;
    }

    public Card(String name, String address, String name1, String name2, String name3, String number1, String number2, String number3, int hinhAnh, int nen, boolean icon1, boolean icon2) {
        this.name = name;
        this.address = address;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.hinhAnh = hinhAnh;
        this.nen = nen;
        this.icon1 = icon1;
        this.icon2 = icon2;

    }
}