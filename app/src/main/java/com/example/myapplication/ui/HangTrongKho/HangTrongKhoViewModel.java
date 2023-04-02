package com.example.myapplication.ui.HangTrongKho;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HangTrongKhoViewModel extends ViewModel {
    private final MutableLiveData<String> mText ;

    public HangTrongKhoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Danh sách hàng trong kho");
    }



    public LiveData<String> getText() {
        return mText;
    }
}
