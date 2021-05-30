package com.trantien.nguphaptienganh.Lesson.CauDieuKien;

import android.webkit.WebView;

public class CauDieuKienL3 {
    WebView wv;

    public CauDieuKienL3(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Kh&aacute;i niệm:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><em>C&acirc;u điều kiện loại 3 l&agrave; c&acirc;u điều kiện kh&ocirc;ng c&oacute; thực trong qu&aacute; khứ.</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>Điều kiện kh&ocirc;ng thể xảy ra trong qu&aacute; khứ, chỉ mang t&iacute;nh ước muốn trong qu&aacute; khứ, một giả thiết tr&aacute;i ngược với thực trạng ở qu&aacute; khứ.</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Cấu tr&uacute;c:</strong></span></h3>\n" +
                "<table style=\"width: 333px;\" border=\"1\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td style=\"width: 97px;\">\n" +
                "<p><strong>If clause</strong></p>\n" +
                "</td>\n" +
                "<td style=\"width: 224px;\">\n" +
                "<p><strong>Main clause</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 97px;\">\n" +
                "<p>lf +S + had + P.P</p>\n" +
                "</td>\n" +
                "<td style=\"width: 224px;\">\n" +
                "<p>S + would / could / should + have + P.P</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>&ndash; Trong c&acirc;u điều kiện loại III, động từ của mệnh đề điều kiện chia ở qu&aacute; khứ ph&acirc;n từ, c&ograve;n động từ của mệnh đề ch&iacute;nh chia ở điều kiện ho&agrave;n th&agrave;nh (perfect conditional).</p>\n" +
                "<h3><span style=\"color: #ff6600;\">3.&nbsp;<strong>V&iacute; dụ:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>If the forwards&nbsp;<strong>had run</strong>&nbsp;faster, they&nbsp;<strong>would have scored</strong>&nbsp;more goals. (Nếu tiền đạo chạy nhanh hơn, họ sẽ ghi được nhiều b&agrave;n thắng hơn.)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If it&nbsp;<strong>had been</strong>&nbsp;a home game, our team&nbsp;<strong>would have won</strong>&nbsp;the match. (<em>Nếu đ&oacute; l&agrave; trận đấu s&acirc;n nh&agrave;, đội của ch&uacute;ng t&ocirc;i sẽ thắng.)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If you&nbsp;<strong>had spoken</strong>&nbsp;English, she&nbsp;<strong>would have</strong>&nbsp;understood.&nbsp;(<em>Nếu bạn n&oacute;i tiếng Anh th&igrave; c&ocirc; ấy đ&atilde; hiểu)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If they&nbsp;<strong>had listened</strong>&nbsp;to me, we&nbsp;<strong>would have been</strong>&nbsp;home earlier.&nbsp;(&nbsp;<em>nếu họ đ&atilde; nghe lời t&ocirc;i, ch&uacute;ng ta đ&atilde; về nh&agrave; sớm hơn)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I&nbsp;<strong>would have written</strong>&nbsp;you a postcard if I&nbsp;<strong>had had</strong>&nbsp;your address.&nbsp;(<em>T&ocirc;i đ&atilde; viết cho bạn một tấm bưu thiếp nếu t&ocirc;i c&oacute; địa chỉ của bạn)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If I&nbsp;<strong>had not broken</strong>&nbsp;my leg, I&nbsp;<strong>would have taken</strong>&nbsp;part&nbsp;in the contest.&nbsp;(<em>Nếu t&ocirc;i kh&ocirc;ng bị g&atilde;y ch&acirc;n, t&ocirc;i sẽ tham gia cuộc thi.)</em></p>\n" +
                "</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
