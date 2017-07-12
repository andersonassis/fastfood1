package br.com.hugaolanches.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import br.com.hugaolanches.holders.CategoryHolder;
import br.com.hugaolanches.models.Category;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryHolder> {
    private List<Category> lista;
    private Context context;

    public CategoryAdapter(Context context, List<Category> lista) {
        this.lista      = lista;
        this.context    = context;
    }

    @Override
    public CategoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategoryHolder(LayoutInflater.from(parent.getContext()), parent);
    }
    @Override
    public void onBindViewHolder(CategoryHolder holder, int i) {
        Category objeto = lista.get(i);

        holder.txtnome.setText(objeto.getName());
    }

    @Override
    public int getItemCount() {
        return (null != lista ? lista.size() : 0 );
    }
}
