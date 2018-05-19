package com.gayratrakhimov.rxjava2course.datasource;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.gayratrakhimov.rxjava2course.R;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObservableActivity extends AppCompatActivity {

    public static final String TAG = "RxJavaTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observable4);

        // Observable observable = Observable.just(3, 5, 2);
        Observable observable = Observable.range(1, 10);

        Observer observer = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "onSubscribe: ");
            }

            @Override
            public void onNext(Object o) {
                Log.d(TAG, "onNext: "+o);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: "+e.toString());
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: ");
            }
        };

        observable.subscribe(observer);

    }

}
