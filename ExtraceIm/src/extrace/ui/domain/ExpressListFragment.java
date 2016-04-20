package extrace.ui.domain;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;

public class ExpressListFragment extends ListFragment{
	
	private static final String ARG_EX_TYPE = "ExType";
	
	private String mExType;

	//private ExpressListAdapter mAdapter;
	//private ExpressListLoader mLoader;

	Intent mIntent;  
	
	private OnFragmentInteractionListener mListener;
	
	public static ExpressListFragment newInstance(String ex_type) {
		
		ExpressListFragment fragment = new ExpressListFragment();

		Bundle args = new Bundle();
		args.putString(ARG_EX_TYPE, ex_type);	
		fragment.setArguments(args);
		return fragment;
	}
	public ExpressListFragment() {
	}
	
	public interface OnFragmentInteractionListener {
		public void onFragmentInteraction(String id);
	}
	
}
