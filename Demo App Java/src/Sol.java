import java.util.Arrays;

public class Sol {

	public static void main(String[] args) {
		char s[] = {'k','a','r','p','g'};
		char s1[] = {'p','r','i','y','a'};
		System.arraycopy(s, 2, s1, 3, 2);
		System.out.println(Arrays.toString(s1));
		int numbers[]={1,2,3,4};
		int pos[]=numbers;
		for(int i=0;i<numbers.length;i++){
			numbers[i]=-1;
			System.out.println(pos[i]);
		}
	}
 
}
