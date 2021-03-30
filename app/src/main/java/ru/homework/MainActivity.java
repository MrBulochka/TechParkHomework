package ru.homework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_container);
        TableFragment tableFragment = new TableFragment();
        if (getSupportFragmentManager().findFragmentById(R.id.container) == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, tableFragment)
                    .commit();
        }
    }
}
