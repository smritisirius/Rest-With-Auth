package com.example.Newrestws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.example.Newrestws.model.Passenger;

@Path("/passengerservice")

@Produces("application/xml")
@Consumes("application/xml,application/x-www-form-urlencoded")
public interface PassengerService {

	@Path("/Passenger")
	@GET
	List<Passenger> getPassengers(@QueryParam("start")int start,@QueryParam("size")int size);
	@Path("/Passenger")
	@POST
	void addPassenger(@FormParam("fname")String fname,@FormParam("lname")String lname);
	
	
}
