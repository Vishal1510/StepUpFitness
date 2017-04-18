package com.example.vishal.stepupfitness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by User on 5/5/2016.
 */
public class abs extends AppCompatActivity {


    private ArrayList<DataProvider> getData()
    {
        DataProvider CableCrunch= new DataProvider("Cable Crunch | 3 sets to failure| 60 seconds rest");
        CableCrunch.exercise.add("1. Kneel below a high pulley that contains a rope attachment.");
        CableCrunch.exercise.add("2. Grasp cable rope attachment and lower the rope until your hands are placed next to your face.");
        CableCrunch.exercise.add("3. Flex your hips slightly and allow the weight to hyperextend the lower back. This will be your starting position.");
        CableCrunch.exercise.add("4. With the hips stationary, flex the waist as you contract the abs so that the elbows travel towards the middle of the thighs. Exhale as you perform this portion of the movement and hold the contraction for a second.");
        CableCrunch.exercise.add("5. Slowly return to the starting position as you inhale. Tip: Make sure that you keep constant tension on the abs throughout the movement. Also, do not choose a weight so heavy that the lower back handles the brunt of the work.");
        CableCrunch.exercise.add("6. Repeat for the recommended amount of repetitions.");
        CableCrunch.exercise.add("Variations: You can perform this exercise with a handle instead so that you can concentrate on each side of the abs separately by performing the exercise to the side.");

        DataProvider MachineBenchPress= new DataProvider("Machine Bench Press| 4 sets, 10 reps| 2-minute rest");
        MachineBenchPress.exercise.add("1. Sit down on the Chest Press Machine and select the weight.");
        MachineBenchPress.exercise.add("2. Step on the lever provided by the machine since it will help you to bring the handles forward so that you can grab the handles and fully extend the arms.");
        MachineBenchPress.exercise.add("3. Grab the handles with a palms-down grip and lift your elbows so that your upper arms are parallel to the floor to the sides of your torso. Tip: Your forearms will be pointing forward since you are grabbing the handles. Once you bring the handles forward and extend the arms you will be at the starting position.");
        MachineBenchPress.exercise.add("4. Now bring the handles back towards you as you breathe in.");
        MachineBenchPress.exercise.add("5. Push the handles away from you as you flex your pecs and you breathe out. Hold the contraction for a second before going back to the starting position.");
        MachineBenchPress.exercise.add("6. Repeat for the recommended amount of reps.");
        MachineBenchPress.exercise.add("7. When finished step on the lever again and slowly get the handles back to their original place.");
        MachineBenchPress.exercise.add("Variations: You can use free weights (barbells and dumbbells) to perform this exercise on a regular bench. Alternatively, you can use the pulley machine as well.");

        DataProvider InclinedDumbellPress= new DataProvider("Inclined Dumbell Press| 4 sets, 15, 12, 10, 8 reps| 2-minute rest ");
        InclinedDumbellPress.exercise.add("1. Lie back on an incline bench with a dumbbell in each hand atop your thighs. The palms of your hands will be facing each other.");
        InclinedDumbellPress.exercise.add("2. Then, using your thighs to help push the dumbbells up, lift the dumbbells one at a time so that you can hold them at shoulder width.");
        InclinedDumbellPress.exercise.add("3. Once you have the dumbbells raised to shoulder width, rotate your wrists forward so that the palms of your hands are facing away from you. This will be your starting position.");
        InclinedDumbellPress.exercise.add("4. Be sure to keep full control of the dumbbells at all times. Then breathe out and push the dumbbells up with your chest.");
        InclinedDumbellPress.exercise.add("5. Lock your arms at the top, hold for a second, and then start slowly lowering the weight. Tip Ideally, lowering the weights should take about twice as long as raising them.");
        InclinedDumbellPress.exercise.add("6. Repeat the movement for the prescribed amount of repetitions.");
        InclinedDumbellPress.exercise.add("7. When you are done, place the dumbbells back on your thighs and then on the floor. This is the safest manner to release the dumbbells.");
        InclinedDumbellPress.exercise.add("Variations: You can use several angles on the incline bench if the bench you are using is adjustable.\n" +
                "\n" +
                "Another variation of this exercise is to perform it with the palms of the hands facing each other.\n" +
                "\n" +
                "Also, you can perform the exercise with the palms facing each other and then twisting the wrist as you lift the dumbbells so that at the top of the movement the palms are facing away from the body. I personally do not use this variation very often as it seems to be hard on my shoulders.\n" +
                "\n");

        DataProvider WeightedBenchDip = new DataProvider("Weighted Bench Dip| 3 sets to failure| 60-second rest");
        WeightedBenchDip.exercise.add("1. For this exercise you will need to place a bench behind your back and another one in front of you. With the benches perpendicular to your body, hold on to one bench on its edge with the hands close to your body, separated at shoulder width. Your arms should be fully extended.");
        WeightedBenchDip.exercise.add("2. The legs will be extended forward on top of the other bench. Your legs should be parallel to the floor while your torso is to be perpendicular to the floor. Have your partner place the dumbbell on your lap. Note: This exercise is best performed with a partner as placing the weight on your lap can be challenging and cause injury without assistance. This will be your starting position.");
        WeightedBenchDip.exercise.add("3. Slowly lower your body as you inhale by bending at the elbows until you lower yourself far enough to where there is an angle slightly smaller than 90 degrees between the upper arm and the forearm. Tip: Keep the elbows as close as possible throughout the movement. Forearms should always be pointing down.");
        WeightedBenchDip.exercise.add("4. Using your triceps to bring your torso up again, lift yourself back to the starting position while exhaling.");
        WeightedBenchDip.exercise.add("5. Repeat for the recommended amount of repetitions.");
        WeightedBenchDip.exercise.add("Caution: By placing your legs on top of another flat bench in front of you, the exercise becomes more challenging. It is best to attempt this exercise without any weights at first in order to get used to the movements required for good form. If that variation also becomes easy, then you can have a partner place plates on top of your lap. Make sure that in this case the partner ensures that the weights stay there throughout the movement.");

        DataProvider JackknifeSitUp = new DataProvider("Jackknife Sit Up| 3 sets to failure| 2-minute rest");
        JackknifeSitUp.exercise.add("1. Lie flat on the floor (or exercise mat) on your back with your arms extended straight back behind your head and your legs extended also. This will be your starting position.");
        JackknifeSitUp.exercise.add("2. As you exhale, bend at the waist while simultaneously raising your legs and arms to meet in a jackknife position. Tip: The legs should be extended and lifted at approximately a 35-45 degree angle from the floor and the arms should be extended and parallel to your legs. The upper torso should be off the floor.");
        JackknifeSitUp.exercise.add("3. While inhaling, lower your arms and legs back to the starting position.");
        JackknifeSitUp.exercise.add("4. Repeat for the recommended amount of repetitions.");
        JackknifeSitUp.exercise.add("Variation: If you are really advanced you could use a medicine ball for added resistance.");

        ArrayList<DataProvider> allABS= new ArrayList<DataProvider>();
        allABS.add(CableCrunch);
        allABS.add(MachineBenchPress);
        allABS.add(InclinedDumbellPress);
        allABS.add(WeightedBenchDip);
        allABS.add(JackknifeSitUp);

        return allABS;
    }
    ExpandableListView expandableListView;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);


            expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
            ArrayList<DataProvider> data = getData();

            CustomListViewAdapter adapter = new CustomListViewAdapter(abs.this, data);
            expandableListView.setAdapter(adapter);
            expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

                @Override
                public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                    return false;
                }
            });
        }

}
