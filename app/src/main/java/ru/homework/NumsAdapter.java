package ru.homework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


class NumsAdapter extends RecyclerView.Adapter<NumsViewHolder> {

    List<TableModel> data = DataSource.getInstance().getRemoteData();

    @NonNull
    @Override
    public NumsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.table_item, parent, false);
        return new NumsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumsViewHolder holder, int position) {
        TableModel model = data.get(position);
        holder.bind(model);

//        holder.addButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {


    }



    @Override
    public int getItemCount() {
        return data.size();
    }

}
