package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Один", "Uno"));
        words.add(new Word("Два", "Dos"));
        words.add(new Word("Три", "Tres"));
        words.add(new Word("Четыре", "Cuatro"));
        words.add(new Word("Пять", "Cinco"));
        words.add(new Word("Шесть", "Seis"));
        words.add(new Word("Семь", "Siete"));
        words.add(new Word("Восемь", "Ocho"));
        words.add(new Word("Девять", "Nueve"));
        words.add(new Word("Десять", "Diez"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.wordList);
        listView.setAdapter(adapter);

        //Если бы мы хотели делать LinearLayout
//        for (int i = 0; i < words.size(); i++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            //Добавляем созданный виджет текста на rootView
//            rootView.addView(wordView);
//        }
    }
}
