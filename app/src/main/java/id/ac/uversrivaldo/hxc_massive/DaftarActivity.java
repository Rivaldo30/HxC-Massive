package id.ac.uversrivaldo.hxc_massive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarActivity extends AppCompatActivity {

    ImageView daf;
    TextView masukT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        daf = (ImageView)findViewById(R.id.demail);
        masukT = findViewById(R.id.masukT);

        daf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarActivity.this, daftarr.class);
                startActivity(intent);

             //Pindah ke halaman daftar1

                    }
                });
            }


    public void goToMasuk1(View view) {
        Intent intent = new Intent(DaftarActivity.this, masuk.class);
        startActivity(intent);
    }
}
