package com.trantien.nguphaptienganh.Lesson.TinhTu;


import android.webkit.WebView;

public class TinhTuKep {
    WebView wv;

    public TinhTuKep(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><strong><span style=\"color: #ff6600;\">1. Định nghĩa:</span>&nbsp;</strong></h3>\n" +
                "<p>T&iacute;nh từ k&eacute;p l&agrave; sự kết hợp của hai hoặc nhiều từ lại với nhau v&agrave; được d&ugrave;ng như một t&iacute;nh từ duy nhất.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. C&aacute;ch viết:</strong></span>&nbsp;</h3>\n" +
                "<p>Khi c&aacute;c từ được kết hợp với nhau để tạo th&agrave;nh t&iacute;nh từ k&eacute;p, ch&uacute;ng c&oacute; thể được viết:</p>\n" +
                "<p>*&nbsp;th&agrave;nh một từ duy nhất:</p>\n" +
                "<p>life + long = lifelong</p>\n" +
                "<p>car + sick = carsick</p>\n" +
                "<p>* th&agrave;nh hai từ c&oacute; dấu nối (-) ở giữa</p>\n" +
                "<p>world + famous = world-famous</p>\n" +
                "<p>C&aacute;ch viết t&iacute;nh từ k&eacute;p được ph&acirc;n loại như tr&ecirc;n chỉ c&oacute; t&iacute;nh tương đối.</p>\n" +
                "<p>Một t&iacute;nh từ k&eacute;p c&oacute; thể được một số người bản ngữ viết c&oacute; dấu gạch nối (-) trong l&uacute;c một số người viết liền nhau hoặc ch&uacute;ng c&oacute; thể thay đổi c&aacute;h viết theo thời gian</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. Cấu tạo:&nbsp;</strong></span></h3>\n" +
                "<p>T&iacute;nh từ k&eacute;p được tạo th&agrave;nh bởi:</p>\n" +
                "<p><strong>+ Danh từ + t&iacute;nh từ:</strong></p>\n" +
                "<p>snow-white (trắng như tuyết)&nbsp;carsick (say xe)</p>\n" +
                "<p>world-wide (khắp thế giới) noteworthy (đ&aacute;nh ch&uacute; &yacute;)</p>\n" +
                "<p><strong>+ Danh từ + ph&acirc;n từ</strong></p>\n" +
                "<p>handmade (l&agrave;m bằng tay) heartbroken (đau l&ograve;ng)</p>\n" +
                "<p>homegorwn (nh&agrave; trồng) heart-warming (vui vẻ)</p>\n" +
                "<p><strong>+ Ph&oacute; từ + ph&acirc;n từ</strong></p>\n" +
                "<p>never-defeated (kh&ocirc;ng bị đ&aacute;nh bại) outspoken (thẳng thắn)</p>\n" +
                "<p>well-built (tr&aacute;ng kiện) everlasting (vĩnh cửu)</p>\n" +
                "<p><strong>+ T&iacute;nh từ + t&iacute;nh từ</strong></p>\n" +
                "<p>blue-black (xanh đen) white-hot (cực n&oacute;ng)</p>\n" +
                "<p>dark-brown (n&acirc;u đậm) worldly-wise (từng trải)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. T&iacute;nh từ k&eacute;p bằng dấu gạch ngang&nbsp;(hyphenated adjectives)</strong></span></h3>\n" +
                "<p>V&iacute; dụ:&nbsp;A four-year-old girl = The girl is four years old.</p>\n" +
                "<p>A ten-storey building = The building has ten storeys.</p>\n" +
                "<p>A never-to-be-forgetten memory = The memory will be never forgotten.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
