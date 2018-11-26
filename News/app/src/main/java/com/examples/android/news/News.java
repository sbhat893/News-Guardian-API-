package com.examples.android.news;

public class News {

    private String mTitle;
    private String mSection;
    private String mUrl;
    private String mDate;
    private String mAuthor;

    public News(String articleTitle, String section, String articleAuthor, String url, String date) {
        mTitle = articleTitle;
        mSection = section;
        mUrl = url;
        mDate = date;
        mAuthor = articleAuthor;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }


    public String getDate() {
        return mDate;
    }

    public String getAuthor() {
        return mAuthor;
    }
}
