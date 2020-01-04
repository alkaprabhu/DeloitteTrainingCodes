------------------car class-------------------------
public class Car {
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Car(String name) {
		super();
		this.name = name;
}
}

------------------showroom class--------------------
import java.util.ArrayList;

public class Showroom {
	
		String sname;
		int sno;
		ArrayList<Car> cars;
		
		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}
		public int getsno() {
			return sno;
		}

		public void setsno(int sno) {
			this.sno = sno;
		}
		public ArrayList<Car> getCars() {
			return cars;
		}

		public void setCars(ArrayList<Car> cars) {
			this.cars = cars;
		}

		

}

--------------------------main method class-------------------
import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
	public static void main(String[] args) {

		Car c1=new Car("swift dzire");
		Car c2=new Car("fiat punto");
		Car c3=new Car("honda city");
		
		Showroom s=new Showroom();
		s.setSname("shodha cars");
		s.setsno(10);
		ArrayList<Car> cars1=new ArrayList<>();
		cars1.add(c1);
		cars1.add(c2);
		cars1.add(c3);
		s.setCars(cars1);
		
		
		Showroom s1=new Showroom();
		s1.setSname("lakeview cars");
		s1.setsno(11);
		ArrayList<Car> cars2=new ArrayList<>();
		cars2.add(c1);
		cars2.add(c2);
		cars2.add(c3);

		s1.setCars(cars2);
		// ------------------------ //


		HashMap<String, ArrayList<Car>> hash = new HashMap<String, ArrayList<Car>>();
		hash.put("shodha cars", cars1);
		hash.put("lakeview cars", cars2);
		System.out.println(s.getSname() + "\n" + s.getsno() + "\n");
		ArrayList<Car> cl1 = hash.get("shodha cars");
		for(Car c :cl1)
		{
		System.out.println(c.getName());

		}
		System.out.println(s1.getSname() + "\n" + s1.getsno() + "\n");
		ArrayList<Car> cl2 = hash.get("lakeview cars");
		for(Car c :cl2)
		{
		System.out.println(c.getName());

		}


		}

}

