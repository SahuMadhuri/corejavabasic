package in.core.basic;

import java.util.Random;

public class RandomNo {

	public static void main(String[] args) {
	int max,min;
	max=100;
	min=1;
	for(int j=0;j<5;j++){
		Random r=new Random();
		int i=min+r.nextInt(max);
		System.out.println(i);
	}
	

	}

}
