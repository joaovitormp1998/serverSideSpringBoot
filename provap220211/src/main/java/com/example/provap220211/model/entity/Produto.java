package com.example.provap220211.model.entity;

public class Produto {

    private Integer id;
    private String name;
    private String img;
    private float odPrice;
    private float price;
    private String description;

    public Installments getInstallments() {
        return installments;
    }

    public void setInstallments(Installments installments) {
        this.installments = installments;
    }

    private Installments installments;
    public int getCodigo_installments() {
        return codigo_installments;
    }

    public void setCodigo_installments(int codigo_installments) {
        this.codigo_installments = codigo_installments;
    }

    private int codigo_installments;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public float getOdPrice() {
        return odPrice;
    }

    public void setOdPrice(float odPrice) {
        this.odPrice = odPrice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

 }