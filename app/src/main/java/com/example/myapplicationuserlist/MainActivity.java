package com.example.myapplicationuserlist;


import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplicationuserlist.adapter.UserAdapter;
import com.example.myapplicationuserlist.model.UserModel;
import com.example.myapplicationuserlist.util.UserGenerator;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<UserModel> users;
    ListView userList;

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

        users = UserGenerator.generate(100);
        userList = findViewById(R.id.userList);

        UserAdapter userAdapter = new UserAdapter(this, R.layout.list_item, users);
        userList.setAdapter(userAdapter);

        userList.setOnItemClickListener((parent, view, position, id) -> {
            UserModel selected = (UserModel) parent.getItemAtPosition(position);
            Toast.makeText(
                    getApplicationContext(),
                    "Обрано: " + selected.getFirstName() + " " + selected.getLastName()
                            + ", " + selected.getAge() + " років",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}
