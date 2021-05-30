package com.trantien.nguphaptienganh.Lesson.TinhTu;

import android.webkit.WebView;

public class ViTriTinhTu {
    WebView wv;

    public ViTriTinhTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Trước danh từ</strong>:</span></h3>\n" +
                "<p>a small house</p>\n" +
                "<p>an old woman</p>\n" +
                "<p>khi c&oacute; nhiều t&iacute;nh từ đứng trước danh từ,<strong>&nbsp;trật tự của t&iacute;nh từ như sau:</strong>&nbsp;</p>\n" +
                "<p>Opinion (nhận x&eacute;t, &yacute; kiến) &gt; Size (k&iacute;ch thước) &gt; Quality (chất lượng) &gt; Age (tuổi) &gt; Shape (h&igrave;nh dạng) &gt; Color (m&agrave;u sắc) &gt; Participle Forms (th&igrave; ho&agrave;n th&agrave;nh) &gt; Origin (xuất xứ) &gt; Material (nguy&ecirc;n liệu) &gt; Type (loại) &gt; Purpose (mục đ&iacute;ch sử dụng)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Sau động từ:&nbsp;( be v&agrave; c&aacute;c động từ như seem, look, feel..)</strong></span></h3>\n" +
                "<p>She is tired.</p>\n" +
                "<p>Jack is hungry.</p>\n" +
                "<p>John is very tall.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. Sau danh từ:</strong>&nbsp;</span></h3>\n" +
                "<p>T&iacute;nh từ c&oacute; thể đi sau danh từ n&oacute; bổ trợ trong c&aacute;c trường hợp sau đ&acirc;y:</p>\n" +
                "<p><strong>* Khi t&iacute;nh từ được d&ugrave;ng để phẩm chất/t&iacute;nh chất c&aacute;c đại từ bất định:</strong></p>\n" +
                "<p>There is nothing interesting. [nothing l&agrave; đại từ bất định]</p>\n" +
                "<p>I'll tell you something new. [something l&agrave; đại từ bất định]</p>\n" +
                "<p><strong>* Khi hai hay nhiều t&iacute;nh từ được nối với nhau bằng \"and\" hoặc \"but\", &yacute; tưởng diễn tả bởi t&iacute;nh từ được nhấn mạnh:</strong></p>\n" +
                "<p>The writer is both clever and wise.</p>\n" +
                "<p>The old man, poor but proud, refused my offer.</p>\n" +
                "<p><strong>* Khi t&iacute;nh từ được d&ugrave;ng trong c&aacute;c cụm từ diễn tả sự đo lường:</strong></p>\n" +
                "<p>The road is 5 kms long</p>\n" +
                "<p>A building is ten storeys high</p>\n" +
                "<p><strong>* Khi t&iacute;nh từ ở dạng so s&aacute;nh:</strong></p>\n" +
                "<p>They have a house bigger than yours</p>\n" +
                "<p>The boys easiest to teach were in the classroom</p>\n" +
                "<p><strong>* Khi c&aacute;c qu&aacute; khứ ph&acirc;n từ l&agrave; th&agrave;nh phần của mệnh đề được r&uacute;t gọn:</strong></p>\n" +
                "<p>The glass broken yesterday was very expensive</p>\n" +
                "<p><strong>* Một số qu&aacute; khứ ph&acirc;n từ (P2) như: involved, mentioned, indicated:</strong></p>\n" +
                "<p>The court asked the people involved</p>\n" +
                "<p>Look at the notes mentioned/indicated hereafter</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4.&nbsp;T&iacute;nh từ được d&ugrave;ng như danh từ.</strong></span></h3>\n" +
                "<p>Một số t&iacute;nh từ được d&ugrave;ng như danh từ để chỉ một tập hợp người hoặc một kh&aacute;i niệm thường c&oacute;&nbsp;\"the\"&nbsp;đi trước.</p>\n" +
                "<p>the poor, the blind, the rich, the deaf, the sick, the handicapped, the good, the old; ...</p>\n" +
                "<p>V&iacute; dụ&nbsp;:&nbsp;The rich do not know how the poor live.</p>\n" +
                "<p>(the rich= rich people, the blind = blind people)</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
