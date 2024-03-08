package com.example.prakt3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        Bundle bundle = getArguments();
        if (bundle != null){
            String word = bundle.getString("Hello", "");
            TextView textView = view.findViewById(R.id.textView);
            textView.setText(word);
        }
        return view;
    }
}
