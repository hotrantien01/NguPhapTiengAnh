package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class An {
    ArrayList<ItemLession> arrayList;

    public An(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "apple", "táo", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "banana", "chuối", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "bar", "quầy bán rượu", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "bean", "đậu", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "beef", "thịt bò", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "beer", "bia", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "bill", "hóa đơn", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "bottle", "chai", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "bowl", "bát, tô", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "bread", "bánh mì", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "breakfast", "điểm tâm", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "butter", "bơ", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "cabbage", "cải bắp", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "cafe", "quán ăn", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "cake", "bánh ngọt", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "candy", "kẹo", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "cheese", "phó mát", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "chicken", "gà", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "chocolate", "sô cô la", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "coffee", "cà phê", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "container", "thùng chứa", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "cook", "nấu ăn", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "corn", "ngô, bắp", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "cup", "tách", R.raw.sound_pull));
    }
}
