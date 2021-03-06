package com.example.shenron.delhitour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{
    /*
    * Resource ID for the background color for this list of words
    * */
    private int mColorResourceId;



    public WordAdapter(Activity context, ArrayList<Word> words,int ColorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = ColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);

        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        placeTextView.setText(currentWord.getmPlace());

        // Find the TextView in the list.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the version number from the current AndroidFlavor object and
        defaultTextView.setText(currentWord.getmIntroDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        imageView.setImageResource((currentWord.getmImageResourceId()));

        View textContainer = listItemView.findViewById(R.id.list_item_view);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
