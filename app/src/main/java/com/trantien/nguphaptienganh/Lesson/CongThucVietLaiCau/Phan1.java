package com.trantien.nguphaptienganh.Lesson.CongThucVietLaiCau;

import android.webkit.WebView;

public class Phan1 {
    WebView wv;

    public Phan1(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 1:&nbsp;C&aacute;c từ, cụm từ chỉ nguy&ecirc;n nh&acirc;n (<em>bởi v&igrave;</em>)</strong></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>Since, As, Because + S + V + &hellip;</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;Because of, Due to, As a result of + Noun/ V-ing</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p><em><strong>Because</strong></em>&nbsp;it's raining now, we can't go to work.&nbsp;</p>\n" +
                "<p>&harr;&nbsp;<em><strong>Because of</strong></em>&nbsp;the rain, we can't go to work.</p>\n" +
                "<p>(Bởi v&igrave; trời mưa, n&ecirc;n ch&uacute;ng t&ocirc;i kh&ocirc;ng thể đi l&agrave;m được)</p>\n" +
                "<h3><span style=\"color: #ff6600;\">Cấu tr&uacute;c 2:&nbsp;C&aacute;c từ, cụm từ chỉ sự tr&aacute;i ngược (<em>mặc d&ugrave;</em>)</span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>Although/Though/Even though + S + V + &hellip;</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;Despite/ In spite of + Noun/ V-ing</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p><em><strong>Although</strong></em>&nbsp;it was very noisy, we continued to study our lessons.&nbsp;</p>\n" +
                "<p>&harr;&nbsp;<em><strong>In spite of</strong></em>&nbsp;the noise, we continued to study our lessons.</p>\n" +
                "<p>(Mặc d&ugrave; rất ồn &agrave;o, nhưng ch&uacute;ng t&ocirc;i vẫn tiếp tục học cho xong b&agrave;i)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 3:&nbsp;Cấu tr&uacute;c&nbsp;<em>qu&aacute; &hellip; đến nổi m&agrave;</em>&nbsp;đi với t&iacute;nh từ/danh từ</strong></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>S + V + so + Adj. + that &hellip;&nbsp;</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;It + be + such + Noun + that</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>This film is&nbsp;<em><strong>so boring that</strong></em>&nbsp;no one wants to see it.&nbsp;</p>\n" +
                "<p>&harr; It is&nbsp;<em><strong>such a boring film</strong></em>&nbsp;that no one wants to see it.</p>\n" +
                "<p>(C&aacute;i phim n&agrave;y ch&aacute;n tới nổi m&agrave; chẳng ai muốn coi n&oacute; hết)</p>\n" +
                "<h3><span style=\"color: #ff6600;\">Cấu tr&uacute;c 4:&nbsp;Cấu tr&uacute;c&nbsp;<em>qu&aacute; &hellip; đến nổi kh&ocirc;ng thể</em>&nbsp;tương đương với&nbsp;<em>chưa đủ để l&agrave;m g&igrave; &hellip;</em></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>S + V + too + Adj. + to V</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;not + Adj. + enough + to V</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>Yuri is&nbsp;<em><strong>too fat to</strong></em>&nbsp;wear that dress.&nbsp;</p>\n" +
                "<p>&harr; Yuri is&nbsp;<em><strong>not thin enough to</strong></em>&nbsp;wear that dress.</p>\n" +
                "<p>(Yuri qu&aacute; b&eacute;o để c&oacute; thể mặc vừa c&aacute;i v&aacute;y kia)</p>\n" +
                "<h3><span style=\"color: #ff6600;\">Cấu tr&uacute;c 5:&nbsp;&nbsp;<em>qu&aacute; .. đến mức</em>&nbsp;tương đương với&nbsp;<em>qu&aacute; &hellip; đến mức kh&ocirc;ng thể</em></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>so + Adj. + that/ such + noun + that</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;too + Adj. (for somebody) + to V</strong></p>\n" +
                "</blockquote>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>- These shoes are&nbsp;<em><strong>so small that</strong></em>&nbsp;he can't wear it.&nbsp;</p>\n" +
                "<p>&harr; These shoes are&nbsp;<em><strong>too small for him</strong></em>&nbsp;to wear.</p>\n" +
                "<p>(Mấy đ&ocirc;i gi&agrave;y n&agrave;y qu&aacute; b&eacute; so với c&aacute;i ch&acirc;n của anh ta)</p>\n" +
                "<p>- It was&nbsp;<em><strong>such</strong></em>&nbsp;a difficult question&nbsp;<em><strong>that</strong></em>&nbsp;we can't find the answer.&nbsp;</p>\n" +
                "<p>&harr; The question is&nbsp;<em><strong>too difficult for us</strong></em>&nbsp;to answer.</p>\n" +
                "<p>(C&acirc;u hỏi qu&aacute; kh&oacute; đến nổi kh&ocirc;ng ai trong ch&uacute;ng t&ocirc;i t&igrave;m được c&acirc;u trả lời)</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
