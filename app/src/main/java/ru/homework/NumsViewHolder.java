package ru.homework;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class NumsViewHolder extends RecyclerView.ViewHolder {

    private final TextView title;

    public NumsViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.number);
    }

    public void bind(int number) {
        String mText = Integer.toString(number);
        int mColor = DataSource.getColor(number);
        title.setText(mText);
        title.setTextColor(mColor);

        title.setOnClickListener(view -> {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                if (activity.getSupportFragmentManager().findFragmentById(R.id.table_container) == null) {
                    activity.getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.container, LargeNumFragment.newInstance(mText, mColor))
                            .addToBackStack(null)
                            .commit();
                }
            }
        );
    }
}
