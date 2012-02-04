package com.advancementbureau.testall;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class GraphicsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graphics);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    
    
    
    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	getMenuInflater().inflate(R.menu.graphicsoptions, menu);
    	menu.findItem(R.id.graphicsAbout_menu_item);
    	menu.findItem(R.id.graphicsSettings_menu_item).setIntent(new Intent(this, SettingsActivity.class));
    	return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	super.onOptionsItemSelected(item);
    	if (item.getItemId() == R.id.graphicsSettings_menu_item) {
			startActivity(item.getIntent()); 
		}
		if (item.getItemId() == R.id.graphicsAbout_menu_item) {
			PopIt(); 
		}if (item.getItemId() == android.R.id.home) {
			Intent intent2 = new Intent(this, TestAllActivity.class);
			intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent2); }
    	return true;
    }
    private void PopIt(){
        new AlertDialog.Builder(this)
        .setTitle(R.string.about)
        .setMessage(R.string.graphics_about)
        .setNegativeButton("Close", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {}
        }).show();
    }
    /*public void onGraphicsBackButtonClick(View view) {
		startActivity(new Intent(GraphicsActivity.this, TestAllActivity.class));
		GraphicsActivity.this.finish();
	}*/
}