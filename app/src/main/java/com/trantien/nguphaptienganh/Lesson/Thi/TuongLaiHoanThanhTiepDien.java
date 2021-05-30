package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class TuongLaiHoanThanhTiepDien {WebView webView;

    public TuongLaiHoanThanhTiepDien(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa th&igrave; tương lai ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<p>Th&igrave; tương lại ho&agrave;n th&agrave;nh tiếp diễn (Future Perfect Continuous)&nbsp;diễn tả một h&agrave;nh động<strong>&nbsp;đ&atilde; đang</strong>&nbsp;xảy ra cho tới 1 thời điểm trong tương lai</p>\n" +
                "<h3><span style=\"color: #ff6600;\">2. C&aacute;ch d&ugrave;ng th&igrave; tương lai ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<ul>\n" +
                "<li>Diễn tả một h&agrave;nh động xảy ra v&agrave; k&eacute;o d&agrave;i li&ecirc;n tục đến một thời điểm n&agrave;o đ&oacute; trong tương lai.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I&nbsp;<strong>will have been studying</strong>&nbsp;English for 10 year by the end of next month.&nbsp;<em>(T&ocirc;i sẽ học tiếng Anh được 10 năm t&iacute;nh đến thời điểm cuối th&aacute;ng sau)</em></p>\n" +
                "<ul>\n" +
                "<li>D&ugrave;ng để nhấn mạnh t&iacute;nh li&ecirc;n tục của h&agrave;nh động so với một h&agrave;nh động kh&aacute;c trong tương lai.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;When I get my degree, I&nbsp;<strong>will have been studying</strong>at Cambridge for four years. <em>(T&iacute;nh đến khi t&ocirc;i lấy bằng th&igrave; t&ocirc;i sẽ học ở Cambridge được 4 năm.)</em></p>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&ocirc;ng thức th&igrave; tương lai ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u khẳng định:&nbsp;S + will + have + been +V-ing</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; We&nbsp;<strong><u>will have been living</u></strong>&nbsp;in this house for 10 years by next month.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; They&nbsp;<strong><u>will have been getting</u>&nbsp;</strong>married for 2 years by the end of this year.</p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u phủ định:&nbsp;S + will not/ won&rsquo;t + have + been + V-ing</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Ch&uacute; &yacute;: will not = won&rsquo;t</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp; We&nbsp;<strong><u>won&rsquo;t be studying</u></strong>&nbsp;at 8 a.m tomorrow. (<em>Ch&uacute;ng t&ocirc;i sẽ đang kh&ocirc;ng học l&uacute;c 8h s&aacute;ng ng&agrave;y mai.)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; The children&nbsp;<strong><u>won&rsquo;t be playing</u></strong>&nbsp;with their friends when you come this weekend. (<em>Bọn trẻ sẽ đang kh&ocirc;ng chơi với bạn của ch&uacute;ng khi bạn đến v&agrave;o cuối tuần n&agrave;y.)</em></p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u nghi vấn:&nbsp;Will + S + have + been + V-ing?</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Trả lời:&nbsp;<strong>Yes, S + will.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; No, S + won&rsquo;t.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>Will</strong>&nbsp;you<strong>&nbsp;have been living</strong>&nbsp;in this country for 2 months by the end of this week?</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I will./ No, I won&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>Will</strong>&nbsp;they&nbsp;<strong>have been talking</strong>&nbsp;for half an hour by the time her husband comes back?</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I will./ No, I won&rsquo;t.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">4. Dấu hiệu nhận biết th&igrave; tương lai tiếp diễn</span></h3>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; by then: t&iacute;nh đến l&uacute;c đ&oacute;</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; by this October,&hellip;: t&iacute;nh đến th&aacute;ng 10 năm nay</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; by the end of this week/month/year: t&iacute;nh đến cuối tuần n&agrave;y/th&aacute;ng n&agrave;y/năm nay</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; by the time + 1 mệnh đề ở th&igrave; hiện tại đơn</p>\n" +
                "<p><strong>&nbsp;</strong></p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
