package com.trantien.nguphaptienganh.Lesson.CongThucVietLaiCau;

import android.webkit.WebView;

public class Phan4 {
    WebView wv;

    public Phan4(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<article class=\"content_detail fck_detail width_common block_ads_connect\">\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 16:&nbsp;</strong>Chuyển c&acirc;u c&oacute;&nbsp;<em>started/began</em>&nbsp;sang&nbsp;<em>th&igrave; hiện tại ho&agrave;n th&agrave;nh</em></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>S + began/ started + to V/ V-ing + [thời gian] ago</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;S + have/has + V3/-ed hoặc been + V-ing + since/for &hellip;</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>She began to learn English 4 years ago.&nbsp;</p>\n" +
                "<p>&harr; She&nbsp;<em><strong>has learned/ has been learning</strong></em>&nbsp;English for 4 years.</p>\n" +
                "<p>(C&ocirc; ấy học tiếng Anh từ bốn năm trước)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 17:&nbsp;</strong>Cấu tr&uacute;c&nbsp;<em>'this is the first time'&nbsp;</em></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>This is the first time + S + have/has + V3/-ed</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;S + have/has + never (not) + V3/-ed + before</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>This is the first time I&nbsp;<em><strong>have watched</strong></em>&nbsp;this film.&nbsp;</p>\n" +
                "<p>&harr; I&nbsp;<em><strong>have never watched</strong></em>&nbsp;this film before.</p>\n" +
                "<p>(T&ocirc;i chưa bao giờ xem bộ phim n&agrave;y trước đ&acirc;y)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 18:</strong><strong>&nbsp;</strong>Cấu tr&uacute;c \"<em>It's high (about) time &hellip;</em>\"</span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>S + should/ought to/had better + V &hellip;</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;It's (high/about) time + S + V2/-ed &hellip;</strong></p>\n" +
                "</blockquote>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>You'd better go to bed.&nbsp;</p>\n" +
                "<p>&harr; It's (high/about) time you went to bed.</p>\n" +
                "<p>(Đ&atilde; tới l&uacute;c con đi ngủ rồi đấy)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 19:</strong>&nbsp;C&aacute;c&nbsp;<em>c&acirc;u đề nghị</em>&nbsp;tương đồng</span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>Shall we + V &harr; Let's + V</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;How/What about + V-ing</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;Why don't we + V</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>- &ldquo;<em><strong>Why don&rsquo;t we</strong></em>&nbsp;go out for a walk?&rdquo; said the girl.&nbsp;</p>\n" +
                "<p>&harr; The girl<em><strong>&nbsp;suggested</strong></em>&nbsp;going out for a walk.</p>\n" +
                "<p>(Tại sao ch&uacute;ng ta kh&ocirc;ng đi dạo đi? - c&ocirc; g&aacute;i đề nghị&nbsp;&harr; C&ocirc; g&aacute;i đề nghị đi ra ngo&agrave;i dạo)</p>\n" +
                "<p><em><strong>- Let's&nbsp;</strong></em>have some rest!&nbsp;</p>\n" +
                "<p>&harr;<em><strong>&nbsp;What about</strong></em>&nbsp;having some rest?</p>\n" +
                "<p>(Nghỉ ngơi ch&uacute;ng th&ocirc;i!)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 20:&nbsp;</strong>&nbsp;<em>C&acirc;u tường thuật</em>&nbsp;dạng bị động:</span></h3>\n" +
                "<table border=\"1\" cellspacing=\"1\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td><strong>C&acirc;u chủ động</strong></td>\n" +
                "<td><strong>C&acirc;u bị động</strong></td>\n" +
                "<td><strong>V&iacute; dụ</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"1\" rowspan=\"2\">\n" +
                "<p><strong>People say + S + V + &hellip;</strong></p>\n" +
                "</td>\n" +
                "<td><strong>It be said that + S + V</strong></td>\n" +
                "<td>\n" +
                "<p>People say that he drinks a lot of wine.&nbsp;<br />&harr; It is said that he drinks a lot of wine.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>S + be said to + V hoặc&nbsp;to have V3/-ed</strong></td>\n" +
                "<td>\n" +
                "<p>People say that he drinks a lot of wine.&nbsp;<br />&harr; He is said to drink a lot of wine.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "</article>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
