package com.example.obada.telegram;


 class Model {
    public String name;
    private String mail;
    private String image;
    private String date;

    public Model() {
    }

     Model(String name,String mail,String image ,String date) {
        this.name = name;
        this.mail = mail;
        this.image = image;
        this.date=date;
    }

    public Model(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

     String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

     String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
