package com.trantien.nguphaptienganh.Lesson.DongTu;

import android.webkit.WebView;

public class DongTuThieuKhuyet {
    WebView wv;

    public DongTuThieuKhuyet(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1.Tại sao lại gọi l&agrave; động từ khiếm khuyết?</strong></span></h3>\n" +
                "<p>- Động từ&nbsp;<strong>kh&ocirc;ng cần chia ở ng&ocirc;i thứ 3 số &iacute;t</strong>: I can, She can, He can</p>\n" +
                "<p>-<strong>&nbsp;Kh&ocirc;ng c&oacute; h&igrave;nh thức nguy&ecirc;n thể&nbsp;</strong>hay&nbsp;<strong>ph&acirc;n từ</strong>&nbsp; hai giống như c&aacute;c động từ thường kh&aacute;c</p>\n" +
                "<p>-&nbsp;<strong>Động từ ch&iacute;nh đứng đằng sau kh&ocirc;ng chia</strong>, ở dạng nguy&ecirc;n thể (c&oacute; hoặc kh&ocirc;ng c&oacute; &ldquo;to&rdquo; )</p>\n" +
                "<p>-&nbsp;<strong>Kh&ocirc;ng cần trợ động từ</strong>&nbsp;trong c&acirc;u hỏi, c&acirc;u phủ định, c&acirc;u hỏi đu&ocirc;i&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. C&aacute;c động từ khiếm khuyết hay gặp:</strong></span></h3>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p><strong>Modal Verbs</strong></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><strong>Chức năng</strong></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><strong>V&iacute; dụ</strong></p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p><strong>Ch&uacute; &yacute;</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Can</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Diễn tả khả năng hiện tại hoặc tương lai l&agrave; một người c&oacute; thể l&agrave;m được g&igrave;, hoặc một sự việc c&oacute; thể xảy ra</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>You can speak Spainish.</p>\n" +
                "<p>It can rain.</p>\n" +
                "</td>\n" +
                "<td rowspan=\"2\">\n" +
                "<p>- Can v&agrave; Could c&ograve;n được d&ugrave;ng trong c&acirc;u hỏi đề nghị, xin ph&eacute;p, y&ecirc;u cầu.</p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>Could you please wait a moment?</p>\n" +
                "<p>Can I ask you a question?</p>\n" +
                "<p>- C&oacute; thể d&ugrave;ng &ldquo;be able to&rdquo; thay cho &ldquo;can hoặc could&rdquo;</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Could (qu&aacute; khứ của &ldquo;Can&rdquo;)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Diễn tả khả năng xảy ra trong qu&aacute; khứ</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>My brother could speak English when he was five.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Must</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Diễn đạt sự cần thiết, bắt buộc ở hiện tại hoặc tương lai</p>\n" +
                "<p>Đưa ra lời khuy&ecirc;n hoặc suy luận mang t&iacute;nh chắc chắn, y&ecirc;u cầu được nhấn mạnh</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>You must get up earily in the morning.</p>\n" +
                "<p>You must be hungry after work hard.</p>\n" +
                "<p>You must be here before 8 a.m</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Mustn&rsquo;t &ndash; chỉ sự cấm đo&aacute;n</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Have to</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Diễn tả sự cần thiết phải l&agrave;m g&igrave; nhưng l&agrave; do kh&aacute;ch quan (nội quy, quy định&hellip;)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>I have to stop smoking. My doctor said that.</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Don&rsquo;t have to= Don&rsquo;t need to (chỉ sự kh&ocirc;ng cần thiết)</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>May</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Diễn tả điều g&igrave; c&oacute; thể xảy ra ở hiện tại</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>May I call her?</p>\n" +
                "</td>\n" +
                "<td rowspan=\"2\">\n" +
                "<p>-May v&agrave; might d&ugrave;ng để xin ph&eacute;p. Nhưng might &iacute;t được d&ugrave;ng trong văn n&oacute;i, chủ yếu trong c&acirc;u gi&aacute;n tiếp:</p>\n" +
                "<p>&nbsp;May I turn on TV?</p>\n" +
                "<p>I wonder if he might go there alone.</p>\n" +
                "<p>-Might được d&ugrave;ng kh&ocirc;ng phải l&agrave; qu&aacute; khứ của May</p>\n" +
                "<p>Where is John? I don&rsquo;t know. He may/might go out with his friends.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Might (qu&aacute; khứ của &ldquo;May&rdquo;)</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Diễn tả điều g&igrave; c&oacute; thể xảy ra ở qu&aacute; khứ</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>She might not be his house.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Will</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Diễn đạt, dự đo&aacute;n sự việc xảy ra trong tương lai</p>\n" +
                "<p>Đưa ra một quyết định tại thời điểm n&oacute;i</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Tomorrow will be sunny.</p>\n" +
                "<p>Did you buy sugar? Oh, sorry. I&rsquo;ll go now.</p>\n" +
                "</td>\n" +
                "<td rowspan=\"2\">\n" +
                "<p>D&ugrave;ng Will hay Would trong c&acirc;u đề nghị, y&ecirc;u cầu, lời mời</p>\n" +
                "<p>Will you have a cup of coffee?</p>\n" +
                "<p>Would you like a cake?</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Would</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Diễn tả một giả định xảy ra hoặc dự đo&aacute;n sự việc c&oacute; thể xảy ra trong qu&aacute; khứ</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>She was a child. She would be upset when hear this bad news.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Shall</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>D&ugrave;ng để xin &yacute; kiến,lời khuy&ecirc;n. &ldquo;Will&rdquo; được sử dụng nhiều hơn</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Where shall we eat tonight?</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>&nbsp;</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Should</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Chỉ sự bắt buộc hay bổn phận nhưng ở mức độ nhẹ hơn &ldquo;Must&rdquo;</p>\n" +
                "<p>Đưa ra lời khuy&ecirc;n, &yacute; kiến</p>\n" +
                "<p>D&ugrave;ng để suy đo&aacute;n</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>You should send this report by 8<sup>th</sup>September.</p>\n" +
                "<p>You should call her.</p>\n" +
                "<p>She worked hard, she should get the best result.</p>\n" +
                "<p>&nbsp;</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>&nbsp;</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Ought to</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Chỉ sự bắt buộc. Mạnh hơn &ldquo;Should&rdquo; nhưng chưa bằng &ldquo;Must&rdquo;</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>You ought not to eat candy at night.</p>\n" +
                "<p>&nbsp;</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>&nbsp;</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p><strong>Mức độ lịch sự&nbsp;</strong>trong c&acirc;u y&ecirc;u cầu khi d&ugrave;ng c&aacute;c động từ khiếm khuyết (được xếp từ cao tới thấp):</p>\n" +
                "<p><strong>May I- Could/Would you (please)- Will you- Can I</strong></p>\n" +
                "<p>&nbsp;</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
