package com.tutorials;

class Solution {
    public int solution(int[] A) {
        int temp=0;
        int min=0;
		for (int i = 0; i < A.length; i++) {     
            for (int j = i+1; j < A.length; j++) {     
               if(A[i] > A[j]) {    
                   temp = A[i];    
                   A[i] = A[j];    
                   A[j] = temp;    
               }      
            }     
        }  
		for (int i = 0; i < A.length; i++) {     
			//System.out.println(A[i]);
		}
		//System.out.println("A[0]"+A[0]);
		if((A[0]==0)|| (A[0]!=1)){
			if((A[0]==0)&& (A[1]!=1)){
				//System.out.println("smallest number is 1---");
				min=1;
			}
			else if((A[0]!=0)&& (A[0]!=1)){
				//System.out.println("smallest number is 1");
				min=1;
			}
		
		//return min;
	  else {
		//System.out.println("In else...");
	
	  for(int i=1;i<A.length-1;i++) {
	  
	  
	  if(A[i+1]==A[i]+1) {
		  //System.out.println("In 2nd if...");
		  continue; 
		  } 
	  else { 
		  System.out.println("i "+i);
		  min = A[i]+1;
		  break;
	  }
	  }
	  //System.out.println("smallest number is "+min); //return min; break; } }
	 
	  }
		}
	else {
			//System.out.println("In outer else...");
		
		  for(int i=0;i<A.length-1;i++) {
			  if(A[i]==A[i+1]) {
				  //System.out.println("In equal if...");
				  continue; 
				  } 
		  
			  else if(A[i+1]==A[i]+1) {
			  //System.out.println("In 2nd if...");
			  if(i==(A.length-2)) {
				  min = A[i+1]+1;
			  }
			  else continue; 
			  } 
		    else { 
			  min = A[i]+1;
			  break;
		  }
		  }
		  //System.out.println("smallest number is "+min); //return min; break; } }
		 
		  }
		 return min; 
    }
	 

    public static void main(String args[]){
        Solution s = new Solution();
        int a[] = new int[]{1, 2, 3};
        int min = s.solution(a);
        System.out.println("smallest number is "+min);
    }
}
