package com.trantien.nguphaptienganh.Lesson.DongTu;

import android.webkit.WebView;

public class NoiDongTuVaNgoaiDongTu {
    WebView wv;

    public NoiDongTuVaNgoaiDongTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Ngoại động từ (Transitive verbs)</strong></span></h3>\n" +
                "<p>Ngoại&nbsp;động từ&nbsp;diễn tả h&agrave;nh động t&aacute;c động trực tiếp l&ecirc;n người hoặc vật, n&oacute; lu&ocirc;n được theo sau bởi một t&acirc;n ngữ.</p>\n" +
                "<p>Nếu thiếu t&acirc;n ngữ, c&acirc;u sẽ kh&ocirc;ng ho&agrave;n chỉnh.</p>\n" +
                "<p>V&iacute; dụ: She ate that cupcake.</p>\n" +
                "<p>Ngoại động từ lu&ocirc;n lu&ocirc;n cần th&ecirc;m yếu tố b&ecirc;n ngo&agrave;i l&agrave; một danh từ hay đại từ theo sau để ho&agrave;n tất nghĩa của c&acirc;u.</p>\n" +
                "<p>Trong c&acirc;u tr&ecirc;n, ch&uacute;ng ta kh&ocirc;ng thể n&oacute;i &ldquo;she ate&rdquo; rồi ngừng lại. Danh từ đi theo ngay sau ngoại động từ được gọi l&agrave; t&acirc;n ngữ (t&uacute;c từ) trực tiếp (cupcake l&agrave; t&acirc;n ngữ trực tiếp của ate)</p>\n" +
                "<p>Một số v&iacute; dụ :</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>I like it (t&ocirc;i th&iacute;ch n&oacute;) Ta kh&ocirc;ng thể n&oacute;i : I like (t&ocirc;i th&iacute;ch) rồi ngưng lại</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>She brings an umbrella.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>We go to the movie theater.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>They play badminton.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Nội động từ (Intransitive verbs)</strong></span></h3>\n" +
                "<p>Nội động từ diễn tả h&agrave;nh động dừng lại với người n&oacute;i hay người thực hiện n&oacute;.&nbsp;</p>\n" +
                "<p>Nội động từ kh&ocirc;ng cần c&oacute; t&acirc;n ngữ trực tiếp đi k&egrave;m theo.</p>\n" +
                "<p>Nếu c&oacute; t&acirc;n ngữ th&igrave; phải c&oacute; giới từ đi trước, t&acirc;n ngữ n&agrave;y được gọi l&agrave; t&acirc;n ngữ của giới từ (prepositional object), kh&ocirc;ng phải l&agrave; t&acirc;n ngữ trực tiếp.</p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>She walks.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Birds fly.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>She walks in the garden.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Birds fly in the sky.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Children play in the park</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&aacute;c động từ vừa l&agrave; ngoại động từ vừa l&agrave; nội động từ</span></h3>\n" +
                "<p>C&oacute; một số động từ vừa được xem l&agrave; nội động từ, vừa được xem l&agrave; ngo&agrave;i động từ. V&iacute; dụ như:</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>I write a story.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I write.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Who sang that song?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>He sang.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>She left her bag at the restaurant.</p>\n" +
                "</li>\n" +
                "<li>After finished the lunch, her left.</li>\n" +
                "</ul>\n" +
                "<p>Để&nbsp; quyết định khi n&agrave;o d&ugrave;ng nội động từ, khi n&agrave;o d&ugrave;ng ngoại động từ, h&atilde;y x&aacute;c định xem t&acirc;n ngữ trong c&acirc;u l&agrave; g&igrave;? n&oacute; c&oacute; bị t&aacute;c động trực tiếp hoặc theo sau động từ kh&ocirc;ng?</p>\n" +
                "<p>Nếu c&acirc;u c&oacute; t&acirc;n ngữ v&agrave; t&acirc;n ngữ đ&oacute; được t&aacute;c động trực tiếp bởi động từ th&igrave; đ&oacute; l&agrave; ngoại động từ, v&agrave; ngược lại.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">4. Cụm động từ v&agrave; biến thể của từ</span></h3>\n" +
                "<p>Cụm động từ cũng c&oacute; thể được ph&acirc;n loại l&agrave; nội động từ hay ngoại động từ.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Billy has decided to&nbsp;<strong>give up</strong>&nbsp;smoking when his wife has a baby.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I hope Linda doesn&rsquo;t&nbsp;&nbsp;<strong>give up</strong>.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>&ldquo;give up&rdquo; l&agrave; một cụm động từ.</p>\n" +
                "<p>Trong v&iacute; dụ đầu ti&ecirc;n, ta c&oacute; thể thấy &ldquo;give up&rdquo; mang &yacute; nghĩa từ bỏ, qu&ecirc;n một thứ g&igrave; đấy.</p>\n" +
                "<p>C&ograve;n trong v&iacute; dụ thứ hai, &ldquo;give up&rdquo; c&oacute; nghĩa l&agrave; đừng từ bỏ sự cố gắng.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
