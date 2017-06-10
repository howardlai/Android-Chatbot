
package com.aa_limited.chatbot;



/**
 * Created by Howard on 6/9/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mywebview = (WebView) findViewById(R.id.webView1);
        //WebSettings webSettings = WebView.getSettings();
        //webSettings.setDomStorageEnabled(true);
        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.setWebChromeClient(new WebChromeClient());
        mywebview.loadUrl("https://assistant.google.com");


        //Button mybutton = (Button) findViewById(R.id.button3);
        //mybutton.setOnClickListener((View.OnClickListener) this);



    }

}