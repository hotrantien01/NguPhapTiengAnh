package com.trantien.nguphaptienganh.Model;

public class ItemLession {

    public ItemLession(Integer id, String eng, String vie, int file) {
        this.id = id;
        this.eng = eng;
        this.vie = vie;
        this.file = file;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getVie() {
        return vie;
    }

    public void setVie(String vie) {
        this.vie = vie;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    Integer id;
    String eng;
    String vie;
    int file;
}
