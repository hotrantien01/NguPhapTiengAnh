package com.trantien.nguphaptienganh.Lesson.CauUoc;

import android.webkit.WebView;

public class CauUocLoai3 {
    WebView wv;

    public CauUocLoai3(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Định&nbsp;nghĩa:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>C&acirc;u ước ở qu&aacute; khứ d&ugrave;ng để diễn tả những mong ước về một sự việc kh&ocirc;ng c&oacute; thật ở qu&aacute; khứ, hay giả định một điều ngược lại so với thực tại đ&atilde; xảy ra ở qu&aacute; khứ.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Ch&uacute;ng ta sử dụng c&acirc;u ước ở q&uacute;a khứ để ước điều tr&aacute;i với những g&igrave; xảy ra trong qu&aacute; khứ, thường l&agrave; để diễn tả sự nuối tiếc với t&igrave;nh huống ở qu&aacute; khứ.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Cấu tr&uacute;c</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Khẳng định: <strong>S + wish(es) + S + had + V3/-ed</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Phủ định: <strong>S + wish(es) + S + hadn&rsquo;t + V3/-ed&nbsp;</strong><strong>= IF ONLY + S + V (P2)</strong></p>\n" +
                "</li>\n" +
                "<li><strong>S + WISH + S + COULD HAVE + P2 = IF ONLY+ S + COULD HAVE + P2</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">- Động từ ở mệnh đề sau wish chia ở&nbsp;<strong>th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh</strong>.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. V&iacute; dụ:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>If only I&nbsp;<strong>had gone</strong>&nbsp;by taxi. (I didn&rsquo;t go by taxi).</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I wish I&nbsp;<strong>hadn&rsquo;t failed</strong>&nbsp;my exam last year. (I failed my exam).</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>She wishes she&nbsp;<strong>had had</strong>&nbsp;enough money to buy the house. (She didn&rsquo;t have enough money to buy it).</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If only I&nbsp;<strong>had met</strong>&nbsp;her yesterday. (I didn&rsquo;t meet her).</p>\n" +
                "</li>\n" +
                "<li>She wishes she&nbsp;<strong>could have been</strong>&nbsp;there. (She couldn&rsquo;t be there).</li>\n" +
                "</ul>\n" +
                "<h3>&nbsp;</h3>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
