package com.example.superuser.hometask1.ua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.superuser.hometask1.Config;
import com.example.superuser.hometask1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList mData;
    // переменная класа типа  ArrayList
    private RecyclerView mRecyclerView;
    // переменная класа типа  RecyclerView
    private MyAdapter mAdapter;
    // переменная класа типа  MyAdapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //вызывается при создании или перезапуска активности
        // принимает объект Bundle, содержащий состояние пользовательского интерфейса,
        //сохранённое в последнем вызове обработчика onSaveInstanceState.
        super.onCreate(savedInstanceState);
        //вызов родиельского метода содержащий состояние пользовательского интерфейса,
        //сохранённое в последнем вызове обработчика onSaveInstanceState.
        setContentView(R.layout.activity_main);
        // соединение разметки и активити
        Config data = new Config();
        //создание обьекта типа Config и получаем доступ к полям и методам класса
        mData = data.getPerson();
        //получаю весь список обьектов  персон
        mRecyclerView = (RecyclerView) findViewById(R.id.rcView_recycler);
        //подключить из макета
        mRecyclerView.setHasFixedSize(true);
//контекст не изменяется
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //создаем лояут  менеджер
        mRecyclerView.setLayoutManager(mLayoutManager);
        //задем лояут  менеджер
        mAdapter = new MyAdapter(this, mData);
        //создаем обьект адаптер(передает данные из )передаем контекси и ар.лист
        mRecyclerView.setAdapter(mAdapter);
        //вызываем адаптер

    }
}
