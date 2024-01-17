package com.tutorials;

public class Test1 {
	
	public String Solution(String day,int n){
		
		String days[] = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		int index=0;
		int count=0;
		int newCount=0;
		String result=null;
		
		for(int i=0;i<7;i++) {
			if(days[i].equals(day)) {
				index=i;
				count=index+n;
				if(count>6) {
					newCount=count%6;
					result=days[newCount-1];
				}
				else
					result=days[count];	
			}	
		}
		return result;
	}

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		String Rday=t1.Solution("Mon",9);
		System.out.println(Rday);
		

	}

}
