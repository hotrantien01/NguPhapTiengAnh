package com.trantien.nguphaptienganh.Lesson.GioiTu;

import android.webkit.WebView;

public class CacLoaiGioiTu {
    WebView wv;

    public CacLoaiGioiTu(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<h3><span style=\"color: #ff6600;\"><strong>1. Giới từ chỉ thời gian</strong></span></h3>\n" +
                "<table border=\"1\">\n" +
                "<thead>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\" width=\"64\">\n" +
                "<p style=\"text-align: center;\">Giới từ</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\" width=\"296\">\n" +
                "<p style=\"text-align: center;\">C&aacute;ch sử dụng</p>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\" width=\"297\">\n" +
                "<p style=\"text-align: center;\">V&iacute; dụ</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</thead>\n" +
                "<tbody>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>on</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>ng&agrave;y trong tuần</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>on Thursday</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 107px;\">\n" +
                "<td style=\"height: 107px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>in</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 107px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>th&aacute;ng / m&ugrave;a</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>thời gian trong ng&agrave;y</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>năm</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>sau một khoảng thời gian nhất định</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 107px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>in August / in winter</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>in the morning</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>in 2006</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>in an hour</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 83px;\">\n" +
                "<td style=\"height: 83px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>at</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 83px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>cho&nbsp;<em>night</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>cho&nbsp;<em>weekend</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>một mốc thời gian nhất định</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 83px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>at night</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>at the weekend</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>at half past nine</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 48px;\">\n" +
                "<td style=\"height: 48px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>since</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 48px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>từ khoảng thời gian nhất định trong qu&aacute; khứ đến hiện tại</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 48px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>since 1980</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 48px;\">\n" +
                "<td style=\"height: 48px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>for</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 48px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>một khoảng thời gian nhất định t&iacute;nh từ qu&aacute; khứ đến hiện tại</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 48px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>for 2 years</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35.7188px;\">\n" +
                "<td style=\"height: 35.7188px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>ago</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35.7188px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>khoảng thời gian trong qu&aacute; khứ</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35.7188px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>2 years ago</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>before</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>trước khoảng thời gian</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>before 2004</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>to</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>n&oacute;i về thời gian</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>ten to six (5:50)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>past</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>n&oacute;i về thời gian</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>ten past six (6:10)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 48px;\">\n" +
                "<td style=\"height: 48px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>to&nbsp;/ till&nbsp;/ until</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 48px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>đ&aacute;nh dấu bắt đầu v&agrave; kết th&uacute;c của khoảng thời gian</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 48px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>from Monday to/till Friday</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 35px;\">\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>till&nbsp;/ until</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>cho đến khi</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 35px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>He is on holiday until Friday.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr style=\"height: 59px;\">\n" +
                "<td style=\"height: 59px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>by</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 59px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>in the sense of&nbsp;<em>at the latest</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>up to a certain time</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"height: 59px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>I will be back by 6 o&rsquo;clock.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>By 11 o&rsquo;clock, I had read five pages.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>2. Giới từ chỉ vị tr&iacute;</strong></span></h3>\n" +
                "<table border=\"1\" cellpadding=\"1\">\n" +
                "<thead>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<p style=\"text-align: center;\">Giới từ</p>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<p style=\"text-align: center;\">C&aacute;ch d&ugrave;ng</p>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<p style=\"text-align: center;\">V&iacute; dụ</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</thead>\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>in</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>room, building, street, town, country</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>book, paper etc.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>car, taxi</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>picture, world</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>in the kitchen, in London</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>in the book</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>in the car, in a taxi</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>in the picture, in the world</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>at</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>meaning&nbsp;<em>next to, by an object</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>for&nbsp;<em>table</em></p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>for events</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>vị tr&iacute; m&agrave; bạn l&agrave;m g&igrave; đ&oacute; (watch a film, study, work)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>at the door, at the station</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>at the table</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>at a concert, at the party</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>at the cinema, at school, at work</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>on</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>attached</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>for a place with a river</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>being on a surface</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>for a certain side (left, right)</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>for a floor in a house</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>for public transport</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>for&nbsp;<em>television, radio</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>the picture on the wall</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>London lies on the Thames.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>on the table</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>on the left</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>on the first floor</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>on the bus, on a plane</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>on TV, on the radio</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>by, next to, beside</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>b&ecirc;n phải của ai đ&oacute; hoặc c&aacute;i g&igrave; đ&oacute;</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>Jane is standing by&nbsp;/ next to&nbsp;/ beside the car.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>under</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>tr&ecirc;n bề mặt thấp hơn (hoặc bị bao phủ bởi) c&aacute;i kh&aacute;c</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>the bag is under the table</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>below</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>thấp hơn c&aacute;i kh&aacute;c nhưng cao hơn mặt đất</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>the fish are below the surface</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>over</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>bị bao phủ bởi c&aacute;i kh&aacute;c</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>nhiều hơn</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>vượt qua một c&aacute;i g&igrave; đ&oacute;</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>put a jacket over your shirt</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>over 16 years of age</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>walk over the bridge</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>climb over the wall</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>above</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>vị tr&iacute; cao hơn một c&aacute;i g&igrave; đ&oacute;</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>a path above the lake</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>across</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>vượt qua</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>băng qua về ph&iacute;a b&ecirc;n kia</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>walk across the bridge</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>swim across the lake</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>through</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>something with limits on top, bottom and the sides</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>drive through the tunnel</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>to</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>movement to person or building</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>movement to a place or country</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>for&nbsp;<em>bed</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>go to the cinema</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>go to London&nbsp;/ Ireland</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>go to bed</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>into</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>enter a room&nbsp;/ a building</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>go into the kitchen&nbsp;/ the house</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>towards</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>movement in the direction of something (but not directly to it)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>go 5 steps towards the house</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>onto</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>movement to the top of something</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>jump onto the table</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"width: 94px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>from</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 354px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>in the sense of&nbsp;<em>where from</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td style=\"width: 350px;\">\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>a flower from the garden</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<h3><span style=\"color: #ff6600;\"><strong>3. Một số giới từ quan trọng kh&aacute;c:</strong></span></h3>\n" +
                "<table border=\"1\" cellpadding=\"1\">\n" +
                "<thead>\n" +
                "<tr>\n" +
                "<td width=\"59\">\n" +
                "<p style=\"text-align: center;\">Giới từ</p>\n" +
                "</td>\n" +
                "<td width=\"299\">\n" +
                "<p style=\"text-align: center;\">C&aacute;ch sử dụng</p>\n" +
                "</td>\n" +
                "<td width=\"299\">\n" +
                "<p style=\"text-align: center;\">V&iacute; dụ</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</thead>\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>from</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>who gave it</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>a present from Jane</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>of</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>who/what does it belong to</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>what does it show</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>a page of the book</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>the picture of a palace</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>by</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>who made it</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>a book by Mark Twain</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>on</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>walking or riding on horseback</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>entering a public transport vehicle</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>on foot, on horseback</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>get on the bus</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>in</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>entering a car &nbsp;/ Taxi</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>get in the car</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>off</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>leaving a public transport vehicle</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>get off the train</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>out of</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>leaving a car &nbsp;/ Taxi</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>get out of the taxi</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>by</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>rise or fall of something</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>travelling (other than walking or horseriding)</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>prices have risen by 10 percent</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p>by car, by bus</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>at</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>for&nbsp;<em>age</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>she learned Russian at 45</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>about</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>for topics, meaning&nbsp;<em>what about</em></p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "<td>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<p>we were talking about you</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
