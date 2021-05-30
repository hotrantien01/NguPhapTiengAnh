package com.trantien.nguphaptienganh.Lesson.CauSoSanh;

import android.webkit.WebView;

public class SoSanhHonNhieuLan {
    WebView wv;

    public SoSanhHonNhieuLan(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. C&uacute; ph&aacute;p:</span></h3>\n" +
                "<p><span class=\"bbccolor\"><strong>S + V + multiple numbers * + as + much/many/adj/adv + (N) + as + N/pronoun.</strong></span></p>\n" +
                "<p><span class=\"bbccolor\">* l&agrave; những số như&nbsp;<strong>half/twice/3,4,5...times</strong>; Ph&acirc;n số; Phần trăm.</span></p>\n" +
                "<p><u>V&iacute; dụ:</u></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><span class=\"bbccolor\">She types&nbsp;<strong>twice as fast as</strong>&nbsp;<strong>I</strong>. </span></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\"><span class=\"bbccolor\">(</span>C&ocirc; ấy đ&aacute;nh m&aacute;y nhanh gấp hai lần t&ocirc;i đ&aacute;nh m&aacute;y.)</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><span class=\"bbccolor\">In many countries in the world with the same job, women only get&nbsp;<strong>40%-50%</strong>&nbsp;<strong>as much as salary as men</strong>. </span></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\"><span class=\"bbccolor\">(</span><span class=\"bbccolor\">Ở nhiều quốc gia, phụ nữ chỉ nhận được lương bằng với 40-50% lương của người đ&agrave;n &ocirc;ng khi họ c&oacute; c&ugrave;ng một c&ocirc;ng việc.)</span></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>This encyclopedia costs&nbsp;<strong>twice as much as the other one</strong>.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">(Bộ s&aacute;ch b&aacute;ch khoa to&agrave;n thư n&agrave;y mắc gấp đ&ocirc;i bộ c&ograve;n lại.)</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>At the clambake last week, Fred ate&nbsp;<strong>three times as many oysters</strong><strong>&nbsp;as Barney</strong>.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">(Trong buổi tiệc tuần trước, Fred ăn h&agrave;u nhiều gấp 3 lần Barney.)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Lưu &yacute;:</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>Khi d&ugrave;ng so s&aacute;nh loại n&agrave;y phải x&aacute;c định r&otilde; danh từ đ&oacute; l&agrave; đếm được hay kh&ocirc;ng đếm được v&igrave; đằng trước ch&uacute;ng c&oacute; much v&agrave; many</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>C&aacute;c cấu tr&uacute;c&nbsp;<strong>twice that + much/many+ &hellip;</strong>&nbsp;chỉ được d&ugrave;ng trong văn n&oacute;i, tuyệt đối kh&ocirc;ng được d&ugrave;ng trong văn viết.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><u>V&iacute; dụ:</u></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>We had expected eighty people at the rally, but&nbsp;<strong>twice that many</strong>&nbsp;showed up. (văn n&oacute;i)</li>\n" +
                "<li>\n" +
                "<p>We had expected eighty people at the rally, but&nbsp;<strong>twice as many as that number</strong>&nbsp;showed up. (văn viết)</p>\n" +
                "</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
