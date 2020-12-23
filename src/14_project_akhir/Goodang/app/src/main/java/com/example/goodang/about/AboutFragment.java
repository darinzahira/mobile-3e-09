package com.example.goodang.about;

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
import com.example.goodang.databinding.FragmentAboutBinding;

public class AboutFragment extends Fragment {

    private AboutViewModel aboutViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentAboutBinding fragmentAboutBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false);
        aboutViewModel = new ViewModelProvider(this).get(AboutViewModel.class);
        fragmentAboutBinding.setAbout(aboutViewModel);

        About about = new About("Darin Zahira", "zahiradarin@gmail.com", "+62 85717171845", "darinzahira");
        aboutViewModel.setAbout(about);

        return fragmentAboutBinding.getRoot();
    }
}
