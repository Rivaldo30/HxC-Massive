package id.ac.uversrivaldo.hxc_massive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UbahProfilActivity extends AppCompatActivity {

    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah_profil);

        img1 = (ImageView) findViewById(R.id.btnBack);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(UbahProfilActivity.this, InformasiProfilActivity.class);
                startActivity(next);
            }
        });

    }
}