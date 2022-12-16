
public class Basic_Java {
     // Data_Premetives
	       String Employee_Name ;
	static String Company_Name = "Infosys";
	static String Bus = "Platform4";
	static String TeckPark = "Redfields";
	       int id ;
	
	

	public Basic_Java(String string, int i) {
		// TODO Auto-generated constructor stub
		id  = i;
		Employee_Name = string;
	}
	public Basic_Java() {
		// TODO Auto-generated constructor stub
	}
	void display (){System.out.println(Employee_Name + " " + id + " "+" from "+ TeckPark + " "+ 	
								Company_Name+" "+" go to "+	
														Bus );}  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Due_Pend = 1230.54;
		/*
		 * System.out.println(Employee_Id); System.out.println(Name);
		 * System.out.println(food_token); System.out.println(IdTag);
		 */
		System.out.println(Due_Pend);
	}

}
