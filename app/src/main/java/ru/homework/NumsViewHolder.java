package ru.homework;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
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
            public void onClick(View v) {

            }
        });
    }



}
