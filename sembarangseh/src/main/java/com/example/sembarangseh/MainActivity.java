package com.example.sembarangseh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview1 = (WebView)findViewById(R.id.webview1);
        webview1.getSettings().setJavaScriptEnabled(true);
        webview1.loadUrl("file://android_asset/tampilanSIM.html");
    }
}
