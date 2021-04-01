package com.example.global_ndp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtThongTin;
    Button btnXacNhan;
    EditText edtTen, edtEmail, edtSdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();


        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten, email, sdt;
                hoten = edtTen.getText().toString();
                email = edtEmail.getText().toString();
                sdt = edtSdt.getText().toString();

                // chuyển đổi ngôn ngữ
                String textChaoBan = getResources().getString(R.string.txt_ChaoBan);
                String txtEmail = getResources().getString(R.string.text_Email);
                String txtSoDienThoai = getResources().getString(R.string.text_Sodienthoai);

                txtThongTin.setText(textChaoBan + hoten + "\n" + txtEmail + email + "\n" + txtSoDienThoai + sdt);
            }
        });


    }

    private void Anhxa()
    {
        txtThongTin = (TextView) findViewById(R.id.textViewthongtin);
        btnXacNhan = (Button) findViewById(R.id.button);
        edtTen = (EditText) findViewById(R.id.editTexthoten);
        edtEmail = (EditText) findViewById(R.id.editTextemail);
        edtSdt = (EditText) findViewById(R.id.editTextsdt);
    }
}