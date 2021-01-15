package in.core.basic;

public class Divisibility {

	public static void main(String[] args) {
		int n=100,t=0;
		for(int i=1; i<100;i++){
			n=n+1;
			if(n%7==0){
				System.out.print(" "+n);
				t=t+n;
			}
			
		}
		System.out.println();
		System.out.println("sum of all integers (100-200)that are divisible by 7= "+t);	
		
	}

}
