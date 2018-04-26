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
public class About_BNM extends Fragment {
    Activity activity1;


    public About_BNM() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity1 = getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about__bnm, container, false);
    }
    public void onStart() {

        super.onStart();
        TextView textView = activity1.findViewById(R.id.about_bnm);
        textView.setText("B.N.M. Institute of Technology (also Bhageerathi Bai Narayana Rao Maanay Institute of Technology) is a private technical co-educational school located in Banshankari 2nd Stage, Bangalore, Karnataka, India. It was established in 2001 and is affiliated to the Visvesvaraya Technological University, Belgaum.[1] It is a part of BNMEI (BNM Educational Institutions) established by the Trust M/s. Bhageerathi Bai Narayana Randi Maanay Charities, started in 1972. BNMIT is an approved ISO 9001:2008 Certified Institute (TUVRheinland).");
            }

}
