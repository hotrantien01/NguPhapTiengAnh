package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class TuVungVaThanhNguVanHoa {
    ArrayList<ItemLession> arrayList;

    public TuVungVaThanhNguVanHoa(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "birthday", "sinh nhật", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "Britian", "Britian", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "buddhist", "Phật tử", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "busy", "bận rộn", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "Canada", "Nước Ca Na Đa", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "China", "Trung Hoa", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "Christian", "tín đồ Thiên Chúa Giáo", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "Christmas", "Giáng sinh", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "drunk", "say rượu", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "Europe", "Âu châu", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "foreign", "nước ngoài", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "France", "Nước Pháp", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "Germany", "nước Đức", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "government", "chính phủ", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "immigration", "di trú", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "Jewish", "Do thái", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "Mexican,", "người Mễ", R.raw.sound_punch));
        arrayList.add(new ItemLession(17, "Mexico,", "Mễ", R.raw.sound_sprinklers));
        arrayList.add(new ItemLession(18, "Muslim,", "tín đồ Hồi Giáo", R.raw.sound_doexercise));
        arrayList.add(new ItemLession(19, "Religion,", "tôn giáo", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(20, "Russia,", "nước Nga", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(21, "Russian,", "người Nga", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(22, "vegetables,", "rau quả", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(23, "wedding,", "đám cưới", R.raw.sound_flyakite));
        arrayList.add(new ItemLession(24, "anyone,", "bất cứ ai", R.raw.sound_flyakite));
    }
}
