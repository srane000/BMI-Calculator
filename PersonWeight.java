import java.util.GregorianCalendar;

public class PersonWeight {
		//instance variables
		private String fullname;
		private int birthyear;
		private double height;
		private double weight;
		//methods
		PersonWeight(){ //default constructor
			fullname = "-";
			birthyear = 0;
			height = 0;
			weight = 0;
		}
		
		public void setName(String name)
		{
			fullname = name; //stores the name
		}
		//Notice for all getter methods you must verify the data type otherwise you will get an error
		public String getName() {
			return fullname; //retrieve the name
		}
		
		public void setBirthYear(int birthyear) {
			this.birthyear = birthyear;
		}
		public int getBirthYear() {
			return birthyear;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getHeight() {
			return height;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public double getWeight() { 
			return weight;
		}
		public double computeBMI(double weight, double height) { //computes bmi give input values
			double bmi = weight / (height * height);
			return bmi;
		}
		public int getAge() { //get age of the person
			GregorianCalendar cal = new GregorianCalendar();		
			int current =  cal.get(GregorianCalendar.YEAR);
			return current - birthyear;
		}
		public PersonWeight (String fullname, int birthyear, double height, int weight) {
			fullname = "Name not inserted";
			birthyear = 0;
			height = 0;
			weight = 0;
		}
}
