package com.laer.easycast;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MusicPane extends Fragment {

	ViewGroup myViewGroup;

	public MusicPane() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = new View(getActivity());
		root.setLayoutParams(new ViewGroup.LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.MATCH_PARENT));
		root.setBackgroundColor(Color.WHITE);
		root = inflater.inflate(R.layout.imagepane, container, false);
		setHasOptionsMenu(true);
		myViewGroup = container;

		return root;
	}
}