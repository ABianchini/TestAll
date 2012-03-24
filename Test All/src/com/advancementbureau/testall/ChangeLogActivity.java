package com.advancementbureau.testall;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ChangeLogActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change);
        ActionBar actionBar2 = getActionBar();
        actionBar2.setDisplayHomeAsUpEnabled(true);
        
        InputStream iFile = getResources().openRawResource(R.raw.changelog);
        try {
        	TextView changeLog = (TextView) findViewById(R.id.TextView_ChangeText);
        	String strFile = inputStreamToString(iFile);
        	changeLog.setText(strFile);
        } catch (Exception e) {
        }

    }
    
    public String inputStreamToString(InputStream is) throws IOException {
    	StringBuffer sBuffer = new StringBuffer();
    	DataInputStream dataIO = new DataInputStream(is);
    	String strLine = null;
    	while ((strLine = dataIO.readLine()) != null) {
    		sBuffer.append(strLine + "\n");
    	}
    	dataIO.close();
    	is.close();
    	return sBuffer.toString();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	super.onOptionsItemSelected(item);
		if (item.getItemId() == android.R.id.home) {
			Intent intent2 = new Intent(this, TestAllActivity.class);
			intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent2); }
    	return true;
    }
}