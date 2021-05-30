package com.trantien.nguphaptienganh.Lesson.CauSoSanh;

import android.webkit.WebView;

public class SoSanhKep {
    WebView wv;

    public SoSanhKep(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. C&ugrave;ng một t&iacute;nh từ:&nbsp;</strong></span><strong><br /></strong></h3>\n" +
                "<p>C&uacute; ph&aacute;p:</p>\n" +
                "<p><span class=\"bbccolor\">- T&iacute;nh từ/Trạng&nbsp;</span>từ ngắn:&nbsp;<strong>S + V + adj/adv</strong><strong>&nbsp;+ er + and + adj/adv + er</strong></p>\n" +
                "<p>- T&iacute;nh từ/Trạng từ d&agrave;i<span class=\"bbccolor\">:&nbsp;<strong>S + V + more and more + adj/adv</strong></span></p>\n" +
                "<p><u>V&iacute; dụ:</u></p>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>\n" +
                "<p><span class=\"bbccolor\">The weather gets&nbsp;<strong>colder</strong>&nbsp;and&nbsp;<strong>colder</strong>. (T&iacute;nh từ ngắn)&nbsp;</span><span class=\"bbccolor\">Thời tiết c&agrave;ng ng&agrave;y c&agrave;ng lạnh.</span></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>His daughter becomes&nbsp;<strong>more</strong>&nbsp;<strong>and</strong>&nbsp;<strong>more intelligent</strong>. (T&iacute;nh từ d&agrave;i) Con g&aacute;i anh ấy ng&agrave;y c&agrave;ng trở n&ecirc;n th&ocirc;ng minh.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2.&nbsp;Hai t&iacute;nh từ kh&aacute;c nhau:</strong></span></h3>\n" +
                "<p><strong><span class=\"bbccolor\">The + comparative + S + V the + comparative + S + V.</span></strong></p>\n" +
                "<p>(<span class=\"bbccolor\">The + comparative : The + từ ở dạng so s&aacute;nh hơn)</span></p>\n" +
                "<p><u>V&iacute; dụ:</u></p>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>\n" +
                "<p><span class=\"bbccolor\"><strong>The richer</strong>&nbsp;she is&nbsp;<strong>the more selfish</strong>&nbsp;she becomes. (</span><span class=\"bbccolor\">C&agrave;ng gi&agrave;u,c&ocirc; ấy c&agrave;ng trở n&ecirc;n &iacute;ch kỷ hơn.)</span></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><span class=\"bbccolor\"><strong>The more intelligent</strong>&nbsp;he is&nbsp;<strong>the lazier</strong>&nbsp;he becomes. (</span><span class=\"bbccolor\">C&agrave;ng th&ocirc;ng minh,anh ta c&agrave;ng trở n&ecirc;n lười hơn.</span></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">3.&nbsp;<strong>Dạng kh&aacute;c</strong><strong>:&nbsp;</strong>(c&agrave;ng...c&agrave;ng...)</span></h3>\n" +
                "<p><span class=\"bbccolor\"><strong>The + S + V + the + comparative + S + V</strong></span></p>\n" +
                "<p><u>V&iacute; dụ:</u></p>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li><strong>The more</strong>&nbsp;we study&nbsp;<strong>the more stupid</strong>&nbsp;we feel. (Ch&uacute;ng ta c&agrave;ng học th&igrave; ch&uacute;ng ta c&agrave;ng thấy m&igrave;nh chậm hiểu.)</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. Lưu<span class=\"bbccolor\">&nbsp;&yacute;:</span></strong></span></h3>\n" +
                "<p><span class=\"bbccolor\">Trong c&acirc;u so s&aacute;nh k&eacute;p, nếu t&uacute;c từ l&agrave; một&nbsp;<strong>danh từ</strong>&nbsp;th&igrave; ta đặt danh từ ấy ngay sau t&iacute;nh từ so s&aacute;nh.</span></p>\n" +
                "<p><u>V&iacute; dụ:</u></p>\n" +
                "<ul style=\"list-style-type: square;\">\n" +
                "<li>The more<span class=\"apple-converted-space\">&nbsp;</span><em><u>English vocabulary</u></em><em>&nbsp;</em>we know the better we speak. (C&agrave;ng biết nhiều từ vựng tiếng Anh, ta c&agrave;ng n&oacute;i tốt hơn.)</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
