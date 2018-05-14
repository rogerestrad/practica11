package com.rogerestrad.practica11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.recycler)
    RecyclerView rv;

    //provicional
    public static final List<Artista> datos = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        Artista ar = new Artista();
        ar.setName("alexandra lux");
        ar.setPhone("3841091234");
        ar.setRating(5);
        datos.add(ar);
        ar= new Artista();
        ar.setName("mia Kalifa");
        ar.setPhone("3321014563");
        ar.setRating(5);
        datos.add(ar);

        LlenarRecicler();

    }

    public void LlenarRecicler (){
        if (datos!=null) {
            AdaptadorRecycler ar = new AdaptadorRecycler(this, datos);
            LinearLayoutManager llm = new LinearLayoutManager(this);
            rv.setLayoutManager(llm);
            rv.setAdapter(ar);
        }
    }
}
