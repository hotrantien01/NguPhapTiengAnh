package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class QuaKhuHoanThanh {WebView webView;

    public QuaKhuHoanThanh(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<p><strong>Th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh</strong>&nbsp;d&ugrave;ng để diễn tả một h&agrave;nh động xảy ra trước một h&agrave;nh động kh&aacute;c v&agrave; cả hai h&agrave;nh động n&agrave;y đều đ&atilde; xảy ra trong qu&aacute; khứ. H&agrave;nh động n&agrave;o xảy ra trước th&igrave; d&ugrave;ng th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh. H&agrave;nh động xảy ra sau th&igrave; d&ugrave;ng th&igrave; qu&aacute; khứ đơn.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">2. C&aacute;ch d&ugrave;ng th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<ul>\n" +
                "<li>Khi hai h&agrave;nh động c&ugrave;ng xảy ra trong qu&aacute; khứ, ta d&ugrave;ng th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh cho h&agrave;nh động xảy ra trước v&agrave; qu&aacute; khứ đơn cho h&agrave;nh động xảy ra sau.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I met them after they had divorced each other. (T&ocirc;i gặp họ sau khi họ ly dị nhau).</p>\n" +
                "<ul>\n" +
                "<li>Th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh diễn tả h&agrave;nh động đ&atilde; xảy ra v&agrave; đ&atilde; ho&agrave;n tất trước một thời điểm trong qu&aacute; khứ, hoặc trước một h&agrave;nh động kh&aacute;c cũng đ&atilde; kết th&uacute;c trong qu&aacute; khứ.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;We had had lunch when she arrived. (Khi c&ocirc; ấy đến ch&uacute;ng t&ocirc;i đ&atilde; ăn trưa xong).</p>\n" +
                "<ul>\n" +
                "<li>Khi&nbsp;<em>th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh</em>&nbsp;thường được d&ugrave;ng kết hợp với th&igrave; qu&aacute; khứ đơn, ta thường d&ugrave;ng k&egrave;m với c&aacute;c giới từ v&agrave; li&ecirc;n từ như: by (c&oacute; nghĩa như before), before, after, when, till, untill, as soon as, no sooner&hellip;than</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd: No sooner had he returned from a long journey than he was ordered to pack his bags.(Anh ta mới đi xa về th&igrave; lại được lệnh cuốn g&oacute;i ra đi).</p>\n" +
                "<ul>\n" +
                "<li>H&agrave;nh động xảy ra như l&agrave; điều kiện ti&ecirc;n quyết cho h&agrave;nh động kh&aacute;c.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I had prepared for the exams and was ready to do well.</p>\n" +
                "<ul>\n" +
                "<li>Trong c&acirc;u điều kiện loại 3 để diễn tả điều kiện kh&ocirc;ng c&oacute; thực.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;If I had known that, I would have acted differently.</p>\n" +
                "<ul>\n" +
                "<li>H&agrave;nh động xảy ra trong 1 khoảng thời gian trong qu&aacute; khứ, trước 1 mốc thời gian kh&aacute;c.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I had lived abroad for twenty years when I received the transfer.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&ocirc;ng thức th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u khẳng định:&nbsp;S + had + VpII</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; He&nbsp;<strong><u>had gone</u></strong>&nbsp;out when I came into the house. (<em>Anh ấy đ&atilde; đi ra ngo&agrave;i khi t&ocirc;i v&agrave;o nh&agrave;</em>).</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; They&nbsp;<strong><u>had finished</u></strong>&nbsp;their work right before the deadline last week .(<em>Họ đ&atilde; ho&agrave;n th&agrave;nh c&ocirc;ng việc của họ ngay trước hạn ch&oacute;t v&agrave;o tuần trước.</em>).</p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u phủ định:&nbsp;S + hadn&rsquo;t + VpII</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; hadn&rsquo;t = had not</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; She&nbsp;<strong><u>hadn&rsquo;t come</u></strong>home when I got into the house. (<em>C&ocirc; ấy vẫn chưa về nh&agrave; khi t&ocirc;i v&agrave;o nh&agrave;.</em>)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; They&nbsp;<strong><u>hadn&rsquo;t finished</u></strong>their lunch when I saw them. (<em>Họ vẫn chưa ăn xong bữa trưa khi tr&ocirc;ng thấy họ</em>).</p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u nghi vấn: Had + S + VpII ?</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Trả lời: Yes, S + had / No, S + hadn&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Had the film ended when you arrived at the cinema? (<em>Bộ phim đ&atilde; kết th&uacute;c khi bạn tới rạp chiếu phim phải kh&ocirc;ng?)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, it had / No, it hadn&rsquo;t.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">4. Dấu hiệu nhận biết th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh</span></h3>\n" +
                "<p style=\"padding-left: 30px;\">Trong c&acirc;u c&oacute; c&aacute;c từ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; when: Khi</p>\n" +
                "<p style=\"padding-left: 30px;\">V&igrave; dụ:&nbsp;<u>When</u>&nbsp;they arrived at the airport, her flight&nbsp;<strong><u>had taken</u></strong>&nbsp;off. (Khi họ tới s&acirc;n bay, chuyến bay của c&ocirc; ấy đ&atilde; cất c&aacute;nh).</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; before: trước khi (Trước &ldquo;before&rdquo; sử dụng th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh v&agrave; sau &ldquo;before&rdquo; sử dụng th&igrave; qu&aacute; khứ đơn).</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ: She&nbsp;<strong><u>had done</u></strong>&nbsp;her homework&nbsp;<u>before</u>&nbsp;her mother&nbsp;<strong><u>asked</u></strong>&nbsp;her to do so. (<em>C&ocirc; ấy đ&atilde; l&agrave;m b&agrave;i tập về nh&agrave; trước khi mẹ c&ocirc; ấy y&ecirc;u cầu c&ocirc; ấy l&agrave;m như vậy).</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; After: sau khi (Trước &ldquo;after&rdquo; sử dụng th&igrave; qu&aacute; khứ đơn v&agrave; sau &ldquo;after&rdquo; sử dụng th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh).</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ: They&nbsp;<strong><u>went</u></strong>&nbsp;home after they&nbsp;<strong><u>had eaten</u></strong>&nbsp;a big roasted chicken. (<em>Họ về nh&agrave; sau khi đ&atilde; ăn một con g&agrave; quay lớn).</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; by the time (v&agrave;o thời điểm)</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ: He&nbsp;<strong><u>had cleaned</u></strong>&nbsp;the house by the time her mother came back. (Cậu ấy đ&atilde; lau xong nh&agrave; v&agrave;o thời điểm mẹ cậu ấy trở về).</p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
