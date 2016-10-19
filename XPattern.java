class XTest
{
	void printCross()
	{
		int size=5;
    		for (int r = 0; r < size; r++) 				//r represent the row
		{
        		for (int c = 0; c < size; c++) 			//c represent the column
			{
            			if (r == c || r + c == size - 1)	//this condition will check to 									print the'*' for X pattern 
				{
                			System.out.print("*");
            			} 
				else if((( c <= 3)&&(r <2))||(r >= c))	//this condition will check to 									print the '-'
				{
                		System.out.print("-");
            			}
				else
				{
				System.out.print(" ");
				}
        		}
		System.out.println(" ");				//It will helps to go for next 									line
    		}
	}
}
class XPattern
{
	public static void main(String[] args)
	{
		XTest x=new XTest();					//Initializing the object
		x.printCross();						//Calling a function 
	}
}