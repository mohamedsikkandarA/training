import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.Scanner;
//LEVEL 1
public class olaapp {
public static void main(String args[]) {
	double gst =0.07; //LEVEL4
	Scanner sc = new Scanner (System.in);
	System.out.println("ENTER THE MOBILE NUMBER");
	long mobileNo = sc.nextLong();
	
	System.out.println("PASSWORD");
	String password= sc.next();
	
	//LEVEL2
	
	System.out.println("CAB TYPES:\n");
	System.out.println("1.MICRO(RS.10/KM.\n");
	System.out.println("2.MINI(RS.15/KM.\n");
	System.out.println("3.PRIME(RS.20/KM.\n");
		
		//LEVEL5
		
		System.out.println("BOOKING");
		System.out.println("CAB TYPES");
		System.out.println("PLEASE TYPE YOUR CAB TYPE ");
		System.out.println("1.MICRO");
		System.out.println("2.MINI");
		System.out.println("3.PRIME");
		String cartype=sc.next();
		System.out.println("YOUR CAB TYPE IS :"+cartype);
		
		System.out.println("JOURNY DATE:");
		String dateStr= sc.next();
		
		
		
		
		
		
		//level6
		
		
		System.out.println("16PM TO 18PM 1.25% EXTRA PER KM!!!!!!");
		
		//level7
				System.out.println("ENTER YOUR DOB:");
				String Dob=sc.next();
				LocalDate DOB=LocalDate.parse(Dob);
				int ageyear = DOB.getYear();
				LocalDate rec =LocalDate.now();
				int curyear=rec.getYear();
				int age =curyear-ageyear;
				if(age>60) {
					System.out.println("YOU ARE A SENIOR CITIZEN,SO 50% DISCOUNT!");
			
		}
		
		}}