package br.com.hugaolanches.holders;


import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.hugaolanches.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public final class CategoryHolder extends ViewHolder {
    @BindView(R.id.txtnome) public TextView txtnome;

    public CategoryHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.item_category, parent, false));
        ButterKnife.bind(this, itemView);
    }
}
