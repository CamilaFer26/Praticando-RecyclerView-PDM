package com.unir.apprecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.unir.apprecyclerview.model.Cachorro;
import com.unir.apprecyclerview.model.CachorroData;

import java.util.ArrayList;

public class ActivityListagem extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Cachorro> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listagem);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        list = CachorroData.getCachorros();
        Adapter adapter = new Adapter(list);
        recyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
         /*
        int numeroDeColunas = 2; // quantas colunas você quer na grade
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), numeroDeColunas);

        int numeroDeColunas = 2;
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(
                numeroDeColunas,
                StaggeredGridLayoutManager.VERTICAL
        );
        */
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(ActivityListagem.this, ActivityInfo.class);
                intent.putExtra("dog_data", list.get(position));
                startActivity(intent);

            }

            @Override
            public void onItemLongClick(int position) {
                Toast.makeText(ActivityListagem.this, "Dog removido: " + list.get(position).getNome(), Toast.LENGTH_SHORT).show();
                list.remove(position);
                adapter.notifyItemRemoved(position);
            }
        });
    }
}