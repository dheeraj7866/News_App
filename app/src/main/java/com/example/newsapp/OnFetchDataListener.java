package com.example.newsapp;

import com.example.newsapp.Models.NewsApiResponse;
import com.example.newsapp.Models.NewsHeadlines;

import java.util.List;
//to handle the response from maina ctivity
public interface OnFetchDataListener<NewsApiResponse> {

    void  onFetchData (List<NewsHeadlines> list, String message);
    void onError (String message);
}
