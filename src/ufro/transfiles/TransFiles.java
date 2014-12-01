package ufro.transfiles;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.os.Build;
import android.provider.Settings;

public class TransFiles extends Activity {
	
	private TabHost tabs;
	private TextView etiqueta;
	private TextView ipUsuario;
	private ToggleButton botonConectado;
	private TextView apariencia;
	private TextView sonido;
	private Button buttonSync;
	private Spinner temas;
	private Spinner sound;
	private String[] nombresTemas;
	private String[] nombresSonidos;
	private Settings ipProvider;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trans_files);
		
		Resources res= getResources();
		
		tabs=(TabHost)findViewById(android.R.id.tabhost);
		
		tabs.setup();
		ipProvider= new Settings();
		TabHost.TabSpec spec=tabs.newTabSpec("");
		spec.setContent(R.id.menutab);
		spec.setIndicator("MENU", res.getDrawable(android.R.drawable.dialog_holo_light_frame));
		tabs.addTab(spec);
		etiqueta=(TextView) findViewById(R.id.etiqueta);
        ipUsuario=(TextView)findViewById(R.id.label);
        botonConectado=(ToggleButton)findViewById(R.id.boton_conectar);
        ipUsuario.setText("");	
        botonConectado.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				
				if(isChecked){//si esta conectado
					
					ipUsuario.setText("11.111.11.111");
				
				}else{//si esta desconectado
					ipUsuario.setText(" -------------- ");
				}
					
			}
		}); 
		
		tabs.setup();
		
		TabHost.TabSpec spec1=tabs.newTabSpec("Pestaña 2");
		spec1.setContent(R.id.settingtab);
		spec1.setIndicator("CONFIGURACIÓN", res.getDrawable(android.R.drawable.ic_media_ff));
		tabs.addTab(spec1);
		
		
	    
	    apariencia =(TextView)findViewById(R.id.apariencia);
	    sonido=(TextView)findViewById(R.id.sonido);
	    buttonSync=(Button)findViewById(R.id.button_sync);
	    
	    temas=(Spinner)findViewById(R.id.themes);
	    sound=(Spinner)findViewById(R.id.sounds);    
	    
	    nombresTemas= new String []{"Defecto","Oscuro"}; 
	    
	    ArrayAdapter<String> adaptadorTemas =
	            new ArrayAdapter<String>(this,
	                android.R.layout.simple_spinner_item, nombresTemas);
	    temas.setAdapter(adaptadorTemas);
	    
	    nombresSonidos=new String[]{"Defecto","Silencio"};
	    
	    ArrayAdapter<String> adaptadorSonidos =
	            new ArrayAdapter<String>(this,
	                android.R.layout.simple_spinner_item, nombresSonidos);
	    sound.setAdapter(adaptadorSonidos);
	    buttonSync.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				botonConectado.setChecked(false);
				ipUsuario.setText("");
				
			}
		});
						
	}
}

	