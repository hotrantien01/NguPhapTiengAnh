package com.trantien.nguphaptienganh.Lesson.CauSoSanh;

import android.webkit.WebView;

public class BangSoSanh {
    WebView wv;

    public BangSoSanh(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<table border=\"1\" cellspacing=\"1\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p><strong>Adj</strong></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><strong>So s&aacute;nh hơn</strong></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><strong>So s&aacute;nh nhất</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>good/well</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>better</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>best</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>bad&nbsp;</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>worse</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>worst</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>little (amount)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>less</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>least</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>little (size)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>smaller</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>smallest</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>much / many</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>more</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>most</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>far (place + time)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>further</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>furthest</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>far (place)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>farther</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>farthest</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>late (time)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>later</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>latest</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>near (place)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>nearer</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>nearest</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>old (people and things)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>older/elder</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>oldest/eldest</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
