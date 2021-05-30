package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class ThoiGianVaNgayThang {
    ArrayList<ItemLession> arrayList;

    public ThoiGianVaNgayThang(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "afternoon", "chiều", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "anytime", "bất cứ lúc nào", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "appointment", "buổi hẹn", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "approximately", "xấp xỉ", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "April", "tháng tư", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "August", "tháng tám", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "before", "trước", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "day", "ngày", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "December", "tháng mười hai", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "during", "trong lúc", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "earlier", "sớm hơn", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "early", "sớm", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "evening", "buổi tối", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "everyday", "mỗi ngày", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "far", "xa", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "february", "tháng hai", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "free-time", "thời gian rảnh", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "friday", "thứ sáu", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "hour", "giờ, tiếng", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "immediately", "ngay lập tức", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "January", "tháng giêng", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "July", "tháng bảy", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "June", "tháng sáu", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "late", "muộn", R.raw.sound_pull));
        arrayList.add(new ItemLession(24, "later", "sau", R.raw.sound_walk));
        arrayList.add(new ItemLession(25, "March", "tháng ba", R.raw.sound_walk));
        arrayList.add(new ItemLession(26, "May", "tháng năm", R.raw.sound_walk));
        arrayList.add(new ItemLession(27, "minute", "phút", R.raw.sound_walk));
        arrayList.add(new ItemLession(28, "Monday", "thứ hai", R.raw.sound_walk));
        arrayList.add(new ItemLession(29, "month", "tháng", R.raw.sound_walk));
        arrayList.add(new ItemLession(30, "morning", "sáng", R.raw.sound_walk));
        arrayList.add(new ItemLession(31, "next", "kế tiếp", R.raw.sound_walk));
        arrayList.add(new ItemLession(32, "night", "đêm", R.raw.sound_walk));
        arrayList.add(new ItemLession(33, "November", "tháng mười một", R.raw.sound_walk));
        arrayList.add(new ItemLession(34, "now", "bây giờ", R.raw.sound_walk));
        arrayList.add(new ItemLession(35, "now", "hiện tại", R.raw.sound_walk));
        arrayList.add(new ItemLession(36, "number", "số", R.raw.sound_pull));
        arrayList.add(new ItemLession(37, "October", "tháng mười", R.raw.sound_walk));
        arrayList.add(new ItemLession(38, "often", "thường", R.raw.sound_walk));
        arrayList.add(new ItemLession(39, "position", "vị trí", R.raw.sound_walk));
        arrayList.add(new ItemLession(40, "previous", "trước", R.raw.sound_walk));
        arrayList.add(new ItemLession(41, "Saturday", "thứ bảy", R.raw.sound_walk));
        arrayList.add(new ItemLession(42, "September", "tháng chín", R.raw.sound_pull));
        arrayList.add(new ItemLession(43, "since", "kể từ", R.raw.sound_walk));
        arrayList.add(new ItemLession(44, "someday", "một ngày nào đó", R.raw.sound_walk));
        arrayList.add(new ItemLession(45, "sometimes", "thỉnh thoảng", R.raw.sound_walk));
        arrayList.add(new ItemLession(46, "soon", "sớm", R.raw.sound_walk));
        arrayList.add(new ItemLession(47, "spring", "mùa xuân", R.raw.sound_walk));
        arrayList.add(new ItemLession(48, "still", "vẫn", R.raw.sound_pull));
        arrayList.add(new ItemLession(49, "summer", "mùa hạ", R.raw.sound_walk));
        arrayList.add(new ItemLession(50, "Sunday", "chủ nhật", R.raw.sound_walk));
        arrayList.add(new ItemLession(51, "Thursday", "thứ năm", R.raw.sound_walk));
        arrayList.add(new ItemLession(52, "time", "thời gian", R.raw.sound_walk));
        arrayList.add(new ItemLession(53, "today", "hôm nay", R.raw.sound_walk));
        arrayList.add(new ItemLession(54, "tomorrow", "ngày mai", R.raw.sound_walk));
        arrayList.add(new ItemLession(55, "tonight", "tối nay", R.raw.sound_pull));
        arrayList.add(new ItemLession(56, "Tuesday", "thứ ba", R.raw.sound_walk));
        arrayList.add(new ItemLession(57, "until", "cho tới", R.raw.sound_walk));
        arrayList.add(new ItemLession(58, "wednesday", "thứ tư", R.raw.sound_walk));
        arrayList.add(new ItemLession(59, "week", "tuần lễ", R.raw.sound_walk));
        arrayList.add(new ItemLession(60, "weekend", "cuối tuần", R.raw.sound_walk));
        arrayList.add(new ItemLession(61, "year", "năm", R.raw.sound_walk));
        arrayList.add(new ItemLession(62, "yesterday", "hôm qua", R.raw.sound_pull));
        arrayList.add(new ItemLession(63, "apartment", "căn hộ", R.raw.sound_walk));
    }
}
