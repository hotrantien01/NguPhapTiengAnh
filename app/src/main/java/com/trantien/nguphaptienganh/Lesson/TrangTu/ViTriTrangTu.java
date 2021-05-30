package com.trantien.nguphaptienganh.Lesson.TrangTu;

import android.webkit.WebView;

public class ViTriTrangTu {
    WebView wv;

    public ViTriTrangTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Trước động từ thường (nhất l&agrave; c&aacute;c trạng từ chỉ tần suất: often, always, usually, seldom....)</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>VD: They often get up at 6am.</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Giữa trợ động từ v&agrave; động từ thường</strong></span></h3>\n" +
                "<p><em>VD: I have recently finished my homework.</em></p>\n" +
                "<p><em>TĐT&nbsp;&nbsp; adv&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; V</em></p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. Sau động từ \"to be/seem/look\"...v&agrave; trước t&iacute;nh từ: \"tobe/feel/look\"... + adv + adj</strong></span></h3>\n" +
                "<p><em>Ex: She is very nice.</em></p>\n" +
                "<p><em>Adv&nbsp; adj</em></p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. Sau &ldquo;too&rdquo;: V(thường) + too + adv</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>VD: The teacher speaks too quickly.</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>5. Trước &ldquo;enough&rdquo; : V + adv + enough</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>VD: The teacher speaks slowly enough for us to understand.</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>6. Trong cấu tr&uacute;c so....that: V + so + adv + that</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>VD: Jack drove so fast that he caused an accident.</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>7. Đứng cuối c&acirc;u</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>VD: The doctor told me to breathe in slowly.</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>8. Trạng từ cũng thường đứng một m&igrave;nh ở đầu c&acirc;u,hoặc giữa c&acirc;u v&agrave; c&aacute;ch c&aacute;c th&agrave;nh phần kh&aacute;c của c&acirc;u bằng dấu phẩy (,)</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><em>VD: Last summer, I came back my home country</em></p>\n" +
                "</li>\n" +
                "<li><em>My parents had gone to bed when I got home.</em></li>\n" +
                "</ul>\n" +
                "<p>Trạng từ bổ nghĩa cho từ loại n&agrave;o th&igrave; phải đứng gần từ loại ấy. Quy tắc n&agrave;y thường được gọi l&agrave; Quy tắc \"cận kề\".</p>\n" +
                "<p>VD: She often says she visits her grandmother. (Often bổ nghĩa cho \"says\").</p>\n" +
                "<p>She says he often visits her grandmother. (Often bổ nghĩa cho \"visits\")</p>\n" +
                "<p>Trạng từ chỉ thời gian trong t&igrave;nh huống b&igrave;nh thường n&ecirc;n đặt n&oacute; ở cuối c&acirc;u (như vậy rất kh&aacute;c với tiếng Việt).</p>\n" +
                "<p>VD: We visited our grandmother yesterday. I took the exams last week.</p>\n" +
                "<p>Trạng từ kh&ocirc;ng được đặt/d&ugrave;ng giữa Động từ v&agrave; T&acirc;n ngữ.</p>\n" +
                "<p>VD: He speaks English slowly. He speaks English very fluently.</p>\n" +
                "<p><strong>Một khi c&oacute; nhiều trạng từ trong một c&acirc;u, vị tr&iacute; của trạng từ nằm ở cuối c&acirc;u sẽ c&oacute; thứ tự ưu ti&ecirc;n như sau:&nbsp;</strong></p>\n" +
                "<p><strong><em>[ Nơi chốn - C&aacute;ch thức - Tần suất - Thời gian]</em></strong></p>\n" +
                "<table border=\"1\" cellpadding=\"0\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Chủ ngữ</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Nơi chốn</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>C&aacute;ch thức</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Tần suất</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Thời gian</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>/động từ</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>/địa điểm</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><em>by plane</em></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><em>everyday</em></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><em>yesterday</em></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p><em>I went</em></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><em>to Bankok</em></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><em>by jet plane</em></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><em>once a week</em></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><em>last month</em></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p><em>I walked</em></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><em>to the library</em></p>\n" +
                "</td>\n" +
                "<td>&nbsp;</td>\n" +
                "<td>&nbsp;</td>\n" +
                "<td>\n" +
                "<p><em>last year</em></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p><em>He flew</em></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><em>to London</em></p>\n" +
                "</td>\n" +
                "<td>&nbsp;</td>\n" +
                "<td>&nbsp;</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p><br />Những trạng từ chỉ phẩm chất cho cả một c&acirc;u như Luckily, Fortunately, Eventually, Certainly hoặc Surely ... thường được đặt ở đầu mỗi c&acirc;u.</p>\n" +
                "<p>VD: Certainly, they will be here this afternoon. Luckily, she didn't live where the war broke out in 1914-1918.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
