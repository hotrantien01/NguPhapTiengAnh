package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class MuaSam {
    ArrayList<ItemLession> arrayList;

    public MuaSam(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "advertisement", "quảng cáo", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "backpack", "ba lô", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "bag", "bao, túi", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "ball", "trái banh", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "basket", "rổ", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "basketball", "bóng rổ", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "batteries", "pin", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "belt", "thắt lưng", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "blouse", "áo cánh", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "box", "hộp", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "bracelet", "vòng tay", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "brush", "chải", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "bucket", "thùng, xô", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "camera", "máy ảnh", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "candle", "nến", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "carpet", "thảm", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "cassette", "cát xét", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "cd", "đĩa cd", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "chair", "ghế", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "clock", "đồng hồ", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "clothes", "quần áo", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "coat", "áo choàng", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "comb", "lượt", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "cotton", "bông", R.raw.sound_walk));
        arrayList.add(new ItemLession(24, "couch", "trường kỷ", R.raw.sound_walk));
        arrayList.add(new ItemLession(25, "customer", "khách hàng", R.raw.sound_walk));
        arrayList.add(new ItemLession(26, "deodorant", "chất khử mùi", R.raw.sound_walk));
        arrayList.add(new ItemLession(27, "discount", "sự giảm giá", R.raw.sound_walk));
        arrayList.add(new ItemLession(28, "dress", "váy đầm", R.raw.sound_walk));
        arrayList.add(new ItemLession(29, "earrings", "hoa tai", R.raw.sound_walk));
        arrayList.add(new ItemLession(30, "expensive", "đắt", R.raw.sound_walk));
        arrayList.add(new ItemLession(31, "flower", "hoa", R.raw.sound_walk));
        arrayList.add(new ItemLession(32, "foot", "cuối", R.raw.sound_walk));
        arrayList.add(new ItemLession(33, "free", "rảnh", R.raw.sound_walk));
        arrayList.add(new ItemLession(34, "garbage", "thùng rác", R.raw.sound_walk));
        arrayList.add(new ItemLession(35, "gift", "món quà", R.raw.sound_walk));
        arrayList.add(new ItemLession(36, "glove", "găng tay", R.raw.sound_walk));
        arrayList.add(new ItemLession(37, "gold", "vàng", R.raw.sound_walk));
        arrayList.add(new ItemLession(38, "guarantee", "bảo đảm", R.raw.sound_walk));
        arrayList.add(new ItemLession(39, "gum", "kẹo cao su", R.raw.sound_walk));
        arrayList.add(new ItemLession(40, "hat", "mũ", R.raw.sound_walk));
        arrayList.add(new ItemLession(41, "headphones", "ống nghe", R.raw.sound_walk));
        arrayList.add(new ItemLession(42, "jeans", "quần gin", R.raw.sound_walk));
        arrayList.add(new ItemLession(43, "lotion", "nước thơm", R.raw.sound_walk));
        arrayList.add(new ItemLession(44, "magazine", "tạp chí", R.raw.sound_walk));
        arrayList.add(new ItemLession(45, "mall", "khu mua sắm", R.raw.sound_walk));
        arrayList.add(new ItemLession(46, "market", "chợ", R.raw.sound_walk));
        arrayList.add(new ItemLession(47, "mirror", "gương", R.raw.sound_walk));
        arrayList.add(new ItemLession(48, "pants", "quần", R.raw.sound_walk));
        arrayList.add(new ItemLession(49, "present", "hiện tại", R.raw.sound_walk));
        arrayList.add(new ItemLession(50, "price", "giá tiền", R.raw.sound_walk));
        arrayList.add(new ItemLession(51, "purse", "ví", R.raw.sound_walk));
        arrayList.add(new ItemLession(52, "rest", "nghỉ", R.raw.sound_walk));
        arrayList.add(new ItemLession(53, "ring", "nhẫn", R.raw.sound_walk));
        arrayList.add(new ItemLession(54, "scarf", "khăn quàng cổ", R.raw.sound_walk));
        arrayList.add(new ItemLession(55, "shampoo", "thuốc gội đầu", R.raw.sound_walk));
        arrayList.add(new ItemLession(56, "shoes", "giày", R.raw.sound_walk));
        arrayList.add(new ItemLession(57, "size", "cỡ", R.raw.sound_walk));
        arrayList.add(new ItemLession(58, "soap", "xà phòng", R.raw.sound_walk));
        arrayList.add(new ItemLession(59, "socks", "vớ", R.raw.sound_walk));
        arrayList.add(new ItemLession(60, "special", "đặc biệt", R.raw.sound_walk));
        arrayList.add(new ItemLession(61, "store", "cữa hàng", R.raw.sound_walk));
        arrayList.add(new ItemLession(62, "sunglasses", "kính mát", R.raw.sound_walk));
        arrayList.add(new ItemLession(63, "supermarket", "siêu thị", R.raw.sound_walk));
        arrayList.add(new ItemLession(64, "sweater", "áo len", R.raw.sound_walk));
        arrayList.add(new ItemLession(65, "tie", "cột", R.raw.sound_walk));
        arrayList.add(new ItemLession(66, "tissue", "giấy lụa", R.raw.sound_walk));
        arrayList.add(new ItemLession(67, "t-shirt", "áo thun", R.raw.sound_walk));
        arrayList.add(new ItemLession(68, "umbrella", "ô, dù", R.raw.sound_walk));
        arrayList.add(new ItemLession(69, "underwear", "quần áo lót", R.raw.sound_walk));
        arrayList.add(new ItemLession(70, "wallet", "ví", R.raw.sound_walk));
        arrayList.add(new ItemLession(71, "against", "chống lại", R.raw.sound_walk));
    }
}
