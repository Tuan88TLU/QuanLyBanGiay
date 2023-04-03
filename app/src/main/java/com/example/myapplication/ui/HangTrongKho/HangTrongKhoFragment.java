package com.example.myapplication.ui.HangTrongKho;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentHangtrongkhoBinding;

public class HangTrongKhoFragment extends Fragment {

    private FragmentHangtrongkhoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HangTrongKhoViewModel slideshowViewModel =
                new ViewModelProvider(this).get(HangTrongKhoViewModel.class);

        binding = FragmentHangtrongkhoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHangtrongkho;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
