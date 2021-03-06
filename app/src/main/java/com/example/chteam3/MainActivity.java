package com.example.chteam3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //récuperer le bouton add et setting depuis le fichier menuu.xml
        getMenuInflater().inflate(R.menu.menuu, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // si on clique sur le bouton add on demarre une nouvelle activité

        if (item.getItemId() == R.id.action_add) {
            Intent i = new Intent(MainActivity.this, AjouterPost.class);

            startActivity(i);
        }

        return super.onOptionsItemSelected(item);

    }
}