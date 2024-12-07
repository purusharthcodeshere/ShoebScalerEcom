package com.scalerecom.scalerecom.Models;

public class Product {
    private long productId;
    private String title;
    private String description;
    private Catagory category;
    private double price;
    private String image_url;

    public Product(){
    }

    public Product(long productId, String title, String description, Catagory category, double price, String image_url) {
        this.productId = productId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
        this.image_url = image_url;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}