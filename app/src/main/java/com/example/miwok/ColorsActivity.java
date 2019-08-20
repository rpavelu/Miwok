package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Красный", "Tinto"));
        words.add(new Word("Оранжевый", "Naranja"));
        words.add(new Word("Желтый", "Amarillo"));
        words.add(new Word("Зеленый", "Pista"));
        words.add(new Word("Голубой и синий", "Azul"));
        words.add(new Word("Серый", "Canoso"));
        words.add(new Word("Чёрный", "Ennegrecer"));
        words.add(new Word("Белый", "Blanco"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.wordList);
        listView.setAdapter(adapter);
    }
}
