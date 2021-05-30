package com.trantien.nguphaptienganh.Lesson.CauBiDong;

import android.webkit.WebView;

public class CauTrucCauBiDong {
    WebView wv;

    public CauTrucCauBiDong(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load(){
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. C&ocirc;ng thức chung</strong></span></h3>\n" +
                "<h3>&nbsp;S + BE + V past participle(V3/ED)</h3>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><strong>2. Điều kiện</strong></strong></span></h3>\n" +
                "<p>- V trong c&acirc;u chủ động phải l&agrave; Transitive Verb (Ngoại động từ: đ&ograve;i hỏi c&oacute; O theo sau)</p>\n" +
                "<p>- C&aacute;c O (trực tiếp, gi&aacute;n tiếp) phải được n&ecirc;u r&otilde; r&agrave;ng</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><strong>3. Quy tắc</strong></strong></span></h3>\n" +
                "<p>Khi biến đổi 1 c&acirc;u từ chủ động sang bị động ta l&agrave;m theo c&aacute;c bước sau:</p>\n" +
                "<p><strong>a.</strong>&nbsp;X&aacute;c định&nbsp;S, V, O&nbsp;v&agrave; th&igrave; của&nbsp;V&nbsp;trong c&acirc;u chủ động.</p>\n" +
                "<p><strong>b.</strong>&nbsp;Lấy&nbsp;O&nbsp;trong c&acirc;u chủ động l&agrave;m&nbsp;S&nbsp;của c&acirc;u bị động.&nbsp;Lấy&nbsp;S&nbsp;trong c&acirc;u chủ động l&agrave;m&nbsp;O&nbsp;v&agrave; đặt sau&nbsp;By&nbsp;trong c&acirc;u bị động.</p>\n" +
                "<p><strong>c.</strong>&nbsp;Biến đổi&nbsp;V&nbsp;ch&iacute;nh trong c&acirc;u chủ động th&agrave;nh&nbsp;P2&nbsp;(Past Participle) trong c&acirc;u bị động.</p>\n" +
                "<p><strong>d.&nbsp;</strong>Th&ecirc;m&nbsp;To be&nbsp;v&agrave;o trước&nbsp;P2&nbsp;trong c&acirc;u bị động&nbsp;(To be&nbsp;phải chia theo thời của&nbsp;V&nbsp;ch&iacute;nh trong c&acirc;u</p>\n" +
                "<p>chủ động v&agrave; chia theo số của S trong c&acirc;u bị động).</p>\n" +
                "<h3><span style=\"color: #ff6600;\">4. C&ocirc;ng thức c&aacute;c th&igrave;<strong>&nbsp;ở thể bị động</strong></span></h3>\n" +
                "<ul>\n" +
                "<li><strong>Hiện tại đơn:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active:&nbsp;S + V + O</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive:&nbsp;S + be + V3/ED + by + O</p>\n" +
                "<ul>\n" +
                "<li><strong>Hiện tại tiếp diễn:&nbsp;</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active: S + am/is/are + V-ing + O</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive: S + am/is/are + being + V3/ED + by + O</p>\n" +
                "<ul>\n" +
                "<li><strong>Hiện tại Ho&agrave;n Th&agrave;nh:&nbsp;</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active: S + has/have + V3/ED + O</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive: S + has/have + been + V3/ED+ by + O</p>\n" +
                "<ul>\n" +
                "<li><strong>Qu&aacute; khứ đơn:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active: S + V-ed + O</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive: S + was/were + V3/ED + by + O</p>\n" +
                "<ul>\n" +
                "<li><strong>Qu&aacute; khứ Tiếp diễn:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active: S + was/were + V-ing + O</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive: S + was/were + being + V3/ED + by + O</p>\n" +
                "<ul>\n" +
                "<li><strong>Qu&aacute; khứ Ho&agrave;n th&agrave;nh:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active: S + had + V3/ED + O</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive: S + had + been + V3/ED + by + O</p>\n" +
                "<ul>\n" +
                "<li><strong>Tương lai đơn:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active: S + will/shall + V + O</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive: S + will + be + V3/ED + by + O</p>\n" +
                "<ul>\n" +
                "<li><strong>Tương lai Ho&agrave;n th&agrave;nh:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active: S + will/shall + have + V3/ED + O</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive: S + will + have + been + V3/ED + by + O</p>\n" +
                "<ul>\n" +
                "<li><strong>Be + going to:</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active: S + am/is/are + going to + V + O</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive: S + am/is/are + going to + be + V3/ED + by + O</p>\n" +
                "<ul>\n" +
                "<li><strong>Động từ đặc biệt:&nbsp;</strong></li>\n" +
                "</ul>\n" +
                "<p style=\"padding-left: 30px;\">+ Active: S + model verb + V + O /&nbsp;S + modal Verb + have +V3/ED</p>\n" +
                "<p style=\"padding-left: 30px;\">+&nbsp;Passive: S + model verb + be + V3/ED + by + O /&nbsp;S + modal Verb + have been +V3/ED</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
