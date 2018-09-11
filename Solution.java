import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] names = new String[n][2];
		
		for(int i=0;i<n;i++)
		{
		    names[i][0]=sc.next();
		    names[i][1]=sc.next();
		}
		
		String dept = sc.next();
		
		for(int i=0;i<n;i++)
		{
		    if(dept.equals(names[i][1]))
		        System.out.println(names[i][0]);
		}
	}
}
