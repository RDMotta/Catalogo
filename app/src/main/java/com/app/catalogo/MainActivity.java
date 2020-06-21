package com.app.catalogo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.app.catalogo.classes.CatalogoActivity;


/**
 * Created by Robson Da Motta on 22/08/2015.
 * Project Catalogo
 */
public class MainActivity extends CatalogoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarPropriedades();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected void inicializarPropriedades(){
       // setDrawerLayout((DrawerLayout) findViewById(R.id.action_bar));

       // final Toolbar toolbar = (Toolbar) findViewById(R.id.action_bar);
       // setSupportActionBar(toolbar);
       // final ActionBar actionBar = getSupportActionBar();

       // if (actionBar != null) {
       //     actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu_black);
       //     actionBar.setDisplayHomeAsUpEnabled(true);
       // }
    }
}
