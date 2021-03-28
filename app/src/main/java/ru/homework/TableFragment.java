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
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TableFragment extends Fragment {
    NumsAdapter adapter = new NumsAdapter();
    int columns;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == 1)
            columns = 3;
        else
            columns = 4;

        View rootView = inflater.inflate(R.layout.table_fragment, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.table);
        recyclerView.setItemViewCacheSize(50);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), columns));
        recyclerView.setAdapter(adapter);

        Button addButton = rootView.findViewById(R.id.creating_button);
        addButton.setOnClickListener(view -> {
//            DataSource.addNumber();
            String title = Integer.toString(adapter.data.size() + 1);
            int color = DataSource.getColor(adapter.data.size() + 1);
            adapter.data.add(new TableModel(title, color));
            adapter.notifyItemInserted(adapter.data.size() - 1);
        });

        return rootView;
    }
}

