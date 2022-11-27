package com.example.myrecycleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<MyItem> items = new ArrayList<MyItem>();
        items.add(new MyItem("Lebron James","Los Angeles Lakers",R.drawable.lebron));
        items.add(new MyItem("Kevin Durant","Brooklyn Nets",R.drawable.kevin));
        items.add(new MyItem("Luka Doncic","Dallas Maverick",R.drawable.luka));
        items.add(new MyItem("Steph Curry","Golden State Warriors",R.drawable.curry));
        items.add(new MyItem("Klay Thompson","Golden State Warriors",R.drawable.klay));
        items.add(new MyItem("Kyrie Irving","Brooklyn Nets",R.drawable.kyrie));
        items.add(new MyItem("Jimmy Butler","Miami Heat",R.drawable.butler));
        items.add(new MyItem("Jayson Tatum","Boston Celtics",R.drawable.tatum));
        items.add(new MyItem("James Harden","76Sixers",R.drawable.tatum));
        items.add(new MyItem("Kobe Bryant","Los Angeles Lakers",R.drawable.kobe));
        items.add(new MyItem("Shaquille O'Neal","Los Angeles Lakers",R.drawable.shaq));
        items.add(new MyItem("Wilt Chamberlain","Golden State Warriors",R.drawable.wilt));
        items.add(new MyItem("Derrick Rose","Chicago Bulls",R.drawable.rose));
        items.add(new MyItem("Bam Adebayo","Miami Heat",R.drawable.bam));
        items.add(new MyItem("Zach Lavine","Chicago Bulls",R.drawable.lavine));
        items.add(new MyItem("Demar Derozan","Chicago Bulls",R.drawable.demar));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this,"Successfully",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Join NBA Subscription",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"Go to Settings page",Toast.LENGTH_SHORT).show();
                return true;}
        return super.onOptionsItemSelected(item);
    }
}