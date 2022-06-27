package com.gdpt.mobile213.dayshotsearch;

import com.google.gson.annotations.SerializedName;


public class Zhihu_search {

    @SerializedName("query")
    private String query;
    @SerializedName("display_query")
    private String displayQuery;
    @SerializedName("url")
    private String url;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getDisplayQuery() {
        return displayQuery;
    }

    public void setDisplayQuery(String displayQuery) {
        this.displayQuery = displayQuery;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
