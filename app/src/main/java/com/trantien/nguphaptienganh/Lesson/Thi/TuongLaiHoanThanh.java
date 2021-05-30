package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class TuongLaiHoanThanh {WebView webView;

    public TuongLaiHoanThanh(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa th&igrave; tương lai ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<p>Th&igrave; tương lai&nbsp; ho&agrave;n th&agrave;nh ( Future Perfect ) được d&ugrave;ng để diễn tả h&agrave;nh động sẽ ho&agrave;n th&agrave;nh tới 1 thời điểm x&aacute;c định trong tương lai.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">2. C&aacute;ch d&ugrave;ng th&igrave; tương lai ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<ul>\n" +
                "<li>D&ugrave;ng để diễn tả một h&agrave;nh động hay sự việc ho&agrave;n th&agrave;nh trước một thời điểm trong tương lai.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I&nbsp;<strong>will have finished</strong>&nbsp;my homework before 11 o&rsquo;clock this evening.&nbsp;<em>(T&ocirc;i sẽ ho&agrave;n th&agrave;nh b&agrave;i tập của m&igrave;nh v&agrave;o trước 11 giờ tối nay).</em></p>\n" +
                "<ul>\n" +
                "<li>D&ugrave;ng để diễn tả một h&agrave;nh động hay sự việc ho&agrave;n th&agrave;nh trước một h&agrave;nh động hay sự việc trong tương lai.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;When you come back, I&nbsp;<strong>will have typed</strong>&nbsp;this email.&nbsp;<em>(Khi bạn quay lại, t&ocirc;i sẽ đ&aacute;nh m&aacute;y xong bức thư điện tử n&agrave;y).</em></p>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&ocirc;ng thức th&igrave; tương lai ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u khẳng định:&nbsp;S + will + have + VpII</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I&nbsp;<strong><u>will have finished</u>&nbsp;</strong>my report by the end of this month. (<em>T&ocirc;i sẽ ho&agrave;n h&agrave;nh b&agrave;i b&aacute;o c&aacute;o của t&ocirc;i v&agrave;o cuối th&aacute;ng n&agrave;y).</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; She&nbsp;<strong><u>will have typed</u>&nbsp;</strong>20 pages by 3 o&rsquo;clock this afternoon. (<em>Cho tới 3h chiều nay th&igrave; c&ocirc; ấy sẽ đ&aacute;nh m&aacute;y được 20 trang</em>).</p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u phủ định:&nbsp;S + will + not + have + VpII</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; will not = won&rsquo;t</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I&nbsp;<strong><u>will not have stopped</u></strong>&nbsp;my work before the time you come tomorrow. (M&igrave;nh sẽ vẫn chưa xong việc khi bạn đến ng&agrave;y mai.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; My father&nbsp;<strong><u>will not have come</u></strong>&nbsp;home by 9 pm this evening. (<em>Bố t&ocirc;i sẽ vẫn chưa về nh&agrave; v&agrave;o l&uacute;c 9h tối nay.)</em></p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u nghi vấn:&nbsp;Will + S + have + VpII ?</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Trả lời:&nbsp;<strong>Yes, S + will</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>No, S + won&rsquo;t</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong><u>Will</u></strong>&nbsp;you&nbsp;<strong><u>have gone</u></strong>&nbsp;out by 7 pm tomorrow? (<em>V&agrave;o l&uacute;c 7 giờ tối mai bạn đi ra ngo&agrave;i rồi đ&uacute;ng kh&ocirc;ng?</em>)</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I will./ No, I won&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong><u>Will</u></strong>&nbsp;your parents&nbsp;<strong><u>have come</u></strong>&nbsp;back Vietnam before the summer vacation? (<em>Trước kỳ nghỉ h&egrave; th&igrave; bố mẹ bạn quay trở về Việt Nam rồi đ&uacute;ng kh&ocirc;ng?</em>)</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, they will./ No, they won&rsquo;t.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">4. Dấu hiệu nhận biết th&igrave; tương lai ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<p style=\"padding-left: 30px;\">Trong c&acirc;u c&oacute; c&aacute;c cụm từ sau:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; by + thời gian trong tương lai</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; by the end of + thời gian trong tương lai</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; by the time &hellip;</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; before + thời gian trong tương lai</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<u>By the end of this month</u>&nbsp;I&nbsp;<strong><u>will have taken</u></strong>&nbsp;an English course. (<em>Cho tới cuối th&aacute;ng n&agrave;y th&igrave; t&ocirc;i đ&atilde; tham gia một kh&oacute;a học Tiếng Anh rồi.)</em></p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
