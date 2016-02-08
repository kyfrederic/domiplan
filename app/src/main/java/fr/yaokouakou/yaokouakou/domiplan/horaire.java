package fr.yaokouakou.yaokouakou.domiplan;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by yaokouakou on 12/11/15.
 */
public class horaire extends Activity{

    public String intentcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horaire);
        //intentcode = (String) getIntent().getStringExtra(MainActivity.code);
        //Log.i("CV", "j'ai bien recu le code : " + intentcode);

        ListView list = (ListView) findViewById(R.id.listjourdelasemaine_id);

        ArrayAdapter<String> tableau = new ArrayAdapter<String>(list.getContext(), R.layout.jourssemaine);

        tableau.add("Lundi");
        tableau.add("Mardi");
        tableau.add("Mercredi");
        tableau.add("Jeudi");
        tableau.add("Vendredi");
        tableau.add("Samedi");
        tableau.add("Dimanche");

        list.setAdapter(tableau);



    }
}
