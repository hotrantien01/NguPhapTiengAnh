package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class QuaKhuHoanThanhTiepDien {WebView webView;

    public QuaKhuHoanThanhTiepDien(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<p><strong>Th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh tiếp diễn</strong>&nbsp;được d&ugrave;ng để diễn tả qu&aacute; tr&igrave;nh xảy&nbsp; ra 1 h&agrave;nh động bắt đầu trước một h&agrave;nh động kh&aacute;c trong qu&aacute; khứ.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">2. C&aacute;ch d&ugrave;ng th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<ul>\n" +
                "<li>Diễn đạt một h&agrave;nh động đang xảy ra trước một h&agrave;nh động trong qu&aacute; khứ (nhấn mạng t&iacute;nh tiếp diễn).</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I had been thinking about that before you mentioned it. (T&ocirc;i vẫn đang nghĩ về điều đ&oacute; trước khi cậu đề cập tới).</p>\n" +
                "<ul>\n" +
                "<li>Diễn đạt h&agrave;nh động l&agrave; nguy&ecirc;n nh&acirc;n của một điều g&igrave; đ&oacute; trong qu&aacute; khứ.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;Sam gained weight because he had been overeating. (Sam tăng c&acirc;n v&igrave; anh ấy đ&atilde; ăn qu&aacute; nhiều).</p>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&ocirc;ng thức th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u khẳng định:&nbsp;S + had + been + V-ing</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; It&nbsp;<strong><u>had been raining</u></strong>very hard for two hours before it stopped.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; They&nbsp;<strong><u>had been working</u></strong>&nbsp;very hard before we came.</p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u phủ định:&nbsp;S + hadn&rsquo;t + been + V-ing</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; hadn&rsquo;t = had not</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; My father&nbsp;<strong><u>hadn&rsquo;t been doing</u></strong>&nbsp;anything when my mother came home.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; They&nbsp;<strong><u>hadn&rsquo;t been talking</u>&nbsp;</strong>to each other when we saw them.</p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u nghi vấn:&nbsp;Had + S + been + V-ing ?</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Trả lời:&nbsp;<strong>Yes, S + had./ No, S + hadn&rsquo;t.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">No, S + hadn&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong><u>Had</u></strong>&nbsp;they&nbsp;<strong><u>been waiting</u>&nbsp;</strong>for me when you met them?</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, they had./ No, they hadn&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong><u>Had</u></strong>&nbsp;she&nbsp;<strong><u>been watching</u>&nbsp;</strong>TV for 4 hours before she went to eat dinner?</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, she had./ No, she hadn&rsquo;t.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">4. Dấu hiệu nhận biết th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<p style=\"padding-left: 30px;\">Từ nhận biết: until then, by the time, prior to that time, before, after.</p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}