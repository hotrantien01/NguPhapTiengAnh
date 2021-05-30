package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class DuLichPhuongHuong {
    ArrayList<ItemLession> arrayList;

    public DuLichPhuongHuong(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "address", "địa chỉ", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "airplane", "máy bay", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "airport", "phi trường", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "America", "Mỹ", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "avenue", "đại lộ", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "bathroom", "phòng tắm", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "beach", "bãi biển", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "bicycle", "xe đạp", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "boat", "thuyền", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "Boston", "Boston", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "bridge", "cầu", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "building", "tòa nhà", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "bus", "xe buýt", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "by", "bởi", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "California", "California", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "came", "đã tới", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "capital", "thủ đô", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "car", "xe hơi", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "Chicago", "Chicago", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "church", "nhà thờ", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "circle", "vòng tròn", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "city", "thành phố", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "club", "câu lạc bộ", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "college", "đại học", R.raw.sound_walk));
        arrayList.add(new ItemLession(24, "company", "công ty", R.raw.sound_crawl));
        arrayList.add(new ItemLession(25, "continent", "lục địa", R.raw.sound_crouch));
        arrayList.add(new ItemLession(26, "country", "đất nước", R.raw.sound_dive));
        arrayList.add(new ItemLession(27, "deep", "sâu", R.raw.sound_hit));
        arrayList.add(new ItemLession(28, "east", "đông", R.raw.sound_hold));
        arrayList.add(new ItemLession(29, "embassy", "đại sứ quán", R.raw.sound_jump));
        arrayList.add(new ItemLession(30, "entrance", "lối vào", R.raw.sound_kick));
        arrayList.add(new ItemLession(31, "exit", "lối ra", R.raw.sound_lift));
        arrayList.add(new ItemLession(32, "farm", "nông trại", R.raw.sound_pickup));
        arrayList.add(new ItemLession(33, "field", "cánh đồng", R.raw.sound_pull));
        arrayList.add(new ItemLession(34, "flight", "chuyến bay", R.raw.sound_push));
        arrayList.add(new ItemLession(35, "forward", "phía trước", R.raw.sound_run));
        arrayList.add(new ItemLession(36, "garden", "vườn", R.raw.sound_sit));
        arrayList.add(new ItemLession(37, "gas", "xăng", R.raw.sound_throw));
        arrayList.add(new ItemLession(38, "highway", "xa lộ", R.raw.sound_walk));
        arrayList.add(new ItemLession(39, "hill", "đồi", R.raw.sound_walk));
        arrayList.add(new ItemLession(40, "home", "nhà", R.raw.sound_walk));
        arrayList.add(new ItemLession(41, "house", "nhà", R.raw.sound_walk));
        arrayList.add(new ItemLession(42, "island", "hòn đảo", R.raw.sound_walk));
        arrayList.add(new ItemLession(43, "kitchen", "bếp", R.raw.sound_walk));
        arrayList.add(new ItemLession(44, "lake", "hồ", R.raw.sound_walk));
        arrayList.add(new ItemLession(45, "left", "đã ra đi", R.raw.sound_walk));
        arrayList.add(new ItemLession(46, "library", "thư viện", R.raw.sound_walk));
        arrayList.add(new ItemLession(47, "license", "giấy phép", R.raw.sound_push));
        arrayList.add(new ItemLession(48, "lost", "đã mất", R.raw.sound_run));
        arrayList.add(new ItemLession(49, "map", "bản đồ", R.raw.sound_sit));
        arrayList.add(new ItemLession(50, "middle", "giữa", R.raw.sound_throw));
        arrayList.add(new ItemLession(51, "motorcycle", "xe gắn máy", R.raw.sound_walk));
        arrayList.add(new ItemLession(52, "mountain", "núi", R.raw.sound_walk));
        arrayList.add(new ItemLession(53, "museum", "bảo tàng viện", R.raw.sound_walk));
        arrayList.add(new ItemLession(54, "nighttime", "thời gian ban đêm", R.raw.sound_walk));
        arrayList.add(new ItemLession(55, "north", "bắc", R.raw.sound_walk));
        arrayList.add(new ItemLession(56, "ocean", "đại dương", R.raw.sound_walk));
        arrayList.add(new ItemLession(57, "office", "văn phòng", R.raw.sound_walk));
        arrayList.add(new ItemLession(58, "outdoors", "ngoài trời", R.raw.sound_walk));
        arrayList.add(new ItemLession(59, "outlet", "lối ra", R.raw.sound_walk));
        arrayList.add(new ItemLession(60, "park", "công viên", R.raw.sound_walk));
        arrayList.add(new ItemLession(61, "passport", "thông hành", R.raw.sound_walk));
        arrayList.add(new ItemLession(62, "pharmacy", "nhà thuốc", R.raw.sound_walk));
        arrayList.add(new ItemLession(63, "police", "cảnh sát", R.raw.sound_walk));
        arrayList.add(new ItemLession(64, "school", "trường", R.raw.sound_walk));
        arrayList.add(new ItemLession(65, "seat", "chỗ ngồi", R.raw.sound_walk));
        arrayList.add(new ItemLession(66, "sign", "dấu hiệu", R.raw.sound_walk));
        arrayList.add(new ItemLession(67, "sign", "ký tên", R.raw.sound_walk));
        arrayList.add(new ItemLession(68, "sky", "trời", R.raw.sound_walk));
    }
}
