package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemQuyTacTrongAm {
    WebView wv;

    public ThemQuyTacTrongAm(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">QUY TẮC 1: Động từ c&oacute; 2 &acirc;m tiết </span></h3>\n" +
                "<p><span style=\"color: #000000;\"><strong>-&gt; trọng &acirc;m rơi v&agrave;o &acirc;m tiết thứ 2</strong></span></p>\n" +
                "<p>Ex:&nbsp;<strong>be'gin, be'come, for'get, en'joy, dis'cover, re'lax, de'ny, re'veal</strong>,&hellip;</p>\n" +
                "<p>Ngoại lệ:&nbsp;<strong>'answer, 'enter, 'happen, 'offer, 'open</strong>&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 2: Danh từ c&oacute; 2 &acirc;m tiết </span></h3>\n" +
                "<p><span style=\"color: #000000;\"><strong>-&gt; trọng &acirc;m rơi v&agrave;o &acirc;m tiết thứ 1</strong></span></p>\n" +
                "<p>Ex:&nbsp;<strong>'children, 'hobby, 'habit, 'labour, 'trouble, 'standard</strong>&hellip;</p>\n" +
                "<p>Ngoại lệ:&nbsp;<strong>ad'vice, ma'chine, mis'take</strong>&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 3: T&iacute;nh từ c&oacute; 2 &acirc;m tiết </span></h3>\n" +
                "<p><span style=\"color: #000000;\"><strong>-&gt; trọng &acirc;m rơi v&agrave;o &acirc;m tiết thứ 1</strong></span></p>\n" +
                "<p>Ex:&nbsp;<strong>'basic, 'busy, 'handsome, 'lucky, 'pretty, 'silly</strong>&hellip;</p>\n" +
                "<p>Ngoại lệ:&nbsp;<strong>a'lone, a'mazed</strong>, &hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 4: Động từ gh&eacute;p </span></h3>\n" +
                "<p><strong><span style=\"color: #000000;\">-&gt; trọng &acirc;m rơi v&agrave;o &acirc;m tiết thứ 2</span></strong></p>\n" +
                "<p>Ex:&nbsp;<strong>be'come, under'stand</strong>,</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 5: Trọng &acirc;m rơi v&agrave;o ch&iacute;nh c&aacute;c vần sau: sist, cur, vert, test, tain, tract, vent, self.</span></h3>\n" +
                "<p>Ex:&nbsp;<strong>e'vent, sub'tract, pro'test, in'sist, main'tain, my'self, him'self</strong>&nbsp;&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 6: Với những hậu tố sau th&igrave; trọng &acirc;m rơi v&agrave;o ch&iacute;nh &acirc;m tiết chứa n&oacute;:&nbsp;<strong><em>-ee, - eer, -ese, -ique, -esque, -ain.</em></strong></span></h3>\n" +
                "<p>Ex:&nbsp;<strong>ag'ree, volun'teer, Vietna'mese, re'tain, main'tain, u'nique, pictu'resque, engi'neer</strong>&hellip;</p>\n" +
                "<p>Ngoại lệ:&nbsp;<strong>com'mittee, 'coffee, em'ployee</strong>&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 7: C&aacute;c từ c&oacute; hậu tố l&agrave;&nbsp;<strong><em>&ndash;ic, -ish, -ical, -sion, -tion, -ance, -ence, -idle, -ious, -iar, ience, -id, -eous, -acy, -ian, -ity</em></strong>&nbsp;</span></h3>\n" +
                "<p><span style=\"color: #000000;\"><strong>-&gt; trọng &acirc;m rơi v&agrave;o &acirc;m tiết liền trước.</strong></span></p>\n" +
                "<p>Ex:&nbsp;<strong>eco'nomic, 'foolish, 'entrance, e'normous</strong>&nbsp;&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 8: Hầu như c&aacute;c tiền tố kh&ocirc;ng nhận trọng &acirc;m.</span></h3>\n" +
                "<p>Ex:&nbsp;<strong>dis'cover, re'ly, re'ply, re'move, des'troy, re'write, im'possible, ex'pert, re'cord</strong>, &hellip;</p>\n" +
                "<p>Ngoại lệ:&nbsp;<strong>'underpass, 'underlay</strong>&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 9: Danh từ gh&eacute;p </span></h3>\n" +
                "<p><strong><span style=\"color: #000000;\">-&gt; trọng &acirc;m rơi v&agrave;o &acirc;m tiết thứ 1</span></strong></p>\n" +
                "<p>Ex:&nbsp;<strong>'birthday, 'airport, 'bookshop, 'gateway, 'guidebook, 'filmmaker</strong>,&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 10: T&iacute;nh từ gh&eacute;p </span></h3>\n" +
                "<p><span style=\"color: #000000;\"><strong>-&gt; trọng &acirc;m rơi v&agrave;o &acirc;m tiết thứ 1</strong></span></p>\n" +
                "<p>Ex:&nbsp;<strong>'airsick, 'homesick, 'carsick, 'airtight, 'praiseworthy, 'trustworth, 'waterproof, &hellip;</strong></p>\n" +
                "<p>Ngoại lệ:&nbsp;<strong>duty-'free, snow-'white</strong>&nbsp;&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 11: C&aacute;c t&iacute;nh từ gh&eacute;p c&oacute; th&agrave;nh phần đầu ti&ecirc;n l&agrave; t&iacute;nh từ hoặc trạng từ, th&agrave;nh phần thứ hai tận c&ugrave;ng l&agrave;&nbsp;<strong><em>&ndash;ed</em></strong>&nbsp;</span></h3>\n" +
                "<p><strong><span style=\"color: #000000;\">-&gt; trọng &acirc;m ch&iacute;nh rơi v&agrave;o th&agrave;nh phần thứ 2.</span></strong></p>\n" +
                "<p>Ex: ,<strong>bad-'tempered, ,short-'sighted, ,ill-'treated, ,well-'done, well-'known</strong>&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 12: Khi th&ecirc;m c&aacute;c hậu tố sau th&igrave; trọng &acirc;m ch&iacute;nh của từ kh&ocirc;ng thay đổi.</span></h3>\n" +
                "<p><strong><em>-ment, -ship, -ness, -er/or, -hood, -ing, -en, -ful, -able, -ous, -less</em></strong></p>\n" +
                "<p>Ex:</p>\n" +
                "<ul>\n" +
                "<li><strong>ag'ree &ndash; ag'reement</strong></li>\n" +
                "<li>\n" +
                "<p><strong>'meaning &ndash; 'meaningless</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>re'ly &ndash; re'liable</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>'poison &ndash; 'poisonous</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>'happy &ndash; 'happiness</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>re'lation &ndash; re'lationship</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>'neighbour &ndash; 'neighbourhood</strong></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>ex'cite - ex'citing</strong></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<h3><span style=\"color: #ff6600;\">QUY TẮC 13: Những từ c&oacute; tận c&ugrave;ng l&agrave;:&nbsp;<strong><em>&ndash;graphy, -ate, &ndash;gy, -cy, -ity, -phy, -al</em></strong>&nbsp;</span></h3>\n" +
                "<p><strong><span style=\"color: #000000;\">-&gt; trọng &acirc;m rơi v&agrave;o &acirc;m tiết thứ 3 từ dưới l&ecirc;n.</span></strong></p>\n" +
                "<p>Ex:&nbsp;<strong>eco'nomical, de'moracy, tech'nology, ge'ography, pho'tography, in'vestigate, im'mediate</strong>,&hellip;</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
