package com.apps.incredibleindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CardView cardView1,cardView2,cardView3;

    private Animation anim_from_bottom, anim_from_top, anim_from_left;

    private TextView tagLine1,tagLine2,tagLine3,tagLine4, tagLine5;

    private ImageView imageView;

    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(

                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS

        );

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );

        cardView1 = findViewById(R.id.card1);
        cardView2 = findViewById(R.id.card2);
        cardView3 = findViewById(R.id.card3);

        tagLine1 = findViewById(R.id.headline1);
        tagLine2 = findViewById(R.id.headline2);
        tagLine3 = findViewById(R.id.headline3);
        tagLine4 = findViewById(R.id.headline4);
        tagLine5 = findViewById(R.id.headline5);

        imageView = findViewById(R.id.imageView);

        searchView = findViewById(R.id.search_view);

        anim_from_bottom = AnimationUtils.loadAnimation(this,R.anim.anim_from_bottom);
        anim_from_top = AnimationUtils.loadAnimation(this,R.anim.anim_from_top);
        anim_from_left = AnimationUtils.loadAnimation(this,R.anim.anim_from_left);

        cardView1.setAnimation(anim_from_bottom);
        cardView2.setAnimation(anim_from_bottom);
        cardView3.setAnimation(anim_from_bottom);

        tagLine1.setAnimation(anim_from_top);
        tagLine2.setAnimation(anim_from_top);
        tagLine3.setAnimation(anim_from_top);
        tagLine4.setAnimation(anim_from_top);
        tagLine5.setAnimation(anim_from_top);

        imageView.setAnimation(anim_from_top);

        searchView.setAnimation(anim_from_left);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent detail_intent = new Intent(MainActivity.this,DetailActivity.class);
                startActivity(detail_intent);

            }
        });

    }
}