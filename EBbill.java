package otherPackage;

import java.util.Scanner;

public class EBbill {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("No of months Bill Paid: ");
		int noOfBills=a.nextInt();
		String[] months=new String[noOfBills];
		System.out.print("Enter Months: ");
		System.out.println(months.length);
		int Totalamount=0, high=0;
		while(noOfBills>0) {
		Scanner b=new Scanner(System.in);
		System.out.print("Month: ");
		int i=0, j=1;
		while(i<j) {
			months[i]=b.next();
			int[] Amount=new int[noOfBills];	
		System.out.print("Enter Amount: ");
		j--;
		Amount[j]=b.nextInt();
		if(Amount[j]>high){
			high=Amount[j];
		}
		Totalamount+=Amount[j];
		i++;
		}
		noOfBills--;}
		System.out.println("Total Amount: "+Totalamount);
		System.out.println("Peak Amount: "+high);
	}

}
