package ru.homework;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private final List<TableModel> mData;
    private static DataSource sInstance;



    private int[] mColors = new int[]{
            Color.RED,
            Color.BLUE
    };

    public DataSource() {
        mData = new ArrayList<>();
        int color;
        int number;

        for (int i = 0; i < Constants.DEFOULT_NUMS; i++) {
            number = i + 1;
            String title = Integer.toString(number);
            if (number % 2 == 0)
                color = mColors[0];
            else
                color = mColors[1];
        mData.add(new TableModel(title, color));
        }
    }

    public List<TableModel> getRemoteData() {

        return mData;
    }

    public synchronized static DataSource getInstance() {
        if (sInstance == null) {
            sInstance = new DataSource();
        }
        return sInstance;
    }
}
