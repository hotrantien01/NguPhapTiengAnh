package com.trantien.nguphaptienganh.Lesson.CauDieuKien;

import android.webkit.WebView;

public class CauDieuKienL1 {
    WebView wv;

    public CauDieuKienL1(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Kh&aacute;i niệm c&acirc;u điều kiện loại I.</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><em>C&acirc;u điều kiện loại I c&ograve;n được gọi l&agrave; c&acirc;u điều kiện c&oacute; thực ở hiện tại.</em>&nbsp;<em>Điều kiện c&oacute; thể xảy ra ở hiện tại hoặc tương lai.</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Cấu tr&uacute;c &ndash; C&ocirc;ng thức&nbsp;của c&acirc;u điều kiện</strong></span></h3>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td style=\"width: 185px;\">\n" +
                "<p><strong>If clause</strong></p>\n" +
                "</td>\n" +
                "<td style=\"width: 252px;\">\n" +
                "<p><strong>Main clause</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 185px;\">\n" +
                "<p>If + S + V s(es)...</p>\n" +
                "</td>\n" +
                "<td style=\"width: 252px;\">\n" +
                "<p>S + will / can/ may + V1 (won't/can't + VI)</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>IF + Chủ ngữ 1 + Động từ chia ở th&igrave; hiện tại đơn + Bổ ngữ, Chủ ngữ 2 + WILL + Động từ nguy&ecirc;n mẫu + Bổ ngữ (nếu c&oacute;).</p>\n" +
                "<p>Hiểu c&aacute;ch kh&aacute;c trong c&acirc;u điều kiện loại 1, mệnh đề IF d&ugrave;ng th&igrave; hiện tại đơn, mệnh đề ch&iacute;nh d&ugrave;ng th&igrave; tương lai đơn.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><em>Chủ ngữ 1 v&agrave; chủ ngữ 2 c&oacute; thể tr&ugrave;ng nhau. Bổ ngữ c&oacute; thể kh&ocirc;ng c&oacute;, t&ugrave;y &yacute; nghĩa của c&acirc;u. Mệnh đề IF v&agrave; mệnh đề ch&iacute;nh c&oacute; thể đứng trước hay sau đều được.</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>Trong c&acirc;u điều kiện loại 1, động từ của mệnh đề điều kiện chia ở th&igrave; hiện tại đơn, c&ograve;n động từ trong mệnh đề ch&iacute;nh chia ở th&igrave; tương lai đơn.</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. C&aacute;ch d&ugrave;ng c&acirc;u điều kiện loại 1:</strong></span></h3>\n" +
                "<p>C&acirc;u điều kiện loại 1 c&ograve;n c&oacute; thể được gọi l&agrave; c&acirc;u điều kiện hiện tại c&oacute; thể c&oacute; thật. Ta sử dụng c&acirc;u điều kiện loại 1 để đặt ra một điều kiện c&oacute; thể thực hiện được trong hiện tại v&agrave; n&ecirc;u kết quả c&oacute; thể xảy ra.</p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>&nbsp;If I find her address, I&rsquo;ll send her an invitation. ( Nếu t&ocirc;i t&igrave;m được địa chỉ của c&ocirc; ấy, t&ocirc;i sẽ gửi lời mời tới c&ocirc; ấy)</p>\n" +
                "<p>=&gt; Đổi vị tr&iacute; 2 mệnh đề quan hệ:&nbsp; I will send her an invitation if I find her address.)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If John has the money, he will buy a Ferrari. (Nếu John c&oacute; nhiều tiền, anh ấy sẽ mua chiếc Ferrari).</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. V&iacute; dụ:</strong></span></h3>\n" +
                "<ol>\n" +
                "<li>\n" +
                "<p>If Caroline and Sue&nbsp;<strong>prepare</strong>&nbsp;the salad, Phil&nbsp;<strong>will decorate</strong>&nbsp;the house.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If Sue&nbsp;<strong>cuts</strong>&nbsp;the onions for the salad, Caroline&nbsp;<strong>will peel</strong>&nbsp;the mushrooms.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Jane&nbsp;<strong>will hoover</strong>&nbsp;the sitting room if Aaron and Tim&nbsp;<strong>move</strong>&nbsp;the furniture.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If Bob&nbsp;<strong>tidies</strong>&nbsp;up the kitchen, Anita&nbsp;<strong>will clean</strong>&nbsp;the toilet.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Elaine&nbsp;<strong>will buy</strong>&nbsp;the drinks if somebody&nbsp;<strong>helps</strong>&nbsp;her carry the bottles.</p>\n" +
                "</li>\n" +
                "</ol>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
