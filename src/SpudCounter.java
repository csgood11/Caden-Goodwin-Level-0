

/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Spud Counter
 *    Duration=.75
 *    Platform=Eclipse
 *    Type=Teacher instructions
 *    Objectives=for loop with if/else
 *    Optional=Yes
 *    
 ******************************************************************************/

/**	
 Print “1 potato, 2 potato,..... 9 potato”. [variation: “1 potato, 2 potato, 3 potato, 4, 5 potato, 6 potato, 7 potato, more”] 
 https://youtu.be/efMHLkyb7ho		
*/					

public class SpudCounter {
	public static void main(String[] args) {
		for(int ctr=1; ctr<8; ctr++) {
			if(ctr==4)
				System.out.println(ctr + " ");
			else 
				System.out.println(ctr  + " Potato");
		}		
		System.out.println("More");
	}}

