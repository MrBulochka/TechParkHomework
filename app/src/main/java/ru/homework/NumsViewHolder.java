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

class NumsViewHolder extends RecyclerView.ViewHolder {

    private final TextView title;

    public NumsViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.number);
    }

    public void bind(TableModel model) {
        title.setText(model.mTitle);
        title.setTextColor(model.mColor);

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                activity.getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.large_number, LargeNumFragment.newInstance(model.mTitle, model.mColor))
                        .addToBackStack(null)
                        .commit();
            }
        });
    }



}
