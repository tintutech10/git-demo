package com.tutorials;

public class Test {

	public static void main(String[] args) {
		int a[] = new int[] {10,2,4,10,8,5};
		int temp=0;
		for (int i = 0; i < a.length; i++) {     
            for (int j = i+1; j < a.length; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }  
        for(int i=0;i<a.length;i++) {
        	if(a[0]!=1) {
        		System.out.println("smallest number is 1");
        		break;
        	}
        		
        		if(a[i+1]==a[i]+1) {
        			continue;
        		}
        		else {
        			int min = a[i]+1;
        			System.out.println("smallest number is "+min);
        			break;
        		}
        	}
        
	}

}
