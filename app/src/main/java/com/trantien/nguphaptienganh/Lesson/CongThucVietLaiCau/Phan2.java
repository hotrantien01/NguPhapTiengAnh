package com.trantien.nguphaptienganh.Lesson.CongThucVietLaiCau;

import android.webkit.WebView;

public class Phan2 {
    WebView wv;

    public Phan2(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 6:</strong><strong>&nbsp;</strong>Trong c&acirc;u&nbsp;<em>c&oacute; t&iacute;nh từ</em></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>to V + be + Adj./Noun</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;S + V + it + Adj./Noun + to V</strong></p>\n" +
                "</blockquote>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p><em><strong>To live</strong></em>&nbsp;in the countryside alone could be hard for her.&nbsp;</p>\n" +
                "<p>&harr; She&nbsp;<em><strong>finds</strong></em>&nbsp;it hard to live alone in the countryside.</p>\n" +
                "<p>(C&ocirc; ấy cảm thấy sống ở v&ugrave;ng qu&ecirc; l&agrave; việc kh&oacute; khăn đối với m&igrave;nh)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 7:</strong>&nbsp;Chuyển đổi&nbsp;<em>c&acirc;u điều kiện&nbsp;</em>tương đương</span></h3>\n" +
                "<p><em>a. C&acirc;u gốc l&agrave; c&acirc;u điều kiện:&nbsp;</em></p>\n" +
                "<table border=\"1\" cellspacing=\"1\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td><strong>C&acirc;u điều kiện ở hiện tại</strong></td>\n" +
                "<td><strong>C&acirc;u điều kiện ở qu&aacute; khứ</strong></td>\n" +
                "<td><strong>V&iacute; dụ</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p><strong>If + S + V2/-ed, S + would/could + V(bare)</strong></p>\n" +
                "</td>\n" +
                "<td><strong>If + S + had + V3/-ed, S + would/could + have + V3/-ed</strong></td>\n" +
                "<td>\n" +
                "<p>If I&nbsp;drank enough water,&nbsp;I would feel&nbsp;very thirsty.<br />&harr; If I had drunk enough water, I wouldn't have felt thirsty.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p><em>b. C&acirc;u gốc kh&ocirc;ng phải c&acirc;u điều kiện:&nbsp;</em></p>\n" +
                "<table border=\"1\" cellspacing=\"1\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td><strong>C&acirc;u gốc</strong></td>\n" +
                "<td><strong>C&acirc;u biến đổi</strong></td>\n" +
                "<td><strong>V&iacute; dụ</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p><strong>mệnh đề 1 +&nbsp;<em>so</em>&nbsp;+ mệnh đề 2</strong>&nbsp;</p>\n" +
                "</td>\n" +
                "<td>&nbsp;<strong>If + mệnh đề 1, mệnh đề 2</strong></td>\n" +
                "<td>\n" +
                "<p>Janet didn't bring her raincoat,&nbsp;<em><strong>so</strong></em>she got wet.<br />&harr;&nbsp;<em><strong>If</strong></em>&nbsp;Janet had brought her raincoat, she wouldn't have got wet</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<p><strong>mệnh đề 1 +&nbsp;<em>because</em>&nbsp;+ mệnh đề 2</strong></p>\n" +
                "</td>\n" +
                "<td><strong>If + mệnh đề 2, mệnh đề 1</strong></td>\n" +
                "<td>\n" +
                "<p>I can't go out&nbsp;<em><strong>because</strong></em>&nbsp;I don't have money<br />&harr;&nbsp;<em><strong>If</strong></em>&nbsp;I had money, I could go out</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<h3><strong><br /><span style=\"color: #ff6600;\">Cấu tr&uacute;c 8:</span></strong><span style=\"color: #ff6600;\">&nbsp;Chuyển đổi c&acirc;u với&nbsp;<em>unless</em></span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>If &hellip; not &hArr;&nbsp;Unless &hellip;</strong></p>\n" +
                "</blockquote>\n" +
                "<p><strong>Lưu &yacute;</strong>: Kh&ocirc;ng được thay đổi loại điều kiện, chỉ được thay đổi nghĩa phủ định hay nghi vấn của n&oacute;</p>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>If it doesn't rain, we can go picnic.&nbsp;</p>\n" +
                "<p>&harr;&nbsp;<em><strong>Unless</strong></em>&nbsp;it rains, we can go picnic.</p>\n" +
                "<p>(Nếu trời kh&ocirc;ng mưa, ch&uacute;ng ta c&oacute; thể đi d&atilde; ngoại)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 9:&nbsp;</strong>Chuyển&nbsp;<em>th&igrave; hiện tại ho&agrave;n th&agrave;nh</em>&nbsp;về&nbsp;<em>th&igrave; qu&aacute; khứ đơn&nbsp;</em>(d&ugrave;ng chủ ngữ giả&nbsp;<em>'it'</em>)</span></h3>\n" +
                "<blockquote>\n" +
                "<p><strong>S + have/has + V3/-ed</strong></p>\n" +
                "<p><strong>&hArr;&nbsp;It's + [thời gian] + since + [trạng từ chỉ thời gian] S + V2/-ed + &hellip;</strong></p>\n" +
                "</blockquote>\n" +
                "<p>V&iacute; dụ:</p>\n" +
                "<p>Huan and Vy&nbsp;<em><strong>have been married</strong></em>&nbsp;for 3 years.&nbsp;</p>\n" +
                "<p>&harr; It's 3&nbsp;<em><strong>years</strong></em>&nbsp;since Huan and Vy&nbsp;<em><strong>were</strong></em>&nbsp;married.</p>\n" +
                "<p>(Đ&atilde; ba năm kể từ thời điểm Hu&acirc;n v&agrave; Vy kết h&ocirc;n)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>Cấu tr&uacute;c 10:</strong>&nbsp;Chuyển đổi&nbsp;<em>c&acirc;u điều ước</em></span></h3>\n" +
                "<table border=\"1\" cellspacing=\"1\" cellpadding=\"2\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>&nbsp;</td>\n" +
                "<td><strong>Cấu tr&uacute;c&nbsp;</strong></td>\n" +
                "<td><strong>V&iacute; dụ</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>C&acirc;u ước ở qu&aacute; khứ</strong></td>\n" +
                "<td>wish + someone + would + bare infinitive</td>\n" +
                "<td>She won't come back here. &harr; I<em><strong>wish</strong></em>&nbsp;she&nbsp;<strong><em>would</em></strong>&nbsp;come back here<br />(T&ocirc;i ước chi c&ocirc; ấy sẽ quay lại đ&acirc;y)</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>C&acirc;u ước ở hiện tại</strong></td>\n" +
                "<td>wish + someone + V2/-ed&nbsp;</td>\n" +
                "<td>I don't have lots of money. &harr; I<strong><em>wish</em></strong>&nbsp;I&nbsp;<strong><em>could</em></strong>&nbsp;have lots of money<br />(T&ocirc;i ước g&igrave; t&ocirc;i c&oacute; hật nhiều tiền)</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>C&acirc;u ước ở tương lai</strong></td>\n" +
                "<td>wish + someone + had + V3/-ed</td>\n" +
                "<td>I didn't say that I love him. &harr; I<strong><em>wish</em></strong>&nbsp;I&nbsp;<strong><em>had said</em></strong>&nbsp;that I loved him<br />(T&ocirc;i ước g&igrave; m&igrave;nh c&oacute; thể n&oacute;i rằng t&ocirc;i y&ecirc;u anh ấy)</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
