package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class HienTaiHoanThanh {
    WebView wv;

    public HienTaiHoanThanh(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load(){
        String html = "<h3><span style=\"color: #ff9900;\">1. Định nghĩa th&igrave; hiện tại ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<p><strong>Th&igrave; hiện tại ho&agrave;n th&agrave;nh</strong>&nbsp;(the present perfect tense)&nbsp;d&ugrave;ng để diễn tả về một h&agrave;nh động đ&atilde; ho&agrave;n th&agrave;nh cho tới thời điểm hiện tại m&agrave; kh&ocirc;ng b&agrave;n về thời gian diễn ra n&oacute;</p>\n" +
                "<h3><span style=\"color: #ff9900;\">2. C&aacute;ch d&ugrave;ng th&igrave; hiện tại ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>H&agrave;nh động đ&atilde; ho&agrave;n th&agrave;nh cho tới thời điểm hiện tại m&agrave; kh&ocirc;ng đề cập tới n&oacute; xảy ra khi n&agrave;o.</li>\n" +
                "</ul>\n" +
                "<p style=\"text-align: left; padding-left: 30px;\">vd:&nbsp;I&rsquo;ve done all my homeworks (T&ocirc;i đ&atilde; l&agrave;m hết b&agrave;i tập về nh&agrave;).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>H&agrave;nh động bắt đầu ở qu&aacute; khứ v&agrave; đang tiếp tục ở hiện tại.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;They&rsquo;ve been married for nearly Fifty years (Họ đ&atilde; kết h&ocirc;n được 50 năm)</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>H&agrave;nh động đ&atilde; từng l&agrave;m trước đ&acirc;y v&agrave; b&acirc;y giờ vẫn c&ograve;n l&agrave;m.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;He has written three books and he is working on another book (Anh ấy đ&atilde; viết được 3 cuốn s&aacute;ch v&agrave; đang viết cuốn tiếp theo).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Một kinh nghiệm cho tới thời điểm hiện tại (thường d&ugrave;ng trạng từ ever).</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;My last birthday was the worst day I&rsquo;ve ever had (Sinh nhật năm ngo&aacute;i l&agrave; ng&agrave;y tệ nhất đời t&ocirc;i).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Về một h&agrave;nh động trong qu&aacute; khứ nhưng quan trọng tại thời điểm n&oacute;i.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I can&rsquo;t get my house. I&rsquo;ve lost my keys. (T&ocirc;i kh&ocirc;ng thể v&agrave;o nh&agrave; được. T&ocirc;i đ&aacute;nh mất ch&ugrave;m ch&igrave;a kh&oacute;a của m&igrave;nh rồi).</p>\n" +
                "<h3><span style=\"color: #ff9900;\">3. C&ocirc;ng thức th&igrave; hiện ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>C&acirc;u khẳng định:&nbsp;S + have/ has + been + V-ing</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; S = I/ We/ You/ They + have</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; S = He/ She/ It + has</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; It&nbsp;<strong><u>has been raining</u></strong>&nbsp;for 2 days. (<em>Trời mưa 2 ng&agrave;y rồi).</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; They&nbsp;<strong><u>have been working</u>&nbsp;</strong>for this company for 10 years. (<em>Họ l&agrave;m việc cho c&ocirc;ng ty n&agrave;y 10 năm rồi</em>).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>C&acirc;u phủ định:&nbsp;S + haven&rsquo;t/ hasn&rsquo;t&nbsp; + VpII</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; haven&rsquo;t = have not</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; hasn&rsquo;t = has not</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; We&nbsp;<strong><u>haven&rsquo;t met</u></strong>&nbsp;each other for a long time. (<em>Ch&uacute;ng t&ocirc;i kh&ocirc;ng gặp nhau trong một thời gian d&agrave;i rồi</em>).</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; He&nbsp;<strong><u>hasn&rsquo;t come</u></strong>&nbsp;back his hometown since 1991. (<em>Anh ấy kh&ocirc;ng quay trở lại qu&ecirc; hương của m&igrave;nh từ năm 1991).</em></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>C&acirc;u nghi vấn:&nbsp;Have/ Has + S + VpII ?</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I/ we/ you/ they + have. -Yes, he/ she/ it + has.</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd:</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>-&nbsp;<u>Have</u></strong>&nbsp;you ever&nbsp;<strong><u>travelled</u></strong>&nbsp;to America? (<em>Bạn đ&atilde; từng du lịch tới Mỹ bao giờ chưa?)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I have./ No, I haven&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\">-&nbsp;<strong><u>Has</u></strong>&nbsp;she&nbsp;<strong><u>arrived</u><em>&nbsp;</em></strong>London yet? (<em>C&ocirc; ấy đ&atilde; tới Lu&acirc;n Đ&ocirc;n chưa?)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, she has./ No, she hasn&rsquo;t.</p>\n" +
                "<h3><span style=\"color: #ff9900;\">4. Dấu hiện nhận biết th&igrave; hiện tại ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>just, recently, lately:</strong></em>&nbsp;gần đ&acirc;y, vừa mới.</p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>already:</strong>&nbsp;</em>rồi.</p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>before:</strong></em>&nbsp;trước đ&acirc;y.</p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>ever:</strong>&nbsp;</em>đ&atilde; từng.</p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>never:</strong></em>&nbsp;chưa từng, kh&ocirc;ng bao giờ.</p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>for + N &ndash; qu&atilde;ng thời gian:</strong></em>&nbsp;trong khoảng (for a year, for a long time, &hellip;).</p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>since + N &ndash; mốc/điểm thời gian:</strong></em>&nbsp;từ khi (since 1992, since June, &hellip;).</p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>yet:</strong></em>&nbsp;chưa (d&ugrave;ng trong c&acirc;u phủ định v&agrave; c&acirc;u hỏi).</p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>so far = until now = up to now = up to the present:</strong></em>&nbsp;cho đến b&acirc;y giờ.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
