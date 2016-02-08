package fr.yaokouakou.yaokouakou.domiplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText ;
    static final String code = "code";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.codeemploye);
    }


    public void clickBoutonVal (View view) {


        Intent intent = new Intent(MainActivity.this, horaire.class);
        intent.putExtra(code, editText.getText().toString());
        startActivity(intent);
        //Intent intent = new Intent(MainActivity.this, LoginDisplayActivity.class);
        //startActivity(intent);


    }

}
