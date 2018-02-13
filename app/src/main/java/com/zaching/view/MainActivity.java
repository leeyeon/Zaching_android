package com.zaching.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zaching.R;
import com.zaching.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        setupMVP();
    }

    private void setupViews() {
        // Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
    }

    private void setupMVP() {

    }

}
