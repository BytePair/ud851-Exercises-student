package com.example.android.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

// 1. Use Android Studio's Activity wizard to create a new Activity called ChildActivity
public class ChildActivity extends AppCompatActivity {

    // 6. Create a TextView field to display your message
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // 7. Get a reference to your TextView in Java
        mTextView = (TextView) findViewById(R.id.tv_display);

        Intent intent = getIntent();
        mTextView.setText(intent.getStringExtra("sentence"));
    }

}
