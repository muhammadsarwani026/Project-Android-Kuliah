package com.example.browserku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextURL;
    Button buttonCari;
    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextURL     =(EditText)findViewById(R.id.editTextURL);
        buttonCari      = (Button)findViewById(R.id.buttonCari);
        webView1        = (WebView)findViewById(R.id.webView1);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebViewClient(new browserku());
    }

    public void buttonCari(View view){
        webView1.loadUrl(editTextURL.getText().toString());
    }

    private class browserku extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String editTextURL){
            view.loadUrl(editTextURL);
            return true;
        }
    }
}