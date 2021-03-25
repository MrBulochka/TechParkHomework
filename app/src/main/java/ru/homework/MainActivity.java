package ru.homework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int columns = 3;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

//         Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            columns = 3;
        else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            columns = 4;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // пытаюсь передать значение количества столбцов списка
//        Bundle bundle = new Bundle();
//        bundle.putInt("table_columns", columns);
//        TableFragment tableFragment = new TableFragment();
//        tableFragment.setArguments(bundle);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_fragment);
        if (getSupportFragmentManager().findFragmentById(R.id.table_container) == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.table_container, new TableFragment())
                    .commit();
        }
    }
}
