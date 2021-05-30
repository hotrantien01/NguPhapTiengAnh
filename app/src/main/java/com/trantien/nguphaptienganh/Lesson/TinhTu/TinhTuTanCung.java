package com.trantien.nguphaptienganh.Lesson.TinhTu;

import android.webkit.WebView;

public class TinhTuTanCung {
    WebView wv;

    public TinhTuTanCung(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><strong><span style=\"color: #ff6600;\">1. T&iacute;nh từ c&oacute; đu&ocirc;i -ING:</span></strong></h3>\n" +
                "<p>-<strong>&nbsp;Để m&ocirc; tả sự vật v&agrave; ho&agrave;n cảnh như thế n&agrave;o.</strong></p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>Working hard all day is&nbsp;<em>tiring</em>.</p>\n" +
                "<p><em>(L&agrave;m nhiều việc cả ng&agrave;y rất mệt)</em></p>\n" +
                "<p>This lecture is very<em>&nbsp;confusing</em>. I don't understand.</p>\n" +
                "<p><em>(B&agrave;i giảng n&agrave;y thật kh&oacute; hiểu. T&ocirc;i kh&ocirc;ng hiểu được)</em></p>\n" +
                "<p>-&nbsp;<strong>T&iacute;nh từ đu&ocirc;i -ING n&oacute;i với bạn về c&ocirc;ng việc.</strong></p>\n" +
                "<h3><span style=\"color: #ff6600;\">2. T&iacute;nh từ c&oacute; đu&ocirc;i -ED:</span></h3>\n" +
                "<p>-&nbsp;<strong>Để chỉ cảm x&uacute;c của con người</strong>&nbsp;(để n&oacute;i người ta cảm gi&aacute;c như thế n&agrave;o).</p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>She felt<em>&nbsp;tired</em>&nbsp;after working hard all day.</p>\n" +
                "<p><em>(C&ocirc; ấy thấy mệt v&igrave; l&agrave;m nhiều việc suốt cả ng&agrave;y)</em></p>\n" +
                "<p>I was really&nbsp;<em>bored</em>&nbsp;during the flight.</p>\n" +
                "<p><em>(T&ocirc;i cảm thấy ch&aacute;n trong suốt chuyến bay)</em></p>\n" +
                "<p>I'm not&nbsp;<em>interested</em>&nbsp;in my job any more.</p>\n" +
                "<p><em>(T&ocirc;i kh&ocirc;ng c&ograve;n hứng th&uacute; với c&ocirc;ng việc của t&ocirc;i nữa)</em></p>\n" +
                "<p>Lưu &yacute;:&nbsp;Ta n&oacute;i ai đ&oacute;<strong>&nbsp;'bored'&nbsp;</strong>nếu c&oacute; điều g&igrave; đ&oacute; (hay ai đ&oacute;)&nbsp;<strong>'boring'</strong>. Hoặc khi c&oacute; điều g&igrave; đ&oacute; n&oacute;<strong>&nbsp;'boring'</strong>l&agrave;m cho bạn<strong>&nbsp;'bored'</strong>.</p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>Ann is<em>&nbsp;bored</em>&nbsp;because her job is<em>&nbsp;boring</em>.</p>\n" +
                "<p><em>(Ann đang ch&aacute;n nản v&igrave; c&ocirc;ng việc &nbsp;của c&ocirc; ấy nh&agrave;m ch&aacute;n)</em></p>\n" +
                "<p>Ann's job is&nbsp;<em>boring</em>, so Ann is<em>&nbsp;bored</em>. (not 'Ann<em>&nbsp;is boring</em>')</p>\n" +
                "<p><em>(C&ocirc;ng việc của Ann nh&agrave;m ch&aacute;n, v&igrave; vậy Ann thấy ch&aacute;n nản)</em></p>\n" +
                "<h3><span style=\"color: #ff6600;\">3. So s&aacute;nh một số cặp từ</span></h3>\n" +
                "<p>-&nbsp;<strong>Interesting/interested</strong>&nbsp;(th&uacute; vị).</p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>June thinks politics is very&nbsp;<em>interestin</em>g.</p>\n" +
                "<p><em>(June cho rằng ch&iacute;nh trị rất th&uacute; vị)</em></p>\n" +
                "<p>June is very<em>&nbsp;interested</em>&nbsp;in politics.</p>\n" +
                "<p><em>(June rất quan t&acirc;m đến ch&iacute;nh trị)</em></p>\n" +
                "<p>-<strong>&nbsp;Disappointing/disappointed</strong>&nbsp;(thất vọng).</p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>The film was&nbsp;<em>disappointing</em>. I expected it to be much better.</p>\n" +
                "<p><em>(Bộ phim thật thất vọng. T&ocirc;i đ&atilde; nghĩ rằng n&oacute; hay hơn nhiều)</em></p>\n" +
                "<p>I was&nbsp;<em>disappointed</em>&nbsp;with the film. I expected it to be much better.</p>\n" +
                "<p><em>(T&ocirc;i thất vọng về bộ phim. T&ocirc;i đ&atilde; nghĩ n&oacute; hay hơn nhiều)</em></p>\n" +
                "<p>-&nbsp;<strong>Shocking/shocked</strong>&nbsp;(sốc, chấn động).</p>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>The news was&nbsp;<em>shocking</em>.</p>\n" +
                "<p><em>(Tin tức đ&atilde; g&acirc;y chấn động)</em></p>\n" +
                "<p>We were very&nbsp;<em>shocked</em>&nbsp;when we heard the news.</p>\n" +
                "<p>(<em>Ch&uacute;ng t&ocirc;i đ&atilde; rất sốc khi nghe tin)</em></p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
