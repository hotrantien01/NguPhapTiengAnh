package com.trantien.nguphaptienganh.Lesson.CauDieuKien;

import android.webkit.WebView;

public class CauDieuKienDaoNgu {
    WebView wv;

    public CauDieuKienDaoNgu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<p>Trong tiếng Anh c&acirc;u điều kiện Loại 2, loại 3 v&agrave; loại 2/3 thường được d&ugrave;ng ở dạng đảo. D&ugrave;ng should, were, had đảo l&ecirc;n trước chủ ngữ (should l&agrave; d&ugrave;ng trong điều kiện loại 1; were d&ugrave;ng trong loại 2; had d&ugrave;ng trong loại 3)</p>\n" +
                "<p>V&iacute; dụ: Were I the president, I would build more hospitals. Had I taken his advice, I would be rich now. Nếu t&ocirc;i l&agrave; tổng thống, t&ocirc;i sẽ x&acirc;y th&ecirc;m nhiều bệnh viện hơn. Nếu t&ocirc;i lấy lời khuy&ecirc;n của anh ấy, b&acirc;y giờ t&ocirc;i đ&atilde; gi&agrave;u c&oacute;.</p>\n" +
                "<ul>\n" +
                "<li><em><strong>Đảo ngữ c&acirc;u điều kiện loại 1: Should + S + Vo, S + Will +Vo</strong></em></li>\n" +
                "</ul>\n" +
                "<p>V&iacute; dụ: Should I meet him tomorrow, I will give him this letter = If I meet him tomorrow, I will give him this letter</p>\n" +
                "<ul>\n" +
                "<li><em><strong>Đảo ngữ c&acirc;u điều kiện loại 2: Were + S + to + Vo, S + Would + Vo</strong></em></li>\n" +
                "</ul>\n" +
                "<p>V&iacute; dụ: Were I you, I would buy this house = If I were you, I would buy this house.</p>\n" +
                "<ul>\n" +
                "<li><em><strong>Đảo ngữ c&acirc;u điều kiện loại 3: Had + S + V3/Ved, S + Would have + V3/Ved</strong></em></li>\n" +
                "</ul>\n" +
                "<p>V&iacute; dụ: Had he driven carefully, the accident wouldn't have happened. = If he had driven carefully, the accident wouldn't have happened.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
