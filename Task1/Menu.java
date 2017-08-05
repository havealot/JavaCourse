// 20 point
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main(String [] args){
	 		
			int dollar = 4;
			if(dollar>0){ // make change from here
				dollar=(dollar>3?3:dollar);
				switch(dollar){   // don't use break and don't repeat words (fish,rice,bread) and use ternary
					case 3:
						System.out.print("the bread\nAnd");
					case 2:
						System.out.print(dollar==2?"the ":" ");
						System.out.print("rice\nAnd");
					case 1:
						System.out.print(dollar==1?"the ":" ");
						System.out.println("fish");
				}
			}
	
	    
		}
}
  

/*
dollar = 1
-----------
the fish

dollar = 2
----------
the rice
And fish

dollar >= 3 
----------
the bread
And rice
And fish
*/
