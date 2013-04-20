package com.reandx.quiz;

import android.net.MailTo;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button btnRegistration = (Button) findViewById(R.id.btnRegistration);
		Button btnLogin = (Button) findViewById(R.id.btnLogin);

		btnRegistration.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v1) {
				startActivity(new Intent(MainActivity.this,
						RegistrationActivity.class));
				// TODO Auto-generated method stub

			}
		});

		btnLogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v2) {
				startActivity(new Intent(MainActivity.this, LoginActivity.class));
				// TODO Auto-generated method stub

			}
		});
	}
}
