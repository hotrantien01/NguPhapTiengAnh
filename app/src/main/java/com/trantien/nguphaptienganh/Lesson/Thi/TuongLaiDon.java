package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class TuongLaiDon {WebView webView;

    public TuongLaiDon(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa th&igrave; tương lai đơn</span></h3>\n" +
                "<p><strong>Th&igrave; tương lai đơn</strong>&nbsp;trong tiếng anh (Simple future tense) được d&ugrave;ng khi kh&ocirc;ng c&oacute; kế hoạch hay quyết định l&agrave;m g&igrave; n&agrave;o trước khi ch&uacute;ng ta n&oacute;i. Ch&uacute;ng ta ra quyết định tự ph&aacute;t tại thời điểm n&oacute;i. Thường sử dụng th&igrave; tương lai đơn với động từ to think trước n&oacute;.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">2. C&aacute;ch d&ugrave;ng th&igrave; tương lai đơn</span></h3>\n" +
                "<ul>\n" +
                "<li>Diễn đạt một quyết định tại thời điểm n&oacute;i.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I miss her. I will go to her house to see her. (T&ocirc;i nhớ c&ocirc; ấy. T&ocirc;i sẽ đến nh&agrave; gặp c&ocirc; ấy).</p>\n" +
                "<ul>\n" +
                "<li>Đưa ra lời y&ecirc;u cầu, đề nghị, lời mời.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;Will you open the door? (Anh đ&oacute;ng cửa gi&uacute;p t&ocirc;i được kh&ocirc;ng) &rarr; lời y&ecirc;u cầu.</p>\n" +
                "<ul>\n" +
                "<li>Diễn đạt dự đo&aacute;n kh&ocirc;ng c&oacute; căn cứ.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;People will not go to Jupiter before 22nd century. (Con người sẽ kh&ocirc;ng thể tới sao Mộc trước thế kỉ 22).</p>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&ocirc;ng thức th&igrave; tương lai đơn</span></h3>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u khẳng định:&nbsp;S + will +&nbsp; V(nguy&ecirc;n thể)</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I will = I&rsquo;ll, They will = They&rsquo;ll</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; He will = He&rsquo;ll, We will = We&rsquo;ll</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; She will = She&rsquo;ll, You will = You&rsquo;ll</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; It will = It&rsquo;ll</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I&nbsp;<strong><u>will help</u></strong>&nbsp;her take care of her children tomorrow morning. (<em>T&ocirc;i sẽ gi&uacute;p c&ocirc; ấy tr&ocirc;ng bọn trẻ v&agrave;o s&aacute;ng mai).</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; She&nbsp;<strong><u>will bring</u></strong>&nbsp;you a cup of tea soon. (<em>C&ocirc; ấy sẽ mang cho bạn một t&aacute;ch tr&agrave; sớm th&ocirc;i).</em></p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u phủ định:&nbsp;S + will not + V(nguy&ecirc;n thể)</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; will not = won&rsquo;t</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I won&rsquo;t tell her the truth. (<em>T&ocirc;i sẽ kh&ocirc;ng n&oacute;i với c&ocirc; ấy sự thật).</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; They won&rsquo;t stay at the hotel. (<em>Họ sẽ kh&ocirc;ng ở kh&aacute;ch sạn).</em></p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u nghi vấn:&nbsp;Will + S + V(nguy&ecirc;n thể)</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Trả lời:&nbsp;<strong>Yes, S + will./ No, S + won&rsquo;t.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Will you come here tomorrow? (<em>Bạn sẽ đến đ&acirc;y v&agrave;o ng&agrave;y mai chứ?</em>)</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I will./ No, I won&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Will they accept your suggestion? (<em>Họ sẽ đồng &yacute; với đề nghị của bạn chứ?</em>)</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, they will./ No, they won&rsquo;t.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">4. Dấu hiệu nhận biết th&igrave; tương lai đơn</span></h3>\n" +
                "<p style=\"padding-left: 30px;\">Trong c&acirc;u c&oacute; c&aacute;c trạng từ chỉ thời gian trong tương lai:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; in + thời gian: trong &hellip; nữa (in 2 minutes: trong 2 ph&uacute;t nữa)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; tomorrow: ng&agrave;y mai</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Next day: ng&agrave;y h&ocirc;m tới</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Next week/ next month/ next year: Tuần tới/ th&aacute;ng tới/ năm tới</p>\n" +
                "<p style=\"padding-left: 30px;\">Trong c&acirc;u c&oacute; những động từ chỉ quan điểm như:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; &nbsp;think/ believe/ suppose/ &hellip;: nghĩ/ tin/ cho l&agrave;</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; perhaps: c&oacute; lẽ</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; probably: c&oacute; lẽ</p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
