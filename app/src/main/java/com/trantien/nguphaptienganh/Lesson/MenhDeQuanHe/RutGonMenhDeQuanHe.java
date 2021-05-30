package com.trantien.nguphaptienganh.Lesson.MenhDeQuanHe;

import android.webkit.WebView;

public class RutGonMenhDeQuanHe {
    WebView wv;

    public RutGonMenhDeQuanHe(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. LƯỢC BỎ ĐẠI TỪ QUAN HỆ</strong></span></h3>\n" +
                "<p>Khi n&agrave;o c&oacute; thể lược bỏ đại từ quan hệ WHO, WHICH, WHOM&hellip;</p>\n" +
                "<p>- Khi n&oacute;<strong>&nbsp;l&agrave;m t&acirc;n ngữ, ph&iacute;a trước n&oacute; kh&ocirc;ng c&oacute; dấu phẩy, kh&ocirc;ng c&oacute; giới từ&nbsp;(whose kh&ocirc;ng được bỏ)</strong></p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>Here is the laptop which I bought</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">-&gt; Here is the laptop I bought</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>This is my book , which I bought 2 years ago. Trước chữ which c&oacute; dấu phẩy n&ecirc;n kh&ocirc;ng thể bỏ được.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>This is the house in which I live. Trước which c&oacute; giới từ in n&ecirc;n cũng kh&ocirc;ng bỏ which đựơc.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>This is the man who lives near my house. Who l&agrave; chủ từ (của động từ lives) n&ecirc;n kh&ocirc;ng thể bỏ n&oacute; được.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. MỆNH ĐỀ QUAN HỆ R&Uacute;T GỌN:&nbsp;</strong></span></h3>\n" +
                "<p>Ta sử dụng những c&aacute;ch sau</p>\n" +
                "<h3><strong>a) D&ugrave;ng cụm Ving :</strong></h3>\n" +
                "<p>D&ugrave;ng cho c&aacute;c mệnh đề chủ động:</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>The girl&nbsp;<strong><em>who is sitting next to you&nbsp;</em></strong>is my sister</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">-&gt; The girl&nbsp;<strong><em>sitting to</em></strong>&nbsp;you is my sister</p>\n" +
                "<h3><strong>b) D&ugrave;ng cụm Ph&acirc;n từ hai :</strong></h3>\n" +
                "<p>D&ugrave;ng cho c&aacute;c mệnh đề bị động .</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>The house&nbsp;<strong><em>which is being built</em></strong>&nbsp;now belongs to Mr. John</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">-&gt; The house&nbsp;<strong><em>built</em></strong>&nbsp;now belongs to Mr. Jonh &nbsp;</p>\n" +
                "<p>(dạng a v&agrave; b l&agrave; 2 dạng v&ocirc; c&ugrave;ng phổ biến)</p>\n" +
                "<h3><strong>c) D&ugrave;ng cụm động từ nguy&ecirc;n mẫu (to Vinf)</strong></h3>\n" +
                "<p>- D&ugrave;ng khi danh từ đứng trước c&oacute; c&aacute;c từ bổ nghĩa như: ONLY, LAST, số thứ tự như: FIRST, SECOND&hellip;</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>He is the last man&nbsp;<strong><em>who left</em></strong>&nbsp;the ship</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">-&gt; He is the last man&nbsp;<strong><em>to leave</em></strong>&nbsp;the ship.</p>\n" +
                "<p>- Động từ l&agrave; HAVE/HAD</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>He had something&nbsp;<strong><em>that he could/ had to do&nbsp;</em></strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">-&gt;He had something&nbsp;<strong><em>to do&nbsp;</em></strong></p>\n" +
                "<p>- Đầu c&acirc;u c&oacute; HERE (BE), THERE (BE)</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>There are six letters which have to be written today.</p>\n" +
                "<p>-&gt; There are six letters to be written today.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>GHI NHỚ :</strong></p>\n" +
                "<p>- Nếu chủ ngữ 2 mệnh đề kh&aacute;c nhau th&igrave; th&ecirc;m cụm for sb trước to inf.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>We have some picture books that children can read.</p>\n" +
                "<p>-&gt; We have some picture books for children to read.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>- Tuy nhi&ecirc;n nếu chủ ngữ đ&oacute; l&agrave; đại từ c&oacute; nghĩa chung chung như we, you, everyone&hellip;. th&igrave; c&oacute; thể kh&ocirc;ng cần ghi ra.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>Studying abroad is the wonderful thing that we must think about.</p>\n" +
                "<p>-&gt; Studying abroad is the wonderful (for us ) to think about.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>- Nếu trước relative pronoun c&oacute; giới từ th&igrave; phải đem xuống cuối c&acirc;u. (đ&acirc;y l&agrave; lỗi dễ sai nhất).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>We have a peg on which we can hang our coat.</p>\n" +
                "<p>-&gt; We have a peg to hang our coat on.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><strong>d) D&ugrave;ng cụm danh từ (đồng c&aacute;ch danh từ )</strong></h3>\n" +
                "<p>D&ugrave;ng khi mệnh đề t&igrave;nh từ c&oacute; dạng:</p>\n" +
                "<p>S + BE + DANH TỪ /CỤM DANH TỪ/CỤM GIỚI TỪ</p>\n" +
                "<p>C&aacute;ch l&agrave;m: Bỏ who ,which v&agrave; be</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>Football, which is a popular sport, is very good for health</p>\n" +
                "<p>-&gt; Football, a popular sport, is very good for health.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>We visited Barcelona,&nbsp;<strong>which is</strong>&nbsp;a city in northern Spain</p>\n" +
                "<p>-&gt; We visited Barcelona, a city in northern Spain.</p>\n" +
                "</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
