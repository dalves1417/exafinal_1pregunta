package com.example.primerapregunta;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	public double campo1, campo2, campo3;
	public EditText texto1, texto2, texto3;
	public TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto1 = (EditText) findViewById(R.id.editText1);
        texto2 = (EditText) findViewById(R.id.editText2);
        texto3 = (EditText) findViewById(R.id.editText3);
        resultado = (TextView) findViewById(R.id.textView2);
        
    }
    public void multiplicar(View View){
    	campo1 = Double.parseDouble(texto1.getText().toString());
    	campo2 = Double.parseDouble(texto2.getText().toString());
    	campo3 = Double.parseDouble(texto3.getText().toString());
    	resultado.setText(Double.toString(campo1*campo2*campo3));
    }
    public void clear(View View){
    	texto1.setText(" ");
		texto2.setText(" ");
		texto3.setText(" ");
		resultado.setText(" ");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
