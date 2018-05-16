package com.gayratrakhimov.rxjava2course;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Observable;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Observable.just("Hello RxJava!")
                .subscribe(s -> Log.d("RxJavaTag", "accept: "+s));

    }

}
