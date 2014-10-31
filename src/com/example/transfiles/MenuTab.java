package com.example.transfiles;

import android.app.Activity;
import android.os.Bundle;
import android.test.IsolatedContext;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MenuTab extends Activity {
	
	private TextView etiqueta;
	private TextView ipUsuario;
	private ToggleButton botonConectado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_tab);
        etiqueta=(TextView) findViewById(R.id.etiqueta);
        ipUsuario=(TextView)findViewById(R.id.ip_user);
        botonConectado=(ToggleButton)findViewById(R.id.boton_conectar);
        ipUsuario.setText("");	
        botonConectado.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				
				if(isChecked){//si esta conectado
					
				ipUsuario.setText("11.111.11.111");
				
				}else{//si esta desconectado
					
				}
					
			}
		});
        
    }

}
