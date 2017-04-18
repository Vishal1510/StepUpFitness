package com.example.vishal.stepupfitness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by User on 5/6/2016.
 */
public class arms2 extends AppCompatActivity {
    private ArrayList<DataProvider> getData()
    {
        DataProvider arm1= new DataProvider("Triceps Pushdown—Rope Attachment | 3 sets of 6-8 reps");
        arm1.exercise.add("Attach a rope attachment to a high pulley and grab with a neutral grip (palms facing each other).\n" +
                "Standing upright with the torso straight and a very small inclination forward, bring the upper arms close to your body and perpendicular to the floor. The forearms should be pointing up towards the pulley as they hold the rope with the palms facing each other. This is your starting position.\n" +
                "Using the triceps, bring the rope down as you bring each side of the rope to the side of your thighs. At the end of the movement the arms are fully extended and perpendicular to the floor. The upper arms should always remain stationary next to your torso and only the forearms should move. Exhale as you perform this movement.\n" +
                "After holding for a second, at the contracted position, bring the rope slowly up to the starting point. Breathe in as you perform this step.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Variations: There are many variations to this movement. For instance you can use an E-Z bar attachment as well as a V-angled bar or straight bar.\n" +
                "\n" +
                "Same as the Triceps Pushdown except with the rope attachment.");
        DataProvider arm2= new DataProvider("Triceps Pushdown | 3 sets of 6-8 reps");

        arm2.exercise.add("Attach a straight or angled bar to a high pulley and grab with an overhand grip (palms facing down) at shoulder width.\n" +
                "Standing upright with the torso straight and a very small inclination forward, bring the upper arms close to your body and perpendicular to the floor. The forearms should be pointing up towards the pulley as they hold the bar. This is your starting position.\n" +
                "Using the triceps, bring the bar down until it touches the front of your thighs and the arms are fully extended perpendicular to the floor. The upper arms should always remain stationary next to your torso and only the forearms should move. Exhale as you perform this movement.\n" +
                "After a second hold at the contracted position, bring the bar slowly up to the starting point. Breathe in as you perform this step.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Variations: There are many variations to this movement. For instance you can use an E-Z bar attachment as well as a V-angled bar that allows the thumb to be higher than the small finger. Also, you can attach a rope to the pulley as well as using a reverse grip on the bar exercises.");
        DataProvider arm3=new DataProvider("Incline Dumbbell Curl | 3 sets of 6-8 reps");
        arm3.exercise.add("Sit back on an incline bench with a dumbbell in each hand held at arms length. Keep your elbows close to your torso and rotate the palms of your hands until they are facing forward. This will be your starting position.\n" +
                "While holding the upper arm stationary, curl the weights forward while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a second.\n" +
                "Slowly begin to bring the dumbbells back to starting position as your breathe in.\n" +
                "Repeat for the recommended amount of repetitions.");
        DataProvider arm4=new DataProvider("Dumbbell Biceps Curl | 3 sets of 6-8 reps");
        arm4.exercise.add("Stand up straight with a dumbbell in each hand at arm's length. Keep your elbows close to your torso and rotate the palms of your hands until they are facing forward. This will be your starting position.\n" +
                "Now, keeping the upper arms stationary, exhale and curl the weights while contracting your biceps. Continue to raise the weights until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a brief pause as you squeeze your biceps.\n" +
                "Then, inhale and slowly begin to lower the dumbbells back to the starting position.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Variations: There are many possible variations for this movement. For instance, you can perform the exercise sitting down on a bench with or without back support and you can also perform it by alternating arms; first lift the right arm for one repetition, then the left, then the right, etc.\n" +
                "\n" +
                "You can also do the exercise starting with both palms of the hands facing the torso and then rotating forward as the movement is performed. At the top of the movement the palms should face forward and the small finger should be higher than the thumb for a peak contraction.");


        ArrayList<DataProvider> allArms= new ArrayList<DataProvider>();
        allArms.add(arm1);
        allArms.add(arm2);
        allArms.add(arm3);
        allArms.add(arm4);

        return allArms;
    }

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);
        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        ArrayList<DataProvider> data = getData();
        CustomListViewAdapter adapter= new CustomListViewAdapter(arms2.this, data);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                return false;
            }
        });

    }
}
