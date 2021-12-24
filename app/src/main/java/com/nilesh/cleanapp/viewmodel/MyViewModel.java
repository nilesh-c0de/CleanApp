package com.nilesh.cleanapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MyViewModel extends AndroidViewModel {

    MutableLiveData<String> text = new MutableLiveData<>();


    public MyViewModel(@NonNull Application application) {
        super(application);
    }

    public void setText(MutableLiveData<String> text) {
        text.setValue("lol");
    }

    public MutableLiveData<String> getText() {
        return text;
    }

    public void updateText() {
        text.setValue("updated");
    }
}