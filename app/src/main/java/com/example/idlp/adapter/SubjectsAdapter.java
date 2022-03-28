package com.example.idlp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.idlp.R;
import com.example.idlp.model.liveClassesModel;
import com.example.idlp.model.subjectsModel;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.viewHolder> {
    Context context;
    ArrayList<subjectsModel> arrayList=new ArrayList<>();

    public SubjectsAdapter(Context context, ArrayList<subjectsModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.subjects_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.subjectName.setText(arrayList.get(position).getSubjectName());
        if (arrayList.get(position).isEnrolled())
        {
            holder.enrollButton.setText("Enrolled");
            holder.enrollButton.setTextColor(ContextCompat.getColor(context,R.color.purple_700));
            holder.enrollButton.setBackgroundColor(ContextCompat.getColor(context,R.color.white));

//            holder.enrollButton.setEnabled(false);
        }
        else {
            holder.enrollButton.setText("Enroll");
            holder.enrollButton.setEnabled(true);

        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView subjectName;
        Button enrollButton;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            subjectName=itemView.findViewById(R.id.subjectName);
            enrollButton=itemView.findViewById(R.id.enrollButton);

        }
    }
}
