package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class TuongLaiTiepDien {WebView webView;

    public TuongLaiTiepDien(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa th&igrave; tương lai tiếp diễn</span></h3>\n" +
                "<p>Th&igrave; tương lai tiếp diễn được d&ugrave;ng để n&oacute;i về 1 h&agrave;nh động đang diễn ra tại một thời điểm x&aacute;c định trong tương lai.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">2. C&aacute;ch d&ugrave;ng th&igrave; tương lai tiếp diễn</span></h3>\n" +
                "<ul>\n" +
                "<li>D&ugrave;ng để diễn tả một h&agrave;nh động hay sự việc đang diễn ra tại một thời điểm x&aacute;c định trong tương lai.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd: At 12 o&rsquo;clock tomorrow, my friends and I&nbsp;<strong>will be having</strong>&nbsp;lunch at school. (<em>V&agrave;o l&uacute;c 12h ng&agrave;y mai, c&aacute;c bạn t&ocirc;i v&agrave; t&ocirc;i sẽ đang ăn trưa tại trường).</em></p>\n" +
                "<ul>\n" +
                "<li>D&ugrave;ng để diễn tả một h&agrave;nh động, một sự việc đang xảy ra th&igrave; một h&agrave;nh động, sự việc kh&aacute;c xen v&agrave;o trong tương lai.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd: When you&nbsp;<strong>come</strong>&nbsp;tomorrow, they&nbsp;<strong>will be playing</strong>tennis. (Khi bạn đến v&agrave;o ng&agrave;y mai, th&igrave; họ sẽ đi chơi tennis rồi).</p>\n" +
                "<ul>\n" +
                "<li>H&agrave;nh động sẽ diễn ra v&agrave; k&eacute;o d&agrave;i li&ecirc;n tục suốt một khoảng thời gian ở tương lai</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd: My parents are going to London, so I<strong>&rsquo;ll be staying</strong>&nbsp;with my grandma for the next 2 weeks. (Cha mẹ t&ocirc;i sẽ đi London, v&igrave; vậy t&ocirc;i sẽ ở với b&agrave; trong 2 tuần tới).</p>\n" +
                "<ul>\n" +
                "<li>H&agrave;nh động sẽ xảy ta như một phần trong kế hoạch hoặc một phần trong thời gian biểu.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;The party<strong>&nbsp;will be starting</strong>&nbsp;at ten o&rsquo;clock. (Bữa tiệc sẽ bắt đầu l&uacute;c 10 giờ).</p>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&ocirc;ng thức th&igrave; tương lai tiếp diễn</span></h3>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u khẳng định: <strong>S + will + be + V-ing</strong></strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I&nbsp;<strong><u>will be staying</u>&nbsp;</strong>at the hotel in Nha Trang at 1 p.m tomorrow. (<em>T&ocirc;i sẽ đang ở kh&aacute;ch sạn ở Nha Trang l&uacute;c 1h ng&agrave;y mai).</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; She&nbsp;<strong><u>will be working</u></strong>&nbsp;at the factory when you come tomorrow. (<em>C&ocirc; ấy sẽ đang l&agrave;m việc tại nh&agrave; m&aacute;y l&uacute;c bạn đến ng&agrave;y mai).</em></p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u phủ định: <strong>S + will + not + be + V-ing</strong></strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; will not = won&rsquo;t</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp; We&nbsp;<strong><u>won&rsquo;t be studying</u>&nbsp;</strong>at 8 a.m tomorrow. (<em>Ch&uacute;ng t&ocirc;i sẽ đang kh&ocirc;ng học l&uacute;c 8h s&aacute;ng ng&agrave;y mai).</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; The children&nbsp;<strong><u>won&rsquo;t be playing</u></strong>&nbsp;with their friends when you come this weekend. (<em>Bọn trẻ sẽ đang kh&ocirc;ng chơi với bạn của ch&uacute;ng khi bạn đến v&agrave;o cuối tuần n&agrave;y).</em></p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u nghi vấn: <strong>Will + S + be + V-ing ?</strong></strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Trả lời: <strong>Yes, S + will /&nbsp;</strong><strong>No, S + won&rsquo;t</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong><u>Will</u></strong>&nbsp;you&nbsp;<strong><u>be waiting</u></strong>&nbsp;for the train at 9 a.m next Monday? (<em>Bạn sẽ đang đợi t&agrave;u v&agrave;o l&uacute;c 9h s&aacute;ng thứ Hai tuần tới phải kh&ocirc;ng?)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I will./ No, I won&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong><u>Will</u></strong>&nbsp;she&nbsp;<strong><u>be doing</u></strong>&nbsp;the housework at 10 p.m tomorrow? (<em>C&ocirc; ấy sẽ đang l&agrave;m c&ocirc;ng việc nh&agrave; l&uacute;c 10h tối ng&agrave;y mai phải kh&ocirc;ng?</em>)</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, she will./ No, she won&rsquo;t.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">4. Dấu hiệu th&igrave; tương lai tiếp diễn</span></h3>\n" +
                "<p style=\"padding-left: 30px;\">Trong c&acirc;u c&oacute; c&aacute;c trạng từ chỉ thời gian trong tương lai k&egrave;m theo thời điểm x&aacute;c định:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; at this time/ at this moment + thời gian trong tương lai: V&agrave;o thời điểm n&agrave;y &hellip;.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; At + giờ cụ thể + thời gian trong tương lai: v&agrave;o l&uacute;c &hellip;..</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; At this time tomorrow I&nbsp;<strong><u>will be going</u></strong>&nbsp;shopping in Singapore. (<em>V&agrave;o thời điểm n&agrave;y ng&agrave;y mai, t&ocirc;i sẽ đang đi mua sắm ở Singapore</em>).</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; At 10 a.m tomorrow my mother&nbsp;<strong><u>will be cooking</u></strong>&nbsp;lunch. (<em>V&agrave;o 10h s&aacute;ng ng&agrave;y mai mẹ t&ocirc;i sẽ đang nấu bữa trưa</em>).</p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
