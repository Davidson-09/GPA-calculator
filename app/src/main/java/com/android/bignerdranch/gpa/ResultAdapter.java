package com.android.bignerdranch.gpa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultHolder>{

    private ArrayList<Course> courses;

    public ResultAdapter(Context c, ArrayList<Course> courses) {
        this.courses = courses;
    }

    @NonNull
    @Override
    public ResultHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.result_item, parent, false);
        return new ResultHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultHolder holder, int position) {

        holder.courseCode.setText(courses.get(position).getCourseCode());
        holder.creditLoad.setText(courses.get(position).getCreditLoad());
        holder.grade.setText(courses.get(position).getGrade());

    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    class ResultHolder extends RecyclerView.ViewHolder{

        TextView courseCode;
        TextView creditLoad;
        TextView grade;

        public ResultHolder(@NonNull View itemView) {
            super(itemView);
            courseCode = itemView.findViewById(R.id.course_code);
            creditLoad = itemView.findViewById(R.id.credit_load);
            grade = itemView.findViewById(R.id.course_grade);
        }
    }
}
