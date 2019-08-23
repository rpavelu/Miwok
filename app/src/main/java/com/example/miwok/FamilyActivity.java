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
        words.add(new Word("Отец", "Padre", R.drawable.family_father));
        words.add(new Word("Мать", "Madre", R.drawable.family_mother));
        words.add(new Word("Сын", "Hijo", R.drawable.family_son));
        words.add(new Word("Дочь", "Hija", R.drawable.family_daughter));
        words.add(new Word("Старший брат", "Hermano mayor", R.drawable.family_older_brother));
        words.add(new Word("Младший брат", "Hermano menor", R.drawable.family_younger_brother));
        words.add(new Word("Старшая сестра", "Hermana mayor", R.drawable.family_older_sister));
        words.add(new Word("Младшая сестра", "Hermana menor", R.drawable.family_younger_sister));
        words.add(new Word("Бабушка", "Abuela", R.drawable.family_grandmother));
        words.add(new Word("Дедушка", "Abuelo", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.wordList);
        listView.setAdapter(adapter);
    }

}
