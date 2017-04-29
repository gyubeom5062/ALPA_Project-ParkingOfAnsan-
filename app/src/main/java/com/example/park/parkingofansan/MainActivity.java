package com.example.park.parkingofansan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView i1;
    TextView t1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.filter)
            Toast.makeText(getApplicationContext(), "필터선택", Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

    void init() {
        i1 = (ImageView) findViewById(R.id.menuicon);
        t1 = (TextView)findViewById(R.id.titletv);
        e1 = (EditText)findViewById(R.id.searchet);
        registerForContextMenu(i1);
    }
/*
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v == i1)
            getMenuInflater().inflate(R.menu.menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.filter)
            Toast.makeText(getApplicationContext(), "필터선택", Toast.LENGTH_LONG).show();

        return super.onContextItemSelected(item);
    }*/

    public void MyClick(View v) {
        if(v.getId() == R.id.searchbutton) {
            e1.setVisibility(View.VISIBLE);
            t1.setVisibility(View.GONE);
        }
    }
}
