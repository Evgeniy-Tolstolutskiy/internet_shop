package com.epam.tolstolutskyi.task9.model.domain;

public class Good {
    private int id;
    private double price;
    private String name;
    private String consumer;
    private String category;
    private String ImagePath;

    public boolean equals(Object obj) {
        Good good;
        if (obj instanceof Good) {
            good = (Good) obj;
            return id == good.getId();
        }
        return false;
    }

    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

}
