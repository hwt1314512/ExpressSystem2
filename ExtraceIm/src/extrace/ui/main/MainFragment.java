package extrace.ui.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class MainFragment extends Fragment{
    public static MainFragment newInstance() {
    	MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        //args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}
