package com.example.urlopener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView url1 ;
    Button open ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url1 =findViewById(R.id.url);
        open =findViewById(R.id.open);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Opening", Toast.LENGTH_SHORT).show();
                String url = url1.getText().toString();
                gotourl(url);
            }
        });
    }

    private void gotourl(String urlText) {
        Uri uri = Uri.parse(urlText);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}