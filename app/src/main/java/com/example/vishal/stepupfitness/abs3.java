package com.example.vishal.stepupfitness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by User on 5/6/2016.
 */
public class abs3 extends AppCompatActivity {

    private ArrayList<DataProvider> getData(){
        DataProvider DeclineReverseCrunch= new DataProvider("Decline Crunch| 3 sets to failure, 60-second rest");
        DeclineReverseCrunch.exercise.add("1. Lie on your back on a decline bench and hold on to the top of the bench with both hands. Don't let your body slip down from this position.");
        DeclineReverseCrunch.exercise.add("2. Hold your legs parallel to the floor using your abs to hold them there while keeping your knees and feet together. Tip: Your legs should be fully extended with a slight bend on the knee. This will be your starting position.");
        DeclineReverseCrunch.exercise.add("3. While exhaling, move your legs towards the torso as you roll your pelvis backwards and you raise your hips off the bench. At the end of this movement your knees will be touching your chest.");
        DeclineReverseCrunch.exercise.add("4. Hold the contraction for a second and move your legs back to the starting position while inhaling.");
        DeclineReverseCrunch.exercise.add("5. Repeat for the recommended amount of repetitions.");
        DeclineReverseCrunch.exercise.add("Variations: You can do the movement on a flat surface and as you get more advanced you can use ankle weights.");

        DataProvider SmithMachineBentOverRow=new DataProvider("FLAT BENCH LYING LEG RAISE | 3 sets to failure, 60-second rest");
        SmithMachineBentOverRow.exercise.add("1. Set the barbell attached to the smith machine to a height that is about 2 inches below your knees.");
        SmithMachineBentOverRow.exercise.add("2. Bend your knees slightly and bring your torso forward, by bending at the waist, while keeping the back straight until it is almost parallel to the floor. Tip: Make sure that you keep the head up.");
        SmithMachineBentOverRow.exercise.add("3. Now grasp the barbell using an overhand (pronated) grip and unlock it from the smith machine rack. Then let it hang directly in front of you as your arms hang extended perpendicular to the floor and your torso. This is your starting position.");
        SmithMachineBentOverRow.exercise.add("4. While keeping the torso stationary, lift the barbell as you breathe out, keeping the elbows close to the body and not doing any force with the forearm other than holding the weights. On the top contracted position, squeeze the back muscles and hold for a second.");
        SmithMachineBentOverRow.exercise.add("5. Slowly lower the weight again to the starting position as you inhale.");
        SmithMachineBentOverRow.exercise.add("6. Repeat for the recommended amount of repetitions.");
        SmithMachineBentOverRow.exercise.add("Caution:\n" +
                "\n" +
                "This exercise is not recommended for people with back problems. A Low Pulley Row is a better choice for people with back issues.\n" +
                "Also, just like with the bent knee deadlift, if you have a healthy back, ensure perfect form and never slouch the back forward as this can cause back injury.\n" +
                "Be cautious as well with the weight used; in case of doubt, use less weight rather than more.");
        SmithMachineBentOverRow.exercise.add("Variations: You can perform the same exercise using a supinated (palms facing you) grip. You can also use barbells and dumbbells.");

        DataProvider Pullups = new DataProvider("Triceps Pushdown | 4 sets, 20, 15, 12, 9 reps, 60-second rest");
        Pullups.exercise.add("1. Grab the pull-up bar with the palms facing forward using the prescribed grip. Note on grips: For a wide grip, your hands need to be spaced out at a distance wider than your shoulder width. For a medium grip, your hands need to be spaced out at a distance equal to your shoulder width and for a close grip at a distance smaller than your shoulder width.");
        Pullups.exercise.add("2. As you have both arms extended in front of you holding the bar at the chosen grip width, bring your torso back around 30 degrees or so while creating a curvature on your lower back and sticking your chest out. This is your starting position.");
        Pullups.exercise.add("3. Pull your torso up until the bar touches your upper chest by drawing the shoulders and the upper arms down and back. Exhale as you perform this portion of the movement. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. The upper torso should remain stationary as it moves through space and only the arms should move. The forearms should do no other work other than hold the bar.");
        Pullups.exercise.add("4. After a second on the contracted position, start to inhale and slowly lower your torso back to the starting position when your arms are fully extended and the lats are fully stretched.");
        Pullups.exercise.add("5. Repeat this motion for the prescribed amount of repetitions.");
        Pullups.exercise.add("Variations:\n" +
                "\n" +
                "If you are new at this exercise and do not have the strength to perform it, use a chin assist machine if available. These machines use weight to help you push your bodyweight.\n" +
                "Otherwise, a spotter holding your legs can help.\n" +
                "On the other hand, more advanced lifters can add weight to the exercise by using a weight belt that allows the addition of weighted plates.\n" +
                "The behind the neck variation is not recommended as it can be hard on the rotator cuff due to the hyperextension created by bringing the bar behind the neck.");

        DataProvider StraightArmDumbellPullOver = new DataProvider("Bench Dips| 4 sets to failure, 60-second rest");
        StraightArmDumbellPullOver.exercise.add("1. Place a dumbbell standing up on a flat bench.");
        StraightArmDumbellPullOver.exercise.add("2. Ensuring that the dumbbell stays securely placed at the top of the bench, lie perpendicular to the bench (torso across it as in forming a cross) with only your shoulders lying on the surface. Hips should be below the bench and legs bent with feet firmly on the floor. The head will be off the bench as well.");
        StraightArmDumbellPullOver.exercise.add("3. Grasp the dumbbell with both hands and hold it straight over your chest at arms length. Both palms should be pressing against the underside one of the sides of the dumbbell. This will be your starting position.\n" +
                "Caution: Always ensure that the dumbbell used for this exercise is secure. Using a dumbbell with loose plates can result in the dumbbell falling apart and falling on your face.");
        StraightArmDumbellPullOver.exercise.add("4. While keeping your arms straight, lower the weight slowly in an arc behind your head while breathing in until you feel a stretch on the chest.");
        StraightArmDumbellPullOver.exercise.add("5. At that point, bring the dumbbell back to the starting position using the arc through which the weight was lowered and exhale as you perform this movement.");
        StraightArmDumbellPullOver.exercise.add("6. Hold the weight on the initial position for a second and repeat the motion for the prescribed number of repetitions.");
        StraightArmDumbellPullOver.exercise.add("Caution: If you are new to this movement, have a spotter hand you the weight instead. If not, please ensure that the dumbbell does not fall on you as you arrange your torso to perform the exercise on the bench. Also, as I already mentioned, ensure that the dumbbell used is in perfect working condition. Old dumbbells in need of welding should never be used to perform this exercise.");
        StraightArmDumbellPullOver.exercise.add("Variations:\n" +
                "\n" +
                "You can perform this exercise using a barbell or an e-z bar instead of dumbbells.\n" +
                "Also, if using dumbbells like Powerblocks™, just use a dumbbell on each hand with the palms of your hands facing each other.");

        DataProvider Hyperextensions = new DataProvider("Decline EZ bar Triceps Extensions | 4 sets, 10 reps, 60-second rest");
        Hyperextensions.exercise.add("1. Lie face down on a hyperextension bench, tucking your ankles securely under the footpads.");
        Hyperextensions.exercise.add("2. Adjust the upper pad if possible so your upper thighs lie flat across the wide pad, leaving enough room for you to bend at the waist without any restriction.");
        Hyperextensions.exercise.add("3. With your body straight, cross your arms in front of you (my preference) or behind your head. This will be your starting position. Tip: You can also hold a weight plate for extra resistance in front of you under your crossed arms.");
        Hyperextensions.exercise.add("4. Start bending forward slowly at the waist as far as you can while keeping your back flat. Inhale as you perform this movement. Keep moving forward until you feel a nice stretch on the hamstrings and you can no longer keep going without a rounding of the back. Tip: Never round the back as you perform this exercise. Also, some people can go farther than others. The key thing is that you go as far as your body allows you to without rounding the back.");
        Hyperextensions.exercise.add("5. Slowly raise your torso back to the initial position as you inhale. Tip: Avoid the temptation to arch your back past a straight line. Also, do not swing the torso at any time in order to protect the back from injury.");
        Hyperextensions.exercise.add("Variations: This exercise can also be performed without a hyperextension bench, but in this case you will need a spotter. Also, a similar exercise to this one is the good morning and the stiff-legged deadlift.");

        ArrayList<DataProvider> allABS= new ArrayList<DataProvider>();
        allABS.add(DeclineReverseCrunch);
        allABS.add(SmithMachineBentOverRow);
        allABS.add(Pullups);
        allABS.add(StraightArmDumbellPullOver);
        allABS.add(Hyperextensions);

        return allABS;
    }

    ExpandableListView expandableListView;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);


        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        ArrayList<DataProvider> data = getData();

        CustomListViewAdapter adapter = new CustomListViewAdapter(abs3.this, data);
        expandableListView.setAdapter(adapter);
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                return false;
            }
        });
    }

}
