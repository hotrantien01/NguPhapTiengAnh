package com.trantien.nguphaptienganh.Lesson.CauBiDong;

import android.webkit.WebView;

public class TruongHopDacBietCauBiDong {
    WebView wv;

    public TruongHopDacBietCauBiDong(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. C&Aacute;C TRƯỜNG HỢP ĐẶC BIỆT:</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<h3><strong>It's your duty to + Vinf</strong></h3>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">--&gt;Bị động: You're supposed to + Vinf</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: It's your duty to make tea today.&nbsp;</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; You are supposed to make tea today.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<h3><strong>It's impossible to + Vinf</strong></h3>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">--&gt;Bị động: S + can't + be + P2</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: It's impossible to solve this problem.&nbsp;</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; This problem can't be solve.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<h3><strong>It's necessary to + Vinf</strong></h3>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">--&gt; Bị động: S + should/ must + be +P2</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: It's necessary for you to type this letter. &nbsp;</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; This letter should/ must be typed by you.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<h3><strong>Mệnh lệnh thức + Object</strong></h3>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">--&gt; Bị động: S + should/must + be +P2.</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: Turn on the lights! &nbsp; &nbsp;</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; The lights should be turned on.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. BỊ ĐỘNG CỦA CẤU TR&Uacute;C \"NHỜ AI L&Agrave;M G&Igrave;\"</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>Chủ động:&nbsp;Have + sb + V /&nbsp;Get + sb + to V</li>\n" +
                "<li>Bị động:&nbsp;Have + st + P2 /&nbsp;Get + st + P2</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">VD:</p>\n" +
                "<p style=\"padding-left: 30px;\">I&nbsp;<u>have my father repair</u>&nbsp;my bike.</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; I&nbsp;<u>have my bike repaired</u>&nbsp;by my father.</p>\n" +
                "<p style=\"padding-left: 30px;\">I&nbsp;<u>get my father to wash</u>&nbsp;my car</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; I&nbsp;<u>get my car washed</u>&nbsp;by my father</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. BỊ ĐỘNG CỦA ĐỘNG TỪ ĐI SAU N&Oacute; L&Agrave; MỘT ĐỘNG TỪ Ở DẠNG VING</strong></span></h3>\n" +
                "<p style=\"padding-left: 30px;\">C&aacute;c động từ đ&oacute; như : love, like, dislike, enjoy, fancy, hate, imagine, regret, mind, admit, involve, deny, avoid....etc</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; Chủ động: S + V + sb Ving</p>\n" +
                "<p style=\"padding-left: 30px;\">Bị động: S + V + sb/st + being + P2&nbsp;</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: I like you wearing this dress.</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; I like this dress being worn by you.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. BỊ ĐỘNG CỦA ĐỘNG TỪ MAKE / LET</strong></span></h3>\n" +
                "<ul>\n" +
                "<li><strong>MAKE</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Chủ động :&nbsp;S + make + sb+ Vinf&nbsp;</p>\n" +
                "<p style=\"padding-left: 30px;\">&nbsp;--&gt; Bị động:&nbsp;S +be+ made + to + Vinf</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: They&nbsp;make&nbsp;me make tea</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; I&nbsp;am made to make&nbsp;tea.</p>\n" +
                "<ul>\n" +
                "<li><strong>LET</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">Chủ động:&nbsp;<strong>S + let + sb + Vinf&nbsp;</strong>&nbsp;</p>\n" +
                "<p style=\"padding-left: 30px;\">--&gt; Bị động:&nbsp;<strong>let + sb/st + be P2</strong>&nbsp; hoặc&nbsp;&nbsp;&nbsp;<strong>be allowed to Vinf&nbsp;&nbsp;</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">VD: My parents never let me do anything by myself.</p>\n" +
                "<p style=\"padding-left: 30px;\">&rarr; My parents never&nbsp;<strong><u>let anything be done</u></strong>&nbsp;by myself or I'm never<strong><u>&nbsp;allowed to do</u>&nbsp;</strong>anything by myself by my parents.</p>\n" +
                "<p style=\"padding-left: 30px;\">They don&rsquo;t let us beat their dog.</p>\n" +
                "<p style=\"padding-left: 30px;\">&rarr;They don&rsquo;t&nbsp;<strong><u>let their dog be beaten</u></strong>&nbsp; or &nbsp;We are not&nbsp;<strong><u>allowed to beat</u></strong>&nbsp;their dog.&nbsp;</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>5. BỊ ĐỘNG CỦA C&Aacute;C ĐỘNG TỪ TRI GI&Aacute;C (see, watch, notice, hear, look&hellip;)</strong></span></h3>\n" +
                "<ul>\n" +
                "<li><strong>Cấu tr&uacute;c chủ động 1:&nbsp;</strong>S + Vp + sb + Ving</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt;&nbsp;<strong>Bị động: S + be + P2(of Vp) + Ving&nbsp;</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">(Ai đ&oacute; chứng kiến người kh&aacute;c l&agrave;m g&igrave; v&agrave; chỉ thấy 1 phần của h&agrave;nh động hoặc 1 h&agrave;nh động đang diễn ra bị 1 h&agrave;nh động kh&aacute;c xen v&agrave;o)</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: We saw her overhearing us</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; She was seen overhearing us.</p>\n" +
                "<ul>\n" +
                "<li><strong>2/ <strong>Cấu tr&uacute;c chủ động</strong> 2:&nbsp;</strong>S + Vp + sb + V</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; Bị động:&nbsp;<strong>S + be + P2(of Vp) + to +Vinf</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">(Ai đ&oacute; chứng kiến người kh&aacute;c l&agrave;m g&igrave; từ đầu đến cuối)</p>\n" +
                "<p style=\"padding-left: 30px;\">* NOTE: ri&ecirc;ng c&aacute;c động từ&nbsp;<strong>: feel, find, catch</strong>&nbsp;th&igrave; chỉ sử dụng c&ocirc;ng thức 1.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>6. BỊ ĐỘNG K&Eacute;P</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><strong>Khi main verb ở thời HIỆN TẠI</strong></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">C&ocirc;ng thức:&nbsp;</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>People/they + think/say/suppose/believe/consider/report.....+ that + clause.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; Bị động:</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>a. It's + thought/said/ supposed/believed/considered/reported...+ that + clause&nbsp;</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">(trong đ&oacute; clause = S + Vinf + O)</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>b. Động từ trong clause để ở th&igrave; HTDG hoặc TLĐ</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">S + am/is/are + thought/ said/supposed... + to + Vinf</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: People say that he is a good doctor.</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; It's said that he is a good doctor.</p>\n" +
                "<p style=\"padding-left: 30px;\">He is said to be a good doctor.</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>c. Động từ trong clause để ở thời QKDG hoặc HTHT.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">S + am/is/are + thought/ said/ supposed... + to + have + P2.</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: People think he stole my car.</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; It's thought he stole my car.</p>\n" +
                "<p style=\"padding-left: 30px;\">He is thought to have stolen my car.</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><strong>&nbsp;Khi main verb ở thời QU&Aacute; KHỨ.</strong></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">C&ocirc;ng thức:&nbsp;</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>People/they + thought/said/supposed...+ that + clause.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt;Bị động:</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>a.</strong> <strong>It was + thought/ said/ supposed...+ that + clause.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>b. Động từ trong clause để ở th&igrave; QKĐ:</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">S + was/were + thought/ said/ supposed... + to + Vinf.</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: People said that he is a good doctor.</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; It was said that he is a good doctor.</p>\n" +
                "<p style=\"padding-left: 30px;\">He was said to be a good doctor.</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>c. Động từ trong clause ở th&igrave; QKHT&nbsp;</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">S + was/were + thought/ said/ supposed... + to + have + P2.</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: They thought he was one of famous singers.</p>\n" +
                "<p style=\"padding-left: 30px;\">&nbsp;&gt;&gt; It was thought he was one of famous singers. He was thought to be one of famous singers.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>7. BỊ ĐỘNG CỦA 7&nbsp;ĐỘNG TỪ ĐẶC BIỆT</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><strong>C&aacute;c động từ : suggest, require, request, order, demand, insist(on), recommend.</strong></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\"><strong>C&ocirc;ng thức:</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><strong><strong>S + suggest/ recommend/ order/ require... + that + clause.</strong></strong></p>\n" +
                "<p style=\"padding-left: 30px;\">(trong đ&oacute; clause = S + Vinf + O)</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong><strong><strong>&gt;&gt; Bị động:</strong></strong></strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><strong><strong>It + was/ will be/ has been/ is... + P2 (of 7 verbs) + that + st + be + P2.</strong></strong></p>\n" +
                "<p style=\"padding-left: 30px;\">(trong đ&oacute; \"be\" l&agrave; kh&ocirc;ng đổi v&igrave; động từ trong clause ở c&acirc;u chủ động ở dạng Vinf)</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: He suggested that she buy a new car.</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; It was suggessted that a new car be bought.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>8. BỊ ĐỘNG CỦA CẤU TR&Uacute;C CHỦ NGỮ GIẢ \" IT\".</strong></span></h3>\n" +
                "<p style=\"padding-left: 30px;\"><strong>C&ocirc;ng thức:&nbsp;</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">It + be + adj + for sb + to do st.</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt;Bị động:</p>\n" +
                "<p style=\"padding-left: 30px;\">It + be + adj + for st + to be done.</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: It is difficult for me to finish this test in one hour</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; It is difficult for this test to be finished in one hour.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>9. BỊ ĐỘNG TRONG TRƯỜNG HỢP 2 T&Acirc;N NGỮ</strong></span></h3>\n" +
                "<p style=\"padding-left: 30px;\">Trong đ&oacute; : Oi = Indirect Object, Od = Direct Object.</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>C&ocirc;ng thức:&nbsp;</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>S + V + Oi + Od</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt;Bị động:</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>a. Oi + be + P2( of V) + Od.</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>b. Od + be + P2( of V) + to Oi.&nbsp;</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">(ri&ecirc;ng động từ \" buy\" d&ugrave;ng giới từ \" for\").</p>\n" +
                "<p style=\"padding-left: 30px;\">VD: My friend gave me a present on my birthday.</p>\n" +
                "<p style=\"padding-left: 30px;\">&gt;&gt; A present was given to me by my friend on my birthday.</p>\n" +
                "<p style=\"padding-left: 30px;\">I was given a present on my birthday by my friend.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
