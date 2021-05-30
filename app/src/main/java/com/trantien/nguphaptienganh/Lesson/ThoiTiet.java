package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class ThoiTiet {
    ArrayList<ItemLession> arrayList;

    public ThoiTiet(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "appear", "xuất hiện", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "cloudy", "có mây", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "cold", "lạnh", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "dark", "tối", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "fall", "rơi", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "fog", "sương mù", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "gray", "xám", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "heat", "sức nóng", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "hot", "nóng", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "ice", "nước đá", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "lawyer", "luật sư", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "moon", "mặt trăng", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "rain", "mưa", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "rain", "cơn mưa", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "season", "mùa", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "snow", "tuyết", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "stars,", "ngôi sao", R.raw.sound_punch));
        arrayList.add(new ItemLession(17, "sun,", "mặt trời", R.raw.sound_sprinklers));
        arrayList.add(new ItemLession(18, "sunny,", "nắng", R.raw.sound_doexercise));
        arrayList.add(new ItemLession(19, "temperature,", "nhiệt độ", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(20, "warm,", "ấm", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(21, "weather,", "thời tiết", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(22, "wet,", "ướt", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(23, "wind,", "gió", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(24, "windy,", "có gió", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(25, "winter,", "mùa đông", R.raw.sound_flyakite));
    }
}
