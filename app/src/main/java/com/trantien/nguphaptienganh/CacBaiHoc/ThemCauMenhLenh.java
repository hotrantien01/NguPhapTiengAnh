package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemCauMenhLenh {
    WebView wv;

    public ThemCauMenhLenh(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa c&acirc;u mệnh lệnh trong tiếng Anh</span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>C&acirc;u mệnh lệnh l&agrave; c&acirc;u c&oacute; t&iacute;nh chất sai khiến n&ecirc;n c&ograve;n gọi l&agrave; c&acirc;u cầu khiến. Một người ra lệnh hoặc y&ecirc;u cầu cho một người kh&aacute;c l&agrave;m một việc g&igrave; đ&oacute;. N&oacute; thường theo sau bởi từ please. Chủ ngữ của c&acirc;u mệnh lệnh được ngầm hiểu l&agrave; you. Lu&ocirc;n d&ugrave;ng dạng thức nguy&ecirc;n thể (kh&ocirc;ng c&oacute; to) của động từ trong c&acirc;u mệnh lệnh.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>C&acirc;u mệnh lệnh chia l&agrave;m 2 loại: Trực tiếp v&agrave; gi&aacute;n tiếp.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">2. C&acirc;u mệnh lệnh trực tiếp</span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Close the door! H&atilde;y đ&oacute;ng cửa!</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Please turn off the light! L&agrave;m ơn tắt đ&egrave;n đi!</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Open the window! H&atilde;y mở cửa sổ!</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Be quiet! Im đi!</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&acirc;u mệnh lệnh gi&aacute;n tiếp</span></h3>\n" +
                "<p>Dạng thức gi&aacute;n tiếp thường được d&ugrave;ng với: to order/ ask/ say/ tell sb to do smt.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>John asked Jill to turn off the light. John y&ecirc;u cầu Jill tắt đ&egrave;n đi</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Please tell Jaime to leave the room. Xin vui l&ograve;ng bảo Jaime rời khỏi căn ph&ograve;ng.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I ordered him to open the book. T&ocirc;i ra lệnh cho anh ta mở s&aacute;ch ra.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">4. Phủ định của c&acirc;u mệnh lệnh</span></h3>\n" +
                "<p>Ở dạng phủ định, th&ecirc;m Don&rsquo;t v&agrave;o trước động từ trong c&acirc;u trực tiếp (kể cả động từ be) hoặc th&ecirc;m not v&agrave;o trước động từ nguy&ecirc;n thể trong c&acirc;u gi&aacute;n tiếp.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Don&rsquo;t move! Or I&rsquo;ll shoot. (Đứng im, kh&ocirc;ng tao bắn)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Don&rsquo;t turn off the light when you go out. Đừng tắt đ&egrave;n khi anh ra ngo&agrave;i.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Don&rsquo;t be silly. I&rsquo;ll come back. (Đừng c&oacute; ngốc thế, rồi anh sẽ về m&agrave;)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">5. C&acirc;u mệnh lệnh với cấu tr&uacute;c &rdquo;let&ldquo;</span></h3>\n" +
                "<p>C&acirc;u mệnh lệnh c&oacute; thể được th&agrave;nh lập với cấu tr&uacute;c: Let (+ t&acirc;n ngữ) + động từ nguy&ecirc;n thể</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Let me see. (H&atilde;y để t&ocirc;i xem n&agrave;o)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Let&rsquo;s go. (M&igrave;nh đi n&agrave;o)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Let us go: (H&atilde;y để ch&uacute;ng t&ocirc;i đi)</p>\n" +
                "</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
