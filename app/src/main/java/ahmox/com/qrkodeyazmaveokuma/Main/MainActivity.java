package ahmox.com.qrkodeyazmaveokuma.Main;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ahmox.com.qrkodeyazmaveokuma.Generator.GeneratorActivity;
import ahmox.com.qrkodeyazmaveokuma.Scanner.QrCamera;
import ahmox.com.qrkodeyazmaveokuma.R;

public class MainActivity extends AppCompatActivity {
    Button btn_tara,btn_olustur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED) {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 1);
            }
        }

        btn_tara = (Button) findViewById(R.id.tara_btn);
        btn_olustur=(Button) findViewById(R.id.olustur_btn);

        btn_tara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ıntent = new Intent(getApplicationContext(), QrCamera.class);
                startActivity(ıntent);

            }
        });
        btn_olustur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ıntent = new Intent(getApplicationContext(), GeneratorActivity.class);
                startActivity(ıntent);

            }
        });
    }
}
