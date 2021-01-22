package fr.justin.andikwashuleni1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button clique_Acceuil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.clique_Acceuil = (Button) findViewById(R.id.clique_Acceuil);
        clique_Acceuil.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                Intent otherActivity = new Intent(getApplicationContext(), AcceuilPrincipale.class);
                startActivity(otherActivity);

            }

        });

    }
}