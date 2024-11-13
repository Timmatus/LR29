package com.mgke.lr29;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.fragment.app.ListFragment;

public class PastaFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String[] pasta = {"Спагетти", "Лазанья"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, pasta);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}