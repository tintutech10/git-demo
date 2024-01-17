package com.tutorials;

public class Test2 {
	
	static void calculate(int n) {
		
		//System.out.println(Integer.toBinaryString(n));
		Long a =0L;
		try {
		a = (long) Integer.parseInt(Integer.toBinaryString(n).trim());
		System.out.println(a);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		char[] digits = String.valueOf(a).toCharArray();
		int count=0;
		for(int i=0;i<digits.length-1;i++) {
			//System.out.println(digits[i]);
			if(digits[i]=='1') {
				System.out.println("1");
				if(digits[i+1]=='0') {
					System.out.println("2");
				for(int j=i+1;j<digits.length;j++) {
					if(digits[j]=='1') {
						count++;
						i++;
						System.out.println("count of digit"+count+" "+i);
					}
					else {
						System.out.println("3");
						i++;
						continue;
					}
				}
			}
				else {
					System.out.println("4");
					continue;
				}
		}
			else
			{ System.out.println("5");
				continue;
			}
	}
		System.out.println(count+"----count");
	}

	public static void main(String[] args) {
		calculate(1064);

	}

}
