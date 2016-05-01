package com.app.quiz.quizz;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by acer on 06-Apr-16.
 */
public class Options extends Activity {
    Button btnhard,btnintermediate,btnsimple,btntime,btnuntime;
    public ImageView jouer,parametre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionsmenu);
       // btnhard = (Button) findViewById(R.id.btnhard);
        //btnsimple = (Button) findViewById(R.id.btnsimple);
       // btnintermediate = (Button) findViewById(R.id.btnintermediate);
       // btntime = (Button) findViewById(R.id.btntime);
       // btnuntime = (Button) findViewById(R.id.btnuntime);
        //btnsimple.setEnabled(false);



        jouer = (ImageView) findViewById(R.id.jouer);

        jouer.setOnClickListener(new View.OnClickListener()

                                     {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(Options.this,
                                                     NivActivity.class);
                                             startActivity(intent);
                                             finish();
                                         }
                                     }

        );

        parametre = (ImageView) findViewById(R.id.parametre);

        parametre.setOnClickListener(new View.OnClickListener()

                                 {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(Options.this,
                                                 Vibra.class);
                                         startActivity(intent);
                                         finish();
                                     }
                                 }

        );




    }


}