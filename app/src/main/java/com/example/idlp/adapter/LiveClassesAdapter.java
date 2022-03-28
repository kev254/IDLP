package com.example.idlp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.idlp.R;
import com.example.idlp.model.liveClassesModel;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class LiveClassesAdapter extends RecyclerView.Adapter<LiveClassesAdapter.viewHolder> {
    Context context;
    ArrayList<liveClassesModel> arrayList=new ArrayList<>();

    public LiveClassesAdapter(Context context, ArrayList<liveClassesModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.live_classes_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.subjectName.setText(arrayList.get(position).getSubjectName());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView subjectName;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            subjectName=itemView.findViewById(R.id.subjectName);

        }
    }
}
