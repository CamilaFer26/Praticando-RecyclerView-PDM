package com.unir.apprecyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.unir.apprecyclerview.model.Cachorro;

public class ActivityInfo extends AppCompatActivity {
    TextView txtNome;
    TextView txtRaca;
    TextView txtDetails;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtNome = findViewById(R.id.textNome);
        txtRaca = findViewById(R.id.textRaca);
        txtDetails = findViewById(R.id.textDetails);
        img = findViewById(R.id.imageView);

        Cachorro dog = (Cachorro) getIntent().getSerializableExtra("dog_data");
        if(dog != null){
            txtNome.setText(dog.getNome());
            txtRaca.setText(dog.getRaca());
            txtDetails.setText(dog.getDescricao());
            Glide.with(this).load(dog.getImagem()).into(img);
        }
    }
}