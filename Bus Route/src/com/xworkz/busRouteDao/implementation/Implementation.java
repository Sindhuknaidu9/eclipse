package com.xworkz.busRouteDao.implementation;

import com.xworkz.dao.BusRouteDAO;
import com.xworkz.dto.BusRouteDTO;

public class Implementation implements BusRouteDAO {

		private BusRouteDTO[] busRouteDTO=new BusRouteDTO[3];
		private int count=0;

		public Implementation()
		{
			System.out.println("Invoked no arg constructor from Implementation");
		}

		public void save(BusRouteDTO dto)
		{
			if(dto!=null && this.count<this.busRouteDTO.length)
			{
				this.busRouteDTO[count]=dto;
				System.out.println("busrouteDTO added ");
				System.out.println("ID "+dto.getId());
				System.out.println("Start Point "+dto.getStartPoint());
				System.out.println("Destination "+dto.getDestination());
				System.out.println("driver name "+dto.getDriverName());
				this.count++;

			}
		 	else
 		 	 {
		  		System.out.println("busRouteDTO is full or you have passed null");
			}

		}

		public void findByDestination(String name)
		{
			if(name!=null)
			{
				for(int check=0;check<this.busRouteDTO.length;check++)
				{
					BusRouteDTO route=this.busRouteDTO[check];

					if(route!=null)
					{
						String destination=route.getDestination();

						if(name.equals(destination))
						{
							System.out.println(name +" Destination name matched ");
						}
						else
						{
							System.out.println("Destination not matched");
						}
					}
				}
			}
			else
			{
				System.out.println("Name cannot be null");
			}

		}

		public void displayDetails()
		{
			for(int dis=0;dis<this.busRouteDTO.length;dis++)
			{
				BusRouteDTO contents=busRouteDTO[dis];

				if(contents!=null)
				{
					int id=contents.getId();
					String startPoint=contents.getStartPoint();
					String destination=contents.getDestination();
					String driver=contents.getDriverName();

					System.out.println("ID "+id);
					System.out.println("Start Point "+startPoint);
					System.out.println("Destination "+destination);
					System.out.println("driver name  "+driver);
				}
			}

		}



	}
	 
