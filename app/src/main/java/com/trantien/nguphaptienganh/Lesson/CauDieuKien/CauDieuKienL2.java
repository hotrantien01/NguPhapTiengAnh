package com.trantien.nguphaptienganh.Lesson.CauDieuKien;

import android.webkit.WebView;

public class CauDieuKienL2 {
    WebView wv;

    public CauDieuKienL2(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Kh&aacute;i niệm:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>C&acirc;u điều kiện loại 2 l&agrave; c&acirc;u điều kiện tr&aacute;i với thực tế ở hiện tại</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. C&ocirc;ng thức:&nbsp;</strong></span></h3>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td style=\"width: 142px;\">\n" +
                "<p><strong>If clause</strong></p>\n" +
                "</td>\n" +
                "<td style=\"width: 330px;\">\n" +
                "<p><strong>Main clause</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 142px;\">\n" +
                "<p>If + S + V-ed /V2...</p>\n" +
                "<p>To be: were / weren't</p>\n" +
                "</td>\n" +
                "<td style=\"width: 330px;\">\n" +
                "<p>S + would / could / should + V1 (wouldn't / couldn't + V1)</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>&ndash; Trong c&acirc;u điều kiện loại II, động từ của mệnh đề điều kiện chia ở bang th&aacute;i c&aacute;ch (past subjunctive), động từ của mệnh đề ch&iacute;nh chia ở th&igrave; điều kiện hiện tại (simple conditional).</p>\n" +
                "<p>Ch&uacute; &yacute;: B&agrave;ng th&aacute;i c&aacute;ch (Past subjunctive) l&agrave; h&igrave;nh thức chia động từ giống hệt như th&igrave; qu&aacute; khư đơn, ri&ecirc;ng động từ &ldquo;to be&rdquo; th&igrave; d&ugrave;ng &ldquo;were&rdquo; cho tất cả c&aacute;c ng&ocirc;i.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. V&iacute; dụ:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>If I had a million USD, I would buy&nbsp;a Ferrari.<em> (Nếu t&ocirc;i c&oacute; một triệu đ&ocirc; la, t&ocirc;i sẽ mua chiếc xe đ&oacute;.)&nbsp;</em>&lArr;<em>&nbsp;hiện tại t&ocirc;i kh&ocirc;ng c&oacute;</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>If he&nbsp;<strong>had</strong>&nbsp;more time, he&nbsp;<strong>would learn</strong>&nbsp;karate.&nbsp;(&nbsp; Nếu anh c&oacute; nhiều thời gian, anh sẽ học karate.) &lArr; thời gian kh&ocirc;ng c&oacute; nhiều</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>She&nbsp;<strong>would spend</strong>&nbsp;a year in the USA if it&nbsp;<strong>were</strong>&nbsp;easier to get a green card. C&ocirc; ấy sẽ d&agrave;nh một năm ở Mỹ nếu dễ d&agrave;ng c&oacute; được thẻ xanh). &lArr; thực tế để lấy được thẻ xanh của Mỹ rất kh&oacute;</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If I&nbsp;<strong>lived</strong>&nbsp;on a lonely island, I&nbsp;<strong>would run</strong>&nbsp;around naked all day. (Nếu t&ocirc;i sống tr&ecirc;n một h&ograve;n đảo c&ocirc; đơn, t&ocirc;i sẽ khỏa th&acirc;n chạy quanh cả ng&agrave;y.) &lArr; thực tế bạn kh&ocirc;ng c&oacute; h&ograve;n đảo n&agrave;o!</p>\n" +
                "</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
