package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class HienTaiTiepDien {
    WebView webView;

    public HienTaiTiepDien(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff9900;\">1. Định nghĩa th&igrave; hiện tại tiếp diễn</span></h3>\n" +
                "<p>Th&igrave; hiện tại tiếp diễn&nbsp;d&ugrave;ng để diễn tả những sự việc xảy ra ngay l&uacute;c ch&uacute;ng ta n&oacute;i hay xung quanh thời điểm n&oacute;i, v&agrave; h&agrave;nh động chưa chấm dứt (c&ograve;n tiếp tục diễn ra).</p>\n" +
                "<h3><span style=\"color: #ff9900;\">2. C&aacute;ch d&ugrave;ng của th&igrave; hiện tại tiếp diễn</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Diễn đạt một h&agrave;nh động đang xảy ra tại thời điểm n&oacute;i</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px; text-align: left;\">vd:&nbsp;I&nbsp;<strong>am eating</strong>&nbsp;my lunch right now. (B&acirc;y giờ t&ocirc;i đang ăn trưa)</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Diễn tả một h&agrave;nh động hoặc sự việc n&oacute;i chung đang diễn ra nhưng kh&ocirc;ng nhất thiết phải thực sự diễn ra ngay l&uacute;c n&oacute;i.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I&nbsp;<strong>am looking</strong>&nbsp;for a job. (T&ocirc;i đang t&igrave;m kiếm một c&ocirc;ng việc)</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Diễn đạt một h&agrave;nh động sắp xảy ra trong tương lai gần. Thường diễn tả một kế hoạch đ&atilde; l&ecirc;n lịch sẵn</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd: I&nbsp;<strong>am flying</strong>&nbsp;to London tomorrow. (T&ocirc;i sẽ bay sang Lu&acirc;n Đ&ocirc;n s&aacute;ng ng&agrave;y mai)</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>H&agrave;nh động thường xuy&ecirc;n lặp đi lặp lại g&acirc;y sự bực m&igrave;nh hay kh&oacute; chịu cho người n&oacute;i. C&aacute;ch d&ugrave;ng n&agrave;y được d&ugrave;ng với trạng từ \"always, continually\"</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;He&nbsp;<strong>is</strong>&nbsp;always&nbsp;<strong>losing</strong>&nbsp;his keys (Anh ấy cứ hay đ&aacute;nh mất ch&igrave;a kh&oacute;a)</p>\n" +
                "<h3><span style=\"color: #ff9900;\">3. C&ocirc;ng thức th&igrave; hiện tại tiếp diễn</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>Khẳng định:&nbsp;</strong><strong>S + am/ is/ are + V-ing</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Trong đ&oacute;: &nbsp;&nbsp;&nbsp; S (subject): Chủ ngữ</p>\n" +
                "<p style=\"padding-left: 30px;\">am/ is/ are: l&agrave; 3 dạng của động từ &ldquo;to be&rdquo;</p>\n" +
                "<p style=\"padding-left: 30px;\">V-ing: l&agrave; động từ th&ecirc;m &ldquo;&ndash;ing&rdquo;</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>CH&Uacute; &Yacute;:</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; S = I + am</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; S = He/ She/ It + is</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; S = We/ You/ They + are</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I&nbsp;<strong>am playing</strong>&nbsp;football with my friends . (<em>T&ocirc;i đang chơi b&oacute;ng đ&aacute; với bạn của t&ocirc;i</em>.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; She&nbsp;<strong>is cooking</strong>&nbsp;with her mother. (<em>C&ocirc; ấy đang nấu ăn với mẹ của c&ocirc; ấy.)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; We&nbsp;<strong>are studying</strong>&nbsp;English. (<em>Ch&uacute;ng t&ocirc;i đang học Tiếng Anh</em>.)</p>\n" +
                "<p style=\"padding-left: 30px;\">Ta thấy động từ trong c&acirc;u sử dụng th&igrave; hiện tại tiếp diễn cần phải c&oacute; hai th&agrave;nh phần l&agrave;: động từ &ldquo;TO BE&rdquo; v&agrave; &ldquo;V-ing&rdquo;. Với t&ugrave;y từng chủ ngữ m&agrave; động từ &ldquo;to be&rdquo; c&oacute; c&aacute;ch chia kh&aacute;c nhau.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>Phủ định</strong>:&nbsp;<strong>S + am/ is/ are + not + V-ing</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\"><strong>CH&Uacute; &Yacute;:</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; am not: kh&ocirc;ng c&oacute; dạng viết tắt</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; is not = isn&rsquo;t</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; are not = aren&rsquo;t</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I&nbsp;<strong>am not listening</strong>&nbsp;to music at the moment. (<em>L&uacute;c n&agrave;y t&ocirc;i đang kh&ocirc;ng nghe nhạc</em>.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; My sister&nbsp;<strong>isn&rsquo;t working</strong>&nbsp;now. (<em>Chị g&aacute;i t&ocirc;i đang kh&ocirc;ng l&agrave;m việc</em>.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; They&nbsp;<strong>aren&rsquo;t watching</strong>&nbsp;the TV at present. (<em>Hiện tại t&ocirc;i đang kh&ocirc;ng xem ti vi</em>.)</p>\n" +
                "<p style=\"padding-left: 30px;\">Đối với c&acirc;u phủ định của th&igrave; hiện tại tiếp diễn ta chỉ cần th&ecirc;m &ldquo;not&rdquo; v&agrave;o sau động từ &ldquo;to be&rdquo; rồi cộng động từ đu&ocirc;i &ldquo;&ndash;ing&rdquo;.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>Nghi vấn:&nbsp;</strong><strong>Am/ Is/ Are + S + V-ing ?</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Trả lời:</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>Yes, I + am. &ndash; Yes, he/ she/ it + is. &ndash; Yes, we/ you/ they + are.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>No, I + am not. &ndash; No, he/ she/ it + isn&rsquo;t. &ndash; No, we/ you/ they + aren&rsquo;t.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">Đối với c&acirc;u hỏi ta chỉ việc đảo động từ &ldquo;to be&rdquo; l&ecirc;n trước chủ ngữ.</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong>Are</strong>&nbsp;you&nbsp;<strong>doing</strong>&nbsp;your homework? (<em>Bạn đang l&agrave;m b&agrave;i tập về nh&agrave; phải kh&ocirc;ng?</em>)</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, I am./ No, I am not.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;<strong>Is</strong>&nbsp;he&nbsp;<strong>going</strong>&nbsp;out with you? (<em>Anh ấy đang đi chơi c&ugrave;ng bạn c&oacute; phải kh&ocirc;ng?)</em></p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, he is./ No, he isn&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>Lưu &yacute;:&nbsp;</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">Th&ocirc;ng thường ta chỉ cần cộng th&ecirc;m &ldquo;-ing&rdquo; v&agrave;o sau động từ. Nhưng c&oacute; một số ch&uacute; &yacute; như sau:</p>\n" +
                "<ul>\n" +
                "<li><strong>Với động từ tận c&ugrave;ng l&agrave; MỘT chữ &ldquo;e&rdquo;:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Ta bỏ &ldquo;e&rdquo; rồi th&ecirc;m &ldquo;-ing&rdquo;.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Tận c&ugrave;ng l&agrave; HAI CHỮ &ldquo;e&rdquo; ta kh&ocirc;ng bỏ &ldquo;e&rdquo; m&agrave; vẫn th&ecirc;m &ldquo;-ing&rdquo; b&igrave;nh thường.</p>\n" +
                "<ul>\n" +
                "<li><strong>Với động từ tận c&ugrave;ng l&agrave; &ldquo;ie&rdquo;</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Ta đổi &ldquo;ie&rdquo; th&agrave;nh &ldquo;y&rdquo; rồi th&ecirc;m &ldquo;-ing&rdquo;.</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd: lie &ndash; lying, die &ndash; dying.</p>\n" +
                "<h3><span style=\"color: #ff9900;\">4. Dấu hiệu nhận biết th&igrave; hiện tại tiếp diễn</span></h3>\n" +
                "<ul>\n" +
                "<li><strong><em>Trong c&acirc;u c&oacute; c&aacute;c trạng từ chỉ thời gian:</em></strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Now: b&acirc;y giờ</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Right now: Ngay b&acirc;y giờ</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; At the moment: l&uacute;c n&agrave;y</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; At present: hiện tại &ndash; At + giờ cụ thể (at 12 o&rsquo;lock)</p>\n" +
                "<ul>\n" +
                "<li><strong><em>Trong c&acirc;u c&oacute; c&aacute;c động từ như:</em></strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Look! (Nh&igrave;n k&igrave;a!)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Listen! (H&atilde;y nghe n&agrave;y!)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Keep silent! (H&atilde;y im lặng)</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Now my sister is going shopping with my mother. (B&acirc;y giờ em g&aacute;i t&ocirc;i đang đi mua sắm với mẹ của t&ocirc;i.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Look! The train is coming. (Nh&igrave;n kia! t&agrave;u đang đến.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Listen! Someone is crying. (Nghe n&agrave;y! Ai đ&oacute; đang kh&oacute;c.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Keep silent! The baby is sleeping. (H&atilde;y im lặng! Em b&eacute; đang ngủ.)</p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
