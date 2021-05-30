package com.trantien.nguphaptienganh.Lesson.CauDieuKien;

import android.webkit.WebView;

public class CauDieuKienDacBiet {
    WebView wv;

    public CauDieuKienDacBiet(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. C&acirc;u Điều Kiện Diễn Tả Th&oacute;i Quen Hoặc Một Sự Thật Hiển Nhi&ecirc;n</strong></span></h3>\n" +
                "<p>C&acirc;u điều kiện n&agrave;y diễn tả một th&oacute;i quen, một h&agrave;nh động thường xuy&ecirc;n xảy ra nếu điều kiện được đ&aacute;p ứng, hoặc diễn tả một sự thật hiển nhi&ecirc;n, một kết quả tất yếu xảy ra.&nbsp;</p>\n" +
                "<p><em>Cấu tr&uacute;c</em>:&nbsp;<strong>If + S + V (hiện tại), S + V (hiện tại)</strong></p>\n" +
                "<p>&nbsp;Tất cả động từ trong c&acirc;u (mệnh đề ch&iacute;nh v&agrave; mệnh đề điều kiện) đều được chia ở th&igrave; hiện tại đơn.&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;</p>\n" +
                "<p><strong>If + Mệnh đề 1 (th&igrave; hiện tại đơn giản), Mệnh đề 2 (th&igrave; hiện tại đơn giản) =&gt; Khi muốn nhắn nhủ ai đ&oacute;:</strong></p>\n" +
                "<ul>\n" +
                "<li><em><strong>V&iacute; dụ :</strong></em>&nbsp;If you see Nam, you tell him I&rsquo;m in Vietnam (Nếu bạn gặp Nam, you h&atilde;y nhắn anh ấy rằng t&ocirc;i đang ở Việt Nam nh&eacute;)</li>\n" +
                "</ul>\n" +
                "<p><strong>If + Mệnh đề 1 (th&igrave; hiện tại đơn giản), Mệnh đề 2 (mệnh lệnh thức) =&gt; D&ugrave;ng khi muốn nhấn mạnh</strong></p>\n" +
                "<ul>\n" +
                "<li><em><strong>V&iacute; dụ:</strong></em>&nbsp;If you have any trouble, please telephone me though 115&nbsp;<em>(Nếu bạn c&oacute; bất kỳ rắc rối n&agrave;o, xin hẫy gọi cho t&ocirc;i qua số điện thoại 115)</em></li>\n" +
                "</ul>\n" +
                "<p><strong>Nếu diễn tả th&oacute;i quen, trong mệnh đề ch&iacute;nh thường xuất hiện th&ecirc;m: often, usually, or always. V&iacute; dụ:</strong></p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>If water is frozen, it expands. (Nếu nước bị đ&ocirc;ng đặc n&oacute; nở ra.)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>I usually walk to school if I have enough time. (T&ocirc;i thường đi bộ đến trường nếu t&ocirc;i c&oacute; thời gian.)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If you heat ice, it turns to water. (Nếu bạn l&agrave;m n&oacute;ng nước đ&aacute;, n&oacute; sẽ chảy ra.)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>If we are cold, we shiver. (Nếu bị lạnh, ch&uacute;ng ta sẽ run l&ecirc;n.)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. C&acirc;u điều kiện Hỗn hợp:</strong></span></h3>\n" +
                "<p>Ngo&agrave;i c&ocirc;ng thức &aacute;p dụng cho c&acirc;u điều kiện loại 1, 2, 3 th&igrave; trong tiếng Anh c&oacute; nhiều c&aacute;ch kh&aacute;c nhau được d&ugrave;ng diễn tả điều kiện trong mệnh đề chỉ điều kiện với &ldquo;If&rdquo;.</p>\n" +
                "<p>C&acirc;u điều kiện hỗn hợp l&agrave; mix của c&aacute;c loại c&acirc;u điều kiện với nhau, v&iacute; dụ một số trường hợp được sử dụng trong giao tiếp v&agrave; ng&ocirc;n ngữ viết:</p>\n" +
                "<p>If she hadn't stayed up late last night, she wouldn't be so tired now. (<em>Nếu c&ocirc; ấy kh&ocirc;ng ở lại muộn v&agrave;o đ&ecirc;m qua, b&acirc;y giờ c&ocirc; ấy sẽ kh&ocirc;ng qu&aacute; mệt mỏi&nbsp;</em>)</p>\n" +
                "<p>&rArr; Thường c&oacute; trạng từ đi theo (loại 3+ loại 2: giả thiết tr&aacute;i ngược với qu&aacute; khứ, nhưng kết quả th&igrave; tr&aacute;i ngược với hiện tại)</p>\n" +
                "<p>If I were you, I would have learned English earlier. (<em>Nếu t&ocirc;i l&agrave; bạn, t&ocirc;i đ&atilde; học tiếng Anh sớm hơn</em>)</p>\n" +
                "<p>&rArr;&nbsp; (loại 2 + loại 3: giả thiết tr&aacute;i ngược với hiện tại nhưng kết quả tr&aacute;i ngược với qu&aacute; khứ).</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3.&nbsp;Những trường hợp kh&aacute;c trong c&acirc;u điều kiện:</strong></span></h3>\n" +
                "<p><em><strong>a. Unless = If...not (Trừ phi, nếu...kh&ocirc;ng)</strong></em></p>\n" +
                "<p>V&iacute; dụ:&nbsp; If you don't study hard, you can't pass the exam.</p>\n" +
                "<p>= Unless you work hard, you can't pass the exam.</p>\n" +
                "<p><em><strong>b.&nbsp;Cụm&nbsp;Từ đồng nghĩa:</strong></em>&nbsp;Suppose / Supposing (giả sử như), in case (trong trường hợp), even if (ngay cả khi, cho d&ugrave;), as long as, so long as, provided (that), on condition (that) (miễn l&agrave;, với điều kiện l&agrave;) c&oacute; thể thay cho if trong c&acirc;u điều kiện</p>\n" +
                "<p>V&iacute; dụ: Supposing (that) you are wrong, what will you do then?</p>\n" +
                "<p><em><strong>c. Without: kh&ocirc;ng c&oacute;</strong></em></p>\n" +
                "<p>V&iacute; dụ&nbsp; Without water, life wouldn't exist.</p>\n" +
                "<p>= If there were no water, life wouldn't exist.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4.&nbsp;</strong><strong>Một số biến thể kh&aacute;c của c&aacute;c cụm động từ trong c&aacute;c vế c&acirc;u điều kiện được d&ugrave;ng phổ biến trong tiếng anh.</strong></span></h3>\n" +
                "<p><span style=\"color: #ff6600;\"><strong>+ C&acirc;u điều kiện loại 1</strong></span></p>\n" +
                "<ul>\n" +
                "<li>&nbsp;<em><strong>Đối với trường hợp c&oacute; thể xảy ra trong tương lai v&agrave; nhấn mạnh trạng th&aacute;i diễn ra/ho&agrave;n th&agrave;nh của sự việc.</strong></em></li>\n" +
                "</ul>\n" +
                "<p>C&ocirc;ng thức: If + present simple, future continuous/future perfect.</p>\n" +
                "<p>V&iacute; du:&nbsp;If we&nbsp;<u>leave&nbsp;</u>Hanoi&nbsp;for&nbsp;Hue&nbsp;today, we&nbsp;<u>shall be staying&nbsp;</u>in&nbsp;Hue&nbsp;tomorrow. (<em>Nếu ch&uacute;ng ta rời H&agrave; Nội tới Huế h&ocirc;m nay, ch&uacute;ng ta sẽ ở Huế v&agrave;o ng&agrave;y mai</em>)</p>\n" +
                "<p>If you&nbsp;<u>do</u>&nbsp;your home work right now, you&nbsp;<u>will have finished&nbsp;</u>it in 2 hours' time. (<em>Nếu bạn l&agrave;m việc nh&agrave; ngay b&acirc;y giờ, bạn sẽ ho&agrave;n th&agrave;nh n&oacute; trong 2 giờ)</em></p>\n" +
                "<ul>\n" +
                "<li><em><strong>&nbsp;Đối với trường hợp thể hiện sự đồng &yacute;, cho ph&eacute;p, gợi &yacute;</strong></em></li>\n" +
                "</ul>\n" +
                "<p>C&ocirc;ng thức: If + present simple, ... may/can + V-inf.</p>\n" +
                "<p>V&iacute; dụ:&nbsp;If it&nbsp;<u>stops&nbsp;</u>raining, we&nbsp;<u>can</u>&nbsp;go out. (<em>Nếu trời ngừng mưa, ch&uacute;ng t&ocirc;i sẽ đi ra ngo&agrave;i</em>)</p>\n" +
                "<ul>\n" +
                "<li><em>&nbsp;<strong>Đối với c&acirc;u gợi &yacute;, khuy&ecirc;n răn, đề nghị hoặc y&ecirc;u cầu nhưng nhấn mạnh về h&agrave;nh động</strong></em></li>\n" +
                "</ul>\n" +
                "<p>C&ocirc;ng thức: If + present simple, ... would like to/must/have to/should... + V-inf.</p>\n" +
                "<p>V&iacute; dụ:&nbsp;If you&nbsp;<u>go</u>&nbsp;to the library today, I&nbsp;<u>would like to go&nbsp;</u>with you.&nbsp;<em>(</em><em>&nbsp;Nếu bạn đi đến thư viện ng&agrave;y h&ocirc;m nay, t&ocirc;i muốn đi với bạn.</em>)</p>\n" +
                "<p>If you&nbsp;<u>want</u>&nbsp;to lose weight, you&nbsp;<u>should do&nbsp;</u>some exercise.</p>\n" +
                "<ul>\n" +
                "<li><em><strong>Đối với c&acirc;u mệnh lệnh (chủ ngữ ẩn ở mệnh đề ch&iacute;nh)</strong></em></li>\n" +
                "</ul>\n" +
                "<p>C&ocirc;ng thức: If + present simple, (do not) V-inf.</p>\n" +
                "<p>V&iacute; dụ:&nbsp;If you are hungry, go to a restaurant. (<em>Nếu bạn đ&oacute;i, h&atilde;y đi đến nh&agrave; h&agrave;ng</em>.)</p>\n" +
                "<p>If you feel cold, don't open the door. (<em>Nếu bạn cảm thấy lạnh, đừng mở cửa)</em></p>\n" +
                "<p><span style=\"color: #ff6600;\"><strong>+&nbsp;C&acirc;u điều kiện loại&nbsp;2</strong></span></p>\n" +
                "<p><em><strong>&nbsp;a. Mệnh đề ch&iacute;nh (main clause)</strong></em></p>\n" +
                "<ul>\n" +
                "<li><strong>&nbsp;If + past simple, ... would/should/could/might/had to/ought to + be V-ing.</strong></li>\n" +
                "</ul>\n" +
                "<p>Ex. If we left&nbsp;Hanoi&nbsp;for&nbsp;Hue&nbsp;this morning, we would be staying in&nbsp;Hue&nbsp;tomorrow. (<em>Nếu ch&uacute;ng t&ocirc;i rời H&agrave; Nội v&agrave;o Huế s&aacute;ng nay, ch&uacute;ng t&ocirc;i sẽ ở Huế v&agrave;o ng&agrave;y mai</em>)</p>\n" +
                "<ul>\n" +
                "<li><strong>&nbsp;If + past simple, past simple</strong>. (việc đ&atilde; xảy ra)</li>\n" +
                "</ul>\n" +
                "<p>Ex. If the goalkeeper didn't catch the ball, they lost. (<em>Nếu thủ m&ocirc;n kh&ocirc;ng bắt b&oacute;ng, họ đ&atilde; thua</em>.)</p>\n" +
                "<ul>\n" +
                "<li><strong>&nbsp;If + past simple, ... would be + V-ing.</strong></li>\n" +
                "</ul>\n" +
                "<p>Ex. If I were on holiday with him, I would/might be touring&nbsp;Italy&nbsp;now. (<em>Nếu t&ocirc;i đi nghỉ c&ugrave;ng anh ấy, t&ocirc;i sẽ / c&oacute; thể đi lưu diễn tại &Yacute; b&acirc;y giờ.)</em></p>\n" +
                "<ul>\n" +
                "<li><strong>If d&ugrave;ng như \"as, since, because\"&nbsp;</strong>c&oacute; thể kết hợp với động từ ở nhiều th&igrave; kh&aacute;c nhau trong mệnh đề ch&iacute;nh v&agrave; kh&ocirc;ng thực sự l&agrave; một c&acirc;u điều kiện.</li>\n" +
                "</ul>\n" +
                "<p>Ex. If you knew her troubles, why didn't you tell me? . (nếu bạn biết rắc rối của c&ocirc; ấy, tại sao bạn kh&ocirc;ng n&oacute;i cho t&ocirc;i)</p>\n" +
                "<p><strong>b. Mệnh đề phụ (if-clause)</strong></p>\n" +
                "<ul>\n" +
                "<li><strong>If + past continuous, ... would/could + V-inf.</strong></li>\n" +
                "</ul>\n" +
                "<p>Ex. If we were studying English in&nbsp;London&nbsp;now, we could speak English much better. (<em>Nếu b&acirc;y giờ ch&uacute;ng ta học tiếng Anh ở London, ch&uacute;ng ta c&oacute; thể n&oacute;i tiếng Anh tốt hơn.)</em></p>\n" +
                "<ul>\n" +
                "<li><strong>&nbsp;If + past perfect, ... would/could + V-inf.</strong></li>\n" +
                "</ul>\n" +
                "<p>Ex. If you had taken my advice, you would be a millionaire now. (<em>Nếu bạn đ&atilde; lấy lời khuy&ecirc;n của t&ocirc;i, b&acirc;y giờ bạn sẽ l&agrave; một triệu ph&uacute;)</em></p>\n" +
                "<p><span style=\"color: #ff6600;\"><strong>+ C&acirc;u điều kiện loại&nbsp;3</strong></span><br /><br /><strong>a. Mệnh đề ch&iacute;nh (main clause)</strong></p>\n" +
                "<ul>\n" +
                "<li><strong>If + past perfect, ... could/might + present perfect.</strong></li>\n" +
                "</ul>\n" +
                "<p>Ex. If we had found him earlier, we could have saved his life. (<em>Nếu ch&uacute;ng t&ocirc;i đ&atilde; t&igrave;m thấy anh ta trước đ&oacute;, ch&uacute;ng t&ocirc;i c&oacute; thể đ&atilde; cứu sống anh ta.)</em></p>\n" +
                "<ul>\n" +
                "<li><strong>&nbsp;If + past perfect, present perfect continuous.</strong></li>\n" +
                "</ul>\n" +
                "<p>Ex. If you had left&nbsp;HungYen&nbsp;for&nbsp;ThanhHoa&nbsp;last Saturday, you would have been swimming in SamSon last Sunday. (nếu bạn rời Hưng tới Thanh Ho&aacute; v&agrave; chủ nhật tuần trước, c&oacute; thể bạn sẽ bơi ở biển Sầm Sownv &agrave; chủ nhật tuần trước)</p>\n" +
                "<ul>\n" +
                "<li><strong>If + past perfect, ... would + V-inf.</strong></li>\n" +
                "</ul>\n" +
                "<p>Ex. If she had followedmy advice, she would be richer now. (<em>Nếu c&ocirc; ấy đ&atilde; l&agrave;m theo lời khuy&ecirc;n của t&ocirc;i, b&acirc;y giờ c&ocirc; ấy sẽ gi&agrave;u hơn.</em>)</p>\n" +
                "<p><strong>b. Mệnh đề phụ (if-clause)</strong></p>\n" +
                "<ul>\n" +
                "<li><strong>&nbsp;If + past perfect continuous, ... would + present perfect.</strong></li>\n" +
                "</ul>\n" +
                "<p>Ex. If it hadn't been raining the whole week, I would have finished the laundry (nếu trời kh&ocirc;ng mưa suốt cả tuần, t&ocirc;i đ&atilde; ho&agrave;n th&agrave;nh xong việc giặt quần &aacute;o)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>5. C&Acirc;U AO ƯỚC VỚI WISH / IF ONLY</strong></span></h3>\n" +
                "<p><em>Khi học về c&acirc;u điều kiện, c&aacute;c bạn học th&ecirc;m về c&acirc;u ao ước thể hiện ước muốn trong tương lai, hiện tại v&agrave; qu&aacute; khứ.</em></p>\n" +
                "<p><span style=\"color: #ff6600;\"><strong><em>a. Wish trong tương lai</em></strong></span></p>\n" +
                "<p>&Yacute; nghĩa:</p>\n" +
                "<p>C&acirc;u ước ở tương lai d&ugrave;ng để diễn tả những mong ước về một sự việc trong tương lai.</p>\n" +
                "<p>Cấu tr&uacute;c:</p>\n" +
                "<p><strong>S + wish (es) + S + would / could + V1</strong></p>\n" +
                "<p>V&iacute; dụ:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\n" +
                "<p>I wish I would be a teacher in the future.</p>\n" +
                "<p><span style=\"color: #ff6600;\"><strong><em>b. WISH ở hiện tại</em></strong></span></p>\n" +
                "<p>&Yacute; nghĩa: C&acirc;u ước ở hiện tại d&ugrave;ng để diễn tả những mong ước về một sự việc kh&ocirc;ng c&oacute; thật ở hiện tại, hay giả định một điều ngược lại so với thực tế.</p>\n" +
                "<p><em>Cấu tr&uacute;c:</em></p>\n" +
                "<p>S + wish (es) + S + V2/ed + ...</p>\n" +
                "<p>(to be: were / weren't)</p>\n" +
                "<p>- Động từ BE được sử dụng ở dạng giả định c&aacute;ch, tức l&agrave; ta chia BE WERE với tất cả c&aacute;c chủ ngữ.</p>\n" +
                "<p>V&iacute; dụ: I wish I were rich. (But I am poor now).</p>\n" +
                "<p><span style=\"color: #ff6600;\"><strong><em>c. Wish trong qu&aacute; khứ</em></strong></span></p>\n" +
                "<p>&Yacute; nghĩa: C&acirc;u ước ở qu&aacute; khứ d&ugrave;ng để diễn tả những mong ước về một sự việc kh&ocirc;ng c&oacute; thật ở qu&aacute; khứ, hay giả định một điều ngược lại so với thực tại đ&atilde; xảy ra ở qu&aacute; khứ.</p>\n" +
                "<p>Cấu tr&uacute;c:</p>\n" +
                "<p>V&iacute; dụ:&nbsp; I wish I had met her yesterday. (I didn't meet her).</p>\n" +
                "<p>She wishes she could have been there. (She couldn't be there.)</p>\n" +
                "<p><span style=\"color: #ff6600;\"><em><strong>d.&nbsp;C&aacute;c c&aacute;ch sử dụng kh&aacute;c của WISH</strong></em></span></p>\n" +
                "<p>1. Wish + to V</p>\n" +
                "<p>V&iacute; dụ:&nbsp; I wish to go out with you next Sunday.</p>\n" +
                "<p>2. Wish + N (đưa ra một lời ch&uacute;c mừng, mong ước)</p>\n" +
                "<p>V&iacute; dụ:&nbsp; I wish happiness and good health.</p>\n" +
                "<p>3. Wish + O + (not) to V&hellip;</p>\n" +
                "<p>V&iacute; dụ: She wishes him not to play games any more.</p>\n" +
                "<p>&nbsp;</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
