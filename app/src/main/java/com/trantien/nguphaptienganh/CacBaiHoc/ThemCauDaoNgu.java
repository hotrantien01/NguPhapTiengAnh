package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemCauDaoNgu {
    WebView wv;
    public ThemCauDaoNgu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Đảo ngữ với No v&agrave; Not</strong></span></h3>\n" +
                "<p><strong>+ Cấu tr&uacute;c:</strong></p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>No + N + Auxiliary + S + Verb (inf)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Not any +&nbsp; N + Auxiliary +&nbsp; S + Verb (inf)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>No money shall I lend you from now on.</p>\n" +
                "<p>(= Not any money shall I lend you from now on.)</p>\n" +
                "<p><span style=\"color: #ff6600;\"><strong>2. Đảo ngữ với c&aacute;c cụm từ c&oacute; No</strong></span></p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>At no time</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>On no condition</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>On no account + Auxiliary + S + N</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Under/ in no circumstances</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>For no reason</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>In no way</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>No longer</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>For no reason shall you play truant.</p>\n" +
                "<p>The money is not to be paid under any circumstances.</p>\n" +
                "<p>(= Under no circumsstances is the money tobe paid.)</p>\n" +
                "<p>On no condition shall we accept their proposal.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. Đảo ngữ với c&aacute;c trạng từ phủ định: Never, Rarely, Seldom, Little, Hardly ever,&hellip;..</strong></span></h3>\n" +
                "<p><strong>+ Cấu tr&uacute;c:</strong></p>\n" +
                "<ul>\n" +
                "<li>Never/ Rarely/ Seldom /Little/ Hardly ever + Auxiliary + S + V</li>\n" +
                "</ul>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>Never in Mid-summer does it snow.</p>\n" +
                "<p>Hardly ever does he speak in the public.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>4. Đảo ngữ No sooner&hellip;&hellip;&hellip;. than&hellip;..</strong></span></h3>\n" +
                "<p><strong>+ Cấu tr&uacute;c:</strong></p>\n" +
                "<ul>\n" +
                "<li>Hardly/ Bearly/ Scarely&hellip;&hellip;.. When/ before</li>\n" +
                "</ul>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>No sooner had I arrived home than the telephone rang.</p>\n" +
                "<p>Hardly had she put up her umbrella before the rain became down in torrents.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>5. Đảo ngữ với c&acirc;u điều kiện</strong></span></h3>\n" +
                "<p>Trong đảo ngữ với c&acirc;u điều kiện ch&uacute;ng ta c&oacute; 3 dạng:</p>\n" +
                "<p><strong>- C&acirc;u điều kiện loại 1:</strong> If-clause = Should +S + V&hellip;</p>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>Should she come late, she will miss the train.</p>\n" +
                "<p>Should he lend me some money, I will buy that house.</p>\n" +
                "<p><strong>- C&acirc;u điều kiện loại 2:</strong> If-clause = Were&nbsp; S + to-V/ Were + S&hellip;</p>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>If I were you, I would work harder = Were I you, I&hellip;&hellip;..</p>\n" +
                "<p>If I knew her, I would invite her to the party = Were I to know her, I&hellip;&hellip;..</p>\n" +
                "<p><strong>- C&acirc;u điều kiện loại 3:</strong> If-clause = Had + S + V&shy;&shy;3</p>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>If my parents had encouraged me, I would have passed exam</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>6. Đảo ngữ với No where + Aux (Trợ động từ) + S + V</strong></span></h3>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>No where can you buy the goods as good as those in my country.</p>\n" +
                "<p>No where in the Vietnam is the scenery as beautiful as that in my country.</p>\n" +
                "<p>No where do I feel as comfortable as I do at home.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>7. Đảo ngữ với until/ till + clause/ Adv of time + Auxiliary + S + V</strong></span></h3>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>I didn&rsquo;t know that I had lost my key till I got home.</p>\n" +
                "<p>(= Not until/ till I got home did I know that I had lost my key.)</p>\n" +
                "<p>I won&rsquo;t come home till 10 o&rsquo;clock.</p>\n" +
                "<p>(=Not until/ till o&rsquo;clock that I will come home.)</p>\n" +
                "<p>(= It is not until 10 o&rsquo;clock that I will come home.)</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>8. Đảo ngữ với SO</strong></span></h3>\n" +
                "<p><strong>+ Cấu tr&uacute;c:</strong></p>\n" +
                "<p>So + Adj/ Adv + Auxiliary + S + V + that-clause (mệnh đề danh từ)</p>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>So difficult was the exam that few student pass it.</p>\n" +
                "<p>So attractive is she that many boys run after her.</p>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>9. Đảo ngữ với ONLY</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Only once</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only later</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only in this way</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only in that way</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only then + Auxiliary + S + V</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only after + N</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only by V_ing/ N</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only when + clause</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only with + N</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only if+ clause</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>Only in adv of time/ place</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p><strong>+ V&iacute; dụ:</strong></p>\n" +
                "<p>Only once did I meet her.</p>\n" +
                "<p>Only after all guests had gone home could we relax.</p>\n" +
                "<p>Only when I understand her did I like her.</p>\n" +
                "<p>Only by practising English every day can you speak it fluently.</p>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
