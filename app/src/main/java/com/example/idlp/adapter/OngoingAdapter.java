package com.example.idlp.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.idlp.R;
import com.example.idlp.model.OngoingModel;
import com.example.idlp.model.subjectsModel;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class OngoingAdapter extends RecyclerView.Adapter<OngoingAdapter.viewHolder> {
    Context context;
    ArrayList<OngoingModel> arrayList=new ArrayList<>();

    public OngoingAdapter(Context context, ArrayList<OngoingModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.ongoing_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        OngoingModel model=arrayList.get(position);
        holder.subjectName.setText(arrayList.get(position).getSubjectName());
        if (arrayList.get(position).hasStarted())
        {
            holder.startReading.setVisibility(View.GONE);
            holder.progressBar.setVisibility(View.VISIBLE);
            holder.progressBar.isIndeterminate();
            holder.progressBar.setProgress(model.getProgress());
            holder.progressBar.setProgressTintList(ColorStateList.valueOf(ContextCompat.getColor(context,R.color.purple_700)));




//            holder.enrollButton.setEnabled(false);
        }
        else {
            holder.startReading.setVisibility(View.VISIBLE);
            holder.progressBar.setVisibility(View.GONE);

        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView subjectName;
        Button startReading;
        ProgressBar progressBar;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            subjectName=itemView.findViewById(R.id.subjectName);
            startReading=itemView.findViewById(R.id.startSubjects);
            progressBar=itemView.findViewById(R.id.progressBar);

        }
    }
}
