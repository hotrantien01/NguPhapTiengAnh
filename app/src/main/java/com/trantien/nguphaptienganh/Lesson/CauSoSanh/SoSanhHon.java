package com.trantien.nguphaptienganh.Lesson.CauSoSanh;

import android.webkit.WebView;

public class SoSanhHon {
    WebView wv;

    public SoSanhHon(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Cấu tr&uacute;c:</span></h3>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>\n" +
                "<p><strong>T&iacute;nh từ ngắn (Short Adj):&nbsp;</strong>S + V + adj/adv + er + than + N/pronoun</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>T&iacute;nh từ d&agrave;i (Long Adj):</strong> S + V + more + adj/adv + than + N/pronoun</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">2. V&iacute; dụ:</span></h3>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>\n" +
                "<p>He is taller than his father.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>She speak English more fluently than her friend.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>Một v&agrave;i t&iacute;nh từ bất quy tắc: good &ndash; better, far &ndash; further / farther, bad &ndash; worse, little &ndash; less, old &ndash; elder, &hellip;</p>\n" +
                "<p>Một v&agrave;i trạng từ bất quy tắc: well &ndash; better, much &ndash; more&hellip;</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
