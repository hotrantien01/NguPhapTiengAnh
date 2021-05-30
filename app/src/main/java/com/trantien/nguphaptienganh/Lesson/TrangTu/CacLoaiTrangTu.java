package com.trantien.nguphaptienganh.Lesson.TrangTu;

import android.webkit.WebView;

public class CacLoaiTrangTu {
    WebView wv;

    public CacLoaiTrangTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<table border=\"1\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td><strong>Từ đơn</strong></td>\n" +
                "<td>very (rất, lắm),\n" +
                "<p>&nbsp;</p>\n" +
                "<p>too (qu&aacute;),</p>\n" +
                "<p>almost (hầu như),</p>\n" +
                "<p>then (sau đ&oacute;, l&uacute;c đ&oacute;),</p>\n" +
                "<p>&hellip;</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>T&iacute;nh từ + ly</strong></td>\n" +
                "<td>slow (chậm) &nbsp;=&gt; slowly (một c&aacute;ch chậm chạp),\n" +
                "<p>&nbsp;</p>\n" +
                "<p>quick (nhanh) &nbsp;=&gt; quickly (một c&aacute;ch nhanh nhẹn),</p>\n" +
                "<p>clear (s&aacute;ng sủa) &nbsp;=&gt; &nbsp;clearly (một c&aacute;ch s&aacute;ng sủa)</p>\n" +
                "<p><strong>&hellip;</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>Từ k&eacute;p</strong></td>\n" +
                "<td>everywhere (khắp nơi),\n" +
                "<p>&nbsp;</p>\n" +
                "<p>sometimes (đ&ocirc;i khi),</p>\n" +
                "<p>anyhow (d&ugrave; sao đi nữa)</p>\n" +
                "<p><strong>&hellip;</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>Cụm từ:</strong></td>\n" +
                "<td>next week (tuần tới),\n" +
                "<p>&nbsp;</p>\n" +
                "<p>this morning (s&aacute;ng nay),</p>\n" +
                "<p>at the side (ở b&ecirc;n),</p>\n" +
                "<p>with pleasure (vui l&ograve;ng),</p>\n" +
                "<p>at first (trước ti&ecirc;n)</p>\n" +
                "<p>&hellip;</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
