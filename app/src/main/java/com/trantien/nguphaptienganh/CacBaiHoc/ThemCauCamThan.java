package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemCauCamThan {
    WebView wv;

    public ThemCauCamThan(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Định nghĩa</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>C&acirc;u cảm th&aacute;n l&agrave; c&acirc;u diễn tả một cảm gi&aacute;c cảm x&uacute;c hay th&aacute;i độ (ngạc nhi&ecirc;n, th&aacute;n phục, tội nghiệp, gh&ecirc; tởm,&hellip;) của một người trước một người, sự vật, sự việc n&agrave;o đ&oacute;.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>H&igrave;nh thức cảm th&aacute;n thường được cấu tạo với &ldquo;<em>HOW, WHAT, SO, SUCH&rdquo;&nbsp;</em>v&agrave; h&igrave;nh thức c&acirc;u hỏi phủ định.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. C&acirc;u cảm th&aacute;n với &ldquo;WHAT&rdquo;</strong></span></h3>\n" +
                "<p><strong>- What + a/ an + adj + danh từ số &iacute;t</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>Example:</strong></em></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>What a lazy student! (Cậu học tr&ograve; lười qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>What an interesting novel! (Quyển tiểu thuyết hay qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>- What + adj + danh từ số nhiều/ kh&ocirc;ng đếm được</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>Example</strong></em></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>What tight shoes are! (Giầy chật qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>What beautiful flowers are! (B&ocirc;ng hoa đẹp qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>What beautiful weather! (Thời tiết đẹp qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>&nbsp;</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>- What + a/ an + adj + noun + S + V</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>Example:</strong></em></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>What a beautiful smile you have! (Bạn c&oacute; nụ cười đẹp qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "<li><em>What a good picture they saw! (T&ocirc;i đ&atilde; xem một bức tranh thật tuyệt)</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. C&acirc;u cảm th&aacute;n với &ldquo;HOW</strong></span><span style=\"color: #ff6600;\"><strong><em>&rdquo;</em></strong></span><span style=\"color: #ff6600;\"><strong>:</strong></span></h3>\n" +
                "<h3><strong>- How + adjective/ adverb + S + V</strong></h3>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>Example:</strong></em></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>How cold (adj) it is! (Trời lạnh qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>How interesting (adj) this film is! (Bộ phim n&agrave;y hay qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>How well (adv) she sings! (C&ocirc; ấy h&aacute;t hay thật!)</em></p>\n" +
                "</li>\n" +
                "<li><em><em>How fast you&rsquo;ve grown! (Ch&aacute;u lớn nhanh qu&aacute;!)</em></em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. C&acirc;u cảm th&aacute;n với&nbsp;</strong></span><span style=\"color: #ff6600;\"><strong>&ldquo;</strong></span><span style=\"color: #ff6600;\"><strong>SO</strong></span><span style=\"color: #ff6600;\"><strong><em>&rdquo;&nbsp;</em></strong></span><span style=\"color: #ff6600;\"><strong>v&agrave;&nbsp;</strong></span><span style=\"color: #ff6600;\"><strong>&ldquo;</strong></span><span style=\"color: #ff6600;\"><strong>SUCH</strong></span><span style=\"color: #ff6600;\"><strong><em>&rdquo;</em></strong></span><span style=\"color: #ff6600;\"><strong>:</strong></span></h3>\n" +
                "<h3><strong>- so + adjective</strong>&nbsp;<strong>such (+ a/ an) + adjective + noun</strong></h3>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>Example:</strong></em></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>He is so fat! (Anh ta mập qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>It was such a boring speech! (B&agrave;i diễn văn buồn tẻ qu&aacute;!)</em></p>\n" +
                "</li>\n" +
                "<li><em>She has such an expensive coat! (C&ocirc; ấy c&oacute; c&aacute;i &aacute;o kho&aacute;c đắt tiền l&agrave;m sao!)</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">5. Dạng c&acirc;u hỏi phủ định:</span></h3>\n" +
                "<p style=\"padding-left: 30px;\"><em><strong>Example:</strong></em></p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>Isn&rsquo;t the weather nice! (Thời tiết đẹp qu&aacute; nhỉ)</em></p>\n" +
                "</li>\n" +
                "<li><em>Hasn&rsquo;t she grown! (C&ocirc; b&eacute; lớn nhanh thật)</em></li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
