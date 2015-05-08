package com.example.ejdialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class Fragment1 extends DialogFragment{
	
	static Fragment1 newInstance(String title){
		Fragment1 fragment = new Fragment1();
		Bundle Args = new Bundle();
		Args.putString("title", title);
		fragment.setArguments(Args);
		return fragment;		
	}

	public Dialog onCreateDialog(Bundle savedInstanceState) {		
		String title = getArguments().getString("title");
		return new AlertDialog.Builder(getActivity())
			.setIcon(R.drawable.ic_launcher)
			.setTitle(title)
			.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {			
				public void onClick(DialogInterface dialog, int which) {
					((MainActivity)getActivity()).doPositiveClick();				
				}
			})
			.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {			
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					((MainActivity)getActivity()).doNegativeClick();
				}
			}).create();		
	}
}
