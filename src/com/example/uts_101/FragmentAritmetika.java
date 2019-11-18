package com.example.uts_101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentAritmetika extends Fragment {
	
    EditText eatm;
    Button batm;
    TextView thasilatm;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_aritmetika,
				container,false);
		
		eatm = (EditText)rootView.findViewById(R.id.etatm);
		batm = (Button)rootView.findViewById(R.id.btnatm);
		thasilatm = (TextView)rootView.findViewById(R.id.tvhasilatm);
		
		
		batm.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				String pesan = eatm.getText().toString();
				if(pesan.equals("20"))
				{thasilatm.setText("\n Anda Benar \n");}
				else
				{thasilatm.setText("\n Anda Salah \n");}
			}
		});
		
		return rootView;

		
}}
