package com.trantien.nguphaptienganh.Model;

import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;
public class DanhMucReview {
    ArrayList<ItemMain> arrayList;

    public DanhMucReview(ArrayList<ItemMain> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemMain(0, R.drawable.medicine, "Vocabulary 1 to 10"));
        arrayList.add(new ItemMain(1, R.drawable.book, "Vocabulary 11 to 20"));
        arrayList.add(new ItemMain(2, R.drawable.conversation, "Vocabulary 21 to 30"));
        arrayList.add(new ItemMain(3, R.drawable.worker, "Vocabulary 31 to 40"));
        arrayList.add(new ItemMain(4, R.drawable.sunny, "Vocabulary 41 to 50"));
        arrayList.add(new ItemMain(5, R.drawable.email, "Vocabulary 51 to 60"));
        arrayList.add(new ItemMain(6, R.drawable.shopping, "Vocabulary 61 to 70"));
        arrayList.add(new ItemMain(7, R.drawable.console, "Vocabulary 71 to 80"));
        arrayList.add(new ItemMain(8, R.drawable.high, "Vocabulary 81 to 90"));
        arrayList.add(new ItemMain(9, R.drawable.diet, "Vocabulary 91 to 100"));
        arrayList.add(new ItemMain(10, R.drawable.house, "Vocabulary 101 to 110"));
        arrayList.add(new ItemMain(11, R.drawable.calendar, "Vocabulary 111 to 120"));
        arrayList.add(new ItemMain(12, R.drawable.smartphone, "Vocabulary 121 to 130"));
        arrayList.add(new ItemMain(13, R.drawable.map, "Vocabulary 131 to 140"));
        arrayList.add(new ItemMain(14, R.drawable.money, "Vocabulary 141 to 150"));
        arrayList.add(new ItemMain(15, R.drawable.airplane, "Vocabulary 151 to 160"));
        arrayList.add(new ItemMain(16, R.drawable.greeting, "Vocabulary 161 to 170"));
        arrayList.add(new ItemMain(17, R.drawable.open, "Vocabulary 171 to 180"));
        arrayList.add(new ItemMain(18, R.drawable.medicine, "Vocabulary 181 to 190"));
        arrayList.add(new ItemMain(19, R.drawable.book, "Vocabulary 191 to 200"));
        arrayList.add(new ItemMain(20, R.drawable.worker, "Vocabulary 201 to 210"));
        arrayList.add(new ItemMain(21, R.drawable.sunny, "Vocabulary 211 to 220"));
        arrayList.add(new ItemMain(22, R.drawable.email, "Vocabulary 221 to 230"));
        arrayList.add(new ItemMain(23, R.drawable.shopping, "Vocabulary 231 to 240"));
        arrayList.add(new ItemMain(24, R.drawable.console, "Vocabulary 241 to 250"));
        arrayList.add(new ItemMain(25, R.drawable.high, "Vocabulary 251 to 260"));
        arrayList.add(new ItemMain(26, R.drawable.diet, "Vocabulary 261 to 270"));
        arrayList.add(new ItemMain(27, R.drawable.house, "Vocabulary 271 to 280"));
        arrayList.add(new ItemMain(28, R.drawable.calendar, "Vocabulary 281 to 290"));
        arrayList.add(new ItemMain(29, R.drawable.smartphone, "Vocabulary 291 to 300"));
        arrayList.add(new ItemMain(30, R.drawable.map, "Vocabulary 301 to 310"));
        arrayList.add(new ItemMain(31, R.drawable.money, "Vocabulary 311 to 320"));
        arrayList.add(new ItemMain(32, R.drawable.airplane, "Vocabulary 321 to 330"));
        arrayList.add(new ItemMain(33, R.drawable.greeting, "Vocabulary 331 to 340"));
        arrayList.add(new ItemMain(34, R.drawable.open, "Vocabulary 341 to 350"));
    }
}
