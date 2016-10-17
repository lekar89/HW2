package com.example.superuser.hometask1.ua;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.superuser.hometask1.R;
import com.example.superuser.hometask1.model.Person;

import java.util.ArrayList;

/**
 * Created by SuperUser on 17.09.2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PersonViewHolder> {
    private Context mContext;
    // переменная класа типа  Context объект, который предоставляет доступ к базовым функциям приложения
    private ArrayList mPersonData;
    // переменная класа типа ArrayList

    public MyAdapter(Context mContext, ArrayList mPersonData) {
        this.mContext = mContext;
        this.mPersonData = mPersonData;
    }
    // конструктор инициализируем  mContext и  mPersonData при создании обьекта
    static class PersonViewHolder extends RecyclerView.ViewHolder {
//вложеный клас ViewHolder
        TextView mNameTV;
        // переменная класа типа TextView

        public PersonViewHolder(View itemView) {
            super(itemView);

            this.mNameTV = (TextView) itemView.findViewById(R.id.txt_name_person);

        }
    }
///клас соединяет mNameTV с полем в разметке item
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        //создаем представление из item
        PersonViewHolder personViewHolder = new PersonViewHolder(view);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person person = (Person) mPersonData.get(position);
        holder.mNameTV.setText(person.getmName());
        // передача информации в пердстваление(вью )  модели
    }

    @Override
    public int getItemCount() {
        return mPersonData.size();
    }
}
