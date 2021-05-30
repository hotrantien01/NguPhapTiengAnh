package com.trantien.nguphaptienganh.Lesson.DanhTu;

import android.webkit.WebView;

public class CacLoaiDanhTu {
    WebView wv;

    public CacLoaiDanhTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Định nghĩa:</span></h3>\n" +
                "<p>Danh từ trong tiếng anh l&agrave; từ hoặc nh&oacute;m từ d&ugrave;ng để chỉ người (John, teacher, mother,&hellip;), vật&nbsp;(chair, dog,&hellip;), nơi chốn (city, church, England,&hellip;), t&iacute;nh chất (beauty, courage,&nbsp;sorrow,&hellip;) hay hoạt động (travel, cough, walk,&hellip;)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Danh từ ri&ecirc;ng &ndash; Proper nouns</strong></span></h3>\n" +
                "<p>L&agrave; những danh từ chỉ t&ecirc;n của&nbsp;<strong>người v&agrave; địa điểm cụ thể, chỉ c&aacute;c ng&agrave;y trong tuần, t&ecirc;n c&aacute;c t&ocirc;n gi&aacute;o, c&aacute;c tổ chức, &hellip;</strong>&nbsp;</p>\n" +
                "<p>Danh từ ri&ecirc;ng phải được&nbsp;<strong>viết hoa chữ c&aacute;i đầu</strong>&nbsp;để ph&acirc;n biệt n&oacute; với c&aacute;c danh từ kh&aacute;c.</p>\n" +
                "<p><strong>a. Danh từ ri&ecirc;ng l&agrave; t&ecirc;n của người cụ thể:</strong></p>\n" +
                "<p><em>William Shakespeare was a playwright.</em></p>\n" +
                "<p><em>William Shakespeare l&agrave; một nh&agrave; viết kịch.</em></p>\n" +
                "<p><strong>b. Danh từ ri&ecirc;ng l&agrave; t&ecirc;n của một địa điểm cụ thể:</strong></p>\n" +
                "<p><em>I will be visiting New York next month.</em></p>\n" +
                "<p><em>T&ocirc;i sẽ đến thăm New York v&agrave;o th&aacute;ng tới.</em></p>\n" +
                "<p><strong>c. Danh từ ri&ecirc;ng l&agrave; t&ecirc;n của một ng&agrave;y cụ thể:</strong></p>\n" +
                "<p><em>Everyone dislikes Monday mornings.</em></p>\n" +
                "<p><em>Mọi người đều kh&ocirc;ng th&iacute;ch những buổi s&aacute;ng thứ Hai.</em></p>\n" +
                "<p><strong>d. Danh từ ri&ecirc;ng l&agrave; t&ecirc;n một t&ocirc;n gi&aacute;o v&agrave; văn bản t&ocirc;n gi&aacute;o:</strong></p>\n" +
                "<p><em>The holy book of Islam is the Koran.</em></p>\n" +
                "<p><em>Kinh th&aacute;nh của Hồi gi&aacute;o l&agrave; kinh Koran.</em></p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. Danh từ chung &ndash; Common nouns</strong></span></h3>\n" +
                "<p>L&agrave; những danh từ được d&ugrave;ng để chỉ một loại n&oacute;i chung của người, địa điểm hoặc sự vật, sự việc.</p>\n" +
                "<p>Chỉ được viết hoa khi đứng ở đầu c&acirc;u.</p>\n" +
                "<p><em>&ldquo;The boys went to play cricket.&rdquo; </em></p>\n" +
                "<p><em>&ndash;&nbsp;</em><em>C&aacute;c cậu b&eacute; đi chơi cricket.</em></p>\n" +
                "<p>Cả hai từ boys v&agrave; cricket đều l&agrave; danh từ chung.</p>\n" +
                "<p>N&oacute;&nbsp;<strong>kh&ocirc;ng c&oacute; li&ecirc;n hệ cụ thể l&agrave; cậu b&eacute; n&agrave;o hay trận cricket cụ thể</strong>&nbsp;n&agrave;o.</p>\n" +
                "<p><em>&ldquo;She was trying to answer her phone while buying coffee.&rdquo; </em></p>\n" +
                "<p><em>&ndash;&nbsp;</em><em>C&ocirc; đ&atilde; cố gắng để trả lời điện thoại trong khi mua c&agrave; ph&ecirc;.</em></p>\n" +
                "<p>Ở đ&acirc;y điện thoại v&agrave; c&agrave; ph&ecirc; cả hai đều chỉ đối tượng v&agrave; c&aacute;c đồ uống n&oacute;i chung.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. Danh từ trừu tượng &ndash; Abstract nouns</strong></span></h3>\n" +
                "<p>Danh từ trừu tượng chỉ những điều ch&uacute;ng ta&nbsp;<strong>kh&ocirc;ng thể cảm nhận được qua 5 gi&aacute;c quan: chạm, ngửi, nh&igrave;n, nghe, nếm</strong>.</p>\n" +
                "<p>Danh từ trừu tượng cũng c&oacute; thể d&ugrave;ng với c&aacute;c trạng th&aacute;i li&ecirc;n quan đến tr&iacute; n&atilde;o hoặc d&ugrave;ng để b&agrave;y tỏ suy nghĩ.</p>\n" +
                "<p><em>&ldquo;She screamed with great delight&rdquo; </em></p>\n" +
                "<p><em>&ndash;&nbsp;</em><em>C&ocirc; reo l&ecirc;n với niềm vui lớn.</em></p>\n" +
                "<p><em>Delight</em>&nbsp;l&agrave; một danh từ trừu tượng &ndash; n&oacute; n&oacute;i về trạng th&aacute;i của t&acirc;m tr&iacute; của một người.</p>\n" +
                "<p><em>&ldquo;His bravery in the war won him a medal&rdquo; </em></p>\n" +
                "<p><em>&ndash;&nbsp;</em><em>Bản lĩnh trong chiến tranh của &ocirc;ng đ&atilde; gi&uacute;p &ocirc;ng gi&agrave;nh được hu&acirc;n chương.</em></p>\n" +
                "<p>Danh từ trừu tượng&nbsp;<em>bravery</em>&nbsp;được sử dụng để n&oacute;i đến động lực đằng sau những h&agrave;nh động n&agrave;o đ&oacute; thực hiện bởi con người.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>5.&nbsp;Danh từ đếm được &ndash; Countable nouns</strong></span></h3>\n" +
                "<p>C&aacute;c danh từ đếm được l&agrave; c&aacute;c danh từ&nbsp;<strong>c&oacute; cả hai h&igrave;nh thức số &iacute;t v&agrave; số nhiều</strong>.</p>\n" +
                "<p>N&oacute; c&oacute; thể kết hợp với động từ số &iacute;t hoặc động từ số nhiều trong c&acirc;u.</p>\n" +
                "<p><em>&ldquo;I need to buy four new suitcases for my trip&rdquo; </em></p>\n" +
                "<p><em>&ndash;&nbsp;</em><em>T&ocirc;i cần mua bốn chiếc vali mới cho chuyến đi của t&ocirc;i.</em></p>\n" +
                "<p>Suitcase(s) l&agrave; một danh từ đếm được, th&ecirc;m&nbsp;<em>&lsquo;s&rsquo;</em>&nbsp;để h&igrave;nh th&agrave;nh dạng số nhiều.</p>\n" +
                "<p><em>&ldquo;Does anyone want some oranges?&rdquo;</em></p>\n" +
                "<p><em>-&nbsp;</em><em>Ai muốn c&oacute; v&agrave;i quả cam kh&ocirc;ng?&nbsp;</em></p>\n" +
                "<p>Orange l&agrave; danh từ đếm được, số nhiều l&agrave; oranges.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>6. Danh từ kh&ocirc;ng đếm được &ndash; Uncountable nouns</strong></span></h3>\n" +
                "<p>Ngược với danh từ đếm được l&agrave; những danh từ kh&ocirc;ng đếm được.</p>\n" +
                "<p>Những danh từ n&agrave;y&nbsp;<strong>chỉ c&oacute; một h&igrave;nh thức số &iacute;t</strong>&nbsp;v&agrave; sử dụng với động từ số &iacute;t trong c&acirc;u.</p>\n" +
                "<p><em>&ldquo;The furniture was damaged in moving out&rdquo; </em></p>\n" +
                "<p><em>&ndash;&nbsp;</em><em>C&aacute;c đồ nội thất đ&atilde; bị hư hại trong khi chuyển ra ngo&agrave;i.</em></p>\n" +
                "<p><em>Furniture</em>&nbsp;l&agrave; một danh từ kh&ocirc;ng đếm được v&agrave; do đ&oacute;, ch&uacute;ng ta sử dụng động từ số &iacute;t &ldquo;was&rdquo;.</p>\n" +
                "<p><em>&ldquo;Is 250mgs of sugar enough?&rdquo; </em></p>\n" +
                "<p><em>&ndash;&nbsp;</em><em>250mgs đường c&oacute; đủ kh&ocirc;ng?</em></p>\n" +
                "<p>Ở đ&acirc;y, đường l&agrave; một danh từ kh&ocirc;ng đếm được, chỉ c&oacute; thể x&aacute;c định bằng c&aacute;ch c&acirc;n.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
