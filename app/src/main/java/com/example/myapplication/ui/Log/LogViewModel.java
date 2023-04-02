package com.example.myapplication.ui.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LogViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LogViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Đây là nơi đăng nhập đăng ký");
    }

    public LiveData<String> getText() {
        return mText;
    }
}