package com.tiger.hilt;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.tiger.hilt.binds.ChinaCar;
import com.tiger.hilt.provides.Dog;
import com.tiger.hilt.provides1.MadeInCN;
import com.tiger.hilt.provides1.MadeInUSA;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @MadeInCN
    @Inject
    ChinaCar chinaCar;

    @MadeInUSA
    @Inject
    ChinaCar usaCar;

    @Inject
    User user;

    @Inject
    Dog dog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user.setName("nihao");
        user.setAddress("长安大姐");
        user.setAge(100);

        System.out.println(user.toString());

        TextView viewById = findViewById(R.id.textview);

        viewById.setText(user.toString());
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        chinaCar.setName("-----------");

        chinaCar.getEngine().on();
        chinaCar.getEngine().off();

        System.out.println(chinaCar.toString());

        String name = dog.getName();
        Log.e("----------", "onCreate: " + name);

        String name1 = chinaCar.getName();
        String name2 = usaCar.getName();
        chinaCar.getEngine().off();
        chinaCar.getEngine().on();
        usaCar.getEngine().off();
        usaCar.getEngine().on();
    }
}