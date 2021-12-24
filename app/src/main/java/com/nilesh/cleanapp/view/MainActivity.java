package com.nilesh.cleanapp.view;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.nilesh.cleanapp.R;
import com.nilesh.cleanapp.adapter.MyAdapter;
import com.nilesh.cleanapp.databinding.ActivityMainBinding;
import com.nilesh.cleanapp.model.User;
import com.nilesh.cleanapp.viewmodel.MyViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding.setViewmodel(viewModel);
        binding.setLifecycleOwner(this);

        binding.setUser(new User(10, "nilesh"));

        viewModel.getText().setValue("lol");

        ArrayList<User> userArrayList = new ArrayList<>();

        userArrayList.add(new User(10, "nilesh"));
        userArrayList.add(new User(10, "shailesh"));
        userArrayList.add(new User(10, "umesh"));
        userArrayList.add(new User(10, "mahesh"));
        userArrayList.add(new User(10, "vishesh"));

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(new MyAdapter(userArrayList, this));

        
        String myName = "nilesh";

    }
}

