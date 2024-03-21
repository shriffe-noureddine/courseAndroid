package com.example.myapplication32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //start the intent
        String url = "http://www.uni.lu/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public class BrowserActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            WebView webview = new WebView(this);
            webview.setWebViewClient(new WebViewClient());
            setContentView(webview);

            Uri data = getIntent().getData();
            try
            {
                URL url = new URL(data.getScheme(), data.getHost(), data.getPath());
                webview.loadUrl(url.toExternalForm());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}