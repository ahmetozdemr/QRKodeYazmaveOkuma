package ahmox.com.qrkodeyazmaveokuma.Scanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.zxing.Result;

import ahmox.com.qrkodeyazmaveokuma.R;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class QrCamera extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    private ZXingScannerView mScannerView;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr_camera);

        text = (TextView) findViewById(R.id.text);

        mScannerView = new ZXingScannerView(this);
        setContentView(mScannerView);
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }


    @Override
    protected void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result result) {
        Intent intent = new Intent(this, QrCodeText.class);
        intent.putExtra("text",result.getText());
        this.startActivity(intent);
        finish();
    }
}