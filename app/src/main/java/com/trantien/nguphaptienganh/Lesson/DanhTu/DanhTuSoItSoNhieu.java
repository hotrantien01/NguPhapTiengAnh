package com.trantien.nguphaptienganh.Lesson.DanhTu;

import android.webkit.WebView;

public class DanhTuSoItSoNhieu {
    WebView wv;

    public DanhTuSoItSoNhieu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Danh từ số &iacute;t trong tiếng Anh</span></h3>\n" +
                "<p class=\"definition\">Danh từ số &iacute;t&nbsp;l&agrave; danh từ đếm được với đơn vị số đếm l&agrave; một hoặc c&oacute; thể l&agrave; danh từ kh&ocirc;ng đếm được.</p>\n" +
                "<pre>V&iacute; dụ: apple, cake, table&hellip;</pre>\n" +
                "<p class=\"notice\">Ch&uacute; &yacute;: Một số danh từ c&oacute; tận c&ugrave;ng l&agrave;&nbsp;<strong>s</strong>&nbsp;nhưng vẫn thuộc danh từ số &iacute;t.</p>\n" +
                "<pre>V&iacute; dụ:<br />\n" +
                "&ndash; M&ocirc;n học: physics, mathematics&hellip;<br />\n" +
                "&ndash; Bệnh tật: measles, mumps&hellip;<br />\n" +
                "&ndash; Đo lường: ten pounds, two kilograms, five miles&hellip;<br />\n" +
                "&ndash; Thời gian: six months, nine years&hellip;<br />\n" +
                "&ndash; Gi&aacute; tiền: 100 dollars&hellip;<br />\n" +
                "&ndash; Quốc gia: the United States, the Philipines&hellip;</pre>\n" +
                "<h3><span style=\"color: #ff6600;\">2. Danh từ số nhiều trong tiếng Anh</span></h3>\n" +
                "<p class=\"definition\">Danh từ số nhiều &agrave; danh từ đếm được c&oacute; đơn vị số đếm bằng hoặc lớn hơn hai.</p>\n" +
                "<pre>V&iacute; dụ: five apples, two rooms, six phones&hellip;</pre>\n" +
                "<p class=\"notice\">Ch&uacute; &yacute;: C&oacute; nhiều danh từ kh&ocirc;ng c&oacute; tận c&ugrave;ng l&agrave;&nbsp;<strong>s</strong>&nbsp;nhưng vẫn l&agrave; danh từ số nhiều.</p>\n" +
                "<pre>V&iacute; dụ:<br />\n" +
                "&ndash; Danh từ chỉ tập hợp: police, people, cattle, army, children&hellip;<br />\n" +
                "&ndash; Nh&oacute;m t&iacute;nh từ c&oacute; the ph&iacute;a trước: the poor, the rich, the blind, the dumb, the injured&hellip;\n" +
                "</pre>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&aacute;ch chuyển danh từ số &iacute;t th&agrave;nh số nhiều</span></h3>\n" +
                "<p><strong>a. Th&ocirc;ng thường danh từ đều th&ecirc;m &ldquo;s&rdquo; v&agrave;o cuối để th&agrave;nh số nhiều</strong></p>\n" +
                "<pre>V&iacute; dụ:<br />\n" +
                "&ndash; car -&gt; cars<br />\n" +
                "&ndash; house -&gt; houses<br />\n" +
                "&ndash; ticket -&gt; tickets<br />\n" +
                "&ndash; shop -&gt; shops</pre>\n" +
                "<p><strong>b. Danh từ tận c&ugrave;ng l&agrave; CH, SH, S, X&nbsp;th&igrave; th&ecirc;m &ldquo;es&rdquo; v&agrave;o cuối</strong></p>\n" +
                "<p class=\"notice\">Ch&uacute; &yacute;: từ c&oacute; tận c&ugrave;ng l&agrave; z th&igrave; nh&acirc;n đ&ocirc;i chữ z v&agrave; th&ecirc;m es b&igrave;nh thường.</p>\n" +
                "<pre>V&iacute; dụ:<br />\n" +
                "&ndash; one box -&gt; two boxes<br />\n" +
                "&ndash; a watch -&gt; watches<br />\n" +
                "&ndash; a class -&gt; classes<br />\n" +
                "&ndash; a quiz -&gt; quizzes</pre>\n" +
                "<p><strong>c. Danh từ tận c&ugrave;ng l&agrave; Y đổi th&agrave;nh &ldquo;ies&rdquo;</strong></p>\n" +
                "<pre>V&iacute; dụ:<br />\n" +
                "&ndash; butterfly -&gt; butteflies<br />\n" +
                "&ndash; baby -&gt; babies</pre>\n" +
                "<p><strong>d. Danh từ tận c&ugrave;ng l&agrave; một chữ O th&ecirc;m &ldquo;es&rdquo; v&agrave;o cuối</strong></p>\n" +
                "<pre>V&iacute; dụ:<br />\n" +
                "&ndash; mango -&gt; mangoes<br />\n" +
                "&ndash; tomato -&gt; tomatoes<br />\n" +
                "&ndash; potato -&gt; potatoes</pre>\n" +
                "<p class=\"notice\">Ch&uacute; &yacute;: Một số từ đặc biệt chỉ th&ecirc;m &ldquo;s&rdquo; như photos, pianos.</p>\n" +
                "<p><strong>e. Danh từ tận c&ugrave;ng l&agrave; F, FE, FF ta bỏ đi v&agrave; th&ecirc;m &ldquo;ves&rdquo; v&agrave;o cuối</strong></p>\n" +
                "<pre>V&iacute; dụ:<br />\n" +
                "&ndash; a wife -&gt; wives<br />\n" +
                "&ndash; bookshelf -&gt; bookshelves<br />\n" +
                "&ndash; staff -&gt; staves (hoặc staffs)</pre>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
