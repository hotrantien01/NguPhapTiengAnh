package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemPhatAm_s_es {
    WebView wv;

    public ThemPhatAm_s_es(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<p><strong>1. Khi từ vựng c&oacute; tận c&ugrave;ng l&agrave; c&aacute;c phụ &acirc;m v&ocirc; thanh như: /f/, /t/, /k/, /p/ , /&eth;/, khi th&ecirc;m s sẽ được đọc l&agrave; &ndash; /s/</strong></p>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>Books &ndash; /bʊks/:&nbsp;<strong>những cuốn s&aacute;ch</strong></p>\n" +
                "<p>Lamps &ndash; /l&aelig;mps/ :&nbsp;<strong>những c&aacute;i đ&egrave;n</strong></p>\n" +
                "<p>Laughes &ndash; / lɑ:fs/:<strong>&nbsp;cười</strong></p>\n" +
                "<p>Breathes &ndash; / bri:&eth;s/:<strong>&nbsp;thở</strong></p>\n" +
                "<p><strong>2. Đọc l&agrave; &ndash; /iz, khi từ c&oacute; tận c&ugrave;ng l&agrave; c&aacute;c &acirc;m /s/, /z/, /&int;/, /t&int;/, /ʒ/, /dʒ/ /o/ (thường c&oacute; tận c&ugrave;ng l&agrave; c&aacute;c chữ c&aacute;i ce, x, z, sh, ch, s, ss, ge, o)</strong></p>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>Classes &ndash; / klɑ:siz/:&nbsp;<strong>c&aacute;c lớp học</strong></p>\n" +
                "<p>Washes &ndash; /wɒ&int;iz/:<strong>&nbsp;giặt rũ</strong></p>\n" +
                "<p>Watches &ndash; / wɒt&int;iz/:&nbsp;<strong>những chiếc đồng hồ</strong></p>\n" +
                "<p>Changes &ndash; /t&int;eindʒiz/:&nbsp;<strong>thay đổi</strong></p>\n" +
                "<p><strong>3. Đọc l&agrave; &ndash; /z/, khi từ c&oacute; tận c&ugrave;ng l&agrave; nguy&ecirc;n &acirc;m v&agrave; c&aacute;c phụ &acirc;m hữu thanh c&ograve;n lại</strong></p>\n" +
                "<p>+ V&iacute; dụ:</p>\n" +
                "<p>Plays &ndash; / pleiz/:<strong>&nbsp;chơi</strong></p>\n" +
                "<p>Bags &ndash; / b&aelig;gz/:&nbsp;<strong>chiếc t&uacute;i</strong></p>\n" +
                "<p>Speeds &ndash; / spi:dz/:<strong>&nbsp;tốc độ</strong></p>\n" +
                "<p><strong>4. Mục đ&iacute;ch của việc th&ecirc;m s/es ,&rsquo;s</strong></p>\n" +
                "<p>C&oacute; nhiều l&yacute; do để th&ecirc;m s v&agrave; es hay &lsquo;s v&agrave;o đu&ocirc;i của từ :</p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p><em><strong>Để tạo th&agrave;nh danh từ số nhiều (cats)</strong></em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em><strong>Để chia động từ (snows)</strong></em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><em><strong>Để thể hiện sự sở hữu (coach&rsquo;s)</strong></em></p>\n" +
                "</li>\n" +
                "<li><em><strong>Để viết tắt từ (coach&rsquo;s nghĩa l&agrave; coach is)</strong></em></li>\n" +
                "</ul>\n" +
                "<p><em>Lưu &yacute; rằng mục đ&iacute;ch thể hiện sự sở hữu hay viết tắt từ thường chỉ được sử dụng trong văn n&oacute;i giao tiếp.</em></p>\n" +
                "<p><em><strong>Coach&rsquo;s thường được sử dụng nghĩa như The coach</strong>&nbsp;sở hữu một c&aacute;i g&igrave; đ&oacute; hoặc đ&oacute; l&agrave; viết tắt của từ coach is. </em></p>\n" +
                "<p><em>Tuy nhi&ecirc;n về mặt ph&aacute;t &acirc;m th&igrave; tương tự như nhau về hai h&igrave;nh thức sử dụng n&agrave;y.</em></p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
