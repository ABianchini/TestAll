package com.advancementbureau.testall;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ActionBarActivity extends Activity {
    /** Called when the activity is first created. */
	static final int ABOUT_DIALOG_ID = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionbar);
    }
    
    
    
    
    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	getMenuInflater().inflate(R.menu.actionbaroptions, menu);
    	menu.findItem(R.id.actionBarInfo_menu_item);
    	menu.findItem(R.id.settings_menu_item).setIntent(new Intent(this, SettingsActivity.class));
    	return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	super.onOptionsItemSelected(item);
    	if (item.getItemId() == R.id.settings_menu_item) {
    		startActivity(item.getIntent());
    	} else {
    		PopIt();
    	}
    	return true;
    }
    public AlertDialog myAlertDialog;
    public void onActionBarBackButtonClick(View view) {
    	startActivity(new Intent(ActionBarActivity.this, TestAllActivity.class));
    	ActionBarActivity.this.finish();
    }
    private void PopIt(){
        new AlertDialog.Builder(this)
        .setTitle(R.string.about)
        .setMessage(R.string.action_bar_about)
        .setNegativeButton("Close", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {}
        }).show();
    }
}