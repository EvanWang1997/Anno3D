package com.example.anno3d;import androidx.appcompat.app.AppCompatActivity;import android.content.Intent;import android.os.Bundle;import android.view.View;import android.widget.EditText;import static android.provider.AlarmClock.EXTRA_MESSAGE;public class MainActivity extends AppCompatActivity {    public static final String EXTRA_MESSAGE = "com.example.Anno3D.MESSAGE";    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);    }    /** Called when the user taps the Send button */    public void sendMessage(View view) {        Intent intent = new Intent(this, DisplayMessageActivity.class);        EditText editText = findViewById(R.id.editTextTextPersonName);        String message = editText.getText().toString();        intent.putExtra(EXTRA_MESSAGE, message);        startActivity(intent);    }    public void findModel(View view) {        Intent intent = new Intent(this,Scroll_File.class);        startActivity(intent);    }    public void findProject(View view) {        Intent intent = new Intent(this,ProjectBrowser.class);        startActivity(intent);    }}