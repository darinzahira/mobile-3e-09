package com.example.goodang.about;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {

    public MutableLiveData<About> about = new MutableLiveData<>();

    public void setAbout(About about) {
        this.about.setValue(about);
    }
}
