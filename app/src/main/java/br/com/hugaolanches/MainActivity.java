package br.com.hugaolanches;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btcategorias) Button btcategoria;
    int numero=1,numero2=2,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        result = numero + numero2;//teste de commit
    }

    @OnClick(R.id.btcategorias) void abreCategoria(){
        startActivity(new Intent(MainActivity.this, CategoryActivity.class));
    }




}
