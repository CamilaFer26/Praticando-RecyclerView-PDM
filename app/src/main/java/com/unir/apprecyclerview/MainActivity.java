package com.unir.apprecyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editText;
    private RecyclerView recyclerView;
    private ArrayList<Usuario> list;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        list = new ArrayList<Usuario>();
        Adapter adapter = new Adapter(list);
        editText = findViewById(R.id.editText);
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
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(new Usuario(editText.getText().toString(), R.mipmap.ic_launcher_avatar));
                adapter.notifyDataSetChanged();
                editText.setText("");
            }
        });

        adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, list.get(position).getNome(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(int position) {
                Toast.makeText(MainActivity.this, "Usuário removido: " + list.get(position).getNome(), Toast.LENGTH_SHORT).show();
                list.remove(position);
                adapter.notifyItemRemoved(position);
            }
        });

    }
}