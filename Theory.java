package com.aadarsh2;

public class Theory {

	int x= 10;
	String name ="Aadarsh";
	boolean isFail = false;
	
	static int y =20;
	static String how ="fine";
	static boolean happy =true;
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Theory.happy);
		System.out.println(Theory.y);
		System.out.println(Theory.how);
		
		
		Theory a =new Theory();
		
		System.out.println(a.how);
		System.out.println(a.name);
        
		
		Theory b =new Theory();
		System.out.println(b.how);
		
		b.name = "changed for obj b";
		System.out.println(a.name);
		
	}

}


/*                                                                                   
 * << - --------------------------------------- -STATIC AND NON-STATIC VARIABLES ----------------------------------------------->>
 * 
 * 
 *       STATIC VARIABLES ---->    A static variable is also called a class variable and is common across the objects of the class
 *                                 and this variable can be accessed using class name as well.
 * 
 *                        ---->     A static variable can be accessed by static members as well as non-static member functions.  
 * 
 *     
 *                        ---->   A static variable acts as a global variable and is shared among all the objects of the class.
 *                                  (LINE --25, 30 )
 *                                  
 *                        ---->    A static variable is declared using static keyword. (LINE -- 9,10,11)            
 *                        
 *                        ---->    loaded in the context area RAM.
 *                                  
 *       
 *       NON-STATIC VARIABLES
 *                          ---> A non-static variables are specific to instance object in which they are created.
 *                             (LINE --  23 , 29 ) 
 *                          
 *                          ---> A non-static variable may occupy more space. Memory allocation may happen at run time.
 * 
 *                          ---> A normal variable is not required to have any special keyword.
 * 
 * 
 *                          ---> initailly it loaded inthe heap area when object are created then on execution comes in the context area
 *                          
 *               --->  
 *               Instance Variables: Instance variables are non-static variables and are declared in a class outside any method,
 *                                   constructor or block.
 * 
 *                           ----> Initialisation of Instance Variable is not Mandatory. Its default value is 0

 * 
 *                ---->
 *                Local Variables: A variable defined within a block or method or constructor is called local variable.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
