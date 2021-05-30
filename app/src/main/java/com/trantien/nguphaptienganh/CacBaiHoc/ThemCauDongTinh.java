package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemCauDongTinh {
    WebView wv;

    public ThemCauDongTinh(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1.&nbsp;</strong><strong>TOO/SO: cặp n&agrave;y chỉ d&ugrave;ng cho c&acirc;u mang nghĩa khẳng định.</strong></span></h3>\n" +
                "<p><strong>&ndash; TOO</strong>: d&ugrave;ng cuối c&acirc;u.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>A: I LOVE YOU. (anh y&ecirc;u em)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>B: I LOVE YOU, <strong>TOO</strong>. (em cũng y&ecirc;u anh)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>&ndash; SO</strong>: lu&ocirc;n đứng đầu c&acirc;u v&agrave; n&oacute; phải mượn trợ động từ ph&ugrave; hợp đi liền sau n&oacute; v&agrave; đứng liền trước chủ ngữ.</p>\n" +
                "<p>+&nbsp;VD 1:</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>A: I LOVE ENGLISH. (t&ocirc;i y&ecirc;u th&iacute;ch tiếng Anh)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>B: <strong>SO</strong> DO I.(t&ocirc;i cũng vậy)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>(do c&acirc;u A n&oacute;i d&ugrave;ng hiện tại đơn phải động từ thường, do đ&oacute; trợ động từ l&agrave; DO cho chủ ngữ l&agrave; I)</p>\n" +
                "<p>+ VD 2:</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>A: I AM A STUDENT. (t&ocirc;i l&agrave; sinh vi&ecirc;n)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>B: <strong>SO</strong> IS MY YOUNGER BROTHER (em trai t&ocirc;i cũng vậy).</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>(do c&acirc;u người n&oacute;i trước d&ugrave;ng AM, n&ecirc;n phải mượng IS đứng sao SO cho hợp với MY YOUNGER BROTHER, l&agrave; danh từ số &iacute;t)</p>\n" +
                "<p>+&nbsp;VD 3:</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>A: I WENT TO LE HONG PHONG HIGH SCHOOL. (t&ocirc;i đ&atilde; học trường L&ecirc; Hồng Phong)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>B: <strong>SO</strong> DID I. (t&ocirc;i cũng vậy)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>(v&igrave; c&acirc;u người n&oacute;i trước d&ugrave;ng th&igrave; qu&aacute; khứ đơn, n&ecirc;n trợ động từ tương ứng đặt sau SO phải l&agrave; DID)</p>\n" +
                "<p>+ VD 4:</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>A: I HAVE BEEN TO THAILAND. (t&ocirc;i đ&atilde; được đi Th&aacute;i Lan)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>B: <strong>SO</strong> HAVE I. (t&ocirc;i cũng vậy)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>(Do c&acirc;u người n&oacute;i trước d&ugrave;ng th&igrave; hiện tại ho&agrave;n th&agrave;nh n&ecirc;n trợ động từ cần mượn để đặt sau SO phải l&agrave; HAVE)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2.&nbsp;EITHER/NEITHER: cặp n&agrave;y chỉ d&ugrave;ng trong c&acirc;u mang nghĩa phủ định</strong></span></h3>\n" +
                "<p><strong>&ndash; EITHER</strong>: đứng cuối c&acirc;u.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>A: I DON&rsquo;T LIKE FISH. (t&ocirc;i kh&ocirc;ng th&iacute;ch c&aacute;)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>B: I DON&rsquo;T, <strong>EITHER</strong>. (t&ocirc;i cũng kh&ocirc;ng)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>&ndash; NEITHER</strong> đứng đầu c&acirc;u, mượn trợ động từ, trợ động từ đứng liền sau <strong>NEITHER</strong> v&agrave; đứng liền trước Chủ ngữ.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>A: I DON&rsquo;T LIKE FISH. (t&ocirc;i kh&ocirc;ng th&iacute;ch c&aacute;)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>B: <strong>NEITHER</strong> DO I. (t&ocirc;i cũng kh&ocirc;ng)</p>\n" +
                "</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
