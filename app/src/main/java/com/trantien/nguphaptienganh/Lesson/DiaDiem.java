package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class DiaDiem {
    ArrayList<ItemLession> arrayList;

    public DiaDiem(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "back", "trở lại", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "behind", "phía sau", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "below", "dưới", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "between", "giữa", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "center", "trung tâm", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "downstairs", "dưới lầu", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "downtown", "phố", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "front", "phía trước", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "here", "ở đây", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "inside", "bên trong", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "jail", "nhà tù", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "near", "gần", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "nearby", "gần đây", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "on", "trên", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "opposite", "đối diện", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "outside", "bên ngoài", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "over", "trên", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "there", "ở đó", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "top", "đỉnh", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "under", "dưới", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "up", "lên", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "upstairs", "trên lầu", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "village", "làng", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "call", "gọi", R.raw.sound_walk));
    }
}
