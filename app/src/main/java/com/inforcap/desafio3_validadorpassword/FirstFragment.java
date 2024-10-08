package com.inforcap.desafio3_validadorpassword;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.inforcap.desafio3_validadorpassword.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private Button buttonValidacion;
    private TextInputEditText password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =  FragmentFirstBinding.inflate(inflater, container, false);

        View view = binding.getRoot();

        buttonValidacion = binding.buttonValidacion;
        password = binding.textInputEditTextPassword;

        buttonValidacion.setEnabled(false);

        registrarListener();

        return view;
    }

    private void registrarListener() {

        binding.buttonValidacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = String.valueOf(binding.textInputEditTextPassword.getText());
                Toast.makeText(getContext(),"La contraseña ingresada es: " + password,Toast.LENGTH_SHORT).show();
                Navigation.findNavController(getView()).navigate(R.id.action_firstFragment_to_secondFragment);
            }
        });

        binding.textInputEditTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String password = charSequence.toString();
                if (password.length() >= 5 && !password.toLowerCase().equals(password)){
                    binding.buttonValidacion.setEnabled(true);
                }
                else {
                    binding.buttonValidacion.setEnabled(false);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}