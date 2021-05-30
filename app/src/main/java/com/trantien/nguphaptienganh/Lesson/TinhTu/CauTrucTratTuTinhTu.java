package com.trantien.nguphaptienganh.Lesson.TinhTu;

import android.webkit.WebView;

public class CauTrucTratTuTinhTu {
    WebView wv;

    public CauTrucTratTuTinhTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<p><strong>1. Từ nhận x&eacute;t (Opinion):</strong>&nbsp;Useful, beautiful, interesting, lovely, delicious,...</p>\n" +
                "<p><strong>2. K&iacute;ch cỡ (Size):</strong>&nbsp;big, small, large, huge, tiny,...</p>\n" +
                "<p><strong>3. H&igrave;nh d&aacute;ng (Shape):&nbsp;</strong>long, short, round (tr&ograve;n), triangle (tam gi&aacute;c), cubic (h&igrave;nh hộp), heart-shaped (h&igrave;nh tr&aacute;i tim), flat (bằng phẳng),...</p>\n" +
                "<p><strong>4. Tuổi thọ (Age):</strong>&nbsp;old, young, new, brandnew, ancient (cổ đại), modern (hiện đại),...</p>\n" +
                "<p><strong>5. M&agrave;u sắc (Color):&nbsp;</strong>Black, red, white, blue, yellow, cream (m&agrave;u kem), violet (t&iacute;m),purple (đỏ t&iacute;a), navy blue (xanh hải qu&acirc;n), magenta (đỏ thẫm), brick red (đỏ gạch), emerald (xanh ngọc), jet black (đen nh&aacute;nh),...</p>\n" +
                "<p><strong>6. Nguồn gốc (Origin):&nbsp;</strong>Vietnamese, English, Indian, Thai, German, American,...</p>\n" +
                "<p><strong>7. Chất liệu (Material):&nbsp;</strong>Silk (lụa), gold, silver, wooden, metal (kim loại), plastic, leather (da), glass (thủy tinh), concrete (b&ecirc; t&ocirc;ng), ivory (ng&agrave;)</p>\n" +
                "<p>Cuối c&ugrave;ng của cụm c&oacute; thể l&agrave; c&aacute;c danh từ đơn hoặc danh từ gh&eacute;p</p>\n" +
                "<p>Vd: football shoes &ndash; gi&agrave;y b&oacute;ng đ&aacute;; storage house &ndash; nh&agrave; kho; baby shampoo &ndash; dầu gội trẻ em; dining room &ndash; ph&ograve;ng ăn tối, motor helmet &ndash; mũ bảo hiểm đi motor.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
