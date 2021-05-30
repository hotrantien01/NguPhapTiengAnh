package com.trantien.nguphaptienganh.Lesson.CongThucVietLaiCau;

import android.webkit.WebView;
public class Phan3 {
    WebView wv;

    public Phan3(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><strong><span style=\"color: #ff6600;\">Cấu tr&uacute;c 11:&nbsp;Chuyển đổi c&acirc;u từ dang<em>&nbsp;th&igrave; hiện tại ho&agrave;n th&agrave;nh</em>&nbsp;phủ định sang&nbsp;<em>th&igrave; qu&aacute; khứ đơn</em></span></strong></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>S + have/has + NOT&nbsp;+ V3/-ed + since/for &hellip;</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;S + last + V2/-ed + when + S + V</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;The last time + S + V + was &hellip;</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>- I haven't met Lucy since we left school.&nbsp;</p>\n" +
                "<p>&harr;&nbsp;<em><strong>The last time</strong></em>&nbsp;I met Lucy was when we left school.</p>\n" +
                "<p>(Lần cuối c&ugrave;ng t&ocirc;i gặp Lucy l&agrave; khi ch&uacute;ng t&ocirc;i ra trường)</p>\n" +
                "<p>- I haven't seen him since I was a student.&nbsp;</p>\n" +
                "<p>&harr; I&nbsp;<em><strong>last</strong></em>&nbsp;saw him&nbsp;<em><strong>when</strong></em>&nbsp;I was a student.</p>\n" +
                "<p>(T&ocirc;i gặp anh ta lần cuối khi t&ocirc;i vẫn c&ograve;n l&agrave; học sinh)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 12:</strong>&nbsp;Chuyển c&acirc;u ở<em>&nbsp;th&igrave; qu&aacute; khứ</em>&nbsp;sang&nbsp;<em>th&igrave; hiện tại ho&agrave;n th&agrave;nh tiếp diễn</em></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>S + V2/-ed + &hellip;</strong></p>\n" +
                "<p><strong>&hArr;</strong><strong>&nbsp;S + have/has + been + V-ing + since/for + &hellip;</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>Shawn&nbsp;<em><strong>started</strong></em>&nbsp;playing guitar since he was five.&nbsp;</p>\n" +
                "<p>&harr; Shawn&nbsp;<em><strong>has been playing</strong></em>&nbsp;guitar since he was five.</p>\n" +
                "<p>(Shawn đ&atilde; chơi ghi-ta từ khi cậu ấy l&ecirc;n 5 tuổi)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 13:</strong>&nbsp;Cấu tr&uacute;c&nbsp;<em>d&agrave;nh/tốn thời gian l&agrave;m g&igrave;</em></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>S + V + &hellip; + [thời gian]</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;It takes/took + someone + [thời gian] + to V</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>Betty&nbsp;<em><strong>walks</strong></em>&nbsp;to school in 15 minutes.&nbsp;</p>\n" +
                "<p>&harr; It&nbsp;<em><strong>takes</strong></em>&nbsp;Betty 15 minutes&nbsp;<em><strong>to walk</strong></em>&nbsp;to school.</p>\n" +
                "<p>(Betty mất 15 ph&uacute;t để đi bộ tới trường)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 14:&nbsp;</strong>Chuyển đổi d&ugrave;ng cấu tr&uacute;c&nbsp;<em>it was not until &hellip; that&nbsp;</em>(m&atilde;i cho tới khi)</span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>S + didn't + V (bare) + &hellip;. until &hellip;</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;It was not until + &hellip; + that + &hellip;</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>Nam&nbsp;<em><strong>didn't go</strong></em>&nbsp;home until he finishes all the tasks.&nbsp;</p>\n" +
                "<p>&harr;&nbsp;<em><strong>It was not until</strong></em>&nbsp;Nam finish all the tasks&nbsp;<em><strong>that</strong></em>&nbsp;he went home.</p>\n" +
                "<p>(M&atilde;i cho tới khi Nam ho&agrave;n th&agrave;nh xong hết mọi c&ocirc;ng việc th&igrave; cậu mới về nh&agrave;)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 15:&nbsp;</strong>C&aacute;c dạng so s&aacute;nh</span></h3>\n" +
                "<p>- Chuyển đổi c&acirc;u so s&aacute;nh hơn th&agrave;nh so s&aacute;nh nhất v&agrave; ngược lại:&nbsp;</p>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>In my opinion, Vietnam is&nbsp;<em><strong>the most beautiful</strong></em>&nbsp;country.&nbsp;</p>\n" +
                "<p>&harr; In my opinion,&nbsp;<em><strong>no</strong></em>&nbsp;other place on earth can be&nbsp;<em><strong>more beautiful than</strong></em>&nbsp;Vietnam.</p>\n" +
                "<p>(Việt Nam l&agrave; đất nước xinh đẹp nhất theo quan điểm của t&ocirc;i&nbsp;</p>\n" +
                "<p>&harr; Theo quen điểm của t&ocirc;i, kh&ocirc;ng nơi n&agrave;o đẹp bằng Việt Nam)</p>\n" +
                "<p>- Chuyển đổi c&acirc;u so s&aacute;nh bằng th&agrave;nh so s&aacute;nh hơn v&agrave; ngược lại:</p>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>My cake isn't&nbsp;<em><strong>as big as</strong></em>&nbsp;his cake.&nbsp;</p>\n" +
                "<p>&harr; His cake is&nbsp;<em><strong>bigger than</strong></em>&nbsp;my cake.</p>\n" +
                "<p>(B&aacute;nh của t&ocirc;i kh&ocirc;ng to bằng b&aacute;nh của cậu ta&nbsp;&harr; B&aacute;nh của cậu ta to hơn b&aacute;nh của t&ocirc;i)</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
