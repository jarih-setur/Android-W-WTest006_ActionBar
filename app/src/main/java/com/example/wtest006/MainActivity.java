package com.example.wtest006;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar); //SetActionBar to toolbar
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.miHelp:
                Toast.makeText(getApplicationContext(),"Helping...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.miSettings:
                Toast.makeText(getApplicationContext(),"Settings", Toast.LENGTH_SHORT).show();
                Intent settings = new Intent(this,SettingsActivity.class);
                startActivity(settings);
                break;
            case R.id.miUpdates:
                Toast.makeText(getApplicationContext(),"Latest version...", Toast.LENGTH_SHORT).show();
                break;
            default:
                // Unknown option
        }

        TextView textView = (TextView) findViewById(R.id.textView);
        String str = (String) item.getTitle();
        textView.setText("Last clicked item was: "+str.toString());
        return super.onOptionsItemSelected(item);
    }

}
