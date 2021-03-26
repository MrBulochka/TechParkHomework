package ru.homework;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TableFragment extends Fragment {
    int columns;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Bundle bundle = this.getArguments();
//        int columns = bundle.getInt("table_columns", 0);

        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == 1)
            columns = 3;
        else
            columns = 4;

        View rootView = inflater.inflate(R.layout.table, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.table);
        recyclerView.setItemViewCacheSize(50);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), columns));
        recyclerView.setAdapter(new NumsAdapter());

        Button addButton = rootView.findViewById(R.id.creating_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNumber();

            }
        });

        return rootView;
    }
    private void addNumber() {

    }
}

