package com.gdpt.mobile213.dayshotsearch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataManagers {

     String ZHIHU_SEARCH ="https://cdn.jsdelivr.net/gh/huqi-pr/trending-in-one/raw/zhihu-search/";
     String TOUTIAO_SEARCH = "https://cdn.jsdelivr.net/gh/huqi-pr/trending-in-one/raw/toutiao-search/";
     String WEIBO_SEARCH = "https://cdn.jsdelivr.net/gh/huqi-pr/trending-in-one/raw/weibo-search/";
     String ZHIHU_QUESTIONS = "https://cdn.jsdelivr.net/gh/huqi-pr/trending-in-one/raw/zhihu-questions/";
     String ZHIHU_VIDEO= "https://cdn.jsdelivr.net/gh/huqi-pr/trending-in-one/raw/zhihu-video/";

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    //获取当前时间
    String today = formatter.format(date) + ".json";

    //知乎热搜接口
    public String getZHIHU_SEARCHurl(){

        String ZHIHU_SEARCHURL = ZHIHU_SEARCH+today;

        return ZHIHU_SEARCHURL;
    }

    //头条热搜接口
    public String getTOUTIAO_SEARCHurl(){

        String TOUTIAO_SEARCHURL = TOUTIAO_SEARCH+today;

        return TOUTIAO_SEARCHURL;
    }

    //微博热搜接口
    public String getWEIBO_SEARCHurl(){
        String WEIBO_SEARCHURL = WEIBO_SEARCH+today;

        return WEIBO_SEARCHURL ;

    }

    //知乎问题热搜
    public String getZHIHU_QUESTIONSurl(){
        String ZHIHU_QUESTIONSURL = ZHIHU_QUESTIONS+today;

        return ZHIHU_QUESTIONSURL ;

    }

    //知乎视频热搜

    public String getZHIHU_VIDEOurl(){
        String ZHIHU_VIDEOURL = ZHIHU_VIDEO+today;

        return ZHIHU_VIDEOURL ;

    }





}
