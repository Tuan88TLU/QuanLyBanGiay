package com.example.myapplication.ui.XuatHang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentXuathangBinding;

public class XuatHangFragment extends Fragment {

    private FragmentXuathangBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        XuatHangModel homeViewModel =
                new ViewModelProvider(this).get(XuatHangModel.class);

        binding = FragmentXuathangBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textXuathang;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}