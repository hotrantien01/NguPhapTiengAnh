package com.trantien.nguphaptienganh.Lesson.CauHoiDuoi;

import android.webkit.WebView;

public class CongThucCauHoiDuoi {
    WebView wv;

    public CongThucCauHoiDuoi(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Cấu tr&uacute;c cơ bản của c&acirc;u hỏi đu&ocirc;i:</span></h3>\n" +
                "<p>Nếu c&acirc;u trần thuật l&agrave; thể khẳng định, th&igrave; c&acirc;u hỏi đu&ocirc;i sẽ l&agrave; thể phủ định v&agrave; ngược lại.</p>\n" +
                "<table class=\"ec-table\" border=\"1\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<th style=\"width: 130px;\">Khẳng định</th>\n" +
                "<th style=\"width: 101px;\">Phủ định</th>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 130px;\">The test is difficult,</td>\n" +
                "<td style=\"width: 101px;\">isn&rsquo;t it?</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 130px; text-align: center;\"><strong>Phủ định</strong></td>\n" +
                "<td style=\"width: 101px; text-align: center;\"><strong>Khẳng định</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 130px;\">You don&rsquo;t go to school,</td>\n" +
                "<td style=\"width: 101px;\">do you?</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<h3><span style=\"color: #ff6600;\">2. C&acirc;u hỏi đu&ocirc;i khẳng định</span></h3>\n" +
                "<p>Hầu hết c&aacute;c trợ động từ (auxiliary) đều ở cấu tr&uacute;c khẳng định, v&agrave; để th&agrave;nh lập c&acirc;u hỏi đu&ocirc;i, ch&uacute;ng được lặp lại ở cuối c&acirc;u v&agrave; chuyển sang thể phủ định (th&ecirc;m not).</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>You are late, aren&rsquo;t you?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>You do like play soccer, don&rsquo;t you?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>You like milk, don&rsquo;t you?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>They will go out, won&rsquo;t they?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I can go out, can&rsquo;t I?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>We must finish this exercise, mustn&rsquo;t we?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>She should buy a new pair of shoes, should n&rsquo;t she?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I am late, aren&rsquo;t I?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>John was in the bedroom, wasn&rsquo;t he?</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>Ch&uacute; &yacute;:&nbsp;</strong></p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>C&aacute;ch d&ugrave;ng &ldquo;do&rdquo; để th&agrave;nh lập c&acirc;u hỏi đu&ocirc;i: H&atilde;y nhớ rằng trong&nbsp;th&igrave; hiện tại đơn, &ldquo;do/does&rdquo; được sử dụng trong&nbsp;c&acirc;u khẳng định v&agrave; ch&uacute;ng ta c&oacute; thể th&ecirc;m hoặc kh&ocirc;ng th&ecirc;m &ldquo;do/does&rdquo; v&agrave;o trong c&acirc;u (You do like play soccer/You like milk). Tuy nhi&ecirc;n, ch&uacute;ng ta bắt buộc phải sử dụng &ldquo;do/does&rdquo; trong c&acirc;u hỏi đu&ocirc;i. Ở th&igrave; qu&aacute; khứ, &ldquo;do/does&rdquo; chuyển th&agrave;nh &ldquo;did&rdquo;.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Ch&uacute;ng ta c&oacute; ngoại lệ như sau :</p>\n" +
                "<p>C&acirc;u hỏi đu&ocirc;i của&nbsp;&ldquo;I am&rdquo;&nbsp;l&agrave;&nbsp;&ldquo;aren&rsquo;t I&rdquo;?, kh&ocirc;ng phải l&agrave; &ldquo;am not&rdquo;.</p>\n" +
                "<p>V&iacute; dụ: I am late,&nbsp;aren&rsquo;t&nbsp;I (T&ocirc;i bị trễ phải kh&ocirc;ng)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>&ldquo;won&rsquo;t&rdquo; l&agrave; thể r&uacute;t gọn của &ldquo;will not&rdquo;</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">3. C&acirc;u hỏi đu&ocirc;i phủ định</span></h3>\n" +
                "<p>Những động từ phủ định trong c&acirc;u phủ định sẽ được chuyển th&agrave;nh thể khẳng định khi th&agrave;nh lập c&acirc;u hỏi đu&ocirc;i.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>You are not late, are you?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>You don&rsquo;t like play soccer, do you?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>She doesn&rsquo;t want to play games, does she?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>They won&rsquo;t go out, will they?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>He can&rsquo;t bring this heavy box, can he?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>We mustn&rsquo;t finish this exercise, must we?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>She shouldn&rsquo;t drive too slow in the railway, should she?</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>John wasn&rsquo;t in the bedroom, was he?</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">4. C&aacute;ch trả lời c&acirc;u hỏi đu&ocirc;i</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>Th&ocirc;ng thường, ch&uacute;ng ta chỉ trả lời &ldquo;yes&rdquo; hoặc &ldquo;no&rdquo;.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Đ&ocirc;i khi ch&uacute;ng ta phải lặp lại đu&ocirc;i của c&acirc;u hỏi để trả lời (She doesn&rsquo;t want to play games, does she? Yes, she does).</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>H&atilde;y cẩn th&acirc;n với c&aacute;ch trả lời c&acirc;u hỏi đu&ocirc;i, bởi v&igrave; trong&nbsp;một v&agrave;i ng&ocirc;n ngữ, cấu tr&uacute;c c&acirc;u n&oacute;i kh&ocirc;ng giống nhau v&agrave; điều n&agrave;y c&oacute; thể dẫn đến nhiều trường hợp khiến người kh&aacute;c bối rối.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>H&atilde;y tư duy&nbsp;bằng suy nghĩ của người n&oacute;i ng&ocirc;n ngữ đ&oacute; để trả lời c&acirc;u hỏi của họ.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Snow is white, isn&rsquo;t it? Yes (it is).</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Snow isn&rsquo;t white, is it? Yes it is!</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>C&oacute; thể trả lời bằng cả hai c&aacute;ch, bởi v&igrave; sự thật l&agrave; tuyết c&oacute; m&agrave;u trắng, ai cũng biết điều đ&oacute;.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>\n" +
                "<p>Snow is black, isn&rsquo;t it? No it isn&rsquo;t!</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Snow isn&rsquo;t black, is it? No (it isn&rsquo;t).</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>Cả hai c&aacute;ch trả lời đều đ&uacute;ng, bởi v&igrave; sự thật tuyết kh&ocirc;ng phải m&agrave;u đen.</p>\n" +
                "<p>Tuy nhi&ecirc;n, trong một v&agrave;i ng&ocirc;n ngữ, v&iacute; dụ như tiếng Việt, người ta thường trả lời c&acirc;u hỏi &ldquo;Snow isn&rsquo;t black, is it?&rdquo; bằng &ldquo;Yes&rdquo; (nghĩa l&agrave; họ đồng &yacute; với người n&oacute;i &ldquo;Yes, I agree with you&rdquo;).</p>\n" +
                "<p>Đ&acirc;y l&agrave; một c&acirc;u trả lời sai trong tiếng Anh.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
