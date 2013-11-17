package com.equipoa.ayudaenaccion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends Activity {

	private Button mbLogin;
	private Button mbRegister;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		mbLogin=(Button)findViewById(R.id.botonLogin);
		
		mbLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent myIntent=new Intent(Login.this,ListaApadrinados.class);
				Toast t=Toast.makeText(getApplicationContext(), "Login Correcto", Toast.LENGTH_SHORT);
				startActivity(myIntent);
				
			}
		});
		
		mbRegister=(Button)findViewById(R.id.buttonRegister);
		mbRegister.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent myIntent=new Intent(Login.this,RegistroPadrinos.class);
				Toast t=Toast.makeText(getApplicationContext(),"Bienvenido a Ayuda en Accion", Toast.LENGTH_SHORT);
				startActivity(myIntent);				
			}
		});
	}

}
