package com.trantien.nguphaptienganh.Lesson.Thi;

import android.webkit.WebView;

public class HienTaiDon {
    WebView wv;

    public HienTaiDon(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load(){
        String html = "<h3><span style=\"color: #ff9900;\">1. Định nghĩa th&igrave; hiện tại đơn</span></h3>\n" +
                "<p>Th&igrave; hiện tại đơn (tiếng Anh: Simple present hoặc Present simple) l&agrave; một th&igrave; trong tiếng Anh hiện đại. Th&igrave; n&agrave;y diễn tả một h&agrave;nh động chung chung, tổng qu&aacute;t lặp đi lặp lại nhiều lần hoặc một sự thật hiển nhi&ecirc;n hoặc một h&agrave;nh động diễn ra trong thời gian hiện tại.</p>\n" +
                "<h3><span style=\"color: #ff9900;\">2. C&aacute;ch sử dụng th&igrave; hiện tại đơn</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Diễn đạt một th&oacute;i quen hoặc h&agrave;nh động lặp đi lặp lại trong hiện tại.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I usually go to bed at 11 p.m. (T&ocirc;i thường đi ngủ v&agrave;o l&uacute;c 11 giờ).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Ch&acirc;n l&yacute;, sự thật hiển nhi&ecirc;n.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;The sun rises in the East and sets in the West. (Mặt trời mọc ở ph&iacute;a đ&ocirc;ng v&agrave; lặn ở ph&iacute;a T&acirc;y).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Sự việc xảy ra trong tương lai. C&aacute;ch n&agrave;y thường &aacute;p dụng để n&oacute;i về thời gian biểu, chương tr&igrave;nh hoặc kế hoạch đ&atilde; được cố định theo thời gian biểu.</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd: The plane takes off at 3 p.m. this afternoon. (Chiếc m&aacute;y bay hạ c&aacute;nh l&uacute;c 3 giờ chiều nay).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Sử dụng trong c&acirc;u điều kiện loại 1:</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;What will you do if you fail your exam? (Bạn sẽ l&agrave;m g&igrave; nếu bạn trượt kỳ thi n&agrave;y?).</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li>Sử dụng trong một số cấu tr&uacute;c&nbsp;kh&aacute;c</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;<em>We will wait,&nbsp;<u>until</u>&nbsp;she comes.&nbsp;</em>(Ch&uacute;ng t&ocirc;i sẽ đợi cho đến khi c&ocirc; ấy tới).</p>\n" +
                "<h3><span style=\"color: #ff9900;\">3. C&ocirc;ng thức th&igrave; hiện tại đơn</span></h3>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><span style=\"color: #000000;\"><strong>Động từ \"tobe\":</strong></span></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\"><span style=\"color: #000000;\"><strong>+ Khẳng định: S + am/are/is +&nbsp;O</strong></span></p>\n" +
                "<p style=\"padding-left: 30px;\"><span style=\"color: #000000;\">vd:&nbsp;I&nbsp;am&nbsp;a student. (T&ocirc;i l&agrave; một sinh vi&ecirc;n).</span></p>\n" +
                "<p style=\"padding-left: 30px;\"><span style=\"color: #000000;\">+&nbsp;<strong>Phủ định:&nbsp;</strong></span><strong>S + am/are/is + not +&nbsp;</strong><em><strong>... (</strong></em><em><strong>is not = isn&rsquo;t ;</strong></em><em><strong>are not = aren&rsquo;t</strong></em><em><strong>)</strong></em></p>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;I&nbsp;am not&nbsp;a student. (T&ocirc;i kh&ocirc;ng phải l&agrave; một sinh vi&ecirc;n).</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;<strong>Nghi vấn:&nbsp;Am/ Are/ Is&nbsp;&nbsp;(not)&nbsp;+ S + O?</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">vd: Are&nbsp;you a student.</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>Động từ \"thường\":</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\"><strong>+ Khẳng định:&nbsp;S + V(e/es) + O</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;He often&nbsp;plays&nbsp;soccer. (Anh ấy thường xuy&ecirc;n chơi b&oacute;ng đ&aacute;).</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;<strong>Phủ định:&nbsp;</strong><strong>S + do/ does + not + V (nguy&ecirc;n thể) + O</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;Ex:&nbsp; He&nbsp;doesn&rsquo;t&nbsp;often&nbsp;play soccer. (Anh ấy kh&ocirc;ng thường xuy&ecirc;n chơi b&oacute;ng đ&aacute;).</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;<strong>Nghi vấn:&nbsp;Do/ Does (not)&nbsp;+ S +&nbsp;V(nguy&ecirc;n thể) + O?</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">vd:&nbsp;Does he play soccer?</p>\n" +
                "<ul style=\"list-style-type: disc;\">\n" +
                "<li><strong>Lưu &yacute;:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">C&aacute;ch th&ecirc;m s/es:<br />&ndash; Th&ecirc;m s v&agrave;o đằng sau hầu hết c&aacute;c động từ: want-wants; work-works;&hellip;<br />&ndash; Th&ecirc;m es v&agrave;o c&aacute;c động từ kết th&uacute;c bằng ch, sh, x, s: watch-watches;<br />miss-misses; wash-washes; fix-fixes;&hellip;<br />&ndash; Bỏ y v&agrave; th&ecirc;m ies v&agrave;o sau c&aacute;c động từ kết th&uacute;c bởi một phụ &acirc;m + y:<br />study-studies;&hellip;<br />&ndash; Động từ bất quy tắc: Go-goes; do-does; have-has.<br />C&aacute;ch ph&aacute;t &acirc;m phụ &acirc;m cuối s/es:&nbsp;<em>Ch&uacute; &yacute; c&aacute;c ph&aacute;t &acirc;m phụ &acirc;m cuối n&agrave;y phải dựa v&agrave;o phi&ecirc;n &acirc;m quốc tế chứ kh&ocirc;ng dựa v&agrave;o c&aacute;ch viết.</em><br />&ndash; /s/:Khi từ c&oacute; tận c&ugrave;ng l&agrave; c&aacute;c phụ &acirc;m /f/, /t/, /k/, /p/ , /&eth;/<br />&ndash; /iz/:Khi từ c&oacute; tận c&ugrave;ng l&agrave; c&aacute;c &acirc;m /s/, /z/, /&int;/, /t&int;/, /ʒ/, /dʒ/ (thường c&oacute; tận c&ugrave;ng l&agrave; c&aacute;c chữ c&aacute;i ce, x, z, sh, ch, s, ge).<br />&ndash; /z/:Khi từ c&oacute; tận c&ugrave;ng l&agrave; nguy&ecirc;n &acirc;m v&agrave; c&aacute;c phụ &acirc;m c&ograve;n lại.</p>\n" +
                "<h3><span style=\"color: #ff9900;\">4. Dấu hiệu nhận biết th&igrave; hiện tại đơn</span></h2>\n" +
                "<ul>\n" +
                "<li>Always (lu&ocirc;n lu&ocirc;n) , usually (thường xuy&ecirc;n), often (thường xuy&ecirc;n), frequently (thường xuy&ecirc;n) , sometimes (thỉnh thoảng), seldom (hiếm khi), rarely (hiếm khi), hardly (hiếm khi) , never (kh&ocirc;ng bao giờ), generally (nh&igrave;n chung), regularly (thường xuy&ecirc;n).</li>\n" +
                "<li>Every day, every week, every month, every year,&hellip;&hellip;. (Mỗi ng&agrave;y, mỗi tuần, mỗi th&aacute;ng, mỗi năm).</li>\n" +
                "<li>Once/ twice/ three times/ four times&hellip;.. a day/ week/ month/ year,&hellip;&hellip;. (một lần / hai lần/ ba lần/ bốn lần &hellip;&hellip;..một ng&agrave;y/ tuần/ th&aacute;ng/ năm).</li>\n" +
                "</ul>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
