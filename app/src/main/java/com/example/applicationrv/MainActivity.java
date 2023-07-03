package com.example.applicationrv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.applicationrv.Adaptador.AdaptadorNoticias;
import com.example.applicationrv.Modelos.Noticia;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DATA
        Noticia[] noticia =  new Noticia[]{
                        new Noticia("Noticia 1", "SubNoticia Contenido Contenido Contenido Contenido 1"),
                        new Noticia("Noticia 2", "SubNoticia Contenido Contenido Contenido Contenido 2"),
                        new Noticia("Noticia 3", "SubNoticia Contenido Contenido Contenido Contenido 3"),
                        new Noticia("Noticia 4", "SubNoticia Contenido Contenido Contenido Contenido 4"),
                        new Noticia("Noticia 5", "SubNoticia Contenido Contenido Contenido Contenido 5"),
                        new Noticia("Noticia 6", "SubNoticia Contenido Contenido Contenido Contenido 6"),
                        new Noticia("Noticia 7", "SubNoticia Contenido Contenido Contenido Contenido 7")};

        //ADAPTADOR

        AdaptadorNoticias adaptadornoticias = new AdaptadorNoticias(this,
                noticia);

        //VISTA
        ListView lstOpciones = (ListView)findViewById(R.id.lstListaNotici);

        //AGREGAR LA VISTA DE CABEZERA
        View header =
                getLayoutInflater().inflate(
                        R.layout.lyhenotcias
                        , null);
        lstOpciones.addHeaderView(header);
        lstOpciones.setAdapter(adaptadornoticias);
        lstOpciones.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Noticia noticiaselecci= (Noticia)adapterView.getItemAtPosition(i);
        //Toast.makeText(this,"Seleccionaste: " + noticiaselecci.getTitulo(),Toast.LENGTH_LONG).show();


        Intent intent = new Intent(MainActivity.this, MVerNoticia2.class);
        Bundle b = new Bundle();
        b.putString("TITULO",noticiaselecci.getTitulo());
        b.putString("SUBTITULO",noticiaselecci.getSubtitulo());
        intent.putExtras(b);
        startActivity(intent);

    }
}
