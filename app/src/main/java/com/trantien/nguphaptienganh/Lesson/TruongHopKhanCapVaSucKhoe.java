package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;
public class TruongHopKhanCapVaSucKhoe {
    ArrayList<ItemLession> arrayList;

    public TruongHopKhanCapVaSucKhoe(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "allergy", "dị ứng", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "antibiotic", "kháng sinh", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "arm", "cánh tay", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "baby", "bé", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "back", "lưng", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "beard", "râu quai nón", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "body", "thân thể", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "brain", "óc", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "broke", "đã làm vỡ", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "broken", "đã bị vỡ", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "cancer", "ung thư", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "cold", "lạnh", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "cough", "ho", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "dead", "chết", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "dentist", "nha sĩ", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "ear", "tai", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "eye", "mắt", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "face", "mặt", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "fake", "giả mạo", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "fever", "sốt", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "finger", "ngón tay", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "fire", "lửa", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "foot", "bàn chân", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "gun", "súng", R.raw.sound_walk));
        arrayList.add(new ItemLession(24, "hair", "tóc", R.raw.sound_crawl));
        arrayList.add(new ItemLession(25, "hair", "lông", R.raw.sound_pull));
        arrayList.add(new ItemLession(26, "hand", "bàn tay", R.raw.sound_push));
        arrayList.add(new ItemLession(27, "head", "đầu", R.raw.sound_run));
        arrayList.add(new ItemLession(28, "headache", "nhứt đầu", R.raw.sound_sit));
        arrayList.add(new ItemLession(29, "heart", "tim", R.raw.sound_throw));
        arrayList.add(new ItemLession(30, "hospital", "bệnh viện", R.raw.sound_walk));
        arrayList.add(new ItemLession(31, "hurts", "làm đau", R.raw.sound_walk));
        arrayList.add(new ItemLession(32, "leg", "chân", R.raw.sound_walk));
        arrayList.add(new ItemLession(33, "medicine", "dược phẩm", R.raw.sound_walk));
        arrayList.add(new ItemLession(34, "mouth", "miệng", R.raw.sound_walk));
        arrayList.add(new ItemLession(35, "neck", "cổ", R.raw.sound_walk));
        arrayList.add(new ItemLession(36, "nose", "mũi", R.raw.sound_walk));
        arrayList.add(new ItemLession(37, "pain", "đau", R.raw.sound_walk));
        arrayList.add(new ItemLession(38, "serious", "nghiêm túc", R.raw.sound_walk));
        arrayList.add(new ItemLession(39, "shower", "mưa rào", R.raw.sound_crawl));
        arrayList.add(new ItemLession(40, "sick", "ốm", R.raw.sound_walk));
        arrayList.add(new ItemLession(41, "skin", "da", R.raw.sound_walk));
        arrayList.add(new ItemLession(42, "sore", "đau", R.raw.sound_walk));
        arrayList.add(new ItemLession(43, "stomach", "dạ dày", R.raw.sound_walk));
        arrayList.add(new ItemLession(44, "teeth", "răng", R.raw.sound_walk));
        arrayList.add(new ItemLession(45, "throat", "cổ họng", R.raw.sound_walk));
        arrayList.add(new ItemLession(46, "tơe", "ngón chân", R.raw.sound_walk));
        arrayList.add(new ItemLession(47, "toilet", "phòng vệ sinh", R.raw.sound_crawl));
        arrayList.add(new ItemLession(48, "toothbrush", "bàn chải đánh răng", R.raw.sound_walk));
        arrayList.add(new ItemLession(49, "vitamins", "sinh tố", R.raw.sound_walk));
        arrayList.add(new ItemLession(50, "afraid", "sợ", R.raw.sound_walk));
    }
}
