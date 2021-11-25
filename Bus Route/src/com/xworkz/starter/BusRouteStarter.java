package com.xworkz.starter;

import com.xworkz.busRouteDao.implementation.BusRouteManager;
import com.xworkz.busRouteDao.implementation.Implementation;
import com.xworkz.dao.BusRouteDAO;
import com.xworkz.dto.BusRouteDTO;

public class BusRouteStarter {
	public static void main(String[] args) {

		BusRouteDAO dao=new Implementation();

		BusRouteDTO dto1=new BusRouteDTO(1,"Shimogga","Bhadravathi","Ramu");
		BusRouteDTO dto2=new BusRouteDTO(2,"Bhadravathi","Bangalore","Kumar");
		
		
		
		BusRouteManager manager=new BusRouteManager(dao);
		manager.saveRoute(dto1);
		manager.saveRoute(dto2);

		manager.findRoute("Tarikere");
		manager.findRoute("Bhadravathi");
		
		manager.displayRoute();

		
}
}
