package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemPhatAm_ed {
    WebView wv;

    public ThemPhatAm_ed(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. &lsquo;ed&rsquo;đọc l&agrave; /t/:</strong></span></h3>\n" +
                "<p><strong>+ Nếu một từ kết th&uacute;c bằng một &acirc;m v&ocirc; thanh th&igrave; &lsquo;ed&rsquo; sẽ được đọc theo c&aacute;ch v&ocirc; thanh, nghĩa l&agrave; /t/</strong></p>\n" +
                "<p><em>Cụ thể, những từ kết th&uacute;c bằng c&aacute;c &acirc;m: /ʧ/, /s/, /k/, /f/, /p/, /&theta;/, /&int;/ (c&aacute;ch nhớ: chợ xa c&agrave; ph&ecirc; phải thiếu sữa) th&igrave; &lsquo;ed&rsquo; sẽ được đọc l&agrave; /t/</em></p>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>&ndash; watched /wɒtʃt/, missed /mɪst/ ,&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. &lsquo;ed&rsquo; sẽ được đọc l&agrave; /d/: </strong></span></h3>\n" +
                "<p><strong>Nếu một từ kết th&uacute;c bằng một &acirc;m hữu thanh th&igrave; &lsquo;ed&rsquo; sẽ được đọc theo c&aacute;ch hữu thanh, nghĩa l&agrave; /t/</strong></p>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>&ndash; lived /lɪvd/, allowed /əˈlaʊd/</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. &lsquo;ed&rsquo; đọc l&agrave; /ɪd/</strong></span></h3>\n" +
                "<p><strong>+&nbsp;</strong><strong>Một động từ tận c&ugrave;ng bằng /t/ hay /d/ th&igrave; &lsquo;ed&rsquo; sẽ được đọc l&agrave; /ɪd/.</strong></p>\n" +
                "<p><em>Tại sao lại như vậy? V&igrave; một chữ đ&atilde; tận c&ugrave;ng l&agrave; &lsquo;t&rsquo; v&agrave; &lsquo;d&rsquo; (hai trường hợp tr&ecirc;n) th&igrave; ch&uacute;ng ta kh&ocirc;ng thể đọc l&agrave; &lsquo;t&rsquo; hoặc &lsquo;d&rsquo; được bởi lẽ người nghe sẽ rất kh&oacute; nhận biết hơn nữa kh&oacute; c&oacute; thể đọc 2 &acirc;m &lsquo;t&rsquo; hoặc 2 &acirc;n &lsquo;d&rsquo; kế b&ecirc;n nhau.</em></p>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>&ndash; wanted/ˈwɒn.tɪd/ , needed /ˈniː.dɪd/</p>\n" +
                "<p><strong>* Ch&uacute; &yacute;:</strong></p>\n" +
                "<p><strong>+ Đu&ocirc;i &ldquo;-ed&rdquo; trong c&aacute;c động từ sau khi sử dụng như t&iacute;nh từ sẽ được ph&aacute;t &acirc;m l&agrave; /ɪd/</strong></p>\n" +
                "<p>aged/ blessed/ crooked/ dogged/ learned/ naked/ ragged/ wicked/&nbsp;wretched</p>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>&ndash; an aged man /ɪd/</p>\n" +
                "<p>&ndash; a blessed nuisance /ɪd/</p>\n" +
                "<p>&ndash; a dogged persistence /ɪd/</p>\n" +
                "<p>&ndash; a learned professor &ndash; the professor, who was truly learned /ɪd/</p>\n" +
                "<p>&ndash; a wretched beggar &ndash; the beggar was wretched /Id/</p>\n" +
                "<p><strong>* Nhưng khi sử dụng như động từ, ta &aacute;p dụng quy tắc th&ocirc;ng thường</strong></p>\n" +
                "<p>&ndash; he aged quickly /d/</p>\n" +
                "<p>&ndash; he blessed me /t/</p>\n" +
                "<p>&ndash; they dogged him /d/</p>\n" +
                "<p>&ndash; he has learned well /d/</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. Một số trường hợp đặc biệt khi đọc đu&ocirc;i ed trong tiếng anh</strong></span></h3>\n" +
                "<h3><strong>* C&aacute;c động từ dạng V-ed được d&ugrave;ng như T&Iacute;NH TỪ sẽ c&oacute; c&aacute;ch ph&aacute;t &acirc;m đu&ocirc;i &ldquo;ed&rdquo; l&agrave;: /id/</strong></h3>\n" +
                "<p>&ndash; a wicked step-mother</p>\n" +
                "<p>&ndash; an aged woman</p>\n" +
                "<p>Tương tự, bạn h&atilde;y đọc những từ sau với ED được đọc l&agrave; /id/: AGED, BLESSED,DOGGED, CROOKED, LEARNED, WICKED, RAGGED, NAKED&hellip;</p>\n" +
                "<p>Tuy nhi&ecirc;n, nếu ch&uacute;ng được sử dụng như c&aacute;c động từ thường (dưới dạng qu&aacute; khứ đơn hoặc qu&aacute; khứ ph&acirc;n từ) th&igrave; 3 quy tắc cơ bản n&ecirc;u tr&ecirc;n sẽ vẫn được &aacute;p dụng: (ph&aacute;t &acirc;m: /id/ /t/ /d/)</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
