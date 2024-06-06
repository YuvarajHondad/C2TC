package venu;

//package javaSachin;
import java.util.*;

public class firstpgm {

	public static  void main(String args []) {
	
	Scanner sc=new Scanner(System.in);
	double profit=Double.MIN_VALUE;
	System.out.println("Enter the number of obj: ");
	int n=sc.nextInt();
	System.out.println("Enter the Capacity: ");
	double cap=sc.nextDouble();
	double  prof[]=new double[n];
	double weg[]=new double[n];
	double ratio[]=new double[n];
	double weightused[]=new double[n];
	
	for(int i=0;i<n;i++) {
	System.out.println("ENTER Profit: ");
	prof[i]=sc.nextDouble();
	System.out.println("Enter the weight: ");
	weg[i]=sc.nextDouble();
	ratio[i]=prof[i]/weg[i];
	}
	double maxratio=Double.MIN_VALUE;
	int maxid=-1;
	for(int i=0;i<n;i++) {
		if(ratio[i]>maxratio) {
			maxratio=ratio[i];
			maxid=i;
		}
	}
	int wt=0;
	while(cap!=0) {
		
		if(weg[maxid]<=cap) {
			cap=cap-weg[maxid];
			weightused[wt]=weg[maxid];
			wt++;
			profit=profit+ratio[maxid]*100;
	}
		
		
	}
	
	
	
	
}
}