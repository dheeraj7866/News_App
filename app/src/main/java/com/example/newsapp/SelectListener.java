package com.example.newsapp;

import com.example.newsapp.Models.NewsHeadlines;
// to handle the news aftre clicking a news
public interface SelectListener {
    void OnNewsClicked(NewsHeadlines headlines);
}
