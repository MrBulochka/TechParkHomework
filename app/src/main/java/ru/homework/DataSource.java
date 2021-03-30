package ru.homework;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private final ArrayList<Integer> mData;
    private static DataSource sInstance;
    public static int defoultNums = 100;
    
    private static int[] mColors = new int[]{
            Color.RED,
            Color.BLUE
    };

    public DataSource() {
        mData = new ArrayList<>();
        int number;

        for (int i = 0; i < defoultNums; i++) {
            number = i + 1;

        mData.add(number);
        }
    }

    public ArrayList<Integer> getRemoteData() {

        return mData;
    }

    public synchronized static DataSource getInstance() {
        if (sInstance == null) {
            sInstance = new DataSource();
        }
        return sInstance;
    }

    public static int getColor(int number) {
        if (number % 2 == 0)
            return mColors[0];
        else
            return mColors[1];
    }
}
