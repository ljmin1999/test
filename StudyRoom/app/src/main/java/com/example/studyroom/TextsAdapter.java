package com.example.studyroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.studyroom.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class TextsAdapter extends ArrayAdapter<Texts> {
    private Context mContext;
    private List<Texts> threadList = new ArrayList<>();

    public TextsAdapter(Context context, ArrayList<Texts> list){
        super(context,0,list);
        mContext = context;
        threadList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.listview_activity,parent,false);
        Texts currentTexts = threadList.get(position);
        TextView title = listItem.findViewById(R.id.threadTitle);
        title.setText(currentTexts.getThreadTitle());

        TextView text = listItem.findViewById(R.id.threadText);
        text.setText(currentTexts.getThreadText());
        return listItem;
    }
}
