package com.trantien.nguphaptienganh.Lesson.GioiTu;

import android.webkit.WebView;

public class CachDungGioiTu {
    WebView wv;

    public CachDungGioiTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa về giới từ:&nbsp;</span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Giới từ l&agrave; từ loại chỉ sự li&ecirc;n quan giữa c&aacute;c từ loại trong cụm từ, trong c&acirc;u.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Những từ thường đi sau giới từ l&agrave; t&acirc;n ngữ (Object), Verb + ing, Cụm danh từ ...</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>V&iacute; dụ:</strong></p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><em>I went into the room.</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em>I was sitting in the room at that time.</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>Ta thấy r&otilde;, ở v&iacute; dụ a., \"the room\" l&agrave; t&acirc;n ngữ của giới từ \"into\". Ở v&iacute; dụ b., \"the room\" l&agrave; t&acirc;n ngữ của giới từ \"in\".<br />Ch&uacute; &yacute;: C&aacute;c bạn phải lu&ocirc;n ph&acirc;n biệt trạng từ v&agrave; giới từ, v&igrave; thường khi một từ c&oacute; hai chức năng đ&oacute; (vừa l&agrave; trạng từ v&agrave; giới từ). Điều kh&aacute;c nhau cơ bản l&agrave; Trạng từ th&igrave; kh&ocirc;ng c&oacute; t&acirc;n ngữ theo sau.</p>\n" +
                "<h3><span style=\"color: #ff6600;\">2.&nbsp;C&aacute;ch sử dụng giới từ trong tiếng Anh:</span></h3>\n" +
                "<p>C&oacute; thể n&oacute;i việc d&ugrave;ng c&aacute;c giới từ kh&ocirc;ng phải dễ, v&igrave; mỗi nước c&oacute; c&aacute;ch d&ugrave;ng giới từ đặc biệt; vậy ta phải rất ch&uacute; &yacute; đến n&oacute; ngay từ l&uacute;c mới học m&ocirc;n ngoại ngữ đ&oacute; n&oacute;i chung v&agrave; tiếng Anh n&oacute;i ri&ecirc;ng. Trong tiếng Anh, người ta kh&ocirc;ng thể đặt ra c&aacute;c quy luật về c&aacute;c ph&eacute;p d&ugrave;ng giới từ mang t&iacute;nh cố định cho mỗi giới từ đ&oacute; - c&ugrave;ng một giới từ, khi đi với từ loại kh&aacute;c nhau th&igrave; tạo ra nghĩa kh&aacute;c nhau. Vậy ch&uacute;ng ta n&ecirc;n học thuộc mỗi khi gặp phải v&agrave; học ngay từ l&uacute;c ban đầu.</p>\n" +
                "<p><strong>+ Vị tr&iacute; của&nbsp;giới từ trong tiếng anh</strong></p>\n" +
                "<table border=\"1\" cellpadding=\"1\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Sau TO BE, trước danh từ:</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>+ THE BOOK IS ON THE TABLE. = Quyển s&aacute;ch ở tr&ecirc;n b&agrave;n.</p>\n" +
                "<p>+ I WILL STUDY IN AUSTRALIA FOR 2 YEARS. = T&ocirc;i sẽ học ở &Uacute;c trong 2 năm.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Sau động từ: C&oacute; thể liền sau động từ, c&oacute; thể bị 1 từ kh&aacute;c chen giữa động từ v&agrave; giới từ.</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>+ I LIVE IN HO CHI MINH CITY = T&ocirc;i sống ở th&agrave;nh phố Hồ Ch&iacute; Minh.</p>\n" +
                "<p>+TAKE OFF YOUR HAT! Cởi n&oacute;n của bạn ra!</p>\n" +
                "<p>+ I HAVE AN AIR-CONDITIONER, BUT I ONLY TURN IT ON IN SUMMER. = T&ocirc;i c&oacute; m&aacute;y lạnh, nhưng t&ocirc;i chỉ bật n&oacute; l&ecirc;n v&agrave;o m&ugrave;a h&egrave;.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>Sau t&iacute;nh từ:</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>+ I'M NOT WORRIED ABOUT LIVING IN A FOREIGN COUNTRY.&nbsp; = T&ocirc;i kh&ocirc;ng lo lắng về việc sốngở nước ngo&agrave;i.</p>\n" +
                "<p>+ HE IS NOT ANGRY WITH YOU. = Anh ấy kh&ocirc;ng giận bạn.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p><strong>&nbsp;+ Một số sai lầm thường gặp khi sử dụng giới từ trong tiếng anh</strong></p>\n" +
                "<table border=\"1\" cellpadding=\"1\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>1)Suy luận từ c&aacute;ch d&ugrave;ng đ&atilde; gặp trước đ&oacute; :</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>V&iacute; dụ :&nbsp;</p>\n" +
                "<p>Trước đ&oacute; ta gặp : worry about : lo lắng về&nbsp;</p>\n" +
                "<p>Lần sau gặp chữ : disscuss _____ ( thảo luận về ) thế l&agrave; ta suy ra từ c&acirc;u tr&ecirc;n m&agrave; điền about v&agrave;o, thế l&agrave; sai.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>2)Kh&ocirc;ng nhận ra l&agrave; giới từ thay đổi v&igrave; thấy c&ugrave;ng một danh từ:</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>Trước đ&oacute; ta gặp : in the morning&nbsp;</p>\n" +
                "<p>Thế l&agrave; khi gặp : ___ a cold winter morning, thấy morning n&ecirc;n chọn ngay in =&gt; sai ( đ&uacute;ng ra phải d&ugrave;ng on )</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p>3)Bị tiếng Việt ảnh hưởng :</p>\n" +
                "</td>\n" +
                "<td>\n" +
                "<p>Tiếng Việt n&oacute;i: lịch sự với ai n&ecirc;n khi gặp : polite (lịch sự ) liền d&ugrave;ng ngay with ( với ) =&gt; sai ( đ&uacute;ng ra phải d&ugrave;ng to )</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p><strong>&nbsp;+ H&igrave;nh thức của giới từ trong tiếng anh -&nbsp;học tiếng anh</strong></p>\n" +
                "<table border=\"1\">\n" +
                "<tbody>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>1)Giới từ đơn ( simple prepositions ):</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<p>L&agrave; giới từ c&oacute; một chữ : in, at, on, for, from, to, under, over, with &hellip;</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 96px;\">\n" +
                "<td style=\"height: 96px;\">\n" +
                "<p>2)Giới từ đ&ocirc;i ( doubleprepositions ):</p>\n" +
                "</td>\n" +
                "<td style=\"height: 96px;\">\n" +
                "<p>L&agrave; giới từ được tạo ra bằng c&aacute;ch hợp 2 giới từ đơn lại :Into, onto, upon, without, within, underneath, throughout, from among &hellip; -Ex: The boy runs into the room ( thằng b&eacute; chạy v&agrave;o trong ph&ograve;ng )</p>\n" +
                "<p>-Ex: He fell onto the road ( anh ta t&eacute; xuống đường )</p>\n" +
                "<p>-Ex: I chose her from among the girls ( t&ocirc;i chọn c&ocirc; ấy từ trong số c&aacute;c c&ocirc; g&aacute;i )</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 48px;\">\n" +
                "<td style=\"height: 48px;\">\n" +
                "<p>3) Giới từ k&eacute;p ( compound prepositions ):</p>\n" +
                "</td>\n" +
                "<td style=\"height: 48px;\">\n" +
                "<p>L&agrave; giới từ được tạo th&agrave;nh bằng tiếp đầu ngữ a hoặc be: About, among, across , amidst, above, against, Before, behind, beside, beyond, beneath, between, below&hellip;</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 72.4375px;\">\n" +
                "<td style=\"height: 72.4375px;\">\n" +
                "<p>4) Giới từ do ph&acirc;n từ ( participle prepositions ):</p>\n" +
                "</td>\n" +
                "<td style=\"height: 72.4375px;\">\n" +
                "<p>According to ( t&ugrave;y theo), during ( trong khoảng ), owing to ( do ở ), pending ( trong khi) , saving = save = except ( ngoại trừ ), notwithstanding ( mặc d&ugrave; ) , past ( hơn, qua ) considering ( x&eacute;t theo ) concerning/ regarding /touching ( về vấn đề, về ), excepting = except ( ngoại trừ )&nbsp;</p>\n" +
                "<p>-Ex: She is very intelligent, considering her age. ( x&eacute;t theo tuổi th&igrave; cố ấy rất th&ocirc;ng minh )</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 319px;\">\n" +
                "<td style=\"height: 319px;\">\n" +
                "<p>5) Cụm từ được d&ugrave;ng như giới từ: Giới từ loại n&agrave;y bao gồm cả một cụm từ :</p>\n" +
                "</td>\n" +
                "<td style=\"height: 319px;\">\n" +
                "<p>- Because of ( bởi v&igrave; )</p>\n" +
                "<p>- By means of ( do, bằng c&aacute;ch)</p>\n" +
                "<p>- In spite of (mặc d&ugrave;)</p>\n" +
                "<p>- In opposition to ( đối nghịch với )</p>\n" +
                "<p>- On account of ( bởi v&igrave; )</p>\n" +
                "<p>- In the place of ( thay v&igrave; )</p>\n" +
                "<p>- In the event of ( nếu m&agrave; )</p>\n" +
                "<p>+ Ex: In the event of my not coming, you can come home.( nếu m&agrave; t&ocirc;i kh&ocirc;ng đến th&igrave; anh cứ về)<br /><br />- With a view to ( với &yacute; định để )</p>\n" +
                "<p>+ Ex: I learn English with the view of going abroad.( t&ocirc;i học TA với &yacute; định đi nước ngo&agrave;i)</p>\n" +
                "<p>- For the shake of ( v&igrave; )<br />+ Ex: I write this lesson for the shake of your progress. ( t&ocirc;i viết b&agrave;i n&agrave;y v&igrave; sự tiến bộ của c&aacute;c bạn)<br /><br />- On behalf of ( thay mặt cho)<br />+ Ex: On behalf of the students in the class, I wish you good health ( thay mặt cho tất cả học sinh của lớp, em xin ch&uacute;c c&ocirc; được dồi d&agrave;o sức khỏe)<br /><br />- In view of ( x&eacute;t về )<br />+ Ex: In view of age, I am not very old. ( x&eacute;t về mặt tuổi t&aacute;c, t&ocirc;i chưa gi&agrave; lắm )<br /><br />- With reference to ( về vấn đề, li&ecirc;n hệ tới)<br />+ Ex: I send this book to you with reference to my study.( t&ocirc;i đưa bạn quyển s&aacute;ch n&agrave;y c&oacute; li&ecirc;n hệ đến việc học của t&ocirc;i. )</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 48px;\">\n" +
                "<td style=\"height: 48px;\">\n" +
                "<p>6) Giới từ tr&aacute; h&igrave;nh: Đ&acirc;y l&agrave; nh&oacute;m giới từ được ẩn trong h&igrave;nh thức kh&aacute;c:</p>\n" +
                "</td>\n" +
                "<td style=\"height: 48px;\">\n" +
                "<p>At 7 o'clock ( o' = of ): L&uacute;c 7 giờ</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
