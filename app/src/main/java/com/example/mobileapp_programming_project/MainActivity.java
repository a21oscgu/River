package com.example.mobileapp_programming_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    WebView aboutWebView;

    ArrayList<River> riversArray;

    RecyclerView recyclerView;

    private River[] rivers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //

        aboutWebView = findViewById(R.id.about_webview);

        //Starts downloading JSON-data
        String JSON_URL = "https://mobprog.webug.se/json-api?login=a21oscgu";
        new JsonTask(this).execute(JSON_URL);
        //recyclerView.getAdapter().notifyDataSetChanged();
    }

    // Creates option-menu
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.about) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPostExecute(String json) {

        //GSON objekt skapas
        Gson gson = new Gson();
        // Unmarshall JSON -> a single object
        rivers = gson.fromJson(json, River[].class);

        riversArray = new ArrayList<>();
        //ArrayList<River> riversArray = new ArrayList<>(); SOLUTION?

        Collections.addAll(riversArray, rivers);

        recyclerView = findViewById(R.id.riverRecyclerview);
        // Connects Adapter and RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(riversArray));
    }
}