package ru.homework;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LargeNumFragment extends Fragment {
    private static final String EXTRA_NUMBER = "number";
    private static final String EXTRA_COLOR = "color";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.large_num_fragment, container, false);
        TextView textView = view.findViewById(R.id.large_number);
        String text = getArguments().getString(EXTRA_NUMBER);
        int color = getArguments().getInt("color");
        textView.setTextColor(color);

        textView.setText(text);
        return view;
    }
        // метод для передачи параметров во фрагмент
    public static LargeNumFragment newInstance(String num, int color) {
        LargeNumFragment fragment = new LargeNumFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_NUMBER, num);
        bundle.putInt(EXTRA_COLOR, color);
        fragment.setArguments(bundle);
        return fragment;
    }
}
