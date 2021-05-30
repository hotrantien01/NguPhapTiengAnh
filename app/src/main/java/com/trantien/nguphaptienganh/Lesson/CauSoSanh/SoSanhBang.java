package com.trantien.nguphaptienganh.Lesson.CauSoSanh;

import android.webkit.WebView;

public class SoSanhBang {
    WebView wv;

    public SoSanhBang(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Cấu tr&uacute;c:</strong></span></h3>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>\n" +
                "<p><strong>Khẳng định (positive):</strong>&nbsp;S + V + as + adj/adv&nbsp;+ as + N/pronoun</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Phủ định (negative):</strong>&nbsp;S + V + not + so/as + adj/adv + N/Pronoun</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. V&iacute; dụ:</strong></span></h3>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>\n" +
                "<p>She is as beautiful as her sister</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>He is as stupid as his friend</p>\n" +
                "</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
