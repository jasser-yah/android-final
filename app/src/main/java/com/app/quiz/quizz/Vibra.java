package com.app.quiz.quizz;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Vibra extends AppCompatActivity {

    private Button v1, v2, v3,resetjeu;
    private Vibrator vibrator;
    public ImageView play, pause, vibration, svibration, reset;
    MediaPlayer mp;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client3;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibra);
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        mp = MediaPlayer.create(this, R.raw.tokyo );

        v1 = (Button) findViewById(R.id.vib);
        v2 = (Button) findViewById(R.id.ry);
        v3 = (Button) findViewById(R.id.sv);
        resetjeu = (Button) findViewById(R.id.resetjeu);

        resetjeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
            }
        });

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(1000);
            }
        });

        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long[] pattern = {250, 500};
                vibrator.vibrate(pattern, 0);
            }
        });

        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.cancel();
            }
        });

        svibration =  (ImageView) findViewById(R.id.vib2);
        svibration.setOnClickListener(new View.OnClickListener()

                                     {
                                         @Override
                                         public void onClick(View v) {
                                             vibrator.cancel();

                                         }
                                     }

        );

        reset =  (ImageView) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener()

                                      {
                                          @Override
                                          public void onClick(View v) {
                                              restart();

                                          }
                                      }

        );


        vibration = (ImageView) findViewById(R.id.vibration);

        vibration.setOnClickListener(new View.OnClickListener()

                                {
                                    @Override
                                    public void onClick(View v) {
                                        vibrator.vibrate(1000);
                                    }
                                }

        );

        play = (ImageView) findViewById(R.id.Play);

        play.setOnClickListener(new View.OnClickListener()

                                {
                                    @Override
                                    public void onClick(View v) {
                                        onResume();
                                    }
                                }

        );


        pause = (ImageView) findViewById(R.id.Pause);

        pause.setOnClickListener(new View.OnClickListener()

                                 {
                                     @Override
                                     public void onClick(View v) {
                                         onPause();
                                     }
                                 }

        );




        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client4 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }




    public void restart(){
       /* Intent intent = new Intent(this, Options.class);
        this.startActivity(intent);
        this.finishAffinity();*/
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }



    protected void onPause() {
        super.onPause();
        mp.pause();
    }

    protected void onResume() {
        super.onResume();
        mp.start();
    }



    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client4.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Vibra Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.app.quiz.quizz/http/host/path")
        );
        AppIndex.AppIndexApi.start(client4, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Vibra Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.app.quiz.quizz/http/host/path")
        );
        AppIndex.AppIndexApi.end(client4, viewAction);
        client4.disconnect();
    }
}

