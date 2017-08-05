// 10 point
class Draw {
 
	public static void main(String [] args){
 
		System.out.print(
			String.format("%65s\n", "*").replace(" ", "*") + 
			String.format("*%64s\n", "*") + 
			String.format("**%63s\n", "**") + 
			String.format("***%62s\n", "***") + 
			String.format("****%61s\n", "****") + 
			String.format("*****%60s\n", "*****") + 
			String.format("**********%55s\n", "**********") + 
			String.format("%65s\n", "*").replace(" ", "*")
			); // make change here
 
	}
 
}




//the output 

/*


******************************************************************
*                                                                *
**                                                              **
***                                                            ***
****                                                          ****
*****                                                        *****
**********                                              **********
******************************************************************


*/
