package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class GiaiTri {
    ArrayList<ItemLession> arrayList;

    public GiaiTri(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "actor", "diễn viên", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "art", "nghệ thuật", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "channel", "kênh", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "crowd", "đám đông", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "famous", "nổi tiếng", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "game", "trò chơi", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "golf", "môn đánh gôn", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "hike", "đi bộ đường dài", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "louder", "to tiếng hơn", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "modern", "hiện đại", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "movie", "phim", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "music", "nhạc", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "myself", "chính tôi", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "noise", "tiếng ồn", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "paint", "sơn", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "radio", "ra đi ô", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "show", "chỉ cho xem", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "soccer", "bóng đá", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "song", "bài hát", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "sound", "âm thanh", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "sport", "thể thao", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "tennis", "quần vợt", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "TV", "ti vi", R.raw.sound_walk));
    }
}
