package id.ac.uversrivaldo.hxc_massive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class InformasiProfilActivity extends AppCompatActivity {

    ImageView btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_profil);

        btn1 = (ImageView) findViewById(R.id.infoBack);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent next = new Intent(InformasiProfilActivity.this, PengaturanActivity.class);
                startActivity(next);

            }
        });

    }
}