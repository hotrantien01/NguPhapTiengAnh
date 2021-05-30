package com.trantien.nguphaptienganh.CacBaiHoc;

import android.webkit.WebView;

public class ThemDongTuBatQuyTac {
    WebView wv;

    public ThemDongTuBatQuyTac(WebView wv) {
        this.wv = wv;
        load();
    }
    private void load() {
        String html = "<table class=\"cms_table\" border=\"1\" cellpadding=\"1\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>&nbsp;</td>\n" +
                "<td><strong>Động từ nguy&ecirc;n mẫu</strong></td>\n" +
                "<td><strong>Qu&aacute; khứ đơn</strong></td>\n" +
                "<td><strong>Qu&aacute; khứ ph&acirc;n từ</strong></td>\n" +
                "<td><strong>Nghĩa của động từ</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>1</td>\n" +
                "<td>abide</td>\n" +
                "<td>abode/abided</td>\n" +
                "<td>abode / abided</td>\n" +
                "<td>lưu tr&uacute;, lưu lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>2</td>\n" +
                "<td>arise</td>\n" +
                "<td>arose</td>\n" +
                "<td>arisen</td>\n" +
                "<td>ph&aacute;t sinh</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>3</td>\n" +
                "<td>awake</td>\n" +
                "<td>awoke</td>\n" +
                "<td>awoken</td>\n" +
                "<td>đ&aacute;nh thức, thức</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>4</td>\n" +
                "<td>be</td>\n" +
                "<td>was/were</td>\n" +
                "<td>been</td>\n" +
                "<td>th&igrave;, l&agrave;, bị. ở</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>5</td>\n" +
                "<td>bear</td>\n" +
                "<td>bore</td>\n" +
                "<td>borne</td>\n" +
                "<td>mang, chịu dựng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>6</td>\n" +
                "<td>become</td>\n" +
                "<td>became</td>\n" +
                "<td>become</td>\n" +
                "<td>trở n&ecirc;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>7</td>\n" +
                "<td>befall</td>\n" +
                "<td>befell</td>\n" +
                "<td>befallen</td>\n" +
                "<td>xảy đến</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>8</td>\n" +
                "<td>begin</td>\n" +
                "<td>began</td>\n" +
                "<td>begun</td>\n" +
                "<td>bắt đầu</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>9</td>\n" +
                "<td>behold</td>\n" +
                "<td>beheld</td>\n" +
                "<td>beheld</td>\n" +
                "<td>ngắm nh&igrave;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>10</td>\n" +
                "<td>bend</td>\n" +
                "<td>bent</td>\n" +
                "<td>bent</td>\n" +
                "<td>bẻ cong</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>11</td>\n" +
                "<td>beset</td>\n" +
                "<td>beset</td>\n" +
                "<td>beset</td>\n" +
                "<td>bao quanh</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>12</td>\n" +
                "<td>bespeak</td>\n" +
                "<td>bespoke</td>\n" +
                "<td>bespoken</td>\n" +
                "<td>chứng tỏ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>13</td>\n" +
                "<td>bid</td>\n" +
                "<td>bid</td>\n" +
                "<td>bid</td>\n" +
                "<td>trả gi&aacute;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>14</td>\n" +
                "<td>bind</td>\n" +
                "<td>bound</td>\n" +
                "<td>bound</td>\n" +
                "<td>buộc, tr&oacute;i</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>15</td>\n" +
                "<td>bleed</td>\n" +
                "<td>bled</td>\n" +
                "<td>bled</td>\n" +
                "<td>chảy m&aacute;u</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>16</td>\n" +
                "<td>blow</td>\n" +
                "<td>blew</td>\n" +
                "<td>blown</td>\n" +
                "<td>thổi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>17</td>\n" +
                "<td>break</td>\n" +
                "<td>broke</td>\n" +
                "<td>broken</td>\n" +
                "<td>đập vỡ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>18</td>\n" +
                "<td>breed</td>\n" +
                "<td>bred</td>\n" +
                "<td>bred</td>\n" +
                "<td>nu&ocirc;i, dạy dỗ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>19</td>\n" +
                "<td>bring</td>\n" +
                "<td>brought</td>\n" +
                "<td>brought</td>\n" +
                "<td>mang đến</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>20</td>\n" +
                "<td>broadcast</td>\n" +
                "<td>broadcast</td>\n" +
                "<td>broadcast</td>\n" +
                "<td>ph&aacute;t thanh</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>21</td>\n" +
                "<td>build</td>\n" +
                "<td>built</td>\n" +
                "<td>built</td>\n" +
                "<td>x&acirc;y dựng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>22</td>\n" +
                "<td>burn</td>\n" +
                "<td>burnt/burned</td>\n" +
                "<td>burnt/burned</td>\n" +
                "<td>đốt, ch&aacute;y</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>23</td>\n" +
                "<td>buy</td>\n" +
                "<td>bought</td>\n" +
                "<td>bought</td>\n" +
                "<td>mua</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>24</td>\n" +
                "<td>cast</td>\n" +
                "<td>cast</td>\n" +
                "<td>cast</td>\n" +
                "<td>n&eacute;m, tung</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>25</td>\n" +
                "<td>catch</td>\n" +
                "<td>caught</td>\n" +
                "<td>caught</td>\n" +
                "<td>bắt, chụp</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>26</td>\n" +
                "<td>chide</td>\n" +
                "<td>chid/ chided</td>\n" +
                "<td>chid/ chidden/ chided</td>\n" +
                "<td>mắng chửi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>27</td>\n" +
                "<td>choose</td>\n" +
                "<td>chose</td>\n" +
                "<td>chosen</td>\n" +
                "<td>chọn, lựa</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>28</td>\n" +
                "<td>cleave</td>\n" +
                "<td>clove/ cleft/ cleaved</td>\n" +
                "<td>cloven/ cleft/ cleaved</td>\n" +
                "<td>chẻ, t&aacute;ch hai</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>29</td>\n" +
                "<td>cleave</td>\n" +
                "<td>clave</td>\n" +
                "<td>cleaved</td>\n" +
                "<td>d&iacute;nh chặt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>30</td>\n" +
                "<td>come</td>\n" +
                "<td>came</td>\n" +
                "<td>come</td>\n" +
                "<td>đến, đi đến</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>31</td>\n" +
                "<td>cost</td>\n" +
                "<td>cost</td>\n" +
                "<td>cost</td>\n" +
                "<td>c&oacute; gi&aacute; l&agrave;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>32</td>\n" +
                "<td>crow</td>\n" +
                "<td>crew/crewed</td>\n" +
                "<td>crowed</td>\n" +
                "<td>g&aacute;y (g&agrave;)</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>33</td>\n" +
                "<td>cut</td>\n" +
                "<td>cut</td>\n" +
                "<td>cut</td>\n" +
                "<td>cắt, chặt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>34</td>\n" +
                "<td>deal</td>\n" +
                "<td>dealt</td>\n" +
                "<td>dealt</td>\n" +
                "<td>giao thiệp</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>35</td>\n" +
                "<td>dig</td>\n" +
                "<td>dug</td>\n" +
                "<td>dug</td>\n" +
                "<td>d&agrave;o</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>36</td>\n" +
                "<td>dive</td>\n" +
                "<td>dove/ dived</td>\n" +
                "<td>dived</td>\n" +
                "<td>lặn; lao xuống</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>37</td>\n" +
                "<td>draw</td>\n" +
                "<td>drew</td>\n" +
                "<td>drawn</td>\n" +
                "<td>vẽ; k&eacute;o</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>38</td>\n" +
                "<td>dream</td>\n" +
                "<td>dreamt/ dreamed</td>\n" +
                "<td>dreamt/ dreamed</td>\n" +
                "<td>mơ thấy</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>39</td>\n" +
                "<td>drink</td>\n" +
                "<td>drank</td>\n" +
                "<td>drunk</td>\n" +
                "<td>uống</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>40</td>\n" +
                "<td>drive</td>\n" +
                "<td>drove</td>\n" +
                "<td>driven</td>\n" +
                "<td>l&aacute;i xe</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>41</td>\n" +
                "<td>dwell</td>\n" +
                "<td>dwelt</td>\n" +
                "<td>dwelt</td>\n" +
                "<td>tr&uacute; ngụ, ở</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>42</td>\n" +
                "<td>eat</td>\n" +
                "<td>ate</td>\n" +
                "<td>eaten</td>\n" +
                "<td>ăn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>43</td>\n" +
                "<td>fall</td>\n" +
                "<td>fell</td>\n" +
                "<td>fallen</td>\n" +
                "<td>ng&atilde;; rơi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>44</td>\n" +
                "<td>feed</td>\n" +
                "<td>fed</td>\n" +
                "<td>fed</td>\n" +
                "<td>cho ăn; ăn; nu&ocirc;i;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>45</td>\n" +
                "<td>feel</td>\n" +
                "<td>felt</td>\n" +
                "<td>felt</td>\n" +
                "<td>cảm thấy</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>46</td>\n" +
                "<td>fight</td>\n" +
                "<td>fought</td>\n" +
                "<td>fought</td>\n" +
                "<td>chiến đấu</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>47</td>\n" +
                "<td>find</td>\n" +
                "<td>found</td>\n" +
                "<td>found</td>\n" +
                "<td>t&igrave;m thấy; thấy</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>48</td>\n" +
                "<td>flee</td>\n" +
                "<td>fled</td>\n" +
                "<td>fled</td>\n" +
                "<td>chạy trốn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>49</td>\n" +
                "<td>fling</td>\n" +
                "<td>flung</td>\n" +
                "<td>flung</td>\n" +
                "<td>tung; quang</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>50</td>\n" +
                "<td>fly</td>\n" +
                "<td>flew</td>\n" +
                "<td>flown</td>\n" +
                "<td>bay</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>51</td>\n" +
                "<td>forbear</td>\n" +
                "<td>forbore</td>\n" +
                "<td>forborne</td>\n" +
                "<td>nhịn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>52</td>\n" +
                "<td>forbid</td>\n" +
                "<td>forbade/ forbad</td>\n" +
                "<td>forbidden</td>\n" +
                "<td>cấm đo&aacute;n; cấm</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>53</td>\n" +
                "<td>forecast</td>\n" +
                "<td>forecast/ forecasted</td>\n" +
                "<td>forecast/ forecasted</td>\n" +
                "<td>ti&ecirc;n đo&aacute;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>54</td>\n" +
                "<td>foresee</td>\n" +
                "<td>foresaw</td>\n" +
                "<td>forseen</td>\n" +
                "<td>thấy trước</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>55</td>\n" +
                "<td>foretell</td>\n" +
                "<td>foretold</td>\n" +
                "<td>foretold</td>\n" +
                "<td>đo&aacute;n trước</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>56</td>\n" +
                "<td>forget</td>\n" +
                "<td>forgot</td>\n" +
                "<td>forgotten</td>\n" +
                "<td>qu&ecirc;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>57</td>\n" +
                "<td>forgive</td>\n" +
                "<td>forgave</td>\n" +
                "<td>forgiven</td>\n" +
                "<td>tha thứ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>58</td>\n" +
                "<td>forsake</td>\n" +
                "<td>forsook</td>\n" +
                "<td>forsaken</td>\n" +
                "<td>ruồng bỏ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>59</td>\n" +
                "<td>freeze</td>\n" +
                "<td>froze</td>\n" +
                "<td>frozen</td>\n" +
                "<td>(l&agrave;m) đ&ocirc;ng lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>60</td>\n" +
                "<td>get</td>\n" +
                "<td>got</td>\n" +
                "<td>got/ gotten</td>\n" +
                "<td>c&oacute; được</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>61</td>\n" +
                "<td>gild</td>\n" +
                "<td>gilt/ gilded</td>\n" +
                "<td>gilt/ gilded</td>\n" +
                "<td>mạ v&agrave;ng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>62</td>\n" +
                "<td>gird</td>\n" +
                "<td>girt/ girded</td>\n" +
                "<td>girt/ girded</td>\n" +
                "<td>đeo v&agrave;o</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>63</td>\n" +
                "<td>give</td>\n" +
                "<td>gave</td>\n" +
                "<td>given</td>\n" +
                "<td>cho</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>64</td>\n" +
                "<td>go</td>\n" +
                "<td>went</td>\n" +
                "<td>gone</td>\n" +
                "<td>đi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>65</td>\n" +
                "<td>grind</td>\n" +
                "<td>ground</td>\n" +
                "<td>ground</td>\n" +
                "<td>nghiền; xay</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>66</td>\n" +
                "<td>grow</td>\n" +
                "<td>grew</td>\n" +
                "<td>grown</td>\n" +
                "<td>mọc; trồng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>67</td>\n" +
                "<td>hang</td>\n" +
                "<td>hung</td>\n" +
                "<td>hung</td>\n" +
                "<td>m&oacute;c l&ecirc;n; treo l&ecirc;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>68</td>\n" +
                "<td>hear</td>\n" +
                "<td>heard</td>\n" +
                "<td>heard</td>\n" +
                "<td>nghe</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>69</td>\n" +
                "<td>heave</td>\n" +
                "<td>hove/ heaved</td>\n" +
                "<td>hove/ heaved</td>\n" +
                "<td>trục l&ecirc;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>70</td>\n" +
                "<td>hide</td>\n" +
                "<td>hid</td>\n" +
                "<td>hidden</td>\n" +
                "<td>giấu; trốn; nấp</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>71</td>\n" +
                "<td>hit</td>\n" +
                "<td>hit</td>\n" +
                "<td>hit</td>\n" +
                "<td>đụng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>72</td>\n" +
                "<td>hurt</td>\n" +
                "<td>hurt</td>\n" +
                "<td>hurt</td>\n" +
                "<td>l&agrave;m đau</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>73</td>\n" +
                "<td>inlay</td>\n" +
                "<td>inlaid</td>\n" +
                "<td>inlaid</td>\n" +
                "<td>cẩn; khảm</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>74</td>\n" +
                "<td>input</td>\n" +
                "<td>input</td>\n" +
                "<td>input</td>\n" +
                "<td>đưa v&agrave;o (m&aacute;y điện to&aacute;n)</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>75</td>\n" +
                "<td>inset</td>\n" +
                "<td>inset</td>\n" +
                "<td>inset</td>\n" +
                "<td>d&aacute;t; gh&eacute;p</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>76</td>\n" +
                "<td>keep</td>\n" +
                "<td>kept</td>\n" +
                "<td>kept</td>\n" +
                "<td>giữ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>77</td>\n" +
                "<td>kneel</td>\n" +
                "<td>knelt/ kneeled</td>\n" +
                "<td>knelt/ kneeled</td>\n" +
                "<td>quỳ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>78</td>\n" +
                "<td>knit</td>\n" +
                "<td>knit/ knitted</td>\n" +
                "<td>knit/ knitted</td>\n" +
                "<td>đan</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>79</td>\n" +
                "<td>know</td>\n" +
                "<td>knew</td>\n" +
                "<td>known</td>\n" +
                "<td>biết; quen biết</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>80</td>\n" +
                "<td>lay</td>\n" +
                "<td>laid</td>\n" +
                "<td>laid</td>\n" +
                "<td>đặt; để</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>81</td>\n" +
                "<td>lead</td>\n" +
                "<td>led</td>\n" +
                "<td>led</td>\n" +
                "<td>dẫn dắt; l&atilde;nh đạo</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>82</td>\n" +
                "<td>leap</td>\n" +
                "<td>leapt</td>\n" +
                "<td>leapt</td>\n" +
                "<td>nhảy; nhảy qua</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>83</td>\n" +
                "<td>learn</td>\n" +
                "<td>learnt/ learned</td>\n" +
                "<td>learnt/ learned</td>\n" +
                "<td>học; được biết</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>84</td>\n" +
                "<td>leave</td>\n" +
                "<td>left</td>\n" +
                "<td>left</td>\n" +
                "<td>ra đi; để lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>85</td>\n" +
                "<td>lend</td>\n" +
                "<td>lent</td>\n" +
                "<td>lent</td>\n" +
                "<td>cho mượn (vay)</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>86</td>\n" +
                "<td>let</td>\n" +
                "<td>let</td>\n" +
                "<td>let</td>\n" +
                "<td>cho ph&eacute;p; để cho</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>87</td>\n" +
                "<td>lie</td>\n" +
                "<td>lay</td>\n" +
                "<td>lain</td>\n" +
                "<td>nằm</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>88</td>\n" +
                "<td>light</td>\n" +
                "<td>lit/ lighted</td>\n" +
                "<td>lit/ lighted</td>\n" +
                "<td>thắp s&aacute;ng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>89</td>\n" +
                "<td>lose</td>\n" +
                "<td>lost</td>\n" +
                "<td>lost</td>\n" +
                "<td>l&agrave;m mất; mất</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>90</td>\n" +
                "<td>make</td>\n" +
                "<td>made</td>\n" +
                "<td>made</td>\n" +
                "<td>chế tạo; sản xuất</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>91</td>\n" +
                "<td>mean</td>\n" +
                "<td>meant</td>\n" +
                "<td>meant</td>\n" +
                "<td>c&oacute; nghĩa l&agrave;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>92</td>\n" +
                "<td>meet</td>\n" +
                "<td>met</td>\n" +
                "<td>met</td>\n" +
                "<td>gặp mặt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>93</td>\n" +
                "<td>mislay</td>\n" +
                "<td>mislaid</td>\n" +
                "<td>mislaid</td>\n" +
                "<td>để lạc mất</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>94</td>\n" +
                "<td>misread</td>\n" +
                "<td>misread</td>\n" +
                "<td>misread</td>\n" +
                "<td>đọc sai</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>95</td>\n" +
                "<td>misspell</td>\n" +
                "<td>misspelt</td>\n" +
                "<td>misspelt</td>\n" +
                "<td>viết sai ch&iacute;nh tả</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>96</td>\n" +
                "<td>mistake</td>\n" +
                "<td>mistook</td>\n" +
                "<td>mistaken</td>\n" +
                "<td>phạm lỗi, lầm lẫn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>97</td>\n" +
                "<td>misunderstand</td>\n" +
                "<td>misunderstood</td>\n" +
                "<td>misunderstood</td>\n" +
                "<td>hiểu lầm</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>98</td>\n" +
                "<td>mow</td>\n" +
                "<td>mowed</td>\n" +
                "<td>mown/ mowed</td>\n" +
                "<td>cắt cỏ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>99</td>\n" +
                "<td>outbid</td>\n" +
                "<td>outbid</td>\n" +
                "<td>outbid</td>\n" +
                "<td>trả hơn gi&aacute;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>100</td>\n" +
                "<td>outdo</td>\n" +
                "<td>outdid</td>\n" +
                "<td>outdone</td>\n" +
                "<td>l&agrave;m giỏi hơn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>101</td>\n" +
                "<td>outgrow</td>\n" +
                "<td>outgrew</td>\n" +
                "<td>outgrown</td>\n" +
                "<td>lớn nhanh hơn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>102</td>\n" +
                "<td>output</td>\n" +
                "<td>output</td>\n" +
                "<td>output</td>\n" +
                "<td>cho ra (dữ kiện)</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>103</td>\n" +
                "<td>outrun</td>\n" +
                "<td>outran</td>\n" +
                "<td>outrun</td>\n" +
                "<td>chạy nhanh hơn; vượt qu&aacute;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>104</td>\n" +
                "<td>outsell</td>\n" +
                "<td>outsold</td>\n" +
                "<td>outsold</td>\n" +
                "<td>b&aacute;n nhanh hơn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>105</td>\n" +
                "<td>overcome</td>\n" +
                "<td>overcame</td>\n" +
                "<td>overcome</td>\n" +
                "<td>khắc phục</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>106</td>\n" +
                "<td>overeat</td>\n" +
                "<td>overate</td>\n" +
                "<td>overeaten</td>\n" +
                "<td>ăn qu&aacute; nhiều</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>107</td>\n" +
                "<td>overfly</td>\n" +
                "<td>overflew</td>\n" +
                "<td>overflown</td>\n" +
                "<td>bay qua</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>108</td>\n" +
                "<td>overhang</td>\n" +
                "<td>overhung</td>\n" +
                "<td>overhung</td>\n" +
                "<td>nh&ocirc; l&ecirc;n tr&ecirc;n, treo lơ lửng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>109</td>\n" +
                "<td>overhear</td>\n" +
                "<td>overheard</td>\n" +
                "<td>overheard</td>\n" +
                "<td>nghe trộm</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>110</td>\n" +
                "<td>overlay</td>\n" +
                "<td>overlaid</td>\n" +
                "<td>overlaid</td>\n" +
                "<td>phủ l&ecirc;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>111</td>\n" +
                "<td>overpay</td>\n" +
                "<td>overpaid</td>\n" +
                "<td>overpaid</td>\n" +
                "<td>trả qu&aacute; tiền</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>112</td>\n" +
                "<td>overrun</td>\n" +
                "<td>overran</td>\n" +
                "<td>overrun</td>\n" +
                "<td>tr&agrave;n ngập</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>113</td>\n" +
                "<td>oversee</td>\n" +
                "<td>oversaw</td>\n" +
                "<td>overseen</td>\n" +
                "<td>tr&ocirc;ng nom</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>114</td>\n" +
                "<td>overshoot</td>\n" +
                "<td>overshot</td>\n" +
                "<td>overshot</td>\n" +
                "<td>đi qu&aacute; đ&iacute;ch</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>115</td>\n" +
                "<td>oversleep</td>\n" +
                "<td>overslept</td>\n" +
                "<td>overslept</td>\n" +
                "<td>ngủ qu&ecirc;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>116</td>\n" +
                "<td>overtake</td>\n" +
                "<td>overtook</td>\n" +
                "<td>overtaken</td>\n" +
                "<td>đuổi bắt kịp</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>117</td>\n" +
                "<td>overthrow</td>\n" +
                "<td>overthrew</td>\n" +
                "<td>overthrown</td>\n" +
                "<td>lật đổ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>118</td>\n" +
                "<td>pay</td>\n" +
                "<td>paid</td>\n" +
                "<td>paid</td>\n" +
                "<td>trả (tiền)</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>119</td>\n" +
                "<td>prove</td>\n" +
                "<td>proved</td>\n" +
                "<td>proven/proved</td>\n" +
                "<td>chứng minh(tỏ)</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>120</td>\n" +
                "<td>put</td>\n" +
                "<td>put</td>\n" +
                "<td>put</td>\n" +
                "<td>đặt; để</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>121</td>\n" +
                "<td>read</td>\n" +
                "<td>read</td>\n" +
                "<td>read</td>\n" +
                "<td>đọc</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>122</td>\n" +
                "<td>rebuild</td>\n" +
                "<td>rebuilt</td>\n" +
                "<td>rebuilt</td>\n" +
                "<td>x&acirc;y dựng lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>123</td>\n" +
                "<td>redo</td>\n" +
                "<td>redid</td>\n" +
                "<td>redone</td>\n" +
                "<td>l&agrave;m lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>124</td>\n" +
                "<td>remake</td>\n" +
                "<td>remade</td>\n" +
                "<td>remade</td>\n" +
                "<td>l&agrave;m lại; chế tạo lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>125</td>\n" +
                "<td>rend</td>\n" +
                "<td>rent</td>\n" +
                "<td>rent</td>\n" +
                "<td>toạc ra; x&eacute;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>126</td>\n" +
                "<td>repay</td>\n" +
                "<td>repaid</td>\n" +
                "<td>repaid</td>\n" +
                "<td>ho&agrave;n tiền lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>127</td>\n" +
                "<td>resell</td>\n" +
                "<td>retold</td>\n" +
                "<td>retold</td>\n" +
                "<td>b&aacute;n lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>128</td>\n" +
                "<td>retake</td>\n" +
                "<td>retook</td>\n" +
                "<td>retaken</td>\n" +
                "<td>chiếm lại; t&aacute;i chiếm</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>129</td>\n" +
                "<td>rewrite</td>\n" +
                "<td>rewrote</td>\n" +
                "<td>rewritten</td>\n" +
                "<td>viết lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>130</td>\n" +
                "<td>rid</td>\n" +
                "<td>rid</td>\n" +
                "<td>rid</td>\n" +
                "<td>giải tho&aacute;t</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>131</td>\n" +
                "<td>ride</td>\n" +
                "<td>rode</td>\n" +
                "<td>ridden</td>\n" +
                "<td>cưỡi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>132</td>\n" +
                "<td>ring</td>\n" +
                "<td>rang</td>\n" +
                "<td>rung</td>\n" +
                "<td>rung chu&ocirc;ng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>133</td>\n" +
                "<td>rise</td>\n" +
                "<td>rose</td>\n" +
                "<td>risen</td>\n" +
                "<td>đứng dậy; mọc</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>134</td>\n" +
                "<td>run</td>\n" +
                "<td>ran</td>\n" +
                "<td>run</td>\n" +
                "<td>chạy</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>135</td>\n" +
                "<td>saw</td>\n" +
                "<td>sawed</td>\n" +
                "<td>sawn</td>\n" +
                "<td>cưa</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>136</td>\n" +
                "<td>say</td>\n" +
                "<td>said</td>\n" +
                "<td>said</td>\n" +
                "<td>n&oacute;i</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>137</td>\n" +
                "<td>see</td>\n" +
                "<td>saw</td>\n" +
                "<td>seen</td>\n" +
                "<td>nh&igrave;n thấy</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>138</td>\n" +
                "<td>seek</td>\n" +
                "<td>sought</td>\n" +
                "<td>sought</td>\n" +
                "<td>t&igrave;m kiếm</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>139</td>\n" +
                "<td>sell</td>\n" +
                "<td>sold</td>\n" +
                "<td>sold</td>\n" +
                "<td>b&aacute;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>140</td>\n" +
                "<td>send</td>\n" +
                "<td>sent</td>\n" +
                "<td>sent</td>\n" +
                "<td>gửi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>141</td>\n" +
                "<td>sew</td>\n" +
                "<td>sewed</td>\n" +
                "<td>sewn/sewed</td>\n" +
                "<td>may</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>142</td>\n" +
                "<td>shake</td>\n" +
                "<td>shook</td>\n" +
                "<td>shaken</td>\n" +
                "<td>lay; lắc</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>143</td>\n" +
                "<td>shear</td>\n" +
                "<td>sheared</td>\n" +
                "<td>shorn</td>\n" +
                "<td>x&eacute;n l&ocirc;ng cừu</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>144</td>\n" +
                "<td>shed</td>\n" +
                "<td>shed</td>\n" +
                "<td>shed</td>\n" +
                "<td>rơi; rụng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>145</td>\n" +
                "<td>shine</td>\n" +
                "<td>shone</td>\n" +
                "<td>shone</td>\n" +
                "<td>chiếu s&aacute;ng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>146</td>\n" +
                "<td>shoot</td>\n" +
                "<td>shot</td>\n" +
                "<td>shot</td>\n" +
                "<td>bắn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>147</td>\n" +
                "<td>show</td>\n" +
                "<td>showed</td>\n" +
                "<td>shown/ showed</td>\n" +
                "<td>cho xem</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>148</td>\n" +
                "<td>shrink</td>\n" +
                "<td>shrank</td>\n" +
                "<td>shrunk</td>\n" +
                "<td>co r&uacute;t</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>149</td>\n" +
                "<td>shut</td>\n" +
                "<td>shut</td>\n" +
                "<td>shut</td>\n" +
                "<td>đ&oacute;ng lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>150</td>\n" +
                "<td>sing</td>\n" +
                "<td>sang</td>\n" +
                "<td>sung</td>\n" +
                "<td>ca h&aacute;t</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>151</td>\n" +
                "<td>sink</td>\n" +
                "<td>sank</td>\n" +
                "<td>sunk</td>\n" +
                "<td>ch&igrave;m; lặn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>152</td>\n" +
                "<td>sit</td>\n" +
                "<td>sat</td>\n" +
                "<td>sat</td>\n" +
                "<td>ngồi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>153</td>\n" +
                "<td>slay</td>\n" +
                "<td>slew</td>\n" +
                "<td>slain</td>\n" +
                "<td>s&aacute;t hại; giết hại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>154</td>\n" +
                "<td>sleep</td>\n" +
                "<td>slept</td>\n" +
                "<td>slept</td>\n" +
                "<td>ngủ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>155</td>\n" +
                "<td>slide</td>\n" +
                "<td>slid</td>\n" +
                "<td>slid</td>\n" +
                "<td>trượt; lướt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>156</td>\n" +
                "<td>sling</td>\n" +
                "<td>slung</td>\n" +
                "<td>slung</td>\n" +
                "<td>n&eacute;m mạnh</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>157</td>\n" +
                "<td>slink</td>\n" +
                "<td>slunk</td>\n" +
                "<td>slunk</td>\n" +
                "<td>lẻn đi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>158</td>\n" +
                "<td>smell</td>\n" +
                "<td>smelt</td>\n" +
                "<td>smelt</td>\n" +
                "<td>ngửi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>159</td>\n" +
                "<td>smite</td>\n" +
                "<td>smote</td>\n" +
                "<td>smitten</td>\n" +
                "<td>đập mạnh</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>160</td>\n" +
                "<td>sow</td>\n" +
                "<td>sowed</td>\n" +
                "<td>sown/ sewed</td>\n" +
                "<td>gieo; rải</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>161</td>\n" +
                "<td>speak</td>\n" +
                "<td>spoke</td>\n" +
                "<td>spoken</td>\n" +
                "<td>n&oacute;i</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>162</td>\n" +
                "<td>speed</td>\n" +
                "<td>sped/ speeded</td>\n" +
                "<td>sped/ speeded</td>\n" +
                "<td>chạy vụt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>163</td>\n" +
                "<td>spell</td>\n" +
                "<td>spelt/ spelled</td>\n" +
                "<td>spelt/ spelled</td>\n" +
                "<td>đ&aacute;nh vần</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>164</td>\n" +
                "<td>spend</td>\n" +
                "<td>spent</td>\n" +
                "<td>spent</td>\n" +
                "<td>ti&ecirc;u s&agrave;i</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>165</td>\n" +
                "<td>spill</td>\n" +
                "<td>spilt/ spilled</td>\n" +
                "<td>spilt/ spilled</td>\n" +
                "<td>tr&agrave;n đổ ra</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>166</td>\n" +
                "<td>spin</td>\n" +
                "<td>spun/ span</td>\n" +
                "<td>spun</td>\n" +
                "<td>quay sợi</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>167</td>\n" +
                "<td>spit</td>\n" +
                "<td>spat</td>\n" +
                "<td>spat</td>\n" +
                "<td>khạc nhổ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>168</td>\n" +
                "<td>spoil</td>\n" +
                "<td>spoilt/ spoiled</td>\n" +
                "<td>spoilt/ spoiled</td>\n" +
                "<td>l&agrave;m hỏng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>169</td>\n" +
                "<td>spread</td>\n" +
                "<td>spread</td>\n" +
                "<td>spread</td>\n" +
                "<td>lan truyền</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>170</td>\n" +
                "<td>spring</td>\n" +
                "<td>sprang</td>\n" +
                "<td>sprung</td>\n" +
                "<td>nhảy</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>171</td>\n" +
                "<td>stand</td>\n" +
                "<td>stood</td>\n" +
                "<td>stood</td>\n" +
                "<td>đứng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>172</td>\n" +
                "<td>stave</td>\n" +
                "<td>stove/ staved</td>\n" +
                "<td>stove/ staved</td>\n" +
                "<td>đ&acirc;m thủng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>173</td>\n" +
                "<td>steal</td>\n" +
                "<td>stole</td>\n" +
                "<td>stolen</td>\n" +
                "<td>đ&aacute;nh cắp</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>174</td>\n" +
                "<td>stick</td>\n" +
                "<td>stuck</td>\n" +
                "<td>stuck</td>\n" +
                "<td>ghim v&agrave;o; đ&iacute;nh</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>175</td>\n" +
                "<td>sting</td>\n" +
                "<td>stung</td>\n" +
                "<td>stung</td>\n" +
                "<td>ch&acirc;m ; ch&iacute;ch; đốt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>176</td>\n" +
                "<td>stink</td>\n" +
                "<td>stunk/ stank</td>\n" +
                "<td>stunk</td>\n" +
                "<td>bốc mu&igrave;i h&ocirc;i</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>177</td>\n" +
                "<td>strew</td>\n" +
                "<td>strewed</td>\n" +
                "<td>strewn/ strewed</td>\n" +
                "<td>rắc , rải</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>178</td>\n" +
                "<td>stride</td>\n" +
                "<td>strode</td>\n" +
                "<td>stridden</td>\n" +
                "<td>bước sải</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>179</td>\n" +
                "<td>strike</td>\n" +
                "<td>struck</td>\n" +
                "<td>struck</td>\n" +
                "<td>đ&aacute;nh đập</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>180</td>\n" +
                "<td>string</td>\n" +
                "<td>strung</td>\n" +
                "<td>strung</td>\n" +
                "<td>gắn d&acirc;y v&agrave;o</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>181</td>\n" +
                "<td>strive</td>\n" +
                "<td>strove</td>\n" +
                "<td>striven</td>\n" +
                "<td>cố sức</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>182</td>\n" +
                "<td>swear</td>\n" +
                "<td>swore</td>\n" +
                "<td>sworn</td>\n" +
                "<td>tuy&ecirc;n thệ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>183</td>\n" +
                "<td>sweep</td>\n" +
                "<td>swept</td>\n" +
                "<td>swept</td>\n" +
                "<td>qu&eacute;t</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>184</td>\n" +
                "<td>swell</td>\n" +
                "<td>swelled</td>\n" +
                "<td>swollen/ swelled</td>\n" +
                "<td>phồng ; sưng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>185</td>\n" +
                "<td>swim</td>\n" +
                "<td>swam</td>\n" +
                "<td>swum</td>\n" +
                "<td>bơi; lội</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>186</td>\n" +
                "<td>swing</td>\n" +
                "<td>swung</td>\n" +
                "<td>swung</td>\n" +
                "<td>đong đưa</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>187</td>\n" +
                "<td>take</td>\n" +
                "<td>took</td>\n" +
                "<td>taken</td>\n" +
                "<td>cầm ; lấy</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>188</td>\n" +
                "<td>teach</td>\n" +
                "<td>taught</td>\n" +
                "<td>taught</td>\n" +
                "<td>dạy ; giảng dạy</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>189</td>\n" +
                "<td>tear</td>\n" +
                "<td>tore</td>\n" +
                "<td>torn</td>\n" +
                "<td>x&eacute;; r&aacute;ch</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>190</td>\n" +
                "<td>tell</td>\n" +
                "<td>told</td>\n" +
                "<td>told</td>\n" +
                "<td>kể ; bảo</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>191</td>\n" +
                "<td>think</td>\n" +
                "<td>thought</td>\n" +
                "<td>thought</td>\n" +
                "<td>suy nghĩ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>192</td>\n" +
                "<td>throw</td>\n" +
                "<td>threw</td>\n" +
                "<td>thrown</td>\n" +
                "<td>n&eacute;m ; liệng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>193</td>\n" +
                "<td>thrust</td>\n" +
                "<td>thrust</td>\n" +
                "<td>thrust</td>\n" +
                "<td>thọc ;nhấn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>194</td>\n" +
                "<td>tread</td>\n" +
                "<td>trod</td>\n" +
                "<td>trodden/ trod</td>\n" +
                "<td>giẫm ; đạp</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>195</td>\n" +
                "<td>unbend</td>\n" +
                "<td>unbent</td>\n" +
                "<td>unbent</td>\n" +
                "<td>l&agrave;m thẳng lại</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>196</td>\n" +
                "<td>undercut</td>\n" +
                "<td>undercut</td>\n" +
                "<td>undercut</td>\n" +
                "<td>ra gi&aacute; rẻ hơn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>197</td>\n" +
                "<td>undergo</td>\n" +
                "<td>underwent</td>\n" +
                "<td>undergone</td>\n" +
                "<td>kinh qua</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>198</td>\n" +
                "<td>underlie</td>\n" +
                "<td>underlay</td>\n" +
                "<td>underlain</td>\n" +
                "<td>nằm dưới</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>199</td>\n" +
                "<td>underpay</td>\n" +
                "<td>undercut</td>\n" +
                "<td>undercut</td>\n" +
                "<td>trả lương thấp</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>200</td>\n" +
                "<td>undersell</td>\n" +
                "<td>undersold</td>\n" +
                "<td>undersold</td>\n" +
                "<td>b&aacute;n rẻ hơn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>201</td>\n" +
                "<td>understand</td>\n" +
                "<td>understood</td>\n" +
                "<td>understood</td>\n" +
                "<td>hiểu</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>202</td>\n" +
                "<td>undertake</td>\n" +
                "<td>undertook</td>\n" +
                "<td>undertaken</td>\n" +
                "<td>đảm nhận</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>203</td>\n" +
                "<td>underwrite</td>\n" +
                "<td>underwrote</td>\n" +
                "<td>underwritten</td>\n" +
                "<td>bảo hiểm</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>204</td>\n" +
                "<td>undo</td>\n" +
                "<td>undid</td>\n" +
                "<td>undone</td>\n" +
                "<td>th&aacute;o ra</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>205</td>\n" +
                "<td>unfreeze</td>\n" +
                "<td>unfroze</td>\n" +
                "<td>unfrozen</td>\n" +
                "<td>l&agrave;m tan đ&ocirc;ng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>206</td>\n" +
                "<td>unwind</td>\n" +
                "<td>unwound</td>\n" +
                "<td>unwound</td>\n" +
                "<td>th&aacute;o ra</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>207</td>\n" +
                "<td>uphold</td>\n" +
                "<td>upheld</td>\n" +
                "<td>upheld</td>\n" +
                "<td>ủng hộ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>208</td>\n" +
                "<td>upset</td>\n" +
                "<td>upset</td>\n" +
                "<td>upset</td>\n" +
                "<td>đ&aacute;nh đổ; lật đổ</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>209</td>\n" +
                "<td>wake</td>\n" +
                "<td>woke/ waked</td>\n" +
                "<td>woken/ waked</td>\n" +
                "<td>thức giấc</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>210</td>\n" +
                "<td>waylay</td>\n" +
                "<td>waylaid</td>\n" +
                "<td>waylaid</td>\n" +
                "<td>mai phục</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>211</td>\n" +
                "<td>wear</td>\n" +
                "<td>wore</td>\n" +
                "<td>worn</td>\n" +
                "<td>mặc</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>212</td>\n" +
                "<td>weave</td>\n" +
                "<td>wove/ weaved</td>\n" +
                "<td>woven/ weaved</td>\n" +
                "<td>dệt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>213</td>\n" +
                "<td>wed</td>\n" +
                "<td>wed/ wedded</td>\n" +
                "<td>wed/ wedded</td>\n" +
                "<td>kết h&ocirc;n</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>214</td>\n" +
                "<td>weep</td>\n" +
                "<td>wept</td>\n" +
                "<td>wept</td>\n" +
                "<td>kh&oacute;c</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>215</td>\n" +
                "<td>wet</td>\n" +
                "<td>wet / wetted</td>\n" +
                "<td>wet / wetted</td>\n" +
                "<td>l&agrave;m ướt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>216</td>\n" +
                "<td>win</td>\n" +
                "<td>won</td>\n" +
                "<td>won</td>\n" +
                "<td>thắng ; chiến thắng</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>217</td>\n" +
                "<td>wind</td>\n" +
                "<td>wound</td>\n" +
                "<td>wound</td>\n" +
                "<td>quấn</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>218</td>\n" +
                "<td>withdraw</td>\n" +
                "<td>withdrew</td>\n" +
                "<td>withdrawn</td>\n" +
                "<td>r&uacute;t lui</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>219</td>\n" +
                "<td>withhold</td>\n" +
                "<td>withheld</td>\n" +
                "<td>withheld</td>\n" +
                "<td>từ khước</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>220</td>\n" +
                "<td>withstand</td>\n" +
                "<td>withstood</td>\n" +
                "<td>withstood</td>\n" +
                "<td>cầm cự</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>221</td>\n" +
                "<td>work</td>\n" +
                "<td>wrought / worked</td>\n" +
                "<td>wrought / worked</td>\n" +
                "<td>r&egrave;n (sắt)</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>222</td>\n" +
                "<td>wring</td>\n" +
                "<td>wrung</td>\n" +
                "<td>wrung</td>\n" +
                "<td>vặn ; siết chặt</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>223</td>\n" +
                "<td>write</td>\n" +
                "<td>wrote</td>\n" +
                "<td>written</td>\n" +
                "<td>viết</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>";
        wv.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
