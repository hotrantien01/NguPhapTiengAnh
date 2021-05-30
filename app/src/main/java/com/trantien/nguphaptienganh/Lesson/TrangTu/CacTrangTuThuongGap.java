package com.trantien.nguphaptienganh.Lesson.TrangTu;

import android.webkit.WebView;

public class CacTrangTuThuongGap {
    WebView wv;

    public CacTrangTuThuongGap(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<table class=\"cms_table\" border=\"1\" cellpadding=\"1\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Tiếng Anh</td>\n" +
                "<td class=\"cms_table_td\">Tiếng Việt</td>\n" +
                "<td class=\"cms_table_td\">Tiếng Anh</td>\n" +
                "<td class=\"cms_table_td\">Tiếng Việt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Well</td>\n" +
                "<td class=\"cms_table_td\">tốt</td>\n" +
                "<td class=\"cms_table_td\">very</td>\n" +
                "<td class=\"cms_table_td\">rất</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Usually</td>\n" +
                "<td class=\"cms_table_td\">thường xuy&ecirc;n</td>\n" +
                "<td class=\"cms_table_td\">Never</td>\n" +
                "<td class=\"cms_table_td\">kh&ocirc;ng bao giờ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Rather</td>\n" +
                "<td class=\"cms_table_td\">đ&uacute;ng hơn, hơn l&agrave;</td>\n" +
                "<td class=\"cms_table_td\">Almost</td>\n" +
                "<td class=\"cms_table_td\">gần như, hầu như</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Ever</td>\n" +
                "<td class=\"cms_table_td\">bao giờ, đ&atilde; từng</td>\n" +
                "<td class=\"cms_table_td\">Probably</td>\n" +
                "<td class=\"cms_table_td\">c&oacute; thể</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Likely</td>\n" +
                "<td class=\"cms_table_td\">c&oacute; khả năng</td>\n" +
                "<td class=\"cms_table_td\">Eventually</td>\n" +
                "<td class=\"cms_table_td\">c&oacute; khả năng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Eventually</td>\n" +
                "<td class=\"cms_table_td\">cuối c&ugrave;ng</td>\n" +
                "<td class=\"cms_table_td\">Extremely</td>\n" +
                "<td class=\"cms_table_td\">cực kỳ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Properly</td>\n" +
                "<td class=\"cms_table_td\">kh&aacute;c biệt</td>\n" +
                "<td class=\"cms_table_td\">Beautiful</td>\n" +
                "<td class=\"cms_table_td\">xinh đẹp</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Different</td>\n" +
                "<td class=\"cms_table_td\">đ&uacute;ng</td>\n" +
                "<td class=\"cms_table_td\">Constantly</td>\n" +
                "<td class=\"cms_table_td\">li&ecirc;n tục</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Currently</td>\n" +
                "<td class=\"cms_table_td\">hiện tại</td>\n" +
                "<td class=\"cms_table_td\">Certainly</td>\n" +
                "<td class=\"cms_table_td\">chắc chắn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Else</td>\n" +
                "<td class=\"cms_table_td\">kh&aacute;c nữa</td>\n" +
                "<td class=\"cms_table_td\">Daily</td>\n" +
                "<td class=\"cms_table_td\">hằng ng&agrave;y</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Relatively</td>\n" +
                "<td class=\"cms_table_td\">tương đối</td>\n" +
                "<td class=\"cms_table_td\">Fairly</td>\n" +
                "<td class=\"cms_table_td\">kh&aacute;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Ultimately</td>\n" +
                "<td class=\"cms_table_td\">cuối c&ugrave;ng</td>\n" +
                "<td class=\"cms_table_td\">Somewhat</td>\n" +
                "<td class=\"cms_table_td\">hơi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Rarely</td>\n" +
                "<td class=\"cms_table_td\">hiếm khi</td>\n" +
                "<td class=\"cms_table_td\">Regularly</td>\n" +
                "<td class=\"cms_table_td\">thường xuy&ecirc;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Fully</td>\n" +
                "<td class=\"cms_table_td\">đầy đủ</td>\n" +
                "<td class=\"cms_table_td\">Essentially</td>\n" +
                "<td class=\"cms_table_td\">cơ bản</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Hopeful</td>\n" +
                "<td class=\"cms_table_td\">hy vọng</td>\n" +
                "<td class=\"cms_table_td\">Gently</td>\n" +
                "<td class=\"cms_table_td\">nhẹ nh&agrave;ng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Roughtly</td>\n" +
                "<td class=\"cms_table_td\">khoảng</td>\n" +
                "<td class=\"cms_table_td\">Significantly</td>\n" +
                "<td class=\"cms_table_td\">đ&aacute;ng kể</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Totallyl</td>\n" +
                "<td class=\"cms_table_td\">đ&aacute;ng kể</td>\n" +
                "<td class=\"cms_table_td\">Merely</td>\n" +
                "<td class=\"cms_table_td\">chỉ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Mainly</td>\n" +
                "<td class=\"cms_table_td\">chủ yếu</td>\n" +
                "<td class=\"cms_table_td\">Literally</td>\n" +
                "<td class=\"cms_table_td\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Hopeful</td>\n" +
                "<td class=\"cms_table_td\">hy vọng</td>\n" +
                "<td class=\"cms_table_td\">Gently</td>\n" +
                "<td class=\"cms_table_td\">nhẹ nh&agrave;ng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Initially</td>\n" +
                "<td class=\"cms_table_td\">ban đầu</td>\n" +
                "<td class=\"cms_table_td\">Hardly</td>\n" +
                "<td class=\"cms_table_td\">hầu như kh&ocirc;ng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Virtually</td>\n" +
                "<td class=\"cms_table_td\">hầu như</td>\n" +
                "<td class=\"cms_table_td\">Anyway</td>\n" +
                "<td class=\"cms_table_td\">d&ugrave; thế n&agrave;o đi nữa</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Absolutely</td>\n" +
                "<td class=\"cms_table_td\">ho&agrave;n to&agrave;n</td>\n" +
                "<td class=\"cms_table_td\">Otherwise</td>\n" +
                "<td class=\"cms_table_td\">c&aacute;ch kh&aacute;c</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Mostly</td>\n" +
                "<td class=\"cms_table_td\">chủ yếu</td>\n" +
                "<td class=\"cms_table_td\">Personally</td>\n" +
                "<td class=\"cms_table_td\">c&aacute; nh&acirc;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Closely</td>\n" +
                "<td class=\"cms_table_td\">chặt chẽ</td>\n" +
                "<td class=\"cms_table_td\">Altogether</td>\n" +
                "<td class=\"cms_table_td\">nh&igrave;n chung</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class=\"cms_table_td\">Definitely</td>\n" +
                "<td class=\"cms_table_td\">chắc chắn</td>\n" +
                "<td class=\"cms_table_td\">Truly</td>\n" +
                "<td class=\"cms_table_td\">thực sự</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>&nbsp;</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
