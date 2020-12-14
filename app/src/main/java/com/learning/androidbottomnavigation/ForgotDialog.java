package com.learning.androidbottomnavigation;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import java.util.Objects;

public class ForgotDialog extends AppCompatDialogFragment {

    private EditText inputForgotMail;
    private Button cancelBtn, sendBtn;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = Objects.requireNonNull(getActivity()).getLayoutInflater();
        View view = inflater.inflate(R.layout.forgot_dialog, null);

        inputForgotMail = view.findViewById(R.id.inputForgotMail);
        sendBtn = view.findViewById(R.id.send_btn);
        cancelBtn = view.findViewById(R.id.cancel_btn);

        builder.setView(view);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        return builder.create();
    }

//    public interface ExampleDialogListener {
//
//    }
}
