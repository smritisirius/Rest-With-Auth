package com.example.Newrestws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Newrestws.model.Passenger;
@Service
public class PassengerServiceImpl implements PassengerService {

	List<Passenger> passengerList=new ArrayList<>();
	int currentid=121;
	
/*	@Override
	public Passenger addPassenger(Passenger p) {
		p.setId(currentid);
		passengerList.add(p);
		return p;
		
	}*/

	@Override
	public List<Passenger> getPassengers(int start, int size) {
System.out.println(start);
System.out.println(size );
		return passengerList;
	}

	@Override
	public void addPassenger(String fname, String lname) {
		System.out.println("fname"+fname);
		System.out.println("lname"+lname);
		
	}

}
