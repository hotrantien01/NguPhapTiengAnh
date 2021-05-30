package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class QuaKhuDon {
    WebView webView;

    public QuaKhuDon(WebView webView) {
        this.webView = webView;
        load();
    }

    private void load(){
        String html = "<h3><span style=\"color: #ff9900;\">1. Định nghĩa th&igrave; qu&aacute; khứ đơn</span></h3>\n" +
                "<p>Th&igrave; qu&aacute; khứ đơn (Past simple)&nbsp;d&ugrave;ng để diễn tả h&agrave;nh động sự vật x&aacute;c định trong qu&aacute; khứ hoặc vừa mới kết th&uacute;c.</p>\n" +
                "<h3><span style=\"color: #ff9900;\">2. C&aacute;ch d&ugrave;ng th&igrave; qu&aacute; khứ đơn</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Diễn đạt một h&agrave;nh động xảy ra một, một v&agrave;i lần hoặc chưa bao giờ xảy ra trong qu&aacute; khứ.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;He&nbsp;<strong><em>visited</em></strong>&nbsp;his parents every weekend.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Diễn đạt c&aacute;c h&agrave;nh động xảy ra li&ecirc;n tiếp trong qu&aacute; khứ.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;She&nbsp;<em><strong>came</strong></em>&nbsp;home,&nbsp;<em><strong>switched</strong></em>&nbsp;on the computer and&nbsp;<em><strong>checked</strong></em>&nbsp;her e-mails.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Diễn đạt một h&agrave;nh động xen v&agrave;o một h&agrave;nh động đang diễn ra trong qu&aacute; khứ.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;When I was having breakfast, the phone suddenly&nbsp;<strong><em>rang</em></strong>.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>D&ugrave;ng trong c&acirc;u điều kiện loại II.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;If I&nbsp;<strong>had</strong>&nbsp;a million USD, I would buy that car.</p>\n" +
                "<h3><span style=\"color: #ff9900;\">3. C&ocirc;ng thức th&igrave; qu&aacute; khứ đơn</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>Động từ \"tobe:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\"><strong>+ Khẳng định:&nbsp;S + was/ were</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">S = I/ He/ She/ It (số &iacute;t) + was</p>\n" +
                "<p style=\"padding-left: 30px;\">S= We/ You/ They (số nhiều) + were</p>\n" +
                "<p style=\"padding-left: 30px;\">vd:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; I&nbsp;was&nbsp;at my friend&rsquo;s house yesterday morning. (T&ocirc;i đ&atilde; ở nh&agrave; bạn t&ocirc;i sang h&ocirc;m qua).</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; They&nbsp;were&nbsp;in London on their summer holiday last year. (Họ ở Lu&acirc;n Đ&ocirc;n v&agrave;o kỳ nghỉ h&egrave; năm ngo&aacute;i).</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>+ Phủ định:&nbsp;<em>S + was/were&nbsp;not + V (nguy&ecirc;n thể)</em></strong></p>\n" +
                "<p style=\"padding-left: 30px;\">Đối với c&acirc;u phủ định ta chỉ cần th&ecirc;m &ldquo;not&rdquo; v&agrave;o sau động từ &ldquo;to be&rdquo;.</p>\n" +
                "<p style=\"padding-left: 30px;\">CH&Uacute; &Yacute;:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; was not = wasn&rsquo;t</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; were not = weren&rsquo;t</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; She&nbsp;wasn&rsquo;t&nbsp;very happy last night because of having lost money. (Tối qua c&ocirc; ấy kh&ocirc;ng vui v&igrave; mất tiền).</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; We&nbsp;weren&rsquo;t&nbsp;at home yesterday. (H&ocirc;m qua ch&uacute;ng t&ocirc;i kh&ocirc;ng ở nh&agrave;).</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>+</strong>&nbsp;<strong>Nghi vấn:&nbsp;<em>Was/Were+ S + V(nguy&ecirc;n thể)?</em></strong></p>\n" +
                "<p style=\"padding-left: 30px;\">Trả lời: Yes, I/ he/ she/ it + was.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; No, I/ he/ she/ it + wasn&rsquo;t</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, we/ you/ they + were.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; No, we/ you/ they + weren&rsquo;t.</p>\n" +
                "<p style=\"padding-left: 30px;\">C&acirc;u hỏi ta chỉ cần đảo động từ &ldquo;to be&rdquo; l&ecirc;n trước chủ ngữ.</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd:</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;Was&nbsp;she tired of hearing her customer&rsquo;s complaint yesterday? (C&ocirc; ấy c&oacute; bị mệt v&igrave; nghe kh&aacute;ch h&agrave;ng ph&agrave;n n&agrave;n ng&agrave;y h&ocirc;m qua kh&ocirc;ng?)</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, she was./ No, she wasn&rsquo;t. (C&oacute;, c&ocirc; ấy c&oacute;./ Kh&ocirc;ng, c&ocirc; ấy kh&ocirc;ng.)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash;&nbsp;Were&nbsp;they at work yesterday? (H&ocirc;m qua họ c&oacute; l&agrave;m việc kh&ocirc;ng?)</p>\n" +
                "<p style=\"padding-left: 30px;\">Yes, they were./ No, they weren&rsquo;t. (C&oacute;, họ c&oacute;./ Kh&ocirc;ng, họ kh&ocirc;ng.)</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>+ Lưu &yacute;:</strong></p>\n" +
                "<ul>\n" +
                "<li><em><strong>Ta th&ecirc;m \"-ed\" v&agrave;o sau động từ:</strong></em></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Th&ocirc;ng thường ta th&ecirc;m \"ed\" v&agrave;o sau động từ.</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Vd: watch &ndash; watched / turn &ndash; turned/ want &ndash; wanted</p>\n" +
                "<p style=\"padding-left: 30px;\">* Ch&uacute; &yacute; khi th&ecirc;m đu&ocirc;i \"-ed\" v&agrave;o sau động từ.</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;<strong>Động từ tận c&ugrave;ng l&agrave; \"e\" -&gt; ta chỉ cần cộng th&ecirc;m \"d\"</strong>.</p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ: type &ndash; typed/ smile &ndash; smiled/ agree &ndash; agreed</p>\n" +
                "<p style=\"padding-left: 30px;\">+<strong>&nbsp;Động từ c&oacute; MỘT &acirc;m tiết, tận c&ugrave;ng l&agrave; MỘT phụ &acirc;m, trước phụ &acirc;m l&agrave; MỘT nguy&ecirc;n &acirc;m -&gt; ta nh&acirc;n đ&ocirc;i phụ &acirc;m cuối rồi th&ecirc;m \"-ed\".</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:stop &ndash; stopped/ shop &ndash; shopped/ tap &ndash; tapped</p>\n" +
                "<p style=\"padding-left: 30px;\">NGOẠI LỆ: commit &ndash; committed/ travel &ndash; travelled/ &nbsp;prefer &ndash; preferred</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>+ Động từ tận c&ugrave;ng l&agrave; \"y\":</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Nếu trước \"y\" l&agrave; MỘT nguy&ecirc;n &acirc;m (a,e,i,o,u) ta cộng th&ecirc;m \"ed\".</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd: play &ndash; played/ stay &ndash; stayed</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; Nếu trước \"y\" l&agrave; phụ &acirc;m (c&ograve;n lại ) ta đổi \"y\" th&agrave;nh \"i + ed\".</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd: study &ndash; studied/ cry &ndash; cried</p>\n" +
                "<ul>\n" +
                "<li><strong><em>&nbsp;Một số động từ bất qui tắc kh&ocirc;ng th&ecirc;m \"ed\".</em></strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">C&oacute; một số động từ khi sử dụng ở th&igrave; qu&aacute; khứ kh&ocirc;ng theo qui tắc th&ecirc;m 'ed\". Những động từ n&agrave;y ta cần học thuộc.</p>\n" +
                "<p style=\"padding-left: 30px;\">Vd: go &ndash; went/ get &ndash; got /&nbsp; see &ndash; saw/ buy &ndash; bought.</p>\n" +
                "<h3><span style=\"color: #ff9900;\">4. Dấu hiệu nhận biết th&igrave; qu&aacute; khứ đơn</span></h3>\n" +
                "<p style=\"padding-left: 30px;\"><em>Trong c&acirc;u c&oacute; c&aacute;c trạng từ chỉ thời gian trong qu&aacute; khứ:</em></p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; yesterday (h&ocirc;m qua)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; last night/ last week/ last month/ last year:&nbsp;tối qua/ tuần trước/ th&aacute;ng trước/ năm ngo&aacute;i</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; ago:&nbsp;C&aacute;ch đ&acirc;y. (two hours ago:&nbsp;c&aacute;ch đ&acirc;y 2 giờ/ two weeks ago:&nbsp;c&aacute;ch đ&acirc;y 2 ng&agrave;y &hellip;)</p>\n" +
                "<p style=\"padding-left: 30px;\">&ndash; when:&nbsp;khi&nbsp;(trong c&acirc;u kể).</p>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
