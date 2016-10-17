package com.example.superuser.hometask1.model;

/**
 * Created by SuperUser on 17.09.2016.
 */
public class Person
{
    private String mName;
    // переменная класа типа  String
    public Person(String mName)
    {
        this.mName = mName;
    }
// конструктор инициализируем  mName при создании обьекта
    public Person() {

    }

    public String getmName() {
        return mName;
    }
//гетер
    public Person setmName(String mName) {
        this.mName = mName;
        return this;
    }
    //сетер

}
