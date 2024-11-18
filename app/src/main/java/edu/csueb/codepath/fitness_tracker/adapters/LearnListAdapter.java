package edu.csueb.codepath.fitness_tracker.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import edu.csueb.codepath.fitness_tracker.R;
import edu.csueb.codepath.fitness_tracker.TutorialPlayback;
import edu.csueb.codepath.fitness_tracker.fragments.rvLearnFragmentNotFrag;
import edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT;

public class LearnListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private Map<String, String> categoryList;

    public LearnListAdapter(Context context, Map<String, String>  categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    public class Holder extends RecyclerView.ViewHolder{

        ImageView imageView, ivPosterOverlay;
        TextView tvTitle, tvDescription;
        CardView cardView;
        RelativeLayout rvContainer;
        LottieAnimationView animationView;
        //RecyclerView rvLearnWorkout;

        public Holder(@NonNull View itemView) {
            super(itemView);
            //imageView = itemView.findViewById(R.id.imageView);
            tvTitle = itemView.findViewById(R.id.cardViewTextBox);
            //rvLearnWorkout = itemView.findViewById(R.id.card_learn_item);
            //tvDescription = itemView.findViewById(R.id.tvDescription);
            // rvContainer = itemView.findViewById(R.id.card_learn_item);
            // ivPosterOverlay = itemView.findViewById(R.id.ivPosterOverlay);
            cardView = itemView.findViewById(R.id.card_learn_item);
            animationView = itemView.findViewById(R.id.animationView);
        }

        public void setData(String categoryAnimation,String categoryText) {
            String getTitle = categoryText;
            Log.e("LearnListAdapter","categoryAnimation = "+ categoryAnimation);
            if (!categoryAnimation.isEmpty())
            {
                animationView.setAnimation(categoryAnimation);
                animationView.playAnimation();
            }
            tvTitle.setText(getTitle);

            tvTitle.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), rvLearnFragmentNotFrag.class);
                    if(categoryText == "Push Ups"){
                        intent.putExtra("category", "Push Ups");
                        itemView.getContext().startActivity(intent);
                    } else if (categoryText == "Split Jump") {
                        intent.putExtra("category", "Split Jump");
                        itemView.getContext().startActivity(intent);
                    }

                    else if (categoryText == "Jumping Squats") {
                        intent.putExtra("category", "Jumping Squats");
                        itemView.getContext().startActivity(intent);
                    }

                    else if (categoryText == "Squats") {
                        intent.putExtra("category", "Squats");
                        itemView.getContext().startActivity(intent);
                    }

                    else if (categoryText == "Jumping Jacks") {
                        intent.putExtra("category", "Jumping Jacks");
                        itemView.getContext().startActivity(intent);
                    }
                    else {
                        Log.i("LearnFragment", "onItemClick: intent if check failed");
                    }
                }
            });
            //cardView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(itemView.getContext(), R.anim.layout_fade_animation));
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.learn_item_layout, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // Convert Map keys to a List for indexing
        List<Map.Entry<String, String>> entries = new ArrayList<>(categoryList.entrySet());

        // Get the key-value pair for the current position
        Map.Entry<String, String> entry = entries.get(position);

        // Pass the value (e.g., category name) to setData
        LearnListAdapter.Holder hold = (LearnListAdapter.Holder) holder;
        hold.setData(entry.getKey(),entry.getValue());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
