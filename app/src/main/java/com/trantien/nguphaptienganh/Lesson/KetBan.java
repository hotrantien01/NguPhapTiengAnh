package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class KetBan {
    ArrayList<ItemLession> arrayList;

    public KetBan(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "alone", "một mình", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "American", "người Mỹ", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "aunt", "dì, cô", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "beautiful", "đẹp", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "boy", "cậu con trai", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "boyfriend", "bạn trai", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "brother", "anh, em trai", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "child", "đứa trẻ", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "children", "những đứa trẻ", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "date", "ngày tháng", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "daughter", "con gái", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "everybody", "mọi người", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "expert", "chuyên gia", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "family", "gia đình", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "father", "cha", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "foreigner", "người nước ngoài", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "friend", "bạn", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "girl", "cô gái", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "girlfriend", "bạn gái", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "grandfather", "ông nội", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "grandmother", "bà nội", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "group", "nhóm", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "he", "anh ta", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "husband", "chồng", R.raw.sound_pull));
        arrayList.add(new ItemLession(24, "man", "đàn ông", R.raw.sound_push));
        arrayList.add(new ItemLession(25, "meeting", "buổi họp", R.raw.sound_run));
        arrayList.add(new ItemLession(26, "Miss", "cô", R.raw.sound_sit));
        arrayList.add(new ItemLession(27, "Mister", "ông", R.raw.sound_throw));
        arrayList.add(new ItemLession(28, "mother", "mẹ", R.raw.sound_walk));
        arrayList.add(new ItemLession(29, "Mrs", "bà", R.raw.sound_walk));
        arrayList.add(new ItemLession(30, "neighbor", "láng giềng", R.raw.sound_walk));
        arrayList.add(new ItemLession(31, "parents", "cha mẹ", R.raw.sound_walk));
        arrayList.add(new ItemLession(32, "party", "bữa tiệc", R.raw.sound_walk));
        arrayList.add(new ItemLession(33, "people", "người", R.raw.sound_walk));
        arrayList.add(new ItemLession(34, "secret", "bí mật", R.raw.sound_walk));
        arrayList.add(new ItemLession(35, "sister", "nữ tu sĩ", R.raw.sound_walk));
        arrayList.add(new ItemLession(36, "son", "co trai", R.raw.sound_pull));
        arrayList.add(new ItemLession(37, "together", "cùng nhau", R.raw.sound_push));
        arrayList.add(new ItemLession(38, "unmarried", "chưa có gia đình", R.raw.sound_run));
        arrayList.add(new ItemLession(39, "usually", "thường xuyên", R.raw.sound_sit));
        arrayList.add(new ItemLession(40, "wife", "vợ", R.raw.sound_throw));
        arrayList.add(new ItemLession(41, "women", "những người phụ nữ", R.raw.sound_walk));
        arrayList.add(new ItemLession(42, "action", "hành động", R.raw.sound_walk));
    }
}
