package com.londonappbrewery.iampoor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgView;
    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        richify();
    }

    public void richify() {
        imgView = (ImageView)findViewById(R.id.imageView);
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        imgView.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                            textView.setText(R.string.rich);
                            textView2.setText(R.string.confirm);
                            imgView.setImageResource(R.drawable.diamond_image);
                    }
                }
        );

    }
}
