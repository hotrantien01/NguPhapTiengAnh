package com.trantien.nguphaptienganh.Lesson.DanhTu;

import android.webkit.WebView;

public class DanhTuDemDuocVaKhongDemDuoc {
    WebView wv;

    public DanhTuDemDuocVaKhongDemDuoc(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\">1. Danh từ đếm được&nbsp;<strong>(Count noun)</strong></span></h3>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>L&agrave; danh từ c&oacute; thể d&ugrave;ng được với số đếm, do đ&oacute; n&oacute; c&oacute; 2 h&igrave;nh th&aacute;i số &iacute;t v&agrave; số nhiều.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>N&oacute; d&ugrave;ng được với a hay với the.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p>+ VD: one book, two books, &hellip;</p>\n" +
                "<p>- Một số danh từ đếm được c&oacute; h&igrave;nh th&aacute;i số nhiều đặc biệt.</p>\n" +
                "<p>+ VD: person &ndash; people; child &ndash; children; tooth &ndash;teeth; foot &ndash; feet; mouse &ndash; mice &hellip;</p>\n" +
                "<p>- Một số danh từ đếm được c&oacute; dạng số &iacute;t/ số nhiều như nhau chỉ ph&acirc;n biệt bằng c&oacute; &ldquo;a&rdquo; v&agrave; kh&ocirc;ng c&oacute; &ldquo;a&rdquo;:</p>\n" +
                "<p>+ VD: an aircraft/ aircraft; a sheep/ sheep; a fish/ fish.</p>\n" +
                "<p>- Danh từ &ldquo;time&rdquo; nếu d&ugrave;ng với nghĩa l&agrave; &ldquo;thời đại&rdquo; hay &ldquo;số lần&rdquo; l&agrave; danh từ đếm được.</p>\n" +
                "<p>VD : I have seen that movie three times before. (số lần, đếm được)</p>\n" +
                "<h3>C&aacute;ch sử dụng danh từ đếm được v&agrave; danh từ kh&ocirc;ng đếm được.</h3>\n" +
                "<p>Khi n&oacute;i về c&aacute;ch sử dụng danh từ kh&ocirc;ng đếm được v&agrave; danh từ đếm được, ch&uacute;ng ta ch&uacute; &yacute; tới c&aacute;c mạo từ v&agrave; t&iacute;nh&nbsp;từ đi k&egrave;m. &nbsp;</p>\n" +
                "<p>Một số mạo từ v&agrave; t&iacute;nh từ c&oacute; thể đi c&ugrave;ng thể d&ugrave;ng với cả 2 loại danh từ tr&ecirc;n nhưng một số kh&aacute;c chỉ c&oacute; thể đi k&egrave;m với danh từ đếm được hoặc danh từ kh&ocirc;ng đếm được.</p>\n" +
                "<table border=\"1\" cellspacing=\"0\" cellpadding=\"1\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<th colspan=\"2\">CHỈ D&Ugrave;NG VỚI DANH TỪ ĐẾM ĐƯỢC</th>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>a</strong></td>\n" +
                "<td>a doctor, a pen, a meal, a class, a college</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>many</strong></td>\n" +
                "<td>many cups, many books, many libraries, many flights</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>few</strong></td>\n" +
                "<td>few questions, few tables, few apples, few holidays, few countries</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>a few</strong></td>\n" +
                "<td>a few questions, a few problems, a few issues, a few issues</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<h3><span style=\"color: #ff6600;\">2.&nbsp;<strong>Danh từ kh&ocirc;ng đếm được (Non-count noun)</strong></span></h3>\n" +
                "<p><strong>Chất liệu kh&ocirc;ng đếm được</strong>&nbsp;(chất kh&iacute;, chất lỏng, chất nh&atilde;o, chất bột&hellip;)</p>\n" +
                "<p>+ VD:</p>\n" +
                "<p>smoke, air: kh&oacute;i, kh&ocirc;ng kh&iacute;</p>\n" +
                "<p>water, tea, coffee: nước, tr&agrave;, c&agrave; ph&ecirc;</p>\n" +
                "<p>butter, cheese, meat, bread: bơ, ph&oacute; m&aacute;t, thịt, b&aacute;nh m&igrave;</p>\n" +
                "<p>(những thứ n&agrave;y kh&ocirc;ng phải chất rắn như sắt, gỗ, nhưng cũng kh&ocirc;ng phải chất lỏng, gọi l&agrave; chất nh&atilde;o, sệt sệt ấy m&agrave;, hợp l&yacute; phải kh&ocirc;ng?)</p>\n" +
                "<p>rice, sugar, salt: gạo/ l&uacute;a/ cơm, đường, muối (hạt qu&aacute; nhỏ kh&ocirc;ng thể đếm được)</p>\n" +
                "<p>Ch&uacute;ng ta kh&ocirc;ng đếm được những danh từ n&agrave;y, nhưng c&oacute; thể đếm đơn vị đo ch&uacute;ng, hoặc đếm đồ d&ugrave;ng đựng ch&uacute;ng, như c&agrave; ph&ecirc; kh&ocirc;ng đếm được nhưng đếm t&aacute;ch c&agrave; ph&ecirc; hay số kg c&agrave; ph&ecirc; th&igrave; được.</p>\n" +
                "<p>Kh&ocirc;ng d&ugrave;ng được với số đếm, do đ&oacute; n&oacute; kh&ocirc;ng c&oacute; h&igrave;nh th&aacute;i số &iacute;t, số nhiều. N&oacute; kh&ocirc;ng thể d&ugrave;ng được với a, c&ograve;n the chỉ trong một số trường hợp đặc biệt.</p>\n" +
                "<p>+ VD: milk (sữa). Bạn kh&ocirc;ng thể n&oacute;i &ldquo;one milk&rdquo;, &ldquo;two milks&rdquo; &hellip;</p>\n" +
                "<p>(Một số vật chất kh&ocirc;ng đếm được c&oacute; thể được chứa trong c&aacute;c b&igrave;nh đựng, bao b&igrave;&hellip; đếm được.)</p>\n" +
                "<p>+ VD: one glass of milk &ndash; một cốc sữa).</p>\n" +
                "<p>Một số c&aacute;c danh từ kh&ocirc;ng đếm được như food, meat, money, sand, water &hellip; đ&ocirc;i khi được d&ugrave;ng như c&aacute;c danh từ số nhiều để chỉ c&aacute;c dạng, loại kh&aacute;c nhau của vật liệu đ&oacute;.</p>\n" +
                "<p>+ VD :This is one of the foods that my doctor wants me to eat</p>\n" +
                "<p>Danh từ &ldquo;time&rdquo; nếu d&ugrave;ng với nghĩa l&agrave; &ldquo;thời gian&rdquo; l&agrave; kh&ocirc;ng đếm được</p>\n" +
                "<p>VD: You have spent too much time on that homework. (thời gian, kh&ocirc;ng đếm được )</p>\n" +
                "<p><strong>Danh từ trừu tượng:</strong></p>\n" +
                "<p>C&oacute; những thứ ch&uacute;ng ta chỉ c&oacute; thể cảm nhận được chứ kh&ocirc;ng thể d&ugrave;ng gi&aacute;c quan nhận thấy như cảm gi&aacute;c, t&igrave;nh cảm, t&iacute;nh t&igrave;nh l&agrave; những thứ kh&ocirc;ng thể nh&igrave;n thấy được, như l&agrave; sự hạnh ph&uacute;c, buồn rầu, sự can đảm, sự lười biếng</p>\n" +
                "<p>+ VD: Advice (lời khuy&ecirc;n), experience (kinh nghiệm), horror (khủng khiếp), beauty (đẹp), fear (sợ h&atilde;i), information (th&ocirc;ng tin), courage (l&ograve;ng can đảm), help (sự gi&uacute;p đỡ), knowledge (kiến thức), death (c&aacute;i chết), hope (niềm hy vọng), mercy (l&ograve;ng nh&acirc;n từ), pity (sự tội nghiệp), relief (sự gồ l&ecirc;n), suspicion (sự hồ nghi), work (c&ocirc;ng việc) &hellip;</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>Danh từ kh&ocirc;ng đếm được lu&ocirc;n ở số &iacute;t v&agrave; kh&ocirc;ng theo sau&nbsp;a/an:</strong></p>\n" +
                "<p>+ VD:</p>\n" +
                "<p>Those students don&rsquo;t want (any) help. They only want (some) knowledge.</p>\n" +
                "<p>(C&aacute;c sinh vi&ecirc;n ấy kh&ocirc;ng cần sự gi&uacute;p đỡ. Họ cần kiến thức m&agrave; th&ocirc;i)</p>\n" +
                "<p>I have no experience in this field.</p>\n" +
                "<p>(T&ocirc;i chẳng c&oacute; kinh nghiệm về lĩnh vực n&agrave;y).</p>\n" +
                "<h3>Danh từ kh&ocirc;ng đếm được</h3>\n" +
                "<p>Th&shy;ường theo sau&nbsp;<strong>some</strong>,&nbsp;<strong>any</strong>,&nbsp;<strong>no</strong>, a&nbsp;<strong>little</strong>&nbsp;.., hoặc theo sau&nbsp;<strong>bit</strong>,&nbsp;<strong>piece</strong>,&nbsp;<strong>slice</strong>,&nbsp;<strong>gallon</strong>&hellip;</p>\n" +
                "<p>VD:</p>\n" +
                "<p>A&nbsp;<em>bit&nbsp;</em>of news (một mẩu tin), a&nbsp;<em>grain&nbsp;</em>of sand (một hạt c&aacute;t), a&nbsp;<em>pot</em>&nbsp;of jam (một hủ mứt), a&nbsp;<em>slice&nbsp;</em>of bread (một l&aacute;t b&aacute;nh m&igrave;), a&nbsp;<em>bowl</em>&nbsp;of soup (một b&aacute;t s&uacute;p), a&nbsp;<em>cake&nbsp;</em>of soap (một b&aacute;nh x&agrave; b&ocirc;ng), a&nbsp;<em>gallon</em>&nbsp;of petrol (một galon xăng), a&nbsp;<em>pane</em>&nbsp;of glass (một &ocirc; k&iacute;nh), a&nbsp;<em>sheet&nbsp;</em>of paper (một tờ giấy), a&nbsp;<em>glass&nbsp;</em>of beer (một ly bia), a&nbsp;<em>drop</em>&nbsp;of oil (một giọt dầu), a&nbsp;<em>group</em>&nbsp;of people (một nh&oacute;m người), a&nbsp;<em>piece</em>&nbsp;of advice (một lời khuy&ecirc;n)&hellip;</p>\n" +
                "<table border=\"1\" cellspacing=\"0\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<th colspan=\"2\">CHỈ D&Ugrave;NG VỚI DANH TỪ KH&Ocirc;NG ĐẾM ĐƯỢC</th>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>much</strong></td>\n" +
                "<td>much money, much time, much food, much water, much energy</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>little</strong></td>\n" +
                "<td>little trouble, little equipment, little meat, little patience</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>a little bit of</strong></td>\n" +
                "<td>a little bit of confidence, a little bit of sleep, a little bit of snow</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>&nbsp;</p>\n" +
                "<table border=\"1\" cellpadding=\"1\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<th colspan=\"3\">D&Ugrave;NG VỚI CẢ DANH TỪ ĐẾM ĐƯỢC V&Agrave; DANH TỪ KH&Ocirc;NG ĐẾM ĐƯỢC</th>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"2\"><strong>the</strong></td>\n" +
                "<td><em>countable</em></td>\n" +
                "<td>the monkeys, the schools, the teachers, the boats, the bananas</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><em>uncountable</em></td>\n" +
                "<td>the cheese, the machinery, the luggage, the grass, the knowledge</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"2\"><strong>some</strong></td>\n" +
                "<td><em>countable</em></td>\n" +
                "<td>some tables, some stores, some grapes, some cities, some nurses</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><em>uncountable</em></td>\n" +
                "<td>some time, some news, some bread, some salt, some mail</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"2\"><strong>any</strong></td>\n" +
                "<td><em>countable</em></td>\n" +
                "<td>any forks, any socks, any bathrooms, any waiters, any beliefs</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><em>uncountable</em></td>\n" +
                "<td>any advice, any soap, any transportation, any gold, any homework</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"2\"><strong>no</strong></td>\n" +
                "<td><em>countable</em></td>\n" +
                "<td>no magazines, no chocolates, no pilots, no rings, no markers</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><em>uncountable</em></td>\n" +
                "<td>no trouble, no grass, no scenery, no money, no furniture</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"2\"><strong>a lot of</strong></td>\n" +
                "<td><em>countable</em></td>\n" +
                "<td>a lot of animals, a lot of coins, a lot of immigrants, a lot of babies</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><em>uncountable</em></td>\n" +
                "<td>a lot of help, a lot of aggravation, a lot of happiness, a lot of fun</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"2\"><strong>lots of</strong></td>\n" +
                "<td><em>countable</em></td>\n" +
                "<td>lots of computers, lots of buses, lots of parties, lots of colleges</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><em>uncountable</em></td>\n" +
                "<td>lots of cake, lots of ice cream, lots of energy, lots of laughter</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"2\"><strong>enough</strong></td>\n" +
                "<td><em>countable</em></td>\n" +
                "<td>enough plates, enough onions, enough restaurants, enough worries</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><em>uncountable</em></td>\n" +
                "<td>enough courage, enough wisdom, enough spaghetti, enough time</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"2\"><strong>plenty of</strong></td>\n" +
                "<td><em>countable</em></td>\n" +
                "<td>plenty of houses, plenty of concerts, plenty of guitars, plenty of</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><em>uncountable</em></td>\n" +
                "<td>plenty of oil, plenty of sugar, plenty of cheese, plenty of space</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
