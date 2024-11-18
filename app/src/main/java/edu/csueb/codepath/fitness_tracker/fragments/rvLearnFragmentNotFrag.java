package edu.csueb.codepath.fitness_tracker.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.List;

import edu.csueb.codepath.fitness_tracker.R;
import edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT;

public class rvLearnFragmentNotFrag extends AppCompatActivity {

    Context context;
    List<VideoYT> tutorials;
    LottieAnimationView animationView;
    TextView subHeader1, subHeader2, content1, content2;
    String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_rv_learn_not);

        category = getIntent().getStringExtra("category");
        subHeader1 = findViewById(R.id.subHeader1);
        subHeader2 = findViewById(R.id.subHeader2);
        content1 = findViewById(R.id.content1);
        content2 = findViewById(R.id.content2);
        animationView = findViewById(R.id.detailAnimationView);

        setContent();

    }

    private void setContent() {

        if (category.equals("Jumping Jacks"))
        {
            animationView.setAnimation("jumping-jack.json");
            animationView.playAnimation();
            subHeader1.setText("How to Do Jumping Jacks");
            content1.setText("A jumping jack can take a few forms, but here is how to do a basic jumping jack:\n" +
                    "\n" +
                    "Stand up straight, with your feet together and your hands down by your side.\n" +
                    "Jump your feet out to the side while raising your arms to the side and above your head.\n" +
                    "In one fluid motion, jump back to the starting position by lowering the arms and jumping the feet back together. That is one jumping jack.\n" +
                    "Continue this sequence as needed based on your workout. Typically, jumping jacks are done in sets or based on time. To do this, keep moving in a continuous motion, repeating the sequence until you accomplish your set or time goal, depending on the workout.");
            subHeader2.setText("Benefits of Jumping Jacks");
            content2.setText("1. Great for Strong Bones\n" +
                    "There has been a lot of controversy and speculation over the years about what exercise actually strengthen bones. Weightlifting is one way to do this, but some researchers suggest that quick jumping bursts can also do the trick. That means jumping jacks may be the perfect exercise for stronger bones and reducing the risk of osteoporosis.\n" +
                    "\n" +
                    "What happens is that the bones bend a little with each jumping motion, forcing new cell development. It’s the new cell creation that offers up more support for the bones, ultimately strengthening them. The good news is that you may not need to do a lot— just a little bit of explosive activity can lend itself to stronger bones. A study found that subjects who induced jumping for a certain period of time enjoyed more bone mass; therefore, stronger bones.\n" +
                    "\n" +
                    "2. Good for the Heart\n" +
                    "Jumping jacks offer benefits to combat heart disease. With as many as 250,000 heart-related deaths each year in the U.S., making cardio exercise like jumping jacks a part of your daily fitness routine seems like a no brainer.\n" +
                    "\n" +
                    "If you are new to jumping activities, you definitely want to take it slow, and start with the modified no-jumping version if needed. Regardless, over time you will get stronger. This is key numerous experts in the field of fitness and wellness, including the Centers for Disease Control and Prevention (CDC), the American College of Sports Medicine (ACSM) and the American Heart Association (AHA).\n" +
                    "\n" +
                    "The 1996 US Surgeon General’s Report on Physical Activity and Health, shared scientific evidence that links regular physical activity to various measures of cardiovascular health.”");

        }
        else if (category.equals("Push Ups"))
        {
            animationView.setAnimation("push-ups.json");
            animationView.playAnimation();
            subHeader1.setText("How to Do a Push-Up");
            content1.setText("If you don’t know how to do a push-up, it may feel a little awkward at first, but it will get easier. As with any exercise, form is the key to getting the most benefits:\n" +
                    "\n" +
                    "Start in a plank position, face-down with your body straight. Put your palms flat on the ground with your arms straight, in line with your shoulders. \n" +
                    "Keep your feet together or about 12 inches apart, with your weight on the balls of your feet. \n" +
                    "Make sure your back is straight and your weight is evenly spread out. \n" +
                    "Look down as you do your push-ups to make sure your spine is in line from your neck all the way down. \n" +
                    "Lower your body toward the ground, using controlled movement, until your elbows are at 90-degree angles. Then push back up to a plank position. \n" +
                    "For best results, lower slowly and push up quickly. When you begin, try taking 2 seconds to lower and then 1 second to push up.");
            subHeader2.setText("Benefits of Push Ups");
            content2.setText("Push-ups work many muscles in your body, including your:\n" +
                    "\n" +
                    "Chest \n" +
                    "Arms\n" +
                    "Stomach muscles (abdominals)\n" +
                    "Hips\u200C\n" +
                    "Legs\n" +
                    "Push-ups are a convenient exercise that you can do anywhere. They don’t need equipment or a gym membership. You can also adjust them to meet your own physical ability or to target specific muscles.\n" +
                    "\n" +
                    "Push-ups offer many health benefits, including:\n" +
                    "\n" +
                    "Burning calories\n" +
                    "Protecting your shoulders and lower back from injuries\n" +
                    "Improving your balance and posture\n" +
                    "Improving your flexibility\n" +
                    "Improving your performance in sports and athletic activities");

        }

        else if (category.equals("Split Jump"))
        {
            animationView.setAnimation("split-jump-exercise.json");
            animationView.playAnimation();
            subHeader1.setText("How to Do Split Jumps");
            content1.setText("1) Stand tall with your feet hip-distance apart. Hands are in front of the chest hand on fist. Take a large step forward with one foot and lower your body toward the floor. Both legs should be bent at a 90-degree angle at the bottom of the lunge.\n" +
                    "\n" +
                    "2) Lower the back knee slightly and jump to switch the feet.  While in the air front foot comes back and back foot comes to the front.  Land in a bent knee lunge. Repeat.");
            subHeader2.setText("Benefits of Split Jump");
            content2.setText("Split jumps are an awesome cardio exercise that work your glutes, legs and core while giving you a great cardiovascular challenge that gets your heart rate up anytime, anywhere.\n" +
                    "\n" +

                    "There are many reasons you should incorporate split jumps into your workouts. Here are just a few:\n" +
                    "\n" +
                    "1) High-Intensity Interval Benefits: No matter how you look at it, split jumps are going to get you breathing heavy! You will undoubtedly reach your anaerobic state meaning breathing only through your mouth and needing a break after about 20-30 seconds. This makes it perfect for high intensity interval training! It’s a crazy-good move that accomplishes in seconds what takes other exercises several minutes.\n" +
                    "\n" +
                    "2) Work Your Lower Body & Core: Your legs are moving and getting stronger with split jumps. Quads, glutes, hamstrings and calves…every muscle is put to the test. The key is to get a full range of motion. Don’t cut it short! You should go deep and make sure both knees bend. Different than a lot of cardio moves, the key to getting more intensity is range of motion INSTEAD of speed. In addition, you need to use your core in order to keep this movement efficient and easy on the joints, so it’s a great way to train those core stabilizers.");

        }

        else if (category.equals("Jumping Squats"))
        {
            animationView.setAnimation("jumping-squats.json");
            animationView.playAnimation();
            subHeader1.setText("How to Do Jumping Squats");
            content1.setText("Since jump squats put pressure on your joints, do them only when you have healthy hips, ankles, and knees. As a complete beginner, you should know how to do regular squats first. Only then, do jump squats by following these steps:\n" +
                    "\n" +
                    "To start with, stand up straight with your feet hip-distance apart.\n" +
                    "Keep your arms bent and hands in front of your shoulders.\n" +
                    "Lower your body until your hips are below your knees.\n" +
                    "Propel your body up and off the floor while bringing your arms above your head toward the ceiling.\n" +
                    "Land softly on the balls of your feet with your arms bent.\n" +
                    "Repeat as many times as is right for you.\n" +
                    "Keep these points in mind to do the exercise safely:\n" +
                    "\n" +
                    "Always warm up before starting the exercise to avoid overstraining your muscles.\n" +
                    "Only squat down to a level that feels comfortable. Consider the level at which your knees and hips start hurting your endpoint.");
            subHeader2.setText("Benefits of Jumping Squats");
            content2.setText("There are many benefits of jump squats. Regularly practice them using the correct technique to enjoy these positive effects on your health:\n" +
                    "\n" +
                    "Increased lower body strength. Jump squats work on many of your lower body muscles, making them more toned and stronger. \n" +
                    "\n" +
                    "Related:\n" +
                    "Video: Truth About Protein Bars\n" +
                    "\n" +
                    "AD\n" +
                    "More agility and mobility. Regular jump squat practice can help you move more easily while keeping your body agile and active.\n" +
                    "\n" +
                    "Good forweight loss. Being a high-intensity exercise, jump squats burn a lot of fats and calories, which can help you lose weight.\n" +
                    "\n" +
                    "Improved measures of fitness. Jump squat training can help athletes improve their sprint time, vertical strength, and range of motion.\n" +
                    "\n" +
                    "Helpful for children. By doing jump squats, kids can improve their balance as well as their kicking and running abilities.\n" +
                    "\n" +
                    "Jumps Squat Mistakes to Avoid\n" +
                    "While there are many benefits of the jump squat exercise, you can also face some risks if you perform it the wrong way. These are some of those mistakes that you should avoid to make your exercise safe and productive:\n" +
                    "\n" +
                    "\n" +
                    "AD\n" +
                    "Squatting straight down. Make sure to sit back rather than dropping straight into a squat. This will put less pressure on your lower body.\n" +
                    "\n" +
                    "Jumping on a hard surface. It’s best to do this exercise on a soft and flat surface like a mat, especially if you’re a beginner.\n" +
                    "\n" +
                    "Using extra weight. Adding extra weight to your jump squats may not cause any harm. But studies show that it might not benefit you in any way.\n" +
                    "\n" +
                    "Overdoing it. Since jump squats put a lot of pressure on your legs, overdoing them can hurt your knees and overstrain your lower body muscles.\n" +
                    "\n" +
                    "If you have any injury or medical condition in your neck, hips, or lower body, talk to a certified personal trainer or your doctor before adding jump squats to your daily workout. Such a powerful exercise is also not recommended for pregnant women, since they already feel a lot of strain on their joints during this time.");

        }

        else if (category.equals("Squats"))
        {
            animationView.setAnimation("squats.json");
            animationView.playAnimation();
            subHeader1.setText("How to Do Squats");
            content1.setText("\n" +
                    "Known as a bodyweight squat or an air squat, the most basic type of squat uses just your body weight for resistance. Variations of the squat can include weights, like barbells or dumbbells, resistance bands, or yoga balls.\n" +
                    "\n" +
                    "Ideally, it’s a good idea to work with a trainer to help you with your form when learning a squat. When you begin, the pressure in the squat should be placed almost evenly through your feet. Sometimes this is called foot tripod.\n" +
                    "\n" +
                    "Imagine a triangle on the sole of your foot, with pressure placed equally in three areas: on the front of the foot right behind the big toe, on the front of the foot behind the pinky toe, and on the heel.\n" +
                    "\n" +
                    "To do a basic squat:\n" +
                    "\n" +
                    "Start with feet slightly wider than hip-width apart, toes turned slightly out.\n" +
                    "Keeping your chest up and out and the pressure even in your feet, engage your abdominals and shift your weight back into your heels as you push your hips back.\n" +
                    "Lower yourself into a squat until either your heels begin to lift off the floor, or until your torso begins to round or flex forward. Your depth should be determined by your form.\n" +
                    "Keep your chest out and core tight as you push through your heels to stand back up to your starting position. Squeeze your glutes at the top.\n" +
                    "Perform 10–15 reps. Work up to 3 sets.");
            subHeader2.setText("Benefits of Squats");
            content2.setText("The list of squat benefits is lengthy, but to summarize and point out the top picks, here are seven key benefits of doing squats.\n" +
                    "\n" +
                    "1. Strengthens your core\n" +
                    "Having strong core muscles can make everyday movements like turning, bending, and even standing easier. Not only that, but a strong core can improve your balance, ease pain in your low back, and also make it easier to maintain good posture.\n" +
                    "\n" +
                    "A 2018 studyTrusted Source that compared core muscle activation during a plank with back squats found that back squats resulted in greater activation of the muscles that support your back.\n" +
                    "\n" +
                    "Based on these findings, the researchers recommended targeting the core muscles with back squats to reduce the risk of injury and to boost athletic performance.\n" +
                    "\n" +
                    "2. Reduces the risk of injury\n" +
                    "When you strengthen the muscles in your lower body, you’re better able to execute full-body movements with correct form, balance, mobility, and posture.\n" +
                    "\n" +
                    "Plus, incorporating squats in your overall workout routine also helps strengthen your tendons, ligaments, and bones, which, according to the American Council on Exercise, may help reduce your risk of injury.\n" +
                    "\n" +
                    "3. Crushes calories\n" +
                    "Calorie burning is often equated with aerobic exercises such as running or cycling. But performing high-intensity, compound movements like the squat can also crush some serious calories.\n" +
                    "\n" +
                    "For example, according to Harvard Medical School, a 155-pound person can burn approximately 223 calories doing 30-minutes of vigorous strength or weight training exercises, like squats.\n" +
                    "\n" +
                    "4. Strengthens the muscles of your lower body\n" +
                    "Your lower body boasts some of your largest and most powerful muscles.\n" +
                    "\n" +
                    "From getting out of bed, to sitting down in a chair, your glutes, quadriceps, hamstrings, adductors, hip flexors, and calves are responsible for almost every move you make.\n" +
                    "\n" +
                    "Strength training exercises like squats can help strengthen and tone the muscles in your lower body. When these muscles are in good condition, you may find that you can move more comfortably, with less pain, and that everything from walking to bending to exercising is easier to do.\n" +
                    "\n" +
                    "5. Boosts athletic ability and strength\n" +
                    "If you compete in a sport, adding jump squats to your workout may help you develop explosive strength and speed which, in turn, may help improve your athletic performance.\n" +
                    "\n" +
                    "A 2016 studyTrusted Source investigated the effects of jump squat training done 3 times a week over the course of 8 weeks.\n" +
                    "\n" +
                    "Based on the results of the study, the researchers concluded that jump squat training has the ability to improve several different athletic performances simultaneously, including sprint time and explosive strength.\n" +
                    "\n" +
                    "6. Variety helps with motivation\n" +
                    "Once you master the basic squat, there are many different types of squat variations you can try. Changing up your squats can help keep the exercise interesting, while also activating different muscle groups.\n" +
                    "\n" +
                    "Squats can be done with just your body weight. They can also be done with weights, like dumbbells, barbells, kettlebells, or medicine balls, or with resistance bands or yoga balls.\n" +
                    "\n" +
                    "7. Can be done anywhere\n" +
                    "To do bodyweight squats, you don’t need any equipment. All you need is your body and enough room to lower your hips into a sitting position.\n" +
                    "\n" +
                    "And, if you’re pressed for time, you can still benefit many muscle groups by doing 50 squats a day: Try doing 25 in the morning and 25 at night. As you get stronger, add 25 to the afternoon.");

        }



    }
}