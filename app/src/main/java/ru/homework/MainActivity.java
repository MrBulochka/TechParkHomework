package ru.homework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        Bundle bundle = new Bundle();
//        bundle.putInt("table_columns", columns);
//        TableFragment tableFragment = new TableFragment();
//        tableFragment.setArguments(bundle);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_fragment);
        TableFragment tableFragment = new TableFragment();
        if (getSupportFragmentManager().findFragmentById(R.id.table_container) == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.table_container, tableFragment)
                    .commit();
        }
    }
}
