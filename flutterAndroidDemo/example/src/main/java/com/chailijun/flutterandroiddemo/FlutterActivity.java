package com.chailijun.flutterandroiddemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

public class FlutterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flutter);

        FlutterView flutterView = Flutter.createView(this, getLifecycle(), "route1");
        FrameLayout.LayoutParams lyoutParams =  new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        addContentView(flutterView, lyoutParams);

    }
}

