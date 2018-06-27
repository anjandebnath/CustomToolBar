package com.aj.user06.customtoolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/**
 * Created by Anjan Debnath on 6/26/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class CustomToolBar extends Toolbar implements SetActivity {

    private boolean showHomeButton;
    private String toolbarTitle = null;
    private AppCompatActivity activity;

    @Override
    public void setContext(AppCompatActivity activity) {
       this.activity = activity;

        // if true then home button will be enabled
        if(showHomeButton){
            activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            activity.getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        //this will set custom toolbar text
        if(toolbarTitle!= null){
            Log.e("title", toolbarTitle);
            activity.getSupportActionBar().setTitle(toolbarTitle);
        }

    }


    public CustomToolBar(Context context) {
        super(context);
        init(context, null);
    }

    public CustomToolBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomToolBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public void init(Context context, AttributeSet attributeSet){

        if(attributeSet != null){
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.CustomToolBar);
            try {
                showHomeButton = typedArray.getBoolean(R.styleable.CustomToolBar_showHomeButton, false);

                if(typedArray.hasValue(R.styleable.CustomToolBar_customTitle)){
                    toolbarTitle = typedArray.getString(R.styleable.CustomToolBar_customTitle);
                }

            } finally {
                typedArray.recycle();
            }
        }

    }


}
