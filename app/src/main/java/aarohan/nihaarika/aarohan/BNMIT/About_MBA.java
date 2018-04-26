package aarohan.nihaarika.aarohan.BNMIT;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import aarohan.nihaarika.aarohan.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class About_MBA extends Fragment {
Activity activity;

    public About_MBA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity = getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about__mb, container, false);
    }
    public void onStart() {

        super.onStart();
        TextView textView = activity.findViewById(R.id.about_mba);
        textView.setText("Established in 2006, Department of MBA-BNMIT has recorded consistently excellent academic performance by securing top ranks in VTU.  International and national level faculty Research Contributions, Memorandums of Understanding with University of Alabama in Huntsville, USA, Republic of Belarus, Eastern Europe, Fidelity National Financial Ltd., Learninto Edu Pvt. Ltd., and IIMBx, National level student fests, conferences, online courses, Industry Interface programs are the prominent features of the Department. ED Cell of BNMIT has received a grant of Rs. 2.87 crore under New Gen-IEDC from DST, Government of India for students to develop products.");
    }

}
