package com.trantien.nguphaptienganh.Lesson.TinhTu;

import android.webkit.WebView;

public class CacTinhTuThuongGap {
    WebView wv;

    public CacTinhTuThuongGap(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<table border=\"1\" cellpadding=\"1\">\n" +
                "<tbody>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Tiếng Anh</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Tiếng Việt</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Tiếng Anh</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Tiếng Việt</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Different</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">kh&aacute;c biệt</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Beautiful</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">xinh đẹp</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Useful</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">hữu &iacute;ch</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">able</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">c&oacute; thể</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Popolar</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">phổ biến</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Difficult</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">kh&oacute; khăn</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Mental</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">tinh thần</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Similar</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">tương tự</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Emotional</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">cảm x&uacute;c</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Strong</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">mạnh mẽ</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Actual</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">thực tế</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Intelligent</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">th&ocirc;ng minh</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Poor</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">ngh&egrave;o</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Rich</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">gi&agrave;u</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Happy</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">hạnh ph&uacute;c</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Successful</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">th&agrave;nh c&ocirc;ng</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Experience</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">kinh nghiệm</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Cheap</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">rẻ</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Helpful</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">gi&uacute;p đỡ</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Impossible</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">kh&ocirc;ng thể thực hiện</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Serious</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">nghi&ecirc;m trọng</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Wonderful</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">kỳ diệu</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Traditional</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">truyền thống</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Scared</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">sợ h&atilde;i</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Splendid</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">tr&aacute;ng lệ</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Colorful</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">đầy m&agrave;u sắc</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Dramactic</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">kịch t&iacute;nh</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Angry</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">giận dữ</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Active</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">t&iacute;ch cực</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Automatic</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">tự động</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Certain</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">chắc chắn</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Clever</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">kh&eacute;o l&eacute;o</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Complex</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">phức tạp</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Cruel</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">độc &aacute;c</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Dark</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">tối</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Dependent</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">phụ thuộc</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Dirty</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">dơ bẩn</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Feeble</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">yếu đuối</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Foolish</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">ngu ngốc</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Glad</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">vui mừng</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Important</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">quan trọng</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Hollow</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">rỗng</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Lazy</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">lười biếng</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Late</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">trễ</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 13px;\">\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Necessary</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">cần thiết</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">Opposite</td>\n" +
                "<td class=\"cms_table_td\" style=\"height: 13px;\">đối ngược</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
