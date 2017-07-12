package br.com.hugaolanches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.orm.SugarRecord;

import java.util.List;

import br.com.hugaolanches.adapters.CategoryAdapter;
import br.com.hugaolanches.models.Category;
import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryActivity extends AppCompatActivity implements
        ValueEventListener {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference data_reference;


    private List<Category> lista;
    private Gson gson;


    private CategoryAdapter adaptador;
    @BindView(R.id.recyclerView)
    RecyclerView view_reciclada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Escolhar a Categoria");

        ButterKnife.bind(this);
        data_reference = database.getReference().child("categories");
        data_reference.addValueEventListener(this);
    }

    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
            Category objeto = snapshot.getValue(Category.class);
//            lista.add(objeto);
            Log.d("categorias", objeto.toString());
        }

        gson     = new Gson();
        gson.toJson(lista);

        adaptador = new CategoryAdapter(view_reciclada.getContext(), lista);
        view_reciclada.setAdapter(adaptador);
        view_reciclada.setHasFixedSize(true);
        view_reciclada.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                                            LinearLayoutManager.VERTICAL, false));

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {
        Log.w("RETORNO", "loadPost:onCancelled", databaseError.toException());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
