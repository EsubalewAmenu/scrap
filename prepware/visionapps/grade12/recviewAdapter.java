package com.visionapps.grade12;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class recviewAdapter extends RecyclerView.Adapter<ViewHolder> {
    /* access modifiers changed from: private */
    public final Context context;
    public ArrayList<subject> subjects = new ArrayList<>();

    public recviewAdapter(Context context2) {
        this.context = context2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2719R.C2724layout.reclist, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        viewHolder.txt.setText(this.subjects.get(i).getName());
        viewHolder.image.setImageResource(this.subjects.get(i).getImageURL());
        viewHolder.parent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String name = recviewAdapter.this.subjects.get(i).getName();
                if (name.equals("Maths (Natural)")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, maths.class));
                } else if (name.equals("English")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, english.class));
                } else if (name.equals("Biology")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, biology.class));
                } else if (name.equals("Chemistry")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, chemistry.class));
                } else if (name.equals("Physics")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, physics.class));
                } else if (name.equals("Civics")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, civics.class));
                } else if (name.equals("SAT")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, sat.class));
                } else if (name.equals("Economics")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, economics.class));
                } else if (name.equals("Geography")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, geography.class));
                } else if (name.equals("History")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, history.class));
                } else if (name.equals("Maths (Social)")) {
                    recviewAdapter.this.context.startActivity(new Intent(recviewAdapter.this.context, english.class));
                }
            }
        });
        Glide.with(this.context).asBitmap().load(Integer.valueOf(this.subjects.get(i).getImageURL())).into(viewHolder.image);
    }

    public int getItemCount() {
        return this.subjects.size();
    }

    public void setSubjects(ArrayList<subject> arrayList) {
        this.subjects = arrayList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */
        public final ImageView image;
        /* access modifiers changed from: private */
        public final CardView parent;
        /* access modifiers changed from: private */
        public final TextView txt;

        public ViewHolder(View view) {
            super(view);
            this.image = (ImageView) view.findViewById(C2719R.C2722id.img);
            this.txt = (TextView) view.findViewById(C2719R.C2722id.subs);
            this.parent = (CardView) view.findViewById(C2719R.C2722id.parent);
        }
    }
}
