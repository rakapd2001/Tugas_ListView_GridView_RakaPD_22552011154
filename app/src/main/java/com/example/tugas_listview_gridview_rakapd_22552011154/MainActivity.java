package com.example.tugas_listview_gridview_rakapd_22552011154;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            itemList.add(new Item("Title " + i, "Subtitle " + i, "https://source.unsplash.com/random/300x200?sig=" + i));
        }
        adapter = new MyAdapter(itemList);

        // Untuk ListView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Untuk GridView, ganti 2 dengan jumlah kolom yang diinginkan
        // recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        recyclerView.setAdapter(adapter);
    }
}