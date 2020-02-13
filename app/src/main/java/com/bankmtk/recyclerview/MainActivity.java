package com.bankmtk.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] data = {"One", "Two","Three","Four"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        //This setting is used to improve system performance
        recyclerView.setHasFixedSize(true);

        //we'll be work with integral manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        //setup adapter
        SocnetAdapter adapter = new SocnetAdapter(data);
        recyclerView.setAdapter(adapter);

        final Activity that = this;


    }
}
