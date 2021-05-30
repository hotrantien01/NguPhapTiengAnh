package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class HienTaiHoanThanhTiepDien {
    WebView webView;

    public HienTaiHoanThanhTiepDien(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff9900;\">1. Định nghĩa th&igrave; hiện tại ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<p>Th&igrave; hiện tại ho&agrave;n th&agrave;nh tiếp diễn l&agrave; th&igrave; được sử dụng để chỉ sự việc xảy ra trong qu&aacute; khứ nhưng vẫn c&ograve;n tiếp tục ở hiện&nbsp;tại v&agrave; c&oacute; thể vẫn c&ograve;n tiếp diễn trong tương lai. Ch&uacute;ng ta sử dụng th&igrave; n&agrave;y để n&oacute;i về sự việc đ&atilde; kết th&uacute;c nhưng ch&uacute;ng ta vẫn c&ograve;n thấy ảnh hưởng</p>\n" +
                "<h3><span style=\"color: #ff9900;\">2. C&aacute;ch d&ugrave;ng th&igrave; hiện tại ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>H&agrave;nh động bắt đầu ở qu&aacute; khứ v&agrave; c&ograve;n đang tiếp tục ở hiện tại (nhấn mạnh t&iacute;nh li&ecirc;n tục).</li>\n" +
                "</ul>\n" +
                "<p style=\"text-align: left; padding-left: 30px;\">vd:&nbsp;She has been waiting for you all day (C&ocirc; n&agrave;ng đ&atilde; đợi cậu cả ng&agrave;y rồi).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>H&agrave;nh động đ&atilde; kết th&uacute;c trong qu&aacute; khứ, nhưng ch&uacute;ng ta quan t&acirc;m tới kết quả tới hiện tại.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I am very tired now because I have been working hard for 12 hours. (B&acirc;y giờ t&ocirc;i rất mệt v&igrave; t&ocirc;i đ&atilde; l&agrave;m việc vất vả trong 12 tiếng đồng hồ).</p>\n" +
                "<h3><span style=\"color: #ff9900;\">3. C&ocirc;ng thức th&igrave; hiện tại tiếp diễn</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>C&acirc;u khẳng định:&nbsp;S + have/ has + VpII</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; S = I/ We/ You/ They + have</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; S = He/ She/ It + has</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I&nbsp;<strong><u>have graduated</u></strong>&nbsp;from my university since 2012. (<em>T&ocirc;i tốt nghiệp đại học từ năm 2012.)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; She&nbsp;<strong><u>has lived</u>&nbsp;</strong>here for one year. (<em>C&ocirc; ấy sống ở đ&acirc;y được một năm rồi</em>.)</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>C&acirc;u phủ định:&nbsp;S + haven&rsquo;t / hasn&rsquo;t + been + V-ing</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; haven&rsquo;t = have not</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; hasn&rsquo;t = has not</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I&nbsp;<strong><u>haven&rsquo;t been studying</u></strong>&nbsp;English for 5 years. (<em>T&ocirc;i kh&ocirc;ng học tiếng Anh được 5 năm rồi.</em>)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; She&nbsp;<strong><u>hasn&rsquo;t been watching</u></strong>&nbsp;films since last year. (<em>C&ocirc; ấy kh&ocirc;ng xem phim từ năm ngo&aacute;i.</em>)</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>C&acirc;u nghi vấn:&nbsp;Have/ Has + S + been + V-ing ?</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I/ we/ you/ they + have. -Yes, he/ she/ it + has.</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong><u>Have</u></strong>&nbsp;you&nbsp;<strong><u>been standing</u></strong>&nbsp;in the rain for more than 2 hours? (<em>Bạn đứng dưới mưa hơn 2 tiếng đồng hồ rồi phải kh&ocirc;ng?)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I have./ No, I haven&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong><u>Has</u></strong>&nbsp;he&nbsp;<strong><u>been typing</u>&nbsp;</strong>the report since this morning? (<em>Anh ấy đ&aacute;nh m&aacute;y b&agrave;i b&aacute;o c&aacute;o từ s&aacute;ng rồi rồi phải kh&ocirc;ng?)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, he has./ No, he hasn&rsquo;t.</p>\n" +
                "<h3><span style=\"color: #ff9900;\">4. Dấu hiện nhận biết th&igrave; hiện tại ho&agrave;n th&agrave;nh tiếp diễn</span></h3>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Since + mốc thời gian</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd: She has been working since the early morning. (C&ocirc; ấy l&agrave;m việc từ s&aacute;ng sớm.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; For + khoảng thời gian</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd: They have been listening to the radio for 3 hours. (Họ nghe đ&agrave;i được 3 tiếng đồng hồ rồi.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; All + thời gian (all the morning, all the afternoon, all day, &hellip;)</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd: They have been working in the field all the morning. (Họ l&agrave;m việc ngo&agrave;i đồng cả buổi s&aacute;ng.)</p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
