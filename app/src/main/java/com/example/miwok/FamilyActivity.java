package com.example.miwok;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Отец", "Padre"));
        words.add(new Word("Мать", "Madre"));
        words.add(new Word("Сын", "Hijo"));
        words.add(new Word("Дочь", "Hija"));
        words.add(new Word("Старший брат", "Hermano mayor"));
        words.add(new Word("Младший брат", "Hermano menor"));
        words.add(new Word("Старшая сестра", "Hermana mayor"));
        words.add(new Word("Младшая сестра", "Hermana menor"));
        words.add(new Word("Бабушка", "Abuela"));
        words.add(new Word("Дедушка", "Abuelo"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.wordList);
        listView.setAdapter(adapter);
    }

}
