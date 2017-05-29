package org.sawhers.altafhussain.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import static org.sawhers.altafhussain.picasso.R.id.iv_download_imageTwo;

public class MainActivity extends AppCompatActivity {
    Button btn_imageDownload,btn_Glide;
    ImageView ivImageDownload,ivImageDownloadTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_imageDownload= (Button) findViewById(R.id.btn_imgDownlod);
        ivImageDownload= (ImageView) findViewById(R.id.iv_download_image);
        btn_Glide= (Button) findViewById(R.id.btn_imgDownlodTWO);

        btn_imageDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url="https://www.800florals.com/img/TW511.jpg";
                Picasso.with(MainActivity.this).load(url).into(ivImageDownload);
            }
        });
        btn_Glide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivImageDownloadTwo= (ImageView) findViewById(iv_download_imageTwo);
                String url="https://www.800florals.com/img/TW511.jpg";
                Glide.with(MainActivity.this).load(url).into(ivImageDownloadTwo);
            }
        });
    }


}
