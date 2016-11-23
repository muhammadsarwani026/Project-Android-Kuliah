package com.example.muhammadsarwani.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview1 = (WebView)findViewById(R.id.webview1);

        String data = "<html> <body style='background-color=#FFBD9D:font-size=16pt'><div>Welcome</div></br>Wazzup meen!!!</body> </html>";

        webview1.loadData(data,"text/html","UTF-8");
    }
}
