package com.trantien.nguphaptienganh.Lesson.CauUoc;

import android.webkit.WebView;

public class CauUocLoai2 {
    WebView wv;

    public CauUocLoai2(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Định&nbsp;nghĩa:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><span style=\"color: #000000;\">C&acirc;u ước ở hiện tại d&ugrave;ng để diễn tả những mong ước về một sự việc kh&ocirc;ng c&oacute; thật ở hiện tại, hay giả định một điều ngược lại so với thực tế.</span></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><span style=\"color: #000000;\">Ch&uacute;ng ta d&ugrave;ng c&acirc;u ước ở hiện tại để ước về điều kh&ocirc;ng c&oacute; thật ở hiện tại, thường l&agrave; thể hiện sự nuối tiếc về t&igrave;nh huống hiện tại (regret about present situations).</span></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Cấu tr&uacute;c</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Khẳng định: <strong>S + wish(es) + S + V2/-ed + O (to be: were / weren&rsquo;t)</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Phủ định: <strong>S + wish(es) + S + didn&rsquo;t + V1&nbsp;= IF ONLY + S+ V (simple past)</strong></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">- Động từ ở mệnh đề sau wish lu&ocirc;n được chia ở&nbsp;<strong>th&igrave; qu&aacute; khứ đơn</strong>.</p>\n" +
                "<p style=\"padding-left: 30px;\">- Động từ BE được sử dụng ở dạng giải định c&aacute;ch, tức l&agrave; ta chia BE = WERE với tất cả c&aacute;c chủ ngữ.</p>\n" +
                "<div>&nbsp;</div>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. V&iacute; dụ:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><span style=\"color: #000000;\">If wish I&nbsp;were rich. (But I am poor now).</span></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><span style=\"color: #000000;\">I can&rsquo;t swim. I wish I&nbsp;could&nbsp;swim.</span></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><span style=\"color: #000000;\">If only she&nbsp;were&nbsp;here. (The fact is that she isn&rsquo;t here).</span></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><span style=\"color: #000000;\">We wish that we&nbsp;didn&rsquo;t have to&nbsp;go to class today. (The fact is that we have to go to class today).</span></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3>&nbsp;</h3>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
