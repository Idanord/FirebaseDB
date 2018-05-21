package com.example.will.firebasedb;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by Will on 5/20/2018.
 */

public class Database extends Application {

    @Override
    public void onCreate(){
        Firebase.setAndroidContext(this);
    }
}
