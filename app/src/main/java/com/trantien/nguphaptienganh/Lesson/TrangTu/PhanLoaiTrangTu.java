package com.trantien.nguphaptienganh.Lesson.TrangTu;

import android.webkit.WebView;

public class PhanLoaiTrangTu {
    WebView wv;

    public PhanLoaiTrangTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Trạng từ chỉ c&aacute;ch thức (manner)</strong></span></h3>\n" +
                "<p>Diễn tả c&aacute;ch thức một h&agrave;nh động được thực hiện ra sao? d&ugrave;ng để trả lời c&aacute;c c&acirc;u hỏi với How?</p>\n" +
                "<p>V&iacute; dụ: He runs fast. She dances badly. I can sing very well</p>\n" +
                "<p><strong>Vị tr&iacute; của trạng từ chỉ c&aacute;ch thức</strong>&nbsp;thường&nbsp;<strong>đứng sau động từ hoặc đứng sau t&acirc;n ngữ</strong>&nbsp;(nếu như c&oacute; t&acirc;n ngữ).</p>\n" +
                "<p>V&iacute; dụ: She speaks well English. [kh&ocirc;ng đ&uacute;ng].</p>\n" +
                "<p>She speaks English well. [đ&uacute;ng]</p>\n" +
                "<p>I can play well the guitar. [kh&ocirc;ng đ&uacute;ng]</p>\n" +
                "<p>I can play the guitar well. [đ&uacute;ng]</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><strong>2. Trạng từ chỉ thời gian (Time)</strong></strong></span></h3>\n" +
                "<p>Diễn tả thời gian h&agrave;nh động được thực hiện, d&ugrave;ng để trả lời với c&acirc;u hỏi WHEN? (Khi n&agrave;o?)</p>\n" +
                "<p>C&aacute;c trạng từ chỉ thời gian thường được đặt ở&nbsp;<strong>cuối c&acirc;u</strong>&nbsp;(vị tr&iacute; th&ocirc;ng thường) hoặc&nbsp;<strong>đầu c&acirc;u&nbsp;</strong>(vị tr&iacute; nhấn mạnh)</p>\n" +
                "<p>V&iacute; dụ: I want to do the exercise now! She came yesterday. Last Monday, we took the final exams.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. Trạng từ chỉ tần suất (Frequency)</strong></span></h3>\n" +
                "<p>Diễn tả mức độ thường xuy&ecirc;n của một h&agrave;nh động, d&ugrave;ng để trả lời c&acirc;u hỏi HOW OFTEN? v&agrave; được đặt&nbsp;<strong>sau động từ \"to be\" hoặc trước động&nbsp; từ ch&iacute;nh.</strong></p>\n" +
                "<p>V&iacute; dụ: John is always on time He seldom works hard.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><strong>4. Trạng từ chỉ nơi chốn (Place)</strong></strong></span></h3>\n" +
                "<p>Diễn tả h&agrave;nh động diễn tả nơi n&agrave;o , ở đ&acirc;u hoặc gần xa thế n&agrave;o, d&ugrave;ng để trả lời cho c&acirc;u hỏi WHERE?</p>\n" +
                "<p>Một số trạng từ nơi chốn th&ocirc;ng dụng l&agrave; here, there ,out, away, everywhere, somewhere... above (b&ecirc;n tr&ecirc;n), below (b&ecirc;n dưới), along (dọc theo), around (xung quanh), away (đi xa, khỏi, mất), back (đi lại), somewhere (đ&acirc;u đ&oacute;), through (xuy&ecirc;n qua).</p>\n" +
                "<p>V&iacute; dụ: I am standing here. She went out.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><strong>5. Trạng từ chỉ mức độ (Grade)</strong></strong></span></h3>\n" +
                "<p>Diễn tả mức độ, cho biết h&agrave;nh động diễn ra đến mức độ n&agrave;o, thường c&aacute;c trạng từ n&agrave;y được đứng trước c&aacute;c t&iacute;nh từ hay một trạng từ kh&aacute;c hơn l&agrave; d&ugrave;ng với động từ:</p>\n" +
                "<p>V&iacute; dụ: This food is very bad. She speaks English too quickly for me to follow. She can dance very beautifully.</p>\n" +
                "<p>Một số trạng từ mức độ thường gặp: too (qu&aacute;), absolutely (tuyệt đối), completely (ho&agrave;n to&agrave;n), entirely (hết thảy), greatly (rất l&agrave;), exactly (quả thật), extremely (v&ocirc; c&ugrave;ng), perfectly (ho&agrave;n to&agrave;n), slightly (hơi), quite (ho&agrave;n to&agrave;n), rather (c&oacute; phần).</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><strong>6. Trạng từ chỉ số lượng (Quantity)</strong></strong></span></h3>\n" +
                "<p>Diễn tả số lượng (&iacute;t hoặc nhiều, một, hai ... lần...)</p>\n" +
                "<p>V&iacute; dụ: My children study rather little The champion has won the prize twice.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><strong>7. Trạng từ nghi vấn (Questions)</strong></strong></span></h3>\n" +
                "<p>l&agrave; những trạng từ đứng đầu c&acirc;u d&ugrave;ng để hỏi, gồm: When, where, why, how</p>\n" +
                "<p>C&aacute;c trạng từ khẳng định, phủ định, phỏng đo&aacute;n: certainly (chắc chắn), perhaps (c&oacute; lẽ), maybe (c&oacute; lẽ), surely (chắc chắn), of course (dĩ nhi&ecirc;n), willingly (sẵn l&ograve;ng), very well (được rồi).</p>\n" +
                "<p>V&iacute; dụ: When are you going to take it? Why didn't you go to school yesterday?</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong><strong>8. Trạng từ li&ecirc;n hệ (Relation)</strong></strong></span></h3>\n" +
                "<p>l&agrave; những trạng từ d&ugrave;ng để nối hai mệnh đề với nhau.</p>\n" +
                "<p>Ch&uacute;ng c&oacute; thể diễn tả địa điểm (where), thời gian (when) hoặc l&iacute; do (why):</p>\n" +
                "<p>V&iacute; dụ: I remember the day when I met her on the beach. This is the room where I was born.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
