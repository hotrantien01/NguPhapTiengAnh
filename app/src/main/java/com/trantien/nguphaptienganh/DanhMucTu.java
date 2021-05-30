package com.trantien.nguphaptienganh;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class DanhMucTu {
    ArrayList<BaiHoc> arrayList;

    public DanhMucTu(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add(){
        arrayList.add(new BaiHoc("1. Động từ bất quy tắc","Tổng hợp động từ bất quy tắc","16"));
        arrayList.add(new BaiHoc("2. Danh từ","Các loại danh từ, danh từ đếm được, danh từ không đếm được","17"));
        arrayList.add(new BaiHoc("3. Động từ","Động từ khuyết thiếu, nội động từ, ngoại động từ","18"));
        arrayList.add(new BaiHoc("4. Tính từ","Vị trí tính từ, tính từ đuôi \"ed\", đuôi \"ing\"","19"));
        arrayList.add(new BaiHoc("5. Trạng từ","Vị trí trạng từ, các loại trạng từ, phân loại trạng từ","20"));
        arrayList.add(new BaiHoc("6. Giới từ","Cách dùng và các loại giới từ trong Tiếng Anh ","21"));
        arrayList.add(new BaiHoc("7. Quy tắc trọng âm","Tổng hợp cách nhận diện trọng âm","22"));
        arrayList.add(new BaiHoc("8. Cách phát âm \"s/es\"","Tổng hợp cách phát âm \"s/es\"","23"));
        arrayList.add(new BaiHoc("9. Cách phát âm \"ed\"","Tổng hợp cách phát âm \"ed\"","24"));
        arrayList.add(new BaiHoc("10. Vị trí của tính từ, danh từ, động từ, trạng từ","Xác định vị trí tính từ, danh từ, dộng từ, trạng từ","25"));
    }

    public static class DanhMucLession {
    }
}
