package defiyarto.dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;




public class MainActivity extends AppCompatActivity {
    // deklarasi tombol
    private ImageButton mButton, mButton2,mButton3,mButton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisial tombol
        mButton = (ImageButton) findViewById(R.id.Button);
        mButton2=(ImageButton) findViewById(R.id.Button2);
        mButton3=(ImageButton) findViewById(R.id.Button3);
        mButton4=(ImageButton) findViewById(R.id.Button4);

        // function tombol
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iButton = new Intent(getApplicationContext(),Activity_second.class);
                startActivity(iButton);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iButton2 = new Intent(getApplicationContext(), gallery.class);
                startActivity(iButton2);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iButton3 = new Intent(getApplicationContext(), peta.class);
                startActivity(iButton3);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iButton4 = new Intent(getApplicationContext(),Tentang.class);
                startActivity(iButton4);
            }
        });
    }
}