package com.example.myapplication.ui.NhapHang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentNhaphangBinding;

public class NhapHangFragment extends Fragment {

    private FragmentNhaphangBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NhapHangViewModel galleryViewModel =
                new ViewModelProvider(this).get(NhapHangViewModel.class);

        binding = FragmentNhaphangBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNhaphang;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}