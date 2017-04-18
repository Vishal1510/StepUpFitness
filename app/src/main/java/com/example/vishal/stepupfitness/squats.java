package com.example.vishal.stepupfitness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by User on 5/6/2016.
 */
public class squats extends AppCompatActivity {
    private ArrayList<DataProvider> getData()
    {
        DataProvider squat1= new DataProvider("Barbell Squat | 1 set of 20 reps");
        squat1.exercise.add("To begin, stand straight with a dumbbell in each hand using a pronated grip (palms facing down). Your arms should be fully extended while your feet are shoulder width apart from each other. This is the starting position.\n" +
                "While holding the upper arms stationary, curl the weights while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a second as you squeeze the muscle.\n" +
                "Slowly begin to bring the dumbbells back to starting position as your breathe in.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Variations: You can also perform this movement using a straight bar or an E-Z attachment hooked to a low pulley. This variation seems to really provide a good contraction at the top of the movement.");
        DataProvider squat2= new DataProvider("BENT-ARM BARBELL PULLOVER | 1 set of 20 reps ");
        squat2.exercise.add("Stand up with your torso upright and a dumbbell on each hand being held at arms length. The elbows should be close to the torso.\n" +
                "The palms of the hands should be facing your torso. This will be your starting position.\n" +
                "Now, while holding your upper arm stationary, exhale and curl the weight forward while contracting the biceps. Continue to raise the weight until the biceps are fully contracted and the dumbbell is at shoulder level. Hold the contracted position for a brief moment as you squeeze the biceps. Tip: Focus on keeping the elbow stationary and only moving your forearm.\n" +
                "After the brief pause, inhale and slowly begin the lower the dumbbells back down to the starting position.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Variations: There are many possible variations for this movement. For instance, you can perform the exercise sitting down on a bench with or without back support and you can also perform it by alternating arms; first lift the right arm for one repetition, then the left, then the right, etc.");
        DataProvider squat3=new DataProvider("STIFF-LEGGED BARBELL DEADLIFT | 1 set of 15 reps ");
        squat3.exercise.add("Stand up straight while holding an EZ curl bar at the wide outer handle. The palms of your hands should be facing forward and slightly tilted inward due to the shape of the bar. Keep your elbows close to your torso. This will be your starting position.\n" +
                "Now, while keeping your upper arms stationary, exhale and curl the weights forward while contracting the biceps. Focus on only moving your forearms.\n" +
                "Continue to raise the weight until your biceps are fully contracted and the bar is at shoulder level. Hold the top contracted position for a moment and squeeze the biceps.\n" +
                "Then inhale and slowly lower the bar back to the starting position.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Variations: You can also perform this movement using an E-Z attachment hooked to a low pulley. This variation seems to really provide a good contraction at the top of the movement.\n" +
                "\n" +
                "You may also use the closer grip for variety purposes.");
        DataProvider sqaut4=new DataProvider("BENT-ARM BARBELL PULLOVER | 1 set of 20 reps");
        sqaut4.exercise.add("Start by setting a bar attachment (straight or e-z) on a high pulley machine.\n" +
                "Facing the bar attachment, grab it with the palms facing up (supinated grip) at shoulder width. Lower the bar by using your lats until your arms are fully extended by your sides. Tip: Elbows should be in by your sides and your feet should be shoulder width apart from each other. This is the starting position.\n" +
                "Slowly elevate the bar attachment up as you inhale so it is aligned with your chest. Only the forearms should move and the elbows/upper arms should be stationary by your side at all times.\n" +
                "Then begin to lower the cable bar back down to the original staring position while exhaling and contracting the triceps hard.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Variation: This exercise can also be performed with a single handle using one arm at a time. This will allow you to better isolate the triceps. With this version you can self spot yourself by placing your hand over your forearm and applying some pressure to help you perform more reps than before.");


        ArrayList<DataProvider> allArms= new ArrayList<DataProvider>();
        allArms.add(squat1);
        allArms.add(squat2);
        allArms.add(squat3);
        allArms.add(sqaut4);

        return allArms;
    }

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);
        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        ArrayList<DataProvider> data = getData();
        CustomListViewAdapter adapter= new CustomListViewAdapter(squats.this, data);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                return false;
            }
        });

    }
}
