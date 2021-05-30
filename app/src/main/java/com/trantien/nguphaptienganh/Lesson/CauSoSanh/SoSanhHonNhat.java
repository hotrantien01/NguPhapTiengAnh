package com.trantien.nguphaptienganh.Lesson.CauSoSanh;

import android.webkit.WebView;

public class SoSanhHonNhat {
    WebView wv;

    public SoSanhHonNhat(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Cấu tr&uacute;c:</span></h3>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>\n" +
                "<p><strong>T&iacute;nh từ ngắn (Short adj):</strong> S + V + the + adj/adv + est + N/pronoun</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>T<strong>&iacute;nh từ d&agrave;i (Long adj)</strong>: S + V + the most + adj/adv + N/pronoun.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">2. V&iacute; dụ:</span></h3>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>\n" +
                "<p>She is the most beautiful girl I have ever seen.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>This is the longest river in the world.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">3. Ch&uacute; &yacute;:</span></h3>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>\n" +
                "<p>Những t&iacute;nh từ ngắn kết th&uacute;c bằng một phụ &acirc;m m&agrave; ngay trước n&oacute; l&agrave; nguy&ecirc;n &acirc;m duy nhất th&igrave; ch&uacute;ng ta nh&acirc;n đ&ocirc;i phụ &acirc;m l&ecirc;n rồi th&ecirc;m \"er\" trong so s&aacute;nh hơn v&agrave; \"est\" trong so s&aacute;nh nhất.(ex:hot--&gt;hotter/hottest)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Những t&iacute;nh từ c&oacute; hai vần, kết th&uacute;c bằng chữ \"y\" th&igrave; đổi \"y\" th&agrave;nh \"i\" rồi th&ecirc;m \"er\" trong so s&aacute;nh hơn v&agrave; \"est\" trong so s&aacute;nh nhất(ex:happy--&gt;happier/happiest)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Những t&iacute;nh từ/trạng từ đọc từ hai &acirc;m trở l&ecirc;n gọi l&agrave; t&iacute;nh từ d&agrave;i,một &acirc;m gọi l&agrave; t&iacute;nh từ ngắn. Tuy nhi&ecirc;n, một số t&iacute;nh từ c&oacute; hai vần nhưng kết th&uacute;c bằng \"le\", \"et\", \"ow\", \"er\" vẫn xem l&agrave; t&iacute;nh từ ngắn (ex: slow--&gt; slower)</p>\n" +
                "</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
