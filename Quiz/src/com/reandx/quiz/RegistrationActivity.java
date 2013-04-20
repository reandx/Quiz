package com.reandx.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RegistrationActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.registration);

		Button btnLogin = (Button) findViewById(R.id.btnRegistration);

		btnLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v1) {
				startActivity(new Intent(RegistrationActivity.this,
						SelectCategoryActivity.class));
				// TODO Auto-generated method stub

			}
		});

	}
}
