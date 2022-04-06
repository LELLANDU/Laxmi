import java.util.*;
public class PhoneCharging {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Battery Capacity");
    float battery=sc.nextInt();
   if (battery >= 1000 && battery <= 10000) {
      System.out.println("Enter charging current value");
    float current = sc.nextInt();
    if (current >= 300 && current <= 2100) {
     System.out.printf("%.2f Hours", (battery / current) * 1.2);
     } else {
    System.out.println("Invalid output current");
     return;
     }
     } else {
    System.out.println("Invalid battery capacity");
    return;
     }
     }
    		

	}


