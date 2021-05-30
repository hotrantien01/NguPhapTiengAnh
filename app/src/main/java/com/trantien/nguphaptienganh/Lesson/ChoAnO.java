package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class ChoAnO {
    ArrayList<ItemLession> arrayList;

    public ChoAnO(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "bed", "giường", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "bedroom", "phòng ngủ", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "closed", "đã đóng", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "comfortable", "thiện nghi, thoải mái", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "elevator", "thang máy", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "full", "đầy", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "guest", "khách mời", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "gym", "phòng tập thể dục", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "hotel", "khách sạn", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "key", "chìa khóa", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "keys", "những chìa khóa", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "large", "rộng", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "laundromat", "tiệm cho thuê máy giặt", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "leather", "da thuộc", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "luggage", "hành lý", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "non-smoking", "không hút thuốc", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "occupied", "bị chiếm", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "pillow", "gối", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "power", "sức lực", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "quality", "phẩm chất", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "razor", "dao cạo", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "room", "phòng", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "sand", "cát", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "several", "vài", R.raw.sound_pull));
        arrayList.add(new ItemLession(24, "silent", "yên lặng", R.raw.sound_walk));
        arrayList.add(new ItemLession(25, "towel", "khăn tắm", R.raw.sound_walk));
        arrayList.add(new ItemLession(26, "vacant", "trống rỗng", R.raw.sound_walk));
        arrayList.add(new ItemLession(27, "woods", "rừng", R.raw.sound_walk));
        arrayList.add(new ItemLession(28, "appetizers", "món khai vị", R.raw.sound_walk));
    }
}
