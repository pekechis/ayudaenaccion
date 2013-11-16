package com.equipoa.ayudaenaccion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		
		Intent myIntent;
		switch(item.getItemId()) {
		
		case 0:
			myIntent=new Intent(MainActivity.this,ListaApadrinados.class);
	        startActivity(myIntent);
	        return true;
		case 1:
			myIntent=new Intent(MainActivity.this,DatosPersonales.class);
	        startActivity(myIntent);
	        return true;
		case 2:
			myIntent=new Intent(MainActivity.this,AumentarCuota.class);
	        startActivity(myIntent);
	        return true;
		
		case 3: 
			myIntent=new Intent(MainActivity.this,MainActivity.class);
	        startActivity(myIntent);
			return true;
		}
	
		return false;	
	}

}
