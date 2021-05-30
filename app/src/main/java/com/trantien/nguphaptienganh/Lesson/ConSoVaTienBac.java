package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class ConSoVaTienBac {
    ArrayList<ItemLession> arrayList;

    public ConSoVaTienBac(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "10", "10", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "100", "100", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "1000", "1000", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "1000000", "1000000", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "101", "101", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "110", "110", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "12", "12", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "13", "13", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "14", "14", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "15", "15", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "16", "16", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "17", "17", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "18", "18", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "19", "19", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "1st", "thứ nhất", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "2", "2", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "20", "20", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "200", "200", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "21", "21", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "22", "22", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "2nd", "thứ nhì", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "3", "3", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "30", "30", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "3rd", "thứ ba", R.raw.sound_walk));
        arrayList.add(new ItemLession(24, "4", "4", R.raw.sound_crawl));
        arrayList.add(new ItemLession(25, "40", "40", R.raw.sound_crouch));
        arrayList.add(new ItemLession(26, "4th", "thứ tư", R.raw.sound_dive));
        arrayList.add(new ItemLession(27, "5", "5", R.raw.sound_hit));
        arrayList.add(new ItemLession(28, "50", "50", R.raw.sound_hold));
        arrayList.add(new ItemLession(29, "6", "6", R.raw.sound_jump));
        arrayList.add(new ItemLession(30, "60", "60", R.raw.sound_kick));
        arrayList.add(new ItemLession(31, "7", "7", R.raw.sound_lift));
        arrayList.add(new ItemLession(32, "70", "70", R.raw.sound_pickup));
        arrayList.add(new ItemLession(33, "8", "8", R.raw.sound_pull));
        arrayList.add(new ItemLession(34, "80", "80", R.raw.sound_push));
        arrayList.add(new ItemLession(35, "9", "9", R.raw.sound_run));
        arrayList.add(new ItemLession(36, "90", "90", R.raw.sound_sit));
        arrayList.add(new ItemLession(37, "accept", "chấp nhận", R.raw.sound_throw));
        arrayList.add(new ItemLession(38, "all", "tất cả", R.raw.sound_walk));
        arrayList.add(new ItemLession(39, "bank", "ngân hàng", R.raw.sound_walk));
        arrayList.add(new ItemLession(40, "calculator", "máy tính bỏ túi", R.raw.sound_walk));
        arrayList.add(new ItemLession(41, "cash", "tiền mặt", R.raw.sound_walk));
        arrayList.add(new ItemLession(42, "centimeters", "xăng ti mét", R.raw.sound_walk));
        arrayList.add(new ItemLession(43, "cents", "xu", R.raw.sound_walk));
        arrayList.add(new ItemLession(44, "cheap", "rẻ", R.raw.sound_walk));
        arrayList.add(new ItemLession(45, "check", "phiếu tính tiền", R.raw.sound_walk));
        arrayList.add(new ItemLession(46, "doctor", "bác sĩ", R.raw.sound_walk));
        arrayList.add(new ItemLession(47, "dollar", "đô la", R.raw.sound_push));
        arrayList.add(new ItemLession(48, "insurance", "bảo hiểm", R.raw.sound_run));
        arrayList.add(new ItemLession(49, "kilo", "kí", R.raw.sound_sit));
        arrayList.add(new ItemLession(50, "kilometers", "cây số", R.raw.sound_throw));
        arrayList.add(new ItemLession(51, "last", "cuối cùng", R.raw.sound_walk));
        arrayList.add(new ItemLession(52, "less", "ít hơn", R.raw.sound_walk));
        arrayList.add(new ItemLession(53, "light", "thắp sáng", R.raw.sound_walk));
        arrayList.add(new ItemLession(54, "liter", "lít", R.raw.sound_walk));
        arrayList.add(new ItemLession(55, "lots", "nhiều", R.raw.sound_walk));
        arrayList.add(new ItemLession(56, "many", "nhiều", R.raw.sound_walk));
        arrayList.add(new ItemLession(57, "meter", "mét", R.raw.sound_walk));
        arrayList.add(new ItemLession(58, "miles", "dặm", R.raw.sound_walk));
        arrayList.add(new ItemLession(59, "money", "tiền", R.raw.sound_walk));
        arrayList.add(new ItemLession(60, "none", "không ai, không cái nào", R.raw.sound_walk));
        arrayList.add(new ItemLession(61, "once", "một lần", R.raw.sound_walk));
        arrayList.add(new ItemLession(62, "pound", "đồng bảng Anh", R.raw.sound_walk));
        arrayList.add(new ItemLession(63, "second", "thứ nhì", R.raw.sound_walk));
        arrayList.add(new ItemLession(64, "subtract", "trừ", R.raw.sound_walk));
        arrayList.add(new ItemLession(65, "total", "tổng cộng", R.raw.sound_walk));
        arrayList.add(new ItemLession(66, "twice", "hai lần", R.raw.sound_walk));
        arrayList.add(new ItemLession(67, "zero", "số không", R.raw.sound_walk));
        arrayList.add(new ItemLession(68, "above", "trên", R.raw.sound_walk));
    }
}
