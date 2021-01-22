package fr.justin.andikwashuleni1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPain extends AppCompatActivity {
    private Button justin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pain);

        this.justin = (Button) findViewById(R.id.justin);
        justin.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), canevas.class);
                startActivity(otherActivity);

            }

        });
    }
}