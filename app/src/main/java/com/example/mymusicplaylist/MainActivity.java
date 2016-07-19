package com.example.mymusicplaylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nation = (TextView) findViewById(R.id.nation);

// Set a click listener on that View
        nation.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the nation View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nationIntent = new Intent(MainActivity.this, NationActivity.class);
                startActivity(nationIntent);
            }
        });


        // Find the View that shows the loseYourself category
        TextView lose = (TextView) findViewById(R.id.loseYourself);

// Set a click listener on that View
        lose.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the loseYourself View is clicked on.
            @Override
            public void onClick(View view) {
                Intent loseIntent = new Intent(MainActivity.this, LoseActivity.class);
                startActivity(loseIntent);
            }
        });

        // Find the View that shows the drake category
        TextView drake = (TextView) findViewById(R.id.drake);

// Set a click listener on that View
        drake.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent drakeIntent = new Intent(MainActivity.this, DrakeActivity.class);
                startActivity(drakeIntent);
            }
        });

        // Find the View that shows the collapse category
        TextView collapse = (TextView) findViewById(R.id.collapse);

// Set a click listener on that View
        collapse.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the collapse View is clicked on.
            @Override
            public void onClick(View view) {
                Intent collapseIntent = new Intent(MainActivity.this, CollapseActivity.class);
                startActivity(collapseIntent);
            }
        });
    }


}
