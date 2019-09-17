package com.example.hak_bt1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<ContactModel> listContact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Bước 1: Tạo data
        initData();

        //Bước 2: Tạo adapter ở ví dụ này chúng ta tự tạo một Adapter không phụ thuộc vào Adapter có sẵn
        ContactAdapter adapter = new ContactAdapter(listContact, this);

        //Bước 3: Tạo ListView Sét adapter vào ListView
        lvContact = (ListView) findViewById(R.id.lv_contact);
        lvContact.setAdapter(adapter);

        //Bắt sự kiện click vào ListView  dòng bao nhiêu nhận biết thông qua position
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContactModel contactModel = listContact.get(position);
                Toast.makeText(MainActivity.this, contactModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void initData() {
        listContact.add(new ContactModel("Ky Duyen", "1990", R.drawable.avatar1));
        listContact.add(new ContactModel("Dang Thu Thao", "1995", R.drawable.avatar2));
        listContact.add(new ContactModel("Nguyen Thi Huyen", "1989", R.drawable.avatar3));
        listContact.add(new ContactModel("Thanh Huyen", "1972", R.drawable.avatar4));

    }

}

