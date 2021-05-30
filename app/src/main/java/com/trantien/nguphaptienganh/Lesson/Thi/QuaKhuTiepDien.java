package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class QuaKhuTiepDien {WebView webView;

    public QuaKhuTiepDien(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Định nghĩa th&igrave; qu&aacute; khứ tiếp diễn</strong></span></h3>\n" +
                "<p>Th&igrave; qu&aacute; khứ tiếp diễn&nbsp;(Past Continuous Tense) d&ugrave;ng khi muốn nhấn mạnh diễn biến hay qu&aacute; tr&igrave;nh của sự vật hay sự việc hoăc thời gian sự vật hay sự việc đ&oacute; diễn ra &hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">2. C&aacute;ch d&ugrave;ng th&igrave; qu&aacute; khứ tiếp diễn</span></h3>\n" +
                "<ul>\n" +
                "<li>Diễn đạt h&agrave;nh động đang xảy ra tại một thời điểm trong qu&aacute; khứ tiếp diễn.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;When my sister got there, he was waiting for her. (Khi chị t&ocirc;i tới, anh ta đ&atilde; đợi ở đ&acirc;y rồi).</p>\n" +
                "<ul>\n" +
                "<li>Diễn đạt hai h&agrave;nh động xảy ra đồng thời trong qu&aacute; khứ.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;While I was taking a bath, she was using the computer. (Trong khi t&ocirc;i đang tắm th&igrave; c&ocirc; ấy d&ugrave;ng m&aacute;y t&iacute;nh).</p>\n" +
                "<ul>\n" +
                "<li>Diễn đạt h&agrave;nh động đang xảy ra th&igrave; c&oacute; h&agrave;nh động kh&aacute;c xen v&agrave;o.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I was listening to the news when she phoned. (T&ocirc;i đang nghe tin tức th&igrave; c&ocirc; ấy gọi tới).</p>\n" +
                "<ul>\n" +
                "<li>H&agrave;nh động lặp đi lặp lại trong qu&aacute; khứ v&agrave; l&agrave;m phiền đến người kh&aacute;c.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;When he worked here, he was always making noise. (Khi anh ta c&ograve;n l&agrave;m việc ở đ&acirc;y, anh ta thường xuy&ecirc;n l&agrave;m ồn).</p>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&ocirc;ng thức th&igrave; qu&aacute; khứ tiếp diễn</span></h3>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u khẳng định:&nbsp;S + was/were + V-ing (+ O)</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">I was thinking about him last night.<br />We were just talking about it before you arrived.</p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u phủ định:&nbsp;S + was/were + not + V-ing (+ O)</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">I wasn&rsquo;t thinking about him last night.<br />We were not talking about it before you arrived.</p>\n" +
                "<ul>\n" +
                "<li><strong>C&acirc;u nghi vấn:&nbsp;(Từ để hỏi) + was/were + S + V-ing (+ O)?</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Were you thinking about him last night?<br />What were you just talking about before I arrived?</p>\n" +
                "<h3><span style=\"color: #ff6600;\">4. Dấu hiệu nhận biết th&igrave; qu&aacute; khứ tiếp diễn</span></h3>\n" +
                "<p style=\"padding-left: 30px;\">Trong c&acirc;u c&oacute; c&aacute;c trạng từ chỉ thời gian trong qu&aacute; khứ k&egrave;m theo thời điểm x&aacute;c định.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; at + giờ + thời gian trong qu&aacute; khứ (at 12 o&rsquo;clock last night,&hellip;)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; at this time + thời gian trong qu&aacute; khứ. (at this time two weeks ago, &hellip;)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; in + năm (in 2000, in 2005)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; in the past (trong qu&aacute; khứ)</p>\n" +
                "<p style=\"padding-left: 30px;\">+ Trong c&acirc;u c&oacute; &ldquo;when&rdquo; khi diễn tả một h&agrave;nh động đang xảy ra v&agrave; một h&agrave;nh động kh&aacute;c xen v&agrave;o.</p>\n" +
                "<p style=\"padding-left: 30px;\">Ngo&agrave;i việc dựa v&agrave;o c&aacute;ch d&ugrave;ng của th&igrave; Qu&aacute; khứ tiếp diễn, ngữ cảnh của c&acirc;u th&igrave; c&aacute;c bạn cũng h&atilde;y c&acirc;n nhắc sử dụng th&igrave; Qu&aacute; khứ tiếp diễn khi c&oacute; xuất hiện c&aacute;c từ như:&nbsp;<strong><em>While (trong khi); When (Khi); at that time (v&agrave;o thời điểm đ&oacute;);&hellip;</em></strong></p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}