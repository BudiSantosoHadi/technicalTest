package com.example.soal_01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.soal_01.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFormtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdialogtest();
            }
        });
    }

    private void showdialogtest(){
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.from);
        dialog.setCancelable(true);

        EditText edtusername =  dialog.findViewById(R.id.edt_username);
        EditText edtemail = dialog.findViewById(R.id.edt_email);
        EditText edtpassword = dialog.findViewById(R.id.edt_password);
        Button btntest = dialog.findViewById(R.id.btntest);

        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtusername.getText().toString().trim();
                String email = edtemail.getText().toString().trim();
                String password = edtpassword.getText().toString().trim();


                if (username.isEmpty()){
                    edtusername.setError("tidak boleh kosong");
                }
                if (email.isEmpty()){
                    edtemail.setError("tidak boleh kosong!!");
                }
                if (password.length()> 8) {
                    edtpassword.setError("harus 8 karakter saja!!");
                }
                else{

                }

            }

        });
        dialog.show();
    }
}