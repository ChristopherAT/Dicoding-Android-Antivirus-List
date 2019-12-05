package com.dicoding.androidantivirus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dicoding.androidantivirus.adapter.ListAntivirusAdapter;
import com.dicoding.androidantivirus.model.Antivirus;
import com.dicoding.androidantivirus.model.AntivirusData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAntivirus;
    private ArrayList<Antivirus> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAntivirus = findViewById(R.id.rv_antivirus);
        rvAntivirus.setHasFixedSize(true);

        list.addAll(AntivirusData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvAntivirus.setLayoutManager(new LinearLayoutManager(this));
        ListAntivirusAdapter listAntivirusAdapter = new ListAntivirusAdapter(list);
        rvAntivirus.setAdapter(listAntivirusAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;
        }
    }

}
