package com.inforcap.desafio3_validadorpassword;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inforcap.desafio3_validadorpassword.databinding.FragmentFirstBinding;
import com.inforcap.desafio3_validadorpassword.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =  FragmentSecondBinding.inflate(inflater, container, false);

        View view = binding.getRoot();

        return view;
    }
}