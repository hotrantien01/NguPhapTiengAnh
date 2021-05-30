package com.trantien.nguphaptienganh.Model;

public class ItemMain {
    public ItemMain(Integer id, Integer img, String name) {
        this.id = id;
        this.img = img;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ItemLession{" +
                "id=" + id +
                ", img=" + img +
                ", name='" + name + '\'' +
                '}';
    }

    Integer id;
    Integer img;
    String name;

}
