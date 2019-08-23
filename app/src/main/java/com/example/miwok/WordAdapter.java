package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
//      mColorResourceId = color;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView translateWordTextView = listItemView.findViewById(R.id.translateWord);
        translateWordTextView.setText(currentWord.getmDefaultTranslation());

        TextView miwokWordTextView = listItemView.findViewById(R.id.spanishWord);
        miwokWordTextView.setText(currentWord.getmSpanishTranslation());

        ImageView wordImageView = listItemView.findViewById(R.id.imageOfWord);
        if (currentWord.hasImage()) {
            wordImageView.setVisibility(View.VISIBLE);
            wordImageView.setImageResource(currentWord.getWordImage());
        }
        else
            wordImageView.setVisibility(View.GONE);

/*      TODO: Make it work! U need to add textContainer to xml.

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.textContainer);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
*/
        return listItemView;
    }
}
