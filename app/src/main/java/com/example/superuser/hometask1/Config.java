package com.example.superuser.hometask1;

import com.example.superuser.hometask1.model.Person;

import java.util.ArrayList;

/**
 * Created by SuperUser on 17.09.2016.
 */
public class  Config
{
    private static final String[] PERSON = {
            "Михаил Булгаков","Михаил Булгаков","Эрнест Хемингуей","Эрнест Хемингуей",
            "Энтони Берджес","Джорж Оруэлл","Вадим Гонцов",
            "Джорж Мартин","Братья Стругацкие","Братья Стругацкие",
            "Антон Чехов","Антон Чехов", "J R R Tolkien","J R R Tolkien","J R R Tolkien"};

    public ArrayList getPerson(){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i<PERSON.length; i++){
            arrayList.add(new Person().setmName(PERSON[i]));
        }
        return arrayList;
    }
}
