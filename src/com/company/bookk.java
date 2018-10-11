package com.company;

public class bookk {

    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;
    protected static int count = 0;

    public bookk(){
title= "";
author="";
description="";
price=0;
}
    @Override
    public String toString() {
        return "title:               " + title + "\n" +
                "author              " + author + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
        return String.format("$%f", price);
        // Use the NumberFormat class to format the price to 2 decimal places
    }
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        bookk.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return getFormattedPrice();
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
