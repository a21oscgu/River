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

/*
Text which can be helpful when you're creating a WebView.

* Rename your App. Tip: Values->Strings
* Enable Internet access for your App. Tip: Manifest
* Create a WebView element in the layout file content_main.xml
* Give the WebView element ID "my_webview"
-- Commit and push to your github fork

* Create a private member variable called "myWebView" of type WebView
* Locate the WebView element created in step 1 using the ID created in step 2
* Create a new WebViewClient to attach to our WebView. This allows us to
  browse the web inside our app.
-- Commit and push to your github fork
* Enable Javascript execution in your WebViewClient
* Enter the url to load in our WebView
-- Commit and push to your github fork
* Move the code that loads a URL into your WebView into the two methods
  "showExternalWebPage()" and "showInternalWebPage()".
* Call the "showExternalWebPage()" / "showInternalWebPage()" methods
  when you select menu options "External Web Page" or "Internal Web Page"
  respectively
-- Commit and push to your github fork
* Take two screenshots using the "Take a screenshot" tool in the AVD
   showing your App. One (1) screenshot showing your internal web page and
   one (1) screenshot showing your external web page.
*/