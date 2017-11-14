
import java.util.Scanner;

public class median {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int n=scan.nextInt();
       int n2=scan.nextInt();
		int num[] = new int[n];
        int num1[] = new int[n2];
        System.out.println("Enter the first array");
        for(int k=0;k<n;k++){
        	num[k]=scan.nextInt();
        }
        System.out.println("Enter the second array");
        for(int r=0;r<n2;r++){
        	num1[r]=scan.nextInt();
        }
	float sum=0;
	float sum1=0;
       float m1=0;
       float m=0;
       if(num.length>1){
       for(int i=0;i<num.length;i++){
    	   sum=sum+num[i];
       }
         m=sum/2;
       }
       else{
    	   m=num[0];
       }
       // sum=0;
	if(num1.length>1){
	for(int j=0;j<num1.length;j++){
		sum1=sum1+num1[j];
	}
	
	 m1=sum1/2;
	}
	else{ 
	 m1=num1[0];
	}
	float med=(m+m1)/2;
	System.out.println(med);
	}

}
