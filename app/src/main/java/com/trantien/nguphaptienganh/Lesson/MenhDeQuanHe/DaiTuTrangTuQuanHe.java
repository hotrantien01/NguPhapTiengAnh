package com.trantien.nguphaptienganh.Lesson.MenhDeQuanHe;

import android.webkit.WebView;

public class DaiTuTrangTuQuanHe {
    WebView wv;

    public DaiTuTrangTuQuanHe(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa:</span></h3>\n" +
                "<p>Mệnh đề quan hệ (mệnh đề t&iacute;nh từ) bắt đầu bằng c&aacute;c đại từ quan hệ: who, whom, which, that, whose hay những trạng từ quan hệ: why, where, when. Mệnh đề quan hệ d&ugrave;ng để bổ nghĩa cho danh từ đứng trước n&oacute;.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. C&aacute;c đại từ quan hệ</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em><strong>WHO</strong></em></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">- l&agrave;m chủ từ trong mệnh đề quan hệ</p>\n" +
                "<p style=\"padding-left: 30px;\">- thay thế cho danh từ chỉ người</p>\n" +
                "<p style=\"padding-left: 30px;\">&hellip;.. N (person) + WHO + V + O</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong><em>WHOM</em></strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">- l&agrave;m t&uacute;c từ cho động từ trong mệnh đề quan hệ</p>\n" +
                "<p style=\"padding-left: 30px;\">- thay thế cho danh từ chỉ người</p>\n" +
                "<p style=\"padding-left: 30px;\">&hellip;..N (person) + WHOM + S + V</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong><em>WHICH</em></strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">- l&agrave;m chủ từ hoặc t&uacute;c từ trong mệnh đề quan hệ</p>\n" +
                "<p style=\"padding-left: 30px;\">- thay thế cho danh từ chỉ vật</p>\n" +
                "<p style=\"padding-left: 30px;\">&hellip;.N (thing) + WHICH + V + O</p>\n" +
                "<p style=\"padding-left: 30px;\">&hellip;.N (thing) + WHICH + S + V</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em><strong>THAT</strong></em></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">- c&oacute; thể thay thế cho vị tr&iacute; của who, whom, which trong mệnh đề quan hệ quan hệ x&aacute;c định</p>\n" +
                "<p style=\"padding-left: 30px;\">* C&aacute;c trường hợp thường d&ugrave;ng &ldquo;that&rdquo;:</p>\n" +
                "<p style=\"padding-left: 30px;\">- khi đi sau c&aacute;c h&igrave;nh thức so s&aacute;nh nhất</p>\n" +
                "<p style=\"padding-left: 30px;\">- khi đi sau c&aacute;c từ: only, the first, the last</p>\n" +
                "<p style=\"padding-left: 30px;\">- khi danh từ đi trước bao g&ocirc;m cả người v&agrave; vật</p>\n" +
                "<p style=\"padding-left: 30px;\">- khi đi sau c&aacute;c đại từ bất định, đại từ phủ định, đại từ chỉ số lượng: no one, nobody, nothing, anyone, anything, anybody, someone, something, somebody, all, some, any, little, none.</p>\n" +
                "<p style=\"padding-left: 30px;\">Ex: He was the most interesting person that I have ever met.</p>\n" +
                "<p style=\"padding-left: 30px;\">It was the first time that I heard of it.</p>\n" +
                "<div style=\"padding-left: 30px;\">These books are all that my sister left me.</div>\n" +
                "<p style=\"padding-left: 30px;\">She talked about the people and places that she had visited.</p>\n" +
                "<p style=\"padding-left: 30px;\">* C&aacute;c trường hợp kh&ocirc;ng d&ugrave;ng that:</p>\n" +
                "<p style=\"padding-left: 30px;\">- trong mệnh đề quan hệ kh&ocirc;ng x&aacute;c định</p>\n" +
                "<div style=\"padding-left: 30px;\">- sau giới từ</div>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><em><strong>WHOSE</strong></em></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">D&ugrave;ng để chỉ sở hữu cho danh từ chỉ người hoặc vật, thường thay cho c&aacute;c từ: her, his, their, hoặc h&igrave;nh thức &lsquo;s</p>\n" +
                "<p style=\"padding-left: 30px;\">&hellip;..N (person, thing) + WHOSE + N + V &hellip;.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. C&aacute;c trạng từ quan hệ</strong></span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>&nbsp;WHY</strong>: mở&nbsp;đầu cho mệnh đề quan hệ trong Tiếng Anh&nbsp;chỉ l&yacute; do, thường thay cho cụm for the reason, for that reason.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&hellip;..N (reason) + WHY + S + V &hellip;</p>\n" +
                "<p style=\"padding-left: 30px;\">Ex: I don&rsquo;t know the reason. You didn&rsquo;t go to school for that reason.</p>\n" +
                "<p style=\"padding-left: 30px;\">&rarr;&nbsp;I don&rsquo;t know the reason why you didn&rsquo;t go to school.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>WHERE</strong>: thay thế từ chỉ nơi chốn, thường thay cho there</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&hellip;.N (place) + WHERE + S + V &hellip;.</p>\n" +
                "<p style=\"padding-left: 30px;\">(WHERE = ON / IN / AT + WHICH)</p>\n" +
                "<p style=\"padding-left: 30px;\">Ex: a/ The hotel wasn&rsquo;t very clean. We stayed t that hotel.</p>\n" +
                "<p style=\"padding-left: 30px;\">&rarr;&nbsp;The hotel where we stayed wasn&rsquo;t very clean.</p>\n" +
                "<p style=\"padding-left: 30px;\">&rarr;&nbsp;The hotel at which we stayed wasn&rsquo;t very clean.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>WHEN</strong>: thay thế từ chỉ thời gian, thường thay cho từ then</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&hellip;.N (time) + WHEN + S + V &hellip;</p>\n" +
                "<p style=\"padding-left: 30px;\">(WHEN = ON / IN / AT + WHICH)</p>\n" +
                "<p style=\"padding-left: 30px;\">Ex: Do you still remember the day? We first met on that day.</p>\n" +
                "<p style=\"padding-left: 30px;\">&rarr;&nbsp;Do you still remember the day when we first met?</p>\n" +
                "<p style=\"padding-left: 30px;\">&rarr;&nbsp;Do you still remember the day on which we first met?</p>\n" +
                "<p style=\"padding-left: 30px;\">I don&rsquo;t know the time. She will come back then.</p>\n" +
                "<p style=\"padding-left: 30px;\">&rarr;&nbsp;I don&rsquo;t know the time when she will come back.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4.&nbsp;C&aacute;c loại Mệnh đề quan hệ</strong></span></h3>\n" +
                "<p>C&oacute; hai loại mệnh đề quan hệ: mệnh đề quan hệ x&aacute;c định v&agrave; mệnh đề quan hệ kh&ocirc;ng x&aacute;c định.</p>\n" +
                "<ol type=\"1\">\n" +
                "<li>\n" +
                "<p>Mệnh đề quan hệ x&aacute;c định (Defining relative clauses): l&agrave; mệnh đề được d&ugrave;ng để x&aacute;c định danh từ đứng trước n&oacute;. Mệnh đề x&aacute;c định l&agrave; mệnh đề cần thiết cho &yacute; nghĩa của c&acirc;u, kh&ocirc;ng c&oacute; n&oacute; c&acirc;u sẽ kh&ocirc;ng đủ nghĩa. N&oacute; được sử dụng khi danh từ l&agrave; danh từ kh&ocirc;ng x&aacute;c định v&agrave; kh&ocirc;ng d&ugrave;ng dấu phẩy ngăn c&aacute;ch n&oacute; với mệnh đề ch&iacute;nh.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Mệnh đề quan hệ kh&ocirc;ng hạn định (Non-defining relative clauses): l&agrave; mệnh đề cung cấp th&ecirc;m th&ocirc;ng tin về một người, một vật hoặc một sự việc đ&atilde; được x&aacute;c định. Mệnh đề kh&ocirc;ng x&aacute;c định l&agrave; mệnh đề kh&ocirc;ng nhất thiết phải c&oacute; trong c&acirc;u, kh&ocirc;ng c&oacute; n&oacute; c&acirc;u vẫn đủ nghĩa. N&oacute; được sử dụng khi danh từ l&agrave; danh từ x&aacute;c định v&agrave; được ngăn c&aacute;ch với mệnh đề ch&iacute;nh bằng một hoặc hai dấu phẩy (,) hay dấu gạch ngang (-)</p>\n" +
                "</li>\n" +
                "</ol>\n" +
                "<p>Ex: Dalat, which I visited last summer, is very beautiful. (Non-defining relative clause)</p>\n" +
                "<p>Note: để biết khi n&agrave;o d&ugrave;ng mệnh đề quan hệ kh&ocirc;ng x&aacute;c định, ta lưu &yacute; c&aacute;c điểm sau:</p>\n" +
                "<p>- Khi danh từ m&agrave; n&oacute; bổ nghĩa l&agrave; một danh từ ri&ecirc;ng</p>\n" +
                "<p>- Khi danh từ m&agrave; n&oacute; bổ nghĩa l&agrave; một t&iacute;nh từ sở hữu (my, his, her, their)</p>\n" +
                "<p>- Khi danh từ m&agrave; n&oacute; bổ nghĩa la một danh từ đi với this , that, these, those</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>5. Một số lưu &yacute; trong mệnh đề quan hệ</strong></span></h3>\n" +
                "<p>1. Nếu trong mệnh đề quan hệ c&oacute; giới từ th&igrave; giới từ c&oacute; thể đặt trước hoặc sau mệnh đề quan hệ (chỉ &aacute;p dụng với whom v&agrave; which.)</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Ex: Mr. Brown is a nice teacher. We studied with him last year.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>&rarr;&nbsp;Mr. Brown, with whom we studied last year, is a nice teacher.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>&rarr;&nbsp;Mr. Brown, whom we studied with last year, is a nice teacher.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>2. C&oacute; thể d&ugrave;ng which thay cho cả mệnh đề đứng trước.</p>\n" +
                "<ul>\n" +
                "<li>Ex: She can&rsquo;t come to my birthday party. That makes me sad. &rarr; She can&rsquo;t come to my birthday party, which makes me sad.</li>\n" +
                "</ul>\n" +
                "<p>3. Ở vị tr&iacute; t&uacute;c từ, whom c&oacute; thể được thay bằng who.</p>\n" +
                "<ul>\n" +
                "<li>Ex: I&rsquo;d like to talk to the man whom / who I met at your birthday party.</li>\n" +
                "</ul>\n" +
                "<p>4. Trong mệnh đề quan hệ x&aacute;c định , ch&uacute;ng ta c&oacute; thể bỏ c&aacute;c đại từ quan hệ l&agrave;m t&uacute;c từ:whom, which.</p>\n" +
                "<div>\n" +
                "<ul>\n" +
                "<li>Ex: The girl you met yesterday is my close friend. The book you lent me was very interesting.</li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<p>5. C&aacute;c cụm từ chỉ số lượng some of, both of, all of, neither of, many of, none of &hellip; c&oacute; thể được d&ugrave;ng trước whom, which v&agrave; whose.</p>\n" +
                "<ul>\n" +
                "<li>Ex: I have two sisters, both of whom are students. She tried on three dresses, none of which fitted her.</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
