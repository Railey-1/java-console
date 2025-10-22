import java.util.Scanner;
import java.util.ArrayList;
// Railey
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = 2;

		while(true) {
			System.out.print("\n\tCALCULATOR\n[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division\n[5] Exit\n: ");
			int select = s.nextInt();
			if(select == 1) { //Addition
				while(true) {
					ArrayList<Integer> arr = new ArrayList<Integer>();
					System.out.print("\n\tADDITION");
					System.out.print("\nNumber 1: ");
				    arr.add(s.nextInt());
				    System.out.print("Number 2: ");
				    arr.add(s.nextInt());
				    System.out.println("Answer: "+arr.get(0)+" + "+arr.get(1)+" = "+add(arr)+"\n");
				    while(true) {
				    	System.out.print("do you want to continue?\n[1] add\n[2] reset/cancel\n: ");
				    	int sel = s.nextInt();
					    if(sel == 1) {
					    	number++;
					    	int total = add(arr);
						    System.out.print("\nNumber "+number+": ");
						    arr.add(s.nextInt());
						    System.out.println("Answer: "+total+" + "+arr.get(number-1)+" = "+add(arr)+"\n");
						 }
						 else if(sel == 2) {
						 	number = 2;
						 	break;
						 }
					}
					s.nextLine();
			    	System.out.print("Do you want to back to main menu?. Y/N\n: ");
			    	String option = s.nextLine();
			    	if(option.equalsIgnoreCase("y")) break;
			   }	
			}else if(select == 2) {//Subtraction
				System.out.print("\n\tADDITION");
				System.out.print("\nNumber 1: ");
				int num = s.nextInt();
				System.out.print("Number 2: ");
				int num1 = s.nextInt();
				System.out.println("Answer: "+num+" + "+num1+" = "+sub(num, num1)+"\n");
			}else if(select == 3) { //Multiplication
				while(true) {
					ArrayList<Integer> arr = new ArrayList<Integer>();
					System.out.print("\n\tMULTIPLICATION");
				    System.out.print("\nNumber 1: ");
				    arr.add(s.nextInt());
			    	System.out.print("Number 2: ");
			    	arr.add(s.nextInt());
			    	System.out.println("Answer: "+arr.get(0)+" x "+arr.get(1)+" = "+multi(arr)+"\n");
			    	while(true) {
				    	System.out.print("do you want to continue?\n[1] add\n[2] reset/cancel\n: ");
				    	int sel = s.nextInt();
					    if(sel == 1) {
					    	number++;
					    	int total = multi(arr);
						    System.out.print("\nNumber "+number+": ");
						    arr.add(s.nextInt());
						    System.out.println("Answer: "+total+" x "+arr.get(number-1)+" = "+multi(arr)+"\n");
						 }
						 else if(sel == 2) {
						 	number = 2;
						 	break;
						 }
					}
					s.nextLine();
			    	System.out.print("Do you want to back to main menu?. Y/N\n: ");
			    	String option = s.nextLine();
			    	if(option.equalsIgnoreCase("y")) break;
				}
			}else if(select == 4) { //Division
				System.out.print("\n\tDIVISION");
				System.out.print("\nNumber 1: ");
				int num = s.nextInt();
				System.out.print("Number 2: ");
				int num1 = s.nextInt();
				System.out.println("Answer: "+num+" ÷ "+num1+" = "+divide(num, num1)+"\n");
			}else if(select == 5) {
				break;
			}else {
				System.out.println("Invalid Keyword");
			}
		}
		s.close();
	}
	
	static int add(ArrayList<Integer> numbers) {
		int sum = 0;
		for(int x: numbers) sum += x;
		return sum;
	}
	
	static int sub(int num, int num1) {
		return num - num1;
	}
	
	static int multi(ArrayList<Integer> nums) {
		int multi = 1;
		for(int x: nums) multi *= x;
		return multi;
	}
	
	static int divide(int ...num) {
		return num[0] / num[1];
	}
}
