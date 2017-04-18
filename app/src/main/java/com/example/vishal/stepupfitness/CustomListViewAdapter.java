package com.example.vishal.stepupfitness;

/**
 * Created by Aahi on 2/26/2016.
 */
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewAdapter extends BaseExpandableListAdapter{

    private Context ctx;
    private ArrayList<DataProvider> dataProviders;
    private LayoutInflater inflater;

    public CustomListViewAdapter(Context ctx, ArrayList<DataProvider> dataProviders){

        this.ctx= ctx;
        this.dataProviders=dataProviders;
        inflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getGroupCount() {
        return dataProviders.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return dataProviders.get(groupPosition).exercise.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return dataProviders.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return dataProviders.get(groupPosition).exercise.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.week, null);
        }
        DataProvider d=(DataProvider)getGroup(groupPosition);

        TextView textView=(TextView)convertView.findViewById(R.id.textView3);
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView3);

        String name=d.getTitle();
        textView.setText(name);

        if (name=="Cable Crunch | 3 sets to failure| 60 seconds rest")
        {
            imageView.setImageResource(R.drawable.cablecrunch);
        }
        if (name=="Machine Bench Press| 4 sets, 10 reps| 2-minute rest")
        {
            imageView.setImageResource(R.drawable.machinebenchpress);
        }
        if (name=="Inclined Dumbell Press| 4 sets, 15, 12, 10, 8 reps| 2-minute rest ")
        {
            imageView.setImageResource(R.drawable.inclinedbenchpress);
        }
        if (name=="Weighted Bench Dip| 3 sets to failure| 60-second rest")
        {
            imageView.setImageResource(R.drawable.weightedbenchdip);
        }
        if (name=="Jackknife Sit Up| 3 sets to failure| 2-minute rest")
        {
            imageView.setImageResource(R.drawable.jacklift);
        }
        if (name=="Decline Reverse Crunch| 3 sets to failure, 2-minute rest")
        {
            imageView.setImageResource(R.drawable.declinereversecrunch);
        }
        if (name=="Smith Machine Bent Over Row | 4 sets, 10 reps, 2-minute rest ")
        {
            imageView.setImageResource(R.drawable.smithmachine);
        }
        if (name=="Pullups | 4 sets to failure, 2-minute rest "){
            imageView.setImageResource(R.drawable.puulups);
        }

        if (name=="Straight Arm Dumbell Pull Over| 3 sets, 12 reps, 2-minute rest")
        {
            imageView.setImageResource(R.drawable.straightarmpullover);
        }
        if (name=="Hyperextensions Weighted |3 sets to failure, 2-minute rest")
        {
            imageView.setImageResource(R.drawable.hyperextensions);
        }

        if (name=="Standing Dumbell Reverse Curl | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.standingdumbell);
        }
        if (name=="Hammer Curls | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.hammercurls);
        }
        if (name=="EZ Bar Curl | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.ezcurlbar);
        }
        if (name=="Reverse Grips Triceps Pushdown | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.reversegripstricepspushdown);
        }
        if (name=="Triceps Pushdown—Rope Attachment | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.tricepspushdown);
        }
        if (name=="Triceps Pushdown | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.tricepspushdown2);
        }
        if (name=="Incline Dumbbell Curl | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.dumbellinclined);
        }
        if (name=="Dumbbell Biceps Curl | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.dumbellbicepscurl);
        }
        if (name=="Preacher Curl | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.preachercurl);
        }
        if (name=="Seated Triceps Press | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.seatedtriceps);
        }
        if (name=="Lying Triceps Press | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.lyingtricepspress);
        }
        if (name=="Decline EZ-Bar Triceps Extension | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.declinezbartriceps);
        }
        if (name=="Barbell Squat | 1 set of 20 reps"){
            imageView.setImageResource(R.drawable.squatbarbell);
        }
        if (name=="BENT-ARM BARBELL PULLOVER | 1 set of 20 reps ")
        {
            imageView.setImageResource(R.drawable.squatbentarmpullover);
        }
        if (name=="STIFF-LEGGED BARBELL DEADLIFT | 1 set of 15 reps ")
        {
            imageView.setImageResource(R.drawable.squatstiffedlegbarbell);
        }
        if (name=="STANDING MILITARY PRESS | 3 sets of 6-8 reps")
        {
            imageView.setImageResource(R.drawable.squatstandingmilitary);

        }
        if (name=="DIPS - CHEST VERSION| 2 sets of 10 reps")
        {
            imageView.setImageResource(R.drawable.squadipschestversion);
        }

        convertView.setBackgroundColor(Color.LTGRAY);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView==null)
        {
            convertView=inflater.inflate(R.layout.exercise, null);
        }

        String child= (String)getChild(groupPosition, childPosition);
        TextView textView=(TextView)convertView.findViewById(R.id.textView2);
        textView.setText(child);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
