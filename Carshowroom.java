package lab2;

	public class Carshowroom {
	public static void main(String[] args)
	{
	Car c1= new Car("Maruti suzuki","Dzire",7.5,32);
	Car c2= new Car("Toyota","Urban Cruiser",11.1,28);
	Car c3= new Car("tata","altroz",6.89,23);
	c1.displayDetails();
	c2.displayDetails();
	c3.displayDetails();
	c1.setOwnerName("Alice");
	c1.updatePrice(16000);
	System.out.println("after Updates :");
	c1.displayDetails();
	Car.showShowroomName();
	Car.showTotalCars();
	}
	}
