package pkg1;

public class Backtracking {
	
	public static void printperm(String str,String prem) {
		if(str.length()==0) {
			System.out.println(prem+" ");
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			
			String newstr=str.substring(0,i)+str.substring(i+1);
			printperm(newstr,prem+a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printperm("abc"," ");

	}

}
