package com.visionapps.grade12;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.visionapps.grade12.Fragments.OverviewFragment;
import com.visionapps.grade12.Fragments.PredictionsFragment;
import com.visionapps.grade12.Fragments.RecommendationsFragment;

/* renamed from: com.visionapps.grade12.stats */
public class C3394stats extends AppCompatActivity {
    BottomNavigationView bottomnav;
    OverviewFragment overview = new OverviewFragment();
    PredictionsFragment predictions = new PredictionsFragment();
    RecommendationsFragment recommendations = new RecommendationsFragment();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_stats);
        this.bottomnav = (BottomNavigationView) findViewById(C2719R.C2722id.bottomnav);
        getSupportFragmentManager().beginTransaction().replace(C2719R.C2722id.container, this.overview).commit();
        this.bottomnav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case C2719R.C2722id.navigation_Predictions:
                        C3394stats.this.getSupportFragmentManager().beginTransaction().replace(C2719R.C2722id.container, C3394stats.this.predictions).commit();
                        return true;
                    case C2719R.C2722id.navigation_Recommendations:
                        C3394stats.this.getSupportFragmentManager().beginTransaction().replace(C2719R.C2722id.container, C3394stats.this.recommendations).commit();
                        return true;
                    case C2719R.C2722id.navigation_overview:
                        C3394stats.this.getSupportFragmentManager().beginTransaction().replace(C2719R.C2722id.container, C3394stats.this.overview).commit();
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
}
