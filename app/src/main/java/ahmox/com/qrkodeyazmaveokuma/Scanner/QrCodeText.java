package ahmox.com.qrkodeyazmaveokuma.Scanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ahmox.com.qrkodeyazmaveokuma.R;

public class QrCodeText extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr_code_text);

        String deger = getIntent().getExtras().getString("text");

        text = (TextView) findViewById(R.id.text3);

        text.setText(deger);


    }
}
