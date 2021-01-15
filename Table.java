package in.core.basic;

public class Table {

	public static void main(String[] args) {
		/*int a[]=new int[10];
		int t[]={2,4,6,8,10,12,14,16,18,20};
		for(int i=0;i<t.length;i++){
			System.out.print(" "+t[i]);
			}*/
		int a[]=new int[11];
		a[0]=2;
		for(int i=1; i<a.length-1;i++){
			for(int j=1; j<a.length; j++){
			a[i]=a[0]*j;
			System.out.print(" "+a[i]);
			}
			System.out.println();
		}
		

	}

}
