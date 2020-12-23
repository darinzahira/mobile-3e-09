package com.example.goodang.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.goodang.R;
import com.example.goodang.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private ProfileViewModel profileViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentProfileBinding fragmentProfileBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_profile,container,false);
        profileViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
        fragmentProfileBinding.setProfile(profileViewModel);

        Profile profile = new Profile("Toko Sejahtera", "sejahtera@gmail.com", "+62 85717171845", "Jln. Bandung No.42");
        profileViewModel.setProfile(profile);

        return fragmentProfileBinding.getRoot();
    }
}
