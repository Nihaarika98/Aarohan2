package aarohan.nihaarika.aarohan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

public class Event extends AppCompatActivity {
RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        relativeLayout = findViewById(R.id.Event_layout);
        Bundle bundle = getIntent().getExtras();
        int events =  bundle.getInt("Event");
        Toast.makeText(this, ""+events, Toast.LENGTH_SHORT).show();
        int event[] = {R.drawable.blitzkrieg,R.drawable.manstein_plan,R.drawable.maneuver,R.drawable.cease_fire,R.drawable.annihilation,R.drawable.polarity};
        relativeLayout.setBackgroundResource(event[events-1]);
    }
}
