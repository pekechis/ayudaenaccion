package com.equipoa.ayudaenaccion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DatosPersonales extends Activity {

	private Button mButtonMandar;
	private Intent myIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.datospersonales);
	}
}
