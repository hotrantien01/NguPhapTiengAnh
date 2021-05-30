package com.trantien.nguphaptienganh.Lesson.CauUoc;

import android.webkit.WebView;

public class CauUocLoai1 {
    WebView wv;

    public CauUocLoai1(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Định&nbsp;nghĩa:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>C&acirc;u ước ở tương lai d&ugrave;ng để diễn tả những mong ước về một sự việc trong tương lai.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Ch&uacute;ng ta sử dụng c&acirc;u ước ở tương lai với mong muốn ai đ&oacute;, sự việc g&igrave; đ&oacute; sẽ tốt đẹp hơn trong tương lai.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Cấu tr&uacute;c</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Khẳng định:&nbsp;<strong>S+ wish(es) + S + would + V1&nbsp;</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Phủ định:&nbsp;<strong>S + wish(es) + S + wouldn&rsquo;t + V1</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>IF ONLY + S + would/ could + V (bare-infinitive)</strong></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<div>&nbsp;</div>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. V&iacute; dụ:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>I wish you&nbsp;<strong>wouldn&rsquo;t leave</strong>&nbsp;your clothes all over the floor.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I wish I&nbsp;<strong>would be</strong>&nbsp;an astronaut in the future.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If only I&nbsp;<strong>would take</strong>&nbsp;the trip with you next week.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If only I&nbsp;<strong>would be able to</strong>&nbsp;attend your wedding next week.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I wish they&nbsp;<strong>would stop</strong>&nbsp;arguing.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<div>&nbsp;</div>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. Ch&uacute; &yacute;:&nbsp;</strong></span></h3>\n" +
                "<p>Đối với chủ ngữ ở vế &ldquo;wish&rdquo; l&agrave; chủ ngữ số nhiều, ch&uacute;ng ta sử dụng wish.</p>\n" +
                "<p>+ V&iacute; dụ: They wish, Many people wish,&hellip;</p>\n" +
                "<p>Đối với chủ ngữ ở vế &ldquo;wish&rdquo; l&agrave; chủ ngữ số &iacute;t, ch&uacute;ng ta sử dụng wishes.</p>\n" +
                "<p>+ V&iacute; dụ: He wishes, the boy wishes,&hellip;</p>\n" +
                "<p>Động từ ở mệnh đề sau ta chia ở dạng nguy&ecirc;n thể v&igrave; đứng trước n&oacute; l&agrave;&nbsp;<strong>Modal verbs</strong>&nbsp;would/could.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
