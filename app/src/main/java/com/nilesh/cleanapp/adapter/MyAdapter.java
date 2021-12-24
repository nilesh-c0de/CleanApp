package com.nilesh.cleanapp.adapter;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.nilesh.cleanapp.R;
import com.nilesh.cleanapp.databinding.ItemUserLayoutBinding;
import com.nilesh.cleanapp.model.User;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    // change type here
    List<User> myItemList;
    Context context;

    public MyAdapter(List<User> myItemList, Context context) {
        this.myItemList = myItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemUserLayoutBinding binding;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = DataBindingUtil.inflate(inflater, R.layout.item_user_layout, parent, false);
        return new ViewHolder(binding);

      //  binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_user_layout, parent, false);

      //  return new ViewHolder(binding.getRoot());
        // change layout here
     //   View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_layout, parent, false);
       // return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        User user = myItemList.get(position);
        holder.setBinding(user);
    }

    @Override
    public int getItemCount() {
        return myItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ItemUserLayoutBinding binding;

        public ViewHolder(ItemUserLayoutBinding binding) {
            super(binding.getRoot());

            this.binding =binding;
        }
        void setBinding(User user) {
            binding.setUser(user);
            binding.executePendingBindings();
        }
    }
}
