package com.example.ougri2016;

import android.app.Activity;
import android.os.Bundle;
import android.os.storage.StorageManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class OugriLoginPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ougri_login_page);
		final EditText et1 = (EditText) findViewById(R.id.editText1);
		final EditText et2 = (EditText) findViewById(R.id.editText2);
	Button b1 = (Button) findViewById(R.id.button1);
	b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String i = et1.getText().toString(), j = et2.getText().toString();
			
					
		}
	});
		
		
	}

}
