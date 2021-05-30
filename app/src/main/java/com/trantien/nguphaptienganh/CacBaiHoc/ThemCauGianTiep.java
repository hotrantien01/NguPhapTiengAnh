package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemCauGianTiep {
    WebView wv;

    public ThemCauGianTiep(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load(){
        String html = "<h3><span style=\"color: #ff9900;\"><strong>1. KH&Aacute;I NIỆM</strong></span></h3>\n" +
                "<p>C&acirc;u tường thuật l&agrave; c&acirc;u thuật lại lời n&oacute;i trực tiếp.</p>\n" +
                "<ul>\n" +
                "<li><strong>Lời n&oacute;i trực tiếp (direct speech):</strong>&nbsp;l&agrave; n&oacute;i ch&iacute;nh x&aacute;c điều ai đ&oacute; diễn đạt (c&ograve;n gọi l&agrave; tr&iacute;ch dẫn). Lời của người n&oacute;i sẽ được đặt trong dấu ngoặc k&eacute;p.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ:&nbsp;She said, &rdquo; The exam is difficult&rdquo;. \"The exam is&nbsp;difficult\" l&agrave; lời n&oacute;i trực tiếp hay c&acirc;u trực ti</p>\n" +
                "<ul>\n" +
                "<li><strong>Lời n&oacute;i gi&aacute;n tiếp &ndash; c&acirc;u tường thuật (indirect speech):</strong>&nbsp;L&agrave; thuật lại lời n&oacute;i của một người kh&aacute;c dưới dạng gi&aacute;n tiếp, kh&ocirc;ng d&ugrave;ng dấu ngoặc k&eacute;p.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">V&iacute; dụ: Hoa said, &rdquo;I want to go home&rdquo;</p>\n" +
                "<p style=\"padding-left: 30px;\">-&gt; Hoa said she wanted to go home l&agrave; c&acirc;u gi&aacute;n tiếp&nbsp;(indirect speech)</p>\n" +
                "<h3><span style=\"color: #ff9900;\"><strong>2. C&Aacute;CH CHUYỂN C&Acirc;U TRỰC TIẾP SANG C&Acirc;U GI&Aacute;N TIẾP</strong></span></h3>\n" +
                "<p>Khi chuyển từ một lời n&oacute;i trực tiếp sang gi&aacute;n tiếp kh&aacute; đơn giản, ch&uacute;ng ta chỉ cần&nbsp;<strong>gh&eacute;p</strong>&nbsp;nội dung tường thuật ở ph&iacute;a sau c&acirc;u n&oacute;i v&agrave;&nbsp;<strong>hạ</strong>&nbsp;động từ của n&oacute; xuống một cấp qu&aacute; khứ, đại từ được&nbsp;<strong>chuyển</strong>&nbsp;đổi cho ph&ugrave; hợp. Tuy nhi&ecirc;n, cần lưu &yacute; một số vấn đề sau:</p>\n" +
                "<p style=\"padding-left: 30px;\">+ Nếu động từ tường thuật (reporting verb) chia ở c&aacute;c th&igrave; hiện tại ch&uacute;ng ta giữ nguy&ecirc;n th&igrave; (tense) của động từ ch&iacute;nh, đại từ chỉ định v&agrave; c&aacute;c trạng từ chỉ nơi chốn cũng như trạng từ chỉ thời gian trong c&acirc;u trực tiếp khi chuyển sang gi&aacute;n tiếp.<br />V&iacute; dụ:&nbsp;<br />&nbsp;&nbsp;&nbsp;- &nbsp;He&nbsp;<em>says</em>: &ldquo;I&rsquo;<strong>m going</strong>&nbsp;to Ha Noi&nbsp;<strong>next week</strong>.&rdquo;<br />&nbsp;&nbsp; &rArr;&nbsp;He&nbsp;<em>says</em>&nbsp;he&nbsp;<strong>is going</strong>&nbsp;to Ha Noi&nbsp;<strong>next week</strong>.</p>\n" +
                "<p style=\"padding-left: 30px;\">+ Nếu động từ tường thuật (reporting verb) của c&acirc;u ở th&igrave; qu&aacute; khứ th&igrave; phải l&ugrave;i động từ ch&iacute;nh về qu&aacute; khứ một bậc khi chuyển từ lời n&oacute;i trực tiếp (direct speech) sang lời n&oacute;i gi&aacute;n tiếp (indirect / reported speech) theo quy tắc sau:</p>\n" +
                "<ul>\n" +
                "<li><strong>Biến đổi th&igrave; của động từ v&agrave; động từ khuyết thiếu theo bảng sau:</strong></li>\n" +
                "</ul>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p><strong>C&acirc;u trực tiếp</strong></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><strong>C&acirc;u gi&aacute;n tiếp</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Present simple</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Past simple</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Present continuous</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Past continuous</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Present perfect</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Past perfect</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Past simple</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Past perfect</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Present perfect continuous</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Past perfect continuous</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Past continuous</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Past perfect continuous</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>will</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>would</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>can</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>could</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>must/ have to</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>had to</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>may</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>might</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<ul>\n" +
                "<li><strong>Biến đổi đại từ v&agrave; c&aacute;c từ hạn định theo bảng sau:</strong></li>\n" +
                "</ul>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td><strong>C&acirc;u trực tiếp</strong></td>\n" +
                "<td><strong>C&acirc;u gi&aacute;n tiếp</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"3\">\n" +
                "<p>Chủ ngữ</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>I</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>he/ she</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>You</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>I/ We/ They</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>We</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>We/ They</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"3\">\n" +
                "<p>T&acirc;n ngữ</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>me</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>him/ her</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>you</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>me/ us/ them</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>us</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>us/ them</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"3\">\n" +
                "<p>Đại từ sở hữu</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>my</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>his/ her</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>your</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>my/ our/ their</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>our</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>our/ their</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"3\">\n" +
                "<p>Đại từ sở hữu</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>mine</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>his/ hers</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>yours</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>mine/ ours/ theirs</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>ours</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>ours/ theirs</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"2\">\n" +
                "<p>Đại từ chỉ định</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>this</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>the/ that</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>these</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>the/ those</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<ul>\n" +
                "<li><strong>Biến đổi trạng ngữ chỉ thời gian v&agrave; nơi chốn theo bảng sau:</strong></li>\n" +
                "</ul>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr style=\"height: 35.4375px;\">\n" +
                "<td style=\"height: 35.4375px;\">\n" +
                "<p><strong>C&acirc;u trực tiếp</strong></p>\n" +
                "</td>\n" +
                "<td style=\"height: 35.4375px;\">\n" +
                "<p><strong>C&acirc;u gi&aacute;n tiếp&nbsp;</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>here</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>there</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>now</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>then/ at that moment</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>today/ tonight</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>that day/ that night</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>tomorrow</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>the next day</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>next week</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>the following week</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 48px;\">\n" +
                "<td style=\"height: 48px;\">\n" +
                "<p>yesterday</p>\n" +
                "</td>\n" +
                "<td style=\"height: 48px;\">\n" +
                "<p>the previous day<br />the day before</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>last week</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>the week before</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>ago</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>before</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p><strong>NOTE:</strong>&nbsp;Khi chuyển động từ c&aacute;c bạn chỉ cần nhớ lấy động từ gần chủ ngữ&nbsp;nhất&nbsp;giảm xuống 1 cột tức l&agrave;:</p>\n" +
                "<ul>\n" +
                "<li>Động từ ở cột 1 th&igrave; giảm xuống cột 2, ( nhớ &nbsp;th&ecirc;m ed khi kh&ocirc;ng phải l&agrave; đ&ocirc;ng từ bất quy tắc)</li>\n" +
                "<li>Động từ cột 2 th&igrave; giảm th&agrave;nh cột 3</li>\n" +
                "<li>Động từ cột 3 th&ecirc;m had ph&iacute;a trước</li>\n" +
                "</ul>\n" +
                "<p>Tuy nhi&ecirc;n, cần ch&uacute; &yacute; một số trường hợp sau đ&acirc;y kh&ocirc;ng giảm th&igrave; động từ:</p>\n" +
                "<ul>\n" +
                "<li>N&oacute;i về ch&acirc;n l&yacute;, sự thật.</li>\n" +
                "<li>Th&igrave; qu&aacute; khứ ho&agrave;n th&agrave;nh.</li>\n" +
                "<li>Trong c&acirc;u c&oacute; năm x&aacute;c định.</li>\n" +
                "<li>C&aacute;c c&acirc;u c&oacute; cấu tr&uacute;c sau: if only, as if, as though, wish, would rather, it&rsquo;s high time, IF loại&nbsp;2, 3 .</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff9900;\"><strong>3. C&Aacute;C LOẠI C&Acirc;U TƯỜNG THUẬT</strong></span></h3>\n" +
                "<p><strong>a.&nbsp;C&acirc;u tường thuật ở dạng c&acirc;u kể</strong></p>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p align=\"center\"><strong>S + say(s)/said + (that) + S + V</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>says/say to + O&nbsp;-&gt;&nbsp;tells/tell + O</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>said to + O&nbsp;-&gt;told+O</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>Eg: He said to me&rdquo;I haven&rsquo;t finished my work&rdquo; -&gt;&nbsp;He told me he hadn&rsquo;t finished his work.</p>\n" +
                "<p><strong>b. C&acirc;u tường thuật ở dạng c&acirc;u hỏi</strong></p>\n" +
                "<p><strong><em>+Yes/No questions:</em></strong></p>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p align=\"center\"><strong>S+asked/wanted to know/wondered+if/wether+S+V</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>Ex: &rdquo;Are you angry?&rdquo;he asked -&gt;&nbsp;He asked if/whether I was angry.</p>\n" +
                "<p><strong><em>+ Wh-questions:</em></strong></p>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p align=\"center\"><strong>S + asked(+O)/wanted to know/wondered + Wh-words + S + V.</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>* says/say to + O&nbsp;&nbsp;-&gt;&nbsp;asks/ask + O</p>\n" +
                "<p>* said to + O&nbsp;&nbsp;-&gt;&nbsp;asked + O.</p>\n" +
                "<p>Ex: &rdquo;What are you talking about?&rdquo; said the teacher. -&gt;&nbsp;The teacher asked us what we were talking about.</p>\n" +
                "<p><strong>c. C&acirc;u tường thuật ở dạng c&acirc;u mệnh lệnh</strong></p>\n" +
                "<p>*<strong>Khẳng định</strong>:&nbsp;<strong>S + told + O + to-infinitive.</strong></p>\n" +
                "<p>Ex: &rdquo;Please wait for me here, Mary.&rdquo;</p>\n" +
                "<p>Tom said -&gt;&nbsp;Tom told Mary to wait for him there.</p>\n" +
                "<p>*<strong>Phủ định:&nbsp;</strong>:&nbsp;<strong>S + told + O + not to-infinitive.</strong></p>\n" +
                "<p>Ex: &rdquo;Don&rsquo;t talk in class&rdquo;, the teacher said to us. &ndash;&gt;The teacher told us not to talk in class.</p>\n" +
                "<h3><span style=\"color: #ff9900;\">4. Một số dạng c&acirc;u tường thuật đặc biệt</span></h3>\n" +
                "<p>-&gt; SHALL/ WOULD d&ugrave;ng để diễn tả đề nghị, lời mời:</p>\n" +
                "<p>Tom asked: 'Shall I bring you some tea?'</p>\n" +
                "<p>&nbsp;-&gt; Tom offered to bring me some tea.</p>\n" +
                "<p>Tom asked: 'Shall we meet at the theatre?'</p>\n" +
                "<p>&nbsp;-&gt; Tom suggested meeting at the theatre.</p>\n" +
                "<p>-&gt; WILL/ WOULD/ CAN/ COULD d&ugrave;ng để diễn tả sự y&ecirc;u cầu:</p>\n" +
                "<p>Tom asked: 'Will you help me, please?'</p>\n" +
                "<p>&nbsp;-&gt; Tom asked me to help him.</p>\n" +
                "<p>Jane asked Tom: 'Can you open the door for me, Tom?'</p>\n" +
                "<p>&nbsp;-&gt; Jane asked Tom to open the door for her.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
