package in.core.basic;

public class MissingNo {

	public static void main(String[] args) {
		int a[]={4,7,6,9,5};
		int b[]={4,7,9,5};
		for(int i=0;i<a.length;i++){
			boolean flag=true;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
				flag=false;
				}
			}
			if(flag){
	        	System.out.println("Missing number is= "+a[i]);
		}
        
		
        }
	}

}
