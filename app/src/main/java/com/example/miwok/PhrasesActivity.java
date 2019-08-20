package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Куда ты идешь?", "¿Adónde vas a ir?"));
        words.add(new Word("Как тебя зовут?", "¿Cómo te llamas?"));
        words.add(new Word("Меня зовут...", "Me llamo..."));
        words.add(new Word("Как ты себя чувствуешь?", "¿Cómo te sientes?"));
        words.add(new Word("Я чувствую себя хорошо", "Me siento muy bien"));
        words.add(new Word("Ты идешь?", "¿Vas a venir?"));
        words.add(new Word("Да, иду", "Sí, ya voy"));
        words.add(new Word("Иди сюда", "Ven aquí"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.wordList);
        listView.setAdapter(adapter);
    }
}
