package com.example.ougri2016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Ougri extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ougri);
    TextView tv6 = (TextView) findViewById(R.id.textView6);
    tv6.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i6 = new Intent(Ougri.this,History.class);
			startActivity(i6);
		}
	});
    }
    
}
