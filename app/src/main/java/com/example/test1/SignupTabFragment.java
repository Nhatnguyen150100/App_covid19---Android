package com.example.test1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText email, mobie_num, password, confirmPassword;
    Button createButton;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        email = root.findViewById(R.id.email);
        mobie_num = root.findViewById(R.id.mobile_num);
        password = root.findViewById(R.id.password);
        confirmPassword = root.findViewById(R.id.confirm_password);
        createButton = root.findViewById(R.id.createButton);

        email.setTranslationY(600);
        mobie_num.setTranslationY(600);
        password.setTranslationY(600);
        confirmPassword.setTranslationY(600);
        createButton.setTranslationY(600);

        email.setAlpha(v);
        mobie_num.setAlpha(v);
        password.setAlpha(v);
        confirmPassword.setAlpha(v);
        createButton.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        mobie_num.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(600).start();
        password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(600).start();
        confirmPassword.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(600).start();
        createButton.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}
