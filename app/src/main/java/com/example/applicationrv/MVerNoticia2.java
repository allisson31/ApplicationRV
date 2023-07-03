package com.example.applicationrv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MVerNoticia2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mver_noticia2);

     Bundle bundle= this.getIntent().getExtras();
        TextView txttituloNoticia = (TextView)findViewById(R.id.txtNoticia);
        txttituloNoticia.setText(bundle.getString("TITULO"));
        TextView txttSubtitulo = (TextView)findViewById(R.id.txtSubtitulo);
        txttSubtitulo.setText(bundle.getString("SUBTITULO"));
    }
}