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
        words.add(new Word("Красный", "Tinto", R.drawable.color_red));
        words.add(new Word("Оранжевый", "Naranja", R.drawable.color_dusty_yellow));
        words.add(new Word("Желтый", "Amarillo", R.drawable.color_mustard_yellow));
        words.add(new Word("Зеленый", "Pista", R.drawable.color_green));
        words.add(new Word("Коричневый", "Marrón", R.drawable.color_brown));
        words.add(new Word("Серый", "Canoso", R.drawable.color_gray));
        words.add(new Word("Чёрный", "Ennegrecer", R.drawable.color_black));
        words.add(new Word("Белый", "Blanco", R.drawable.color_white));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.wordList);
        listView.setAdapter(adapter);
    }
}
