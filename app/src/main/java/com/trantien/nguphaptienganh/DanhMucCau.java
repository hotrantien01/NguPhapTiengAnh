package com.trantien.nguphaptienganh;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class DanhMucCau {
    ArrayList<BaiHoc> arrayList;

    public DanhMucCau(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add(){
        arrayList.add(new BaiHoc("1. Các thì trong tiếng Anh","Hiện tại đơn, hiện tại tiếp diễn, quá khứ đơn","1"));
        arrayList.add(new BaiHoc("2. Câu bị động","Cấu trúc ngữ pháp, các trường hợp đặc biệt","2"));
        arrayList.add(new BaiHoc("3. Câu ước","Câu ước loại 1, loại 2, loại 3","3"));
        arrayList.add(new BaiHoc("4. Câu gián tiếp","Câu trực tiếp, câu gián tiếp, cách chuyển từ câu trực tiếp sang gián tiếp","4"));
        arrayList.add(new BaiHoc("5. Câu điều kiện","Câu điều kiện loại 1, loại 2, loại 3, đặc biệt","5"));
        arrayList.add(new BaiHoc("6. Câu so sánh","So sánh bằng, so sánh hơn, so sánh nhất","6"));
        arrayList.add(new BaiHoc("7. Mệnh đề quan hệ","Đại từ quan hệ, trạng từ quan hệ, rút gọn mệnh đề quan hệ","7"));
        arrayList.add(new BaiHoc("8. Câu cảm thán","Câu cảm thán với What, How, Such,...","8"));
        arrayList.add(new BaiHoc("9. Câu hỏi đuôi","Công thức và các dạng đặc biệt của câu hỏi đuôi","9"));
        arrayList.add(new BaiHoc("10. Câu đảo ngữ","Câu đảo ngữ với No, Not, Never, Little, Only","10"));
        arrayList.add(new BaiHoc("11. Câu mệnh lệnh","Câu mệnh lệnh trực tiếp, gián tiếp, dạng phủ định","11"));
        arrayList.add(new BaiHoc("12. Câu nhấn mạnh","Câu nhấn mạnh chủ ngữ, tân ngữ, trạng ngữ, câu chẻ bị động","12"));
        arrayList.add(new BaiHoc("13. Công thức viết lại câu","Tổng hợp các công thức viết lại câu","13"));
        arrayList.add(new BaiHoc("14. Thành ngữ tục ngữ","Các thành ngữ, tục ngữ, ca dao thông dụng","14"));
        arrayList.add(new BaiHoc("15. Câu đồng tình","Câu đồng tình với too, so, either, neither","15"));
    }
}
