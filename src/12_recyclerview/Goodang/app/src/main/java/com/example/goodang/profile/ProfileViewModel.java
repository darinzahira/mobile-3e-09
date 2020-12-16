package com.example.goodang.profile;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {

    public MutableLiveData<Profile> profile = new MutableLiveData<>();

    public void setProfile(Profile profile) {
        this.profile.setValue(profile);
    }
}
