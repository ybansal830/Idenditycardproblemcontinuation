package com.myfirst.idcardproblem;

public class IdentityCardModel {
    private String title;
    private int imageId;
    private int age;
    private String profession;

    public IdentityCardModel(String title, int imageId, int age, String profession) {
        this.title = title;
        this.imageId = imageId;
        this.age = age;
        this.profession = profession;
    }

    public String getTitle() {
        return title;
    }

    public int getImageId() {
        return imageId;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
}
