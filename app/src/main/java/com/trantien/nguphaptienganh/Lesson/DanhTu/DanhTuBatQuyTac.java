package com.trantien.nguphaptienganh.Lesson.DanhTu;

import android.webkit.WebView;

public class DanhTuBatQuyTac {
    WebView wv;

    public DanhTuBatQuyTac(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<table class=\"table-product\" border=\"1\" cellpadding=\"1\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td><strong>Loại danh từ</strong></td>\n" +
                "<td><strong>C&aacute;ch chuyển</strong></td>\n" +
                "<td><strong>V&iacute; dụ</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Kết th&uacute;c bằng -fe, -f</td>\n" +
                "<td>Chuyển &ndash;ef,-f th&agrave;nh &ndash;ves</td>\n" +
                "<td><strong>knife&nbsp;&ndash; knives</strong>:con dao\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>life&nbsp;&ndash; lives</strong>: cuộc đời</p>\n" +
                "<p><strong>wife&nbsp;&ndash; wives</strong>: vợ</p>\n" +
                "<p><strong>thief</strong><strong>&nbsp;&ndash; thieves</strong>: t&ecirc;n trộm</p>\n" +
                "<p><strong>half &ndash; halves</strong>: một nửa</p>\n" +
                "<p><strong>wolf &ndash; wolves</strong>: con s&oacute;i</p>\n" +
                "<p><strong>loaf &ndash; loaves</strong>: ổ b&aacute;nh mỳ</p>\n" +
                "<p><strong>calf &ndash; calves</strong>: con b&ecirc;</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>K&ecirc;t th&uacute;c bằng &ndash;us</td>\n" +
                "<td>Đổi &ndash;us th&agrave;nh &ndash;i&nbsp; đối với danh từ c&oacute; gốc l&agrave; từ nước ngo&agrave;i. Hoặc th&ecirc;m &ndash;es, với danh từ l&agrave; tiếng Anh.</td>\n" +
                "<td><strong>cactus&nbsp;&ndash; cacti</strong>: c&acirc;y xương rồng\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>nucleus&nbsp;&ndash; nuclei</strong>: hạt nh&acirc;n</p>\n" +
                "<p><strong>focus&nbsp;&ndash; foci</strong>: ti&ecirc;u điểm</p>\n" +
                "<p><strong>genius &ndash; genii</strong>: thi&ecirc;n t&agrave;i</p>\n" +
                "<p><strong>fungus &ndash; fungi</strong>: nấm</p>\n" +
                "<p><strong>prospectus&nbsp;</strong><strong>&ndash; prospectuses</strong>:</p>\n" +
                "<p>giấy giao h&agrave;ng</p>\n" +
                "<div class=\"insert-post-ads\">&nbsp;</div>\n" +
                "<p><strong>terminus &ndash; termini/terminuses</strong>:</p>\n" +
                "<p>điểm cuối c&ugrave;ng</p>\n" +
                "<p><strong>thesaurus &ndash; thesauri/thesauruses</strong>:</p>\n" +
                "<p>b&aacute;ch khoa to&agrave;n thư</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Kết th&uacute;c bằng -is</td>\n" +
                "<td>Đổi -is th&agrave;nh es</td>\n" +
                "<td><strong>analysis&nbsp;&ndash; analyses</strong>: sự ph&acirc;n t&iacute;ch\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>crisis&nbsp;&ndash; crises</strong>: sự khủng hoảng</p>\n" +
                "<p><strong>thesis&nbsp;&ndash; theses</strong>: luận văn</p>\n" +
                "<p><strong>axis&nbsp;</strong><strong>&ndash; axes</strong>: c&aacute;i trục</p>\n" +
                "<p><strong>diagnosis &ndash; diagnoses</strong>:</p>\n" +
                "<p>lời chuẩn đo&aacute;n</p>\n" +
                "<p><strong>hypothesis &ndash; hypotheses</strong>: giả thuyết</p>\n" +
                "<p><strong>oasis &ndash; oases</strong>: ốc đảo</p>\n" +
                "<p><strong>thesis &ndash; theses</strong>: luận văn</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Danh từ kết th&uacute;c bằng -on</td>\n" +
                "<td>Đổi -on th&agrave;nh -a</td>\n" +
                "<td><strong>phenomenon&nbsp;&ndash; phenomena</strong>:\n" +
                "<p>&nbsp;</p>\n" +
                "<p>vật kỳ lạ, hiện tượng</p>\n" +
                "<p><strong>criterion&nbsp;&ndash; criteria</strong>: ti&ecirc;u chuẩn</p>\n" +
                "<p><strong>automaton &ndash; automata</strong>:</p>\n" +
                "<p>thiết bị tự động</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>&nbsp;</td>\n" +
                "<td>Một số từ bất quy tắc. chỉ th&ecirc;m -s</td>\n" +
                "<td><strong>echo &ndash; echoes</strong>: kẻ ủng hộ m&ugrave; qu&aacute;ng\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>embargo &ndash; embargoes</strong>: lệnh cấm vận</p>\n" +
                "<p><strong>auto &ndash; autos</strong>: &ocirc; t&ocirc;</p>\n" +
                "<p><strong>kangaroo &ndash; kangaroos</strong>: con chuột t&uacute;i</p>\n" +
                "<p><strong>kilo &ndash; kilos</strong>: c&acirc;n</p>\n" +
                "<p><strong>memo &ndash; memos</strong>: bản sao, thư b&aacute;o</p>\n" +
                "<p><strong>photo &ndash; photos</strong>: bản ph&ocirc; t&ocirc;</p>\n" +
                "<p><strong>piano &ndash; pianos</strong>: đ&agrave;n piano</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Danh từ kết th&uacute;c bằng &ndash;ex, ix</td>\n" +
                "<td>Đổi &ndash;ex, ix th&agrave;nh &ndash;ices hoặc -es</td>\n" +
                "<td><strong>apex &ndash; apices, apexes</strong>: đỉnh, chỏm\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>appendix &ndash; appendices/</strong></p>\n" +
                "<p><strong>appendixes</strong>: phụ lục</p>\n" +
                "<p><strong>index &ndash; indices/indexes</strong>: chỉ số</p>\n" +
                "<p><strong>matrix-&gt;matrices/matrixes</strong>: ma trận</p>\n" +
                "<p><strong>vortex &ndash; vortexes</strong>: cơn lốc</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Danh từ kết th&uacute;c bằng -um</td>\n" +
                "<td>Đổi &ndash;um th&agrave;nh &ndash;a,-i,-s</td>\n" +
                "<td><strong>addendum &ndash; addenda:</strong>phụ lục\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>bacterium &ndash; bacteria</strong>: vi khuẩn</p>\n" +
                "<p><strong>curriculum &ndash; curricula/</strong></p>\n" +
                "<p><strong>curriculums</strong>: bản l&yacute; lịch</p>\n" +
                "<p><strong>erratum &ndash; errata</strong>: bản đ&iacute;nh ch&iacute;nh</p>\n" +
                "<p><strong>medium &ndash; media</strong>: b&agrave; đồng, b&agrave; cốt</p>\n" +
                "<p><strong>memorandum &ndash;</strong><strong>&nbsp;memoranda/</strong></p>\n" +
                "<p><strong>memorandums</strong>: thư b&aacute;o</p>\n" +
                "<p><strong>ovum &ndash; ova</strong>: trứng</p>\n" +
                "<p><strong>stratum &ndash; strata</strong>: địa tầng, vỉa</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Những từ kh&ocirc;ng thay đổi khi chia ở số nhiều</td>\n" +
                "<td>Phải học thuộc</td>\n" +
                "<td><strong>sheep &ndash; sheep</strong>: con cừu\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>deer &ndash; deer</strong>: con hươu</p>\n" +
                "<p><strong>fish &ndash; fish</strong>: c&aacute;</p>\n" +
                "<p><strong>gallows &ndash; gallows</strong>: gi&aacute; treo cổ</p>\n" +
                "<p><strong>offspring &ndash; offspring</strong>: con ch&aacute;u</p>\n" +
                "<p><strong>series &ndash;&nbsp;</strong><strong>serries</strong>: d&atilde;y</p>\n" +
                "<p><strong>species &ndash; species</strong>: lo&agrave;i</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Những danh từ bất quy tắc kh&aacute;c</td>\n" +
                "<td>Phải học thuộc</td>\n" +
                "<td><strong>foot &ndash; feet</strong>: ch&acirc;n\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>tooth &ndash; teeth</strong>: răng</p>\n" +
                "<p><strong>person &ndash; people</strong>:người</p>\n" +
                "<p><strong>goose &ndash; geese</strong>: con ngỗng</p>\n" +
                "<p><strong>child &ndash; children</strong>: trẻ em</p>\n" +
                "<p><strong>man &ndash; men</strong>: nam giới</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
