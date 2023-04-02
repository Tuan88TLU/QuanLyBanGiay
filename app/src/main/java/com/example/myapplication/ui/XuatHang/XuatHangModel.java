package com.example.myapplication.ui.XuatHang;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class XuatHangModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public XuatHangModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Xuất hàng và danh sách xuất");
    }

    public LiveData<String> getText() {
        return mText;
    }
}