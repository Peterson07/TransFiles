package com.example.transfiles;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class SettingTab extends Activity {
	
	private TextView apariencia;
	private TextView sonido;
	private Button buttonSync;
	private Spinner temas;
	private Spinner sound;
	private String[] nombresTemas;
	private String[] nombresSonidos;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.setting_tab);
	    
	    final int cargaProceso=0;
	    
	    apariencia =(TextView)findViewById(R.id.apariencia);
	    sonido=(TextView)findViewById(R.id.sonido);
	    buttonSync=(Button)findViewById(R.id.button_sync);
	    
	    temas=(Spinner)findViewById(R.id.themes);
	    sound=(Spinner)findViewById(R.id.sounds);    
	    
	    nombresTemas= new String []{"Defecto","Claro","Oscuro","Delicado"}; 
	    
	    ArrayAdapter<String> adaptadorTemas =
	            new ArrayAdapter<String>(this,
	                android.R.layout.simple_spinner_item, nombresTemas);
	    
	    nombresSonidos=new String[]{"Defecto","Brillante","Discreto","Silencio"};
	    
	    ArrayAdapter<String> adaptadorSonidos =
	            new ArrayAdapter<String>(this,
	                android.R.layout.simple_spinner_item, nombresSonidos);
	    
	    buttonSync.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				

			}
		});
	}
	
}
