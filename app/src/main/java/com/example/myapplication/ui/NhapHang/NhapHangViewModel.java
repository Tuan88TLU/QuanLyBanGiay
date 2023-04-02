package com.example.myapplication.ui.NhapHang;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NhapHangViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NhapHangViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Nhập hàng và danh sách nhập");
    }

    public LiveData<String> getText() {
        return mText;
    }
}