package com.trantien.nguphaptienganh;

import com.trantien.nguphaptienganh.Model.ItemMain;

import java.util.ArrayList;

public class DanhMucLession {
    ArrayList<ItemMain> arrayList;

    public DanhMucLession(ArrayList<ItemMain> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemMain(0, R.drawable.medicine, "Trường hợp khẩn cấp và sức khỏe"));
        arrayList.add(new ItemMain(1, R.drawable.book, "Từ vựng và thành ngữ văn hóa"));
        arrayList.add(new ItemMain(2, R.drawable.conversation, "Những câu hỏi thông thường"));
        arrayList.add(new ItemMain(3, R.drawable.worker, "Việc làm"));
        arrayList.add(new ItemMain(4, R.drawable.sunny, "Thời tiết"));
        arrayList.add(new ItemMain(5, R.drawable.email, "Khó khăn giao tiếp"));
        arrayList.add(new ItemMain(6, R.drawable.shopping, "Mua sắm"));
        arrayList.add(new ItemMain(7, R.drawable.console, "Giải trí"));
        arrayList.add(new ItemMain(8, R.drawable.high, "Kết bạn"));
        arrayList.add(new ItemMain(9, R.drawable.diet, "Ăn"));
        arrayList.add(new ItemMain(10, R.drawable.house, "Chỗ ăn ở"));
        arrayList.add(new ItemMain(11, R.drawable.calendar, "Thời gian và ngày tháng"));
        arrayList.add(new ItemMain(12, R.drawable.smartphone, "Điện thoại/internet/thư"));
        arrayList.add(new ItemMain(13, R.drawable.map, "Địa điểm"));
        arrayList.add(new ItemMain(14, R.drawable.money, "Con số và tiền bạc"));
        arrayList.add(new ItemMain(15, R.drawable.airplane, "Du lịch, phương hướng"));
        arrayList.add(new ItemMain(16, R.drawable.greeting, "Chào hỏi"));
        arrayList.add(new ItemMain(17, R.drawable.open, "Những thành ngữ thông dụng"));
    }
}
