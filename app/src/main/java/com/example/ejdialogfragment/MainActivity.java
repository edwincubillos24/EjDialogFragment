/*Aplicacion que utiliza un fragment como cuadro de dialogo*/

package com.example.ejdialogfragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void llamado(View view){
		Fragment1 dialogFragment = Fragment1.newInstance("Estas seguro de esto?");
		dialogFragment.show(getFragmentManager(),"dialog");
	}
	
	public void doPositiveClick(){
		Toast.makeText(this, "Ha pulsado el boton OK", Toast.LENGTH_SHORT).show();
	}
	
	public void doNegativeClick(){
		Toast.makeText(this, "Ha pulsado el boton cancelar", Toast.LENGTH_SHORT).show();
	}

}
