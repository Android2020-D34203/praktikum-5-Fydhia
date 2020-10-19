package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, button2;
    EditText editText, editText2;

    private String KEY_USERNAME = "USERNAME";
    private String KEY_PASSWORD = "PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.login);
        button2 = findViewById(R.id.forgetPassword);
        editText = findViewById(R.id.username);
        editText2 = findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    String username = editText.getText().toString();
                    String passwprd = editText2.getText().toString();
                    if (username != null && username != " " && passwprd != null && passwprd != " "){
                        Intent i = new Intent(MainActivity.this, MainActivity2.class);
                        i.putExtra(KEY_USERNAME, username);
                        i.putExtra(KEY_PASSWORD, passwprd);
                        startActivity(i);
                    } else{
                        Toast.makeText(getApplication(), "Please enter the Username!", Toast.LENGTH_SHORT);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR", Toast.LENGTH_SHORT);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i);
            }
        });


    }


}