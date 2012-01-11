package com.advancementbureau.testall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GraphicsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graphics);
    }
    public void onGraphicsBackButtonClick(View view) {
    	startActivity(new Intent(GraphicsActivity.this, TestAllActivity.class));
    	GraphicsActivity.this.finish();
    }
}