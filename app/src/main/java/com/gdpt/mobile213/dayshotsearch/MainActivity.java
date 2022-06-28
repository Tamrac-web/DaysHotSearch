package com.gdpt.mobile213.dayshotsearch;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {



    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        initView();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataManagers dataManagers = new DataManagers();




                OkHttpClient okHttpClient = new OkHttpClient();
                //2.创建Request对象，设置一个url地址,设置请求方式。
                Request request = new Request.Builder().url(dataManagers.getTOUTIAO_SEARCHurl()).method("GET",null).build();
                //3.创建一个call对象,参数就是Request请求对象
                Call call = okHttpClient.newCall(request);

                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {

                    }

                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                        String data = response.body().string();
                        Log.d("response",data);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textView.setText(data);
                            }
                        });

                    }
                });









            }
        });
    }






    private void initView() {
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
    }
}