package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemCauNhanManh {
    WebView wv;

    public ThemCauNhanManh(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Cấu tr&uacute;c chung:</span></h3>\n" +
                "<ul>\n" +
                "<li><strong><em>It is/was + &hellip; that/whom/who + &hellip;</em></strong></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Nhấn mạnh chủ ngữ:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><strong>It is/was + chủ ngữ (người) + who/that + V</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>It is/was + chủ ngữ (v&acirc;̣t) + that + V</strong></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>&ndash; Mr. Hung teaches English at my school</p>\n" +
                "<p>=&gt; It is Mr. Hung who/that teaches English at my school</p>\n" +
                "<p>&ndash; My dog made neighbors very scared</p>\n" +
                "<p>=&gt; It was my dog that made neighbors very scared</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. Nhấn mạnh t&acirc;n ngữ</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><strong>It is/was + t&acirc;n ngữ (người) + that/whom + S + V</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>It is/was + t&acirc;n ngữ (Danh từ ri&ecirc;ng) + that + S + V</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>It is/was + t&acirc;n ngữ (v&acirc;̣t) + that + S + V</strong></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>&ndash; I gave her a ring last week.</p>\n" +
                "<p><em>=&gt; It was her that/whom I gave a ring last week.</em></p>\n" +
                "<p>&ndash; He met Linh at school yesterday.</p>\n" +
                "<p><em>=&gt; It was Linh that he met at school yesterday.</em></p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. Nhấn mạnh trạng ngữ (thời gian, nơi chốn, c&aacute;ch thức, l&yacute; do,&hellip;)</strong></span></h3>\n" +
                "<ul>\n" +
                "<li><strong><em>It is/was + trạng ngữ + that + S + V + O</em></strong></li>\n" +
                "</ul>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>&ndash; I was born in 1990</p>\n" +
                "<p>=&gt; It was in 1990 that I was born.&nbsp;<strong>(trạng ngữ chỉ thời gian)</strong></p>\n" +
                "<p>&ndash; You can learn more new words by using this method.</p>\n" +
                "<p>=&gt; It is by using this method that you can learn more new words.<strong>&nbsp;(trạng ngữ chỉ c&aacute;ch thức)</strong></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>&ndash; I met him in this restaurant.</p>\n" +
                "<p><em>=&gt; It was in this restaurant that I met him.</em></p>\n" +
                "<p>&ndash; My father repaired the bicycle for my sister.</p>\n" +
                "<p>=&gt; It was for my sister that my father repaired the bicycle.&nbsp;<strong>(trạng ngữ chỉ mục đ&iacute;ch)&nbsp;</strong></p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
