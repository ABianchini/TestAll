package com.advancementbureau.testall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TestAllActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	getMenuInflater().inflate(R.menu.mainoptions, menu);
    	menu.findItem(R.id.settings_menu_item).setIntent(new Intent(this, SettingsActivity.class));
    	menu.findItem(R.id.changelog_menu_item).setIntent(new Intent(this, ChangeLogActivity.class));
    	return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	super.onOptionsItemSelected(item);
    	startActivity(item.getIntent());
    	return true;
    }
    public void onActionBarButtonClick(View view) {
    	startActivity(new Intent(TestAllActivity.this, ActionBarActivity.class));
    }
   
    public void onGraphicsButtonClick(View view) {
    	startActivity(new Intent(TestAllActivity.this, GraphicsActivity.class));
    }
}