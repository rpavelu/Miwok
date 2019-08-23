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
        words.add(new Word("Один", "Uno", R.drawable.number_one));
        words.add(new Word("Два", "Dos", R.drawable.number_two));
        words.add(new Word("Три", "Tres", R.drawable.number_three));
        words.add(new Word("Четыре", "Cuatro", R.drawable.number_four));
        words.add(new Word("Пять", "Cinco", R.drawable.number_five));
        words.add(new Word("Шесть", "Seis", R.drawable.number_six));
        words.add(new Word("Семь", "Siete", R.drawable.number_seven));
        words.add(new Word("Восемь", "Ocho", R.drawable.number_eight));
        words.add(new Word("Девять", "Nueve", R.drawable.number_nine));
        words.add(new Word("Десять", "Diez", R.drawable.number_ten));

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
