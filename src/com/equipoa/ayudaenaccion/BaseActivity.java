package com.equipoa.ayudaenaccion;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class BaseActivity extends Activity {


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
        
        Intent myIntent;
        switch(item.getItemId()) {
        
        case R.id.datospersonalesmenu:
                myIntent=new Intent(BaseActivity.this,DatosPersonales.class);
        startActivity(myIntent);
        return true;
        case R.id.aumentarcuotamenu:
                myIntent=new Intent(BaseActivity.this,AumentarCuota.class);
        startActivity(myIntent);
        return true;
        case R.id.logoutmenu:
                myIntent=new Intent(BaseActivity.this,Login.class);
        startActivity(myIntent);
        return true;
        case R.id.mandarmensajemenu:
            myIntent=new Intent(BaseActivity.this,MandarMensaje.class);
		    startActivity(myIntent);
		    return true;
        case R.id.listapadrinados:
            myIntent=new Intent(BaseActivity.this,ListaApadrinados.class);
		    startActivity(myIntent);
		    return true;
        
        }

        return false;        
	}
}
