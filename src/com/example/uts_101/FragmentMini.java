package com.example.uts_101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentMini extends Fragment {
	
		EditText emini1;
		Button bmini1;
		EditText emini2;
		Button bmini2;
		EditText emini3;
		Button bmini3;
		TextView thasilmini1;
		TextView thasilmini2;
		TextView thasilmini3;
	
	
		@Override
		public View onCreateView(LayoutInflater inflater,
				ViewGroup container, Bundle savedInstanceState){
			View rootView = inflater.inflate(R.layout.fragment_mini,
					container,false);
			emini1 = (EditText)rootView.findViewById(R.id.etmini1);
			emini2 = (EditText)rootView.findViewById(R.id.etmini2);
			emini3 = (EditText)rootView.findViewById(R.id.etmini3);
			bmini1 = (Button)rootView.findViewById(R.id.btnmini1); 
			bmini2 = (Button)rootView.findViewById(R.id.btnmini2);
			bmini3 = (Button)rootView.findViewById(R.id.btnmini3);
			thasilmini1 = (TextView)rootView.findViewById(R.id.tvhasilmini1);
			thasilmini2 = (TextView)rootView.findViewById(R.id.tvhasilmini2);
			thasilmini3 = (TextView)rootView.findViewById(R.id.tvhasilmini3);
			
			
			bmini1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					String pesan = emini1.getText().toString();
					if (pesan.equals("Yes"))
					{thasilmini1.setText("\n Anda Benar \n");}
					else if (pesan.equals("yes"))
					{thasilmini1.setText("\n Anda Benar \n");}
					else if (pesan.equals("No"))
					{thasilmini1.setText("\n Anda Salah \n");}
					else if (pesan.equals("no"))
					{thasilmini1.setText("\n Anda Salah \n");}
					else 
					{thasilmini1.setText("\n Anda Mengetik Tidak Sesuai Dengan Format Jawaban \n");}
			}});
			
			bmini2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					String pesan = emini2.getText().toString();
					if (pesan.equals("Yes"))
					{thasilmini2.setText("\n Anda Benar \n");}
					else if (pesan.equals("yes"))
					{thasilmini2.setText("\n Anda Benar \n");}
					else if (pesan.equals("No"))
					{thasilmini2.setText("\n Anda Salah \n");}
					else if (pesan.equals("no"))
					{thasilmini2.setText("\n Anda Salah \n");}
					else 
					{thasilmini2.setText("\n Anda Mengetik Tidak Sesuai Dengan Format Jawaban \n");}
					
			}});
			
			bmini3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					String pesan = emini3.getText().toString();
					if (pesan.equals("No"))
					{thasilmini3.setText("\n Anda Benar \n");}
					else if (pesan.equals("no"))
					{thasilmini3.setText("\n Anda Benar \n");}
					else if (pesan.equals("Yes"))
					{thasilmini3.setText("\n Anda Salah \n");}
					else if (pesan.equals("yes"))
					{thasilmini3.setText("\n Anda Salah \n");}
					else 
					{thasilmini3.setText("\n Anda Mengetik Tidak Sesuai Dengan Format Jawaban \n");}
					
				}});
			
			return rootView;
			

		}}