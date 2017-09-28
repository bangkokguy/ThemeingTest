package android.development.bangkokguy.themeingtest;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static String TAG="MainActivity";
    boolean flip;
    TextView view;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //view = (TextView)findViewById(R.id.textView);
        intent = getIntent();
        flip = !intent.getBooleanExtra("flip", true);
        if(flip) {
            Log.d(TAG, "Packet 1");
            //view.setText("Packet 1");
            setTheme(R.style.Packet1_AppTheme);
        }
        else {
            Log.d(TAG, "Packet 2");
            //view.setText("Packet 2");
            setTheme(R.style.Packet2_AppTheme);
        }

        setContentView(R.layout.activity_main);


        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("flip", flip);
                recreate();
                //finish();
                //startActivity(intent);
            }
        });
        //this.getTheme().applyStyle(R.style.LayoutTheme, true);
    }

}
