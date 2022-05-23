package com.example.mobileapp_programming_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        android.webkit.WebView myWebView = findViewById(R.id.about_webview); // The type of the variable is a WebView (android.webkit.WebView)
        myWebView.getSettings().setJavaScriptEnabled(true); // IDK if this needs to be enabled right now.
        myWebView.setWebViewClient(new WebViewClient()); // We want to open this in the app and not switch to another app like chrome.
        myWebView.loadUrl("file:///android_asset/about.html"); // Visar lokal HTML-fil
    }
}