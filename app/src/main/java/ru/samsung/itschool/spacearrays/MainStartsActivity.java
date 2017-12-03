package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Roky Mielsen on 03.12.2017.
 */

public class MainStartsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void login (View view){
        String x="qwerty";
        Intent intent = new Intent(this,MainActivity.class);
        EditText login =(EditText)findViewById(R.id.login);
        String logintext = login.getText().toString();
        if (logintext.equals(x)){startActivity(intent);}
        else {
            TextView error =(TextView) findViewById(R.id.error);
        error.setText ("ERROR");}
    }
}
