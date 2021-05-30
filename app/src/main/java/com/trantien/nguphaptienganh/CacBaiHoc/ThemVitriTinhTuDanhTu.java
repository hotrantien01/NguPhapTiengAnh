package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemVitriTinhTuDanhTu {
    WebView wv;

    public ThemVitriTinhTuDanhTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Động từ (Verb):</strong></span></h3>\n" +
                "<div><strong>* Vị tr&iacute; :</strong></div>\n" +
                "<p>- Thường đứng sau Chủ ngữ: He plays volleyball everyday.</p>\n" +
                "<p>- C&oacute; thể đứng sau trạng từ chỉ mức độ thường xuy&ecirc;n: I usually get up early.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. T&iacute;nh từ (adjective):</strong></span></h3>\n" +
                "<div><strong>* Vị tr&iacute; :</strong></div>\n" +
                "<p>Trước danh từ: beautiful girl, lovely house&hellip;</p>\n" +
                "<p><strong>* Sau TOBE:</strong></p>\n" +
                "<p>I am fat, She is intelligent, You are friendly&hellip;</p>\n" +
                "<p><strong>* Sau động từ chỉ cảm x&uacute;c:</strong> feel, look, become, get, turn, seem, sound, hear&hellip;</p>\n" +
                "<p>She feels tired</p>\n" +
                "<p><strong>* Sau c&aacute;c từ:&nbsp;</strong>something, someone, anything, anyone&hellip;&hellip;..</p>\n" +
                "<p>Is there anything new?/ I&rsquo;ll tell you something interesting.</p>\n" +
                "<p><strong>* Sau keep/make+ (o)+ adj&hellip;:&nbsp;</strong></p>\n" +
                "<p>Let&rsquo;s keep our school clean.</p>\n" +
                "<p><strong>* Dấu hiệu nhận biết:</strong> Thường c&oacute; hậu tố (đu&ocirc;i) l&agrave;:</p>\n" +
                "<p><span style=\"color: #000080;\">al:</span> national, cutural&hellip;</p>\n" +
                "<p><span style=\"color: #000080;\">ful:</span> beautiful, careful, useful,peaceful&hellip;</p>\n" +
                "<p><span style=\"color: #000080;\">ive:</span> active, attractive ,impressive&hellip;&hellip;..</p>\n" +
                "<p><span style=\"color: #000080;\">able:</span> comfortable, miserable&hellip;</p>\n" +
                "<p><span style=\"color: #000080;\">ous:</span> dangerous, serious, homorous,continuous,famous&hellip;</p>\n" +
                "<p><span style=\"color: #000080;\">cult:</span> difficult&hellip;</p>\n" +
                "<p><span style=\"color: #000080;\">ish:</span> selfish, childish&hellip;</p>\n" +
                "<p><span style=\"color: #000080;\">ed:</span> bored, interested, excited&hellip;</p>\n" +
                "<p><span style=\"color: #000080;\">y:</span> danh từ+ Y th&agrave;nh t&iacute;nh từ : daily, monthly, friendly, healthy&hellip;</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. Danh từ (Noun):</strong></span></h3>\n" +
                "<div>Vị tr&iacute; :&nbsp;</div>\n" +
                "<p><strong>*Sau Tobe:</strong> I am a student.</p>\n" +
                "<p><strong>* Sau t&iacute;nh từ :</strong> nice school&hellip;</p>\n" +
                "<p>* <strong>đầu c&acirc;u l&agrave;m chủ ngữ.</strong></p>\n" +
                "<p>* <strong>Sau a/an, the, this, that, these, those&hellip;</strong></p>\n" +
                "<p>* <strong>Sau t&iacute;nh từ sở hữu : my, your, his, her, their&hellip;</strong></p>\n" +
                "<p>* <strong>Sau many, a lot of/ lots of , plenty of&hellip;</strong></p>\n" +
                "<p>T<strong>he +(adj) N &hellip;of + (adj) N&hellip;</strong></p>\n" +
                "<p>* <strong>Dấu hiệu nhận biết:</strong> Thường c&oacute; hậu tố l&agrave;:</p>\n" +
                "<p><span style=\"color: #000080;\">tion:</span> nation,education,instruction&hellip;&hellip;&hellip;.&nbsp;</p>\n" +
                "<p><span style=\"color: #000080;\">sion:</span> question, television ,impression,passion&hellip;&hellip;..</p>\n" +
                "<p><span style=\"color: #000080;\">ment:</span> pavement, movement, environmemt&hellip;.</p>\n" +
                "<p><span style=\"color: #000080;\">ce:</span> differrence, independence,peace&hellip;&hellip;&hellip;..</p>\n" +
                "<p><span style=\"color: #000080;\">ness:</span> kindness, friendliness&hellip;&hellip;</p>\n" +
                "<p><span style=\"color: #000080;\">y:</span> beauty, democracy(nền d&acirc;n chủ), army&hellip;</p>\n" +
                "<p><span style=\"color: #000080;\">er/or:</span> động từ+ er/or th&agrave;nh danh từ chỉ người: worker, driver, swimmer, runner, player, visitor,&hellip;</p>\n" +
                "<p>* <strong>Ch&uacute; &yacute;</strong>: một số T&iacute;nh từ c&oacute; chung Danh từ:</p>\n" +
                "<p>Adj, Adv</p>\n" +
                "<p>Heavy, light weight</p>\n" +
                "<p>Wide, narrow width</p>\n" +
                "<p>Deep, shallow depth</p>\n" +
                "<p>Long, short length</p>\n" +
                "<p>Old, age</p>\n" +
                "<p>Tall, high height</p>\n" +
                "<p>Big, mall size</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. Trạng từ(Adverb):</strong></span></h3>\n" +
                "<p><strong>Trạng từ chỉ thể c&aacute;ch (adverbs of manner): adj+&rsquo;ly&rsquo; adv</strong></p>\n" +
                "<p>*<strong>Vị tr&iacute;</strong> :&nbsp;</p>\n" +
                "<p><strong>Đứng sau động từ thường:</strong> She runs quickly. (S-V-A)</p>\n" +
                "<p><strong>Sau t&acirc;n ngữ:</strong> He speaks English fluently. (S-V-O-A)</p>\n" +
                "<p>* Đ&ocirc;i khi ta thấy trạng từ đứng đầu c&acirc;u hoặc trước động từ nhằm nhấn mạnh &yacute; c&acirc;u hoặc chủ ngữ.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
