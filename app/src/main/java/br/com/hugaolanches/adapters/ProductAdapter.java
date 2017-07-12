package br.com.hugaolanches.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import br.com.hugaolanches.holders.ProductHolder;
import br.com.hugaolanches.models.Product;


public class ProductAdapter extends RecyclerView.Adapter<ProductHolder> {
    private List<Product> lista;
    private Context context;

    public ProductAdapter(Context context, List<Product> lista) {
        this.lista      = lista;
        this.context    = context;
    }

    @Override
    public ProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductHolder(LayoutInflater.from(parent.getContext()), parent);
    }
    @Override
    public void onBindViewHolder(ProductHolder holder, int i) {
        Product objeto = lista.get(i);

        holder.txtnome.setText(objeto.getName());
    }

    @Override
    public int getItemCount() {
        return (null != lista ? lista.size() : 0 );
    }
}
