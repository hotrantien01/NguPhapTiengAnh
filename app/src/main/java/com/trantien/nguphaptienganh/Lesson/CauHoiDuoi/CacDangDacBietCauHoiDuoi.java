package com.trantien.nguphaptienganh.Lesson.CauHoiDuoi;

import android.webkit.WebView;

public class CacDangDacBietCauHoiDuoi {
    WebView wv;

    public CacDangDacBietCauHoiDuoi(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>- C&acirc;u giới thiệu d&ugrave;ng &ldquo;I am&rdquo;, c&acirc;u hỏi đu&ocirc;i l&agrave; &ldquo;aren&rsquo;t I&rdquo;</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>I&nbsp;am&nbsp;a student,&nbsp;aren&rsquo;t&nbsp;I?</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>- C&acirc;u giới thiệu d&ugrave;ng Let&rsquo;s, c&acirc;u hỏi đu&ocirc;i l&agrave; &ldquo;Shall we&rdquo;</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>Let&rsquo;s&nbsp;go for a picnic,&nbsp;shall we?</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>- Chủ ngữ l&agrave; những&nbsp;đại từ bất định&nbsp;&ldquo;Everyone, someone, anyone, no one, nobody&hellip;&rdquo; c&acirc;u hỏi đu&ocirc;i l&agrave; &ldquo;they&rdquo;</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>Somebody&nbsp;wanted a drink, didn&rsquo;t&nbsp;they?</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>Nobody&nbsp;phoned, did&nbsp;they?</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><strong>- Chủ ngữ l&agrave; &ldquo;nothing&rdquo; th&igrave; c&acirc;u hỏi đu&ocirc;i d&ugrave;ng &ldquo;it&rdquo;. V&agrave; Nothing l&agrave; chủ ngữ c&oacute; nghĩa l&agrave; mệnh đề giới thiệu đang ở dạng phủ định, c&acirc;u hỏi đu&ocirc;i sẽ ở dạng khẳng định.</strong></strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>Nothing&nbsp;can happen, can&nbsp;it?</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>- Trong c&acirc;u c&oacute; c&aacute;c&nbsp;trạng từ&nbsp;phủ định v&agrave; b&aacute;n phủ định như: never, seldom, hardly, scarely, little&hellip; th&igrave; c&acirc;u đ&oacute; được xem như l&agrave; c&acirc;u phủ định &ndash; phần hỏi đu&ocirc;i sẽ ở dạng khẳng định</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>He&nbsp;seldom drinks&nbsp;wine,&nbsp;does&nbsp;he</em>?</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>- C&acirc;u đầu c&oacute;&nbsp;<em>It seems that + mệnh đề</em>, lấy mệnh đề l&agrave;m c&acirc;u hỏi đu&ocirc;i&nbsp;</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>It seems that you are right, aren&rsquo;t you ?</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>&ndash; Chủ từ l&agrave; mệnh đề&nbsp;</strong><strong>danh từ</strong><strong><a style=\"color: #ff6600;\" href=\"http://oxford.edu.vn/goc-tieng-anh/hoc-tieng-anh-cung-oxford/danh-tu-trong-tieng-anh-629.html\">,</a>&nbsp;d&ugrave;ng &ldquo;it&rdquo; trong c&acirc;u hỏi đu&ocirc;i</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>What you have said is wrong, isn&rsquo;t it ?</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>Why he killed himself seems a secret, doesn&rsquo;t it ?</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><em>-&nbsp;</em>Sau c&acirc;u mệnh lệnh c&aacute;ch (Do&hellip;/Don&rsquo;t do v.v&hellip; ),&nbsp; c&acirc;u hỏi đu&ocirc;i thường l&agrave; &hellip; will you?:</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>Open the door, will you?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Don&rsquo;t be late, will you?</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>- C&acirc;u đầu l&agrave; I WISH, d&ugrave;ng MAY&nbsp;trong c&acirc;u hỏi đu&ocirc;i</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>I wish to study English, may I ?</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>-&nbsp;Chủ từ l&agrave; ONE, d&ugrave;ng you hoặc one trong c&acirc;u hỏi đu&ocirc;i</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>One can be one&rsquo;s master, can&rsquo;t you/one?</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>-&nbsp;C&acirc;u đầu c&oacute; MUST, must c&oacute; nhiều c&aacute;ch d&ugrave;ng cho n&ecirc;n t&ugrave;y theo c&aacute;ch d&ugrave;ng m&agrave; sẽ c&oacute; c&acirc;u hỏi đu&ocirc;i kh&aacute;c nhau</strong></span></h3>\n" +
                "<p>+ Must chỉ sự cần thiết: =&gt; d&ugrave;ng needn&rsquo;t</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>They must study hard, needn&rsquo;t they?</em></li>\n" +
                "</ul>\n" +
                "<p>+ Must chỉ sự cấm đo&aacute;n: =&gt; d&ugrave;ng must&nbsp;</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>You mustn&rsquo;t come late, must you ?</em>&nbsp;</li>\n" +
                "</ul>\n" +
                "<p>+ Must chỉ sự dự đo&aacute;n ở hiện tại: =&gt; dựa v&agrave;o động từ theo sau must&nbsp;</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>He must be a very intelligent student, isn&rsquo;t he? (anh ta ắt hẳn l&agrave; 1 học sinh rất th&ocirc;ng minh, phải kh&ocirc;ng ?)</li>\n" +
                "</ul>\n" +
                "<p>+ Must chỉ sự dự đo&aacute;n ở qu&aacute; khứ (trong c&ocirc;ng thức must +have+ p.p) : =&gt; d&ugrave;ng have/has&nbsp;</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>You must have stolen my bike, haven&rsquo;t you? (bạn chắc hẵn l&agrave; đ&atilde; lấy cắp xe của t&ocirc;i, phải kh&ocirc;ng?)</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>-&nbsp;C&acirc;u cảm th&aacute;n, lấy danh từ trong c&acirc;u đổi th&agrave;nh đại từ, d&ugrave;ng is, am, are</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>What a beautiful dress, isn&rsquo;t it?</em></p>\n" +
                "</li>\n" +
                "<li><em>How intelligent you are, aren&rsquo;t you?</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>- C&acirc;u đầu c&oacute; I + c&aacute;c động từ sau: think, believe, suppose, figure, assume, fancy, imagine, reckon, expect, seem, feel + mệnh đề phụ, lấy mệnh đề phụ l&agrave;m c&acirc;u hỏi đu&ocirc;i.</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p><em>I think he will come here, won&rsquo;t he?</em></p>\n" +
                "</li>\n" +
                "<li><em>I don&rsquo;t believe Mary can do it, can she?</em></li>\n" +
                "</ul>\n" +
                "<p>( lưu &yacute; MĐ ch&iacute;nh c&oacute; not th&igrave; vẫn t&iacute;nh như ở MĐ phụ)&nbsp;</p>\n" +
                "<p>C&ugrave;ng mẫu n&agrave;y nhưng nếu chủ từ kh&ocirc;ng phải l&agrave; I th&igrave; lại d&ugrave;ng mệnh đề đầu l&agrave;m c&acirc;u hỏi đu&ocirc;i.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>She thinks he will come, doesn&rsquo;t she?</em></li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>-&nbsp;USED TO: từng (diễn tả th&oacute;i quen, h&agrave;nh động thường lập đi lập lại trong qu&aacute; khứ).</strong></span></h3>\n" +
                "<p>+ Trường hợp n&agrave;y, ta cứ việc xem USED TO l&agrave; một động từ chia ở th&igrave; qu&aacute; khứ. Do đ&oacute;, c&acirc;u hỏi đu&ocirc;i tương ứng chỉ cần mượn trợ động từ DID</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em>She used to live here, didn&rsquo;t she?</em>&nbsp;</li>\n" +
                "</ul>\n" +
                "<p>+ Had better:&nbsp; &ldquo;<strong>had better</strong>&rdquo; thường được viết ngắn gọn th&agrave;nh &lsquo;D BETTER, n&ecirc;n dễ khiến ta l&uacute;ng t&uacute;ng khi phải lập c&acirc;u hỏi đu&ocirc;i tương ứng. Khi thấy &lsquo;D BETTER, chỉ cần mượn trợ động từ HAD để lập c&acirc;u hỏi đu&ocirc;i.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>He&rsquo;d better stay, hadn&rsquo;t he?&nbsp;</li>\n" +
                "</ul>\n" +
                "<p>+ WOULD RATHER:&nbsp;&nbsp;<strong>Would rather</strong>&nbsp;thường được viết gọn l&agrave; &lsquo;D RATHER n&ecirc;n cũng dễ g&acirc;y l&uacute;ng t&uacute;ng cho bạn. Chỉ cần mượn trợ động từ WOULD cho trường hợp n&agrave;y để lập c&acirc;u hỏi đu&ocirc;i.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>You&rsquo;d rather go, wouldn&rsquo;t you?</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
