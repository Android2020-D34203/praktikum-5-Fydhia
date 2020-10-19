package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView, textView2;
    private String username, password;
    private String KEY_USERNAME = "USERNAME";
    private String KEY_PASSWORD = "PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();
        username= extras.getString(KEY_USERNAME);
        password= extras.getString(KEY_PASSWORD);
        textView.setText("Username : " + username + ".");
        textView2.setText("Password : " + password + ".");

    }
}