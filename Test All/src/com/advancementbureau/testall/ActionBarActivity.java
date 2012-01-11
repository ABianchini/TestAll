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
import android.view.View;
import android.widget.Toast;

public class ActionBarActivity extends Activity {
    /** Called when the activity is first created. */
	static final int ABOUT_DIALOG_ID = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionbar);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    
    
    
    
    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	getMenuInflater().inflate(R.menu.actionbaroptions, menu);
    	menu.findItem(R.id.actionBarInfo_menu_item);
    	menu.findItem(R.id.actionBar_save);
    	menu.findItem(R.id.settings_menu_item).setIntent(new Intent(this, SettingsActivity.class));
    	menu.findItem(R.id.actionBar_herp);
    	menu.findItem(R.id.actionBar_derp);
    	return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	super.onOptionsItemSelected(item);
    	if (item.getItemId() == R.id.settings_menu_item) {
    			startActivity(item.getIntent()); }
		if (item.getItemId() == R.id.actionBarInfo_menu_item) {
    			PopIt(); }
		if (item.getItemId() == android.R.id.home) {
    			Intent intent2 = new Intent(this, TestAllActivity.class);
    			intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			startActivity(intent2); }
    	if (item.getItemId() == R.id.actionBar_save) {
    			Toast toast = Toast.makeText(getApplicationContext(), "You saved a puppy!", Toast.LENGTH_SHORT);
    			toast.show(); }
		if (item.getItemId() == R.id.actionBar_herp) {
    			Toast toast2 = Toast.makeText(getApplicationContext(), "Herp", Toast.LENGTH_SHORT);
    			toast2.show(); }
    	if (item.getItemId() == R.id.actionBar_derp) {
    			Toast toast3 = Toast.makeText(getApplicationContext(), "Derp", Toast.LENGTH_SHORT);
    			toast3.show();
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