package com.example.vishal.stepupfitness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by User on 5/6/2016.
 */
public class arms3 extends AppCompatActivity {
    private ArrayList<DataProvider> getData()
    {
        DataProvider arm1= new DataProvider("Preacher Curl | 3 sets of 6-8 reps");
        arm1.exercise.add("To perform this movement you will need a preacher bench and an E-Z bar. Grab the E-Z curl bar at the close inner handle (either have someone hand you the bar which is preferable or grab the bar from the front bar rest provided by most preacher benches). The palm of your hands should be facing forward and they should be slightly tilted inwards due to the shape of the bar.\n" +
                "With the upper arms positioned against the preacher bench pad and the chest against it, hold the E-Z Curl Bar at shoulder length. This will be your starting position.\n" +
                "As you breathe in, slowly lower the bar until your upper arm is extended and the biceps is fully stretched.\n" +
                "As you exhale, use the biceps to curl the weight up until your biceps is fully contracted and the bar is at shoulder height. Squeeze the biceps hard and hold this position for a second.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Variations: You can perform this exercise also using a low pulley with an E-Z Bar attachment instead. In this case you will need to position the bench in front of the pulley. You may also use a wider grip for variety purposes.");
        DataProvider arm2= new DataProvider("Seated Triceps Press | 3 sets of 6-8 reps");
        arm2.exercise.add("Sit down on a bench with back support and grasp a dumbbell with both hands and hold it overhead at arm's length. Tip: a better way is to have somebody hand it to you especially if it is very heavy. The resistance should be resting in the palms of your hands with your thumbs around it. The palm of the hand should be facing inward. This will be your starting position.\n" +
                "Keeping your upper arms close to your head (elbows in) and perpendicular to the floor, lower the resistance in a semi-circular motion behind your head until your forearms touch your biceps. Tip: The upper arms should remain stationary and only the forearms should move. Breathe in as you perform this step.\n" +
                "Go back to the starting position by using the triceps to raise the dumbbell. Breathe out as you perform this step.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Variations:\n" +
                "\n" +
                "You can perform this exercise standing as well but this puts strain on your back especially if you are using heavy dumbbells like 95 lbs or so.\n" +
                "Another variation is to use an EZ or straight bar instead in which case you will be holding the bar from the inside (around 5 inches between both hands) with the palms facing forward (pronated grip).\n" +
                "There is also a bar that has parallel bars inside (often referred to as a triceps blaster) and this can also be used for this exercise.\n" +
                "Finally, a low pulley cable with a rope attachment or bar (straight or EZ) attachment at the end can be used for variety purposes as well.");
        DataProvider arm3=new DataProvider("Lying Triceps Press | 3 sets of 6-8 reps");
        arm3.exercise.add("Lie on a flat bench with either an e-z bar (my preference) or a straight bar placed on the floor behind your head and your feet on the floor.\n" +
                "Grab the bar behind you, using a medium overhand (pronated) grip, and raise the bar in front of you at arms length. Tip: The arms should be perpendicular to the torso and the floor. The elbows should be tucked in. This is the starting position.\n" +
                "As you breathe in, slowly lower the weight until the bar lightly touches your forehead while keeping the upper arms and elbows stationary.\n" +
                "At that point, use the triceps to bring the weight back up to the starting position as you breathe out.\n" +
                "Repeat for the recommended amount of repetitions.\n" +
                "Caution: This is an exercise that you need to be very careful with when selecting the weight. Also, if you suffer from elbow problems this exercise might be too harsh on your elbows, so you may need to look for a substitute.\n" +
                "\n" +
                "Variations:\n" +
                "\n" +
                "There are a few variations of this exercise. You can perform it on a decline bench as opposed to a flat bench.\n" +
                "You can also perform it using dumbbells in which case the palms of the hands will be facing each other as opposed to facing forward.\n" +
                "Also, you can try to do it using a revere grip (palms facing you) but this variation seems to strain my wrists.");

        DataProvider arm4=new DataProvider("Decline EZ-Bar Triceps Extension | 3 sets of 6-8 reps");
        arm4.exercise.add("Secure your legs at the end of the decline bench and slowly lay down on the bench.\n" +
                "Using a close grip (a grip that is slightly less than shoulder width), lift the EZ bar from the rack and hold it straight over you with your arms locked and elbows in. The arms should be perpendicular to the floor. This will be your starting position. Tip: In order to protect your rotator cuff, it is best if you have a spotter help you lift the barbell off the rack.\n" +
                "As you breathe in and you keep the upper arms stationary, bring the bar down slowly by moving your forearms in a semicircular motion towards you until you feel the bar slightly touch your forehead. Breathe in as you perform this portion of the movement.\n" +
                "Lift the bar back to the starting position by contracting the triceps and exhaling.\n" +
                "Repeat until the recommended amount of repetitions is performed.\n" +
                "Variations: You can use a straight bar or dumbbells to perform this movement. You can also perform it on a flat bench as well.");


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
        CustomListViewAdapter adapter= new CustomListViewAdapter(arms3.this, data);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                return false;
            }
        });

    }
}
