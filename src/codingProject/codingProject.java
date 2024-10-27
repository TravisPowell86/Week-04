package codingProject;

public class codingProject {

	public static void main(String[] args) {
		

		System.out.println("---------- #1 Ages ----------");
		//1. Create "ages" array of int
			//integer[array] named "ages" = list of integers
			int[] ages = {
					3, 
					9, 
					23, 
					64, 
					2, 
					8, 
					28, 
					93};
		
		//1a. Subtract first element from last element
			//integer named "subtraction" = [last element of "ages" (93) minus first element (3)
			int subtraction = ages[ages.length - 1] - ages[0];
	        	System.out.println(subtraction);
	    
	    //1bi. Create "ages2" array of int (9 values)
	        //integer[array] named "ages2" = list of integers
	        int[] ages2 = {
	        		10, 
	        		15, 
	        		20, 
	        		25, 
	        		30, 
	        		35, 
	        		40, 
	        		45,  
	        		69};
	    
	    //1bii. Subtract first element from last element
	        //integer named "subtraction2" = [last element of "ages2" (69) minus first element (10)
	        int subtraction2 = ages2[ages2.length - 1] - ages2[0];
        		System.out.println(subtraction2);
	         
        //1biii. "ages2" is dynamic
        	//integer[array] variable named "newAges2" = increase "ages2" length by 1
        	int[] newAges2 = new int[ages2.length + 1];
        	
        	//Copies all elements from the beginning of "ages2" to "newAges2"
        	System.arraycopy(ages2, 0, newAges2, 0, ages2.length);
        	
        	//Adding new integer to the end of "newAges2"
        	newAges2[ages2.length] = 13;
        	
        	//Subtracting the first element (10) from the NEW last element (13)
        	subtraction2 = newAges2[newAges2.length - 1] - newAges2[0];
        	
        	//Showing that the previous line worked properly
        	System.out.println(subtraction2);
        		
        //1c. Average of "ages2"
        	//for loop to calculate the average of "newAges2" (32.0)
		    double sum = 0;
		    
		    for (int age : newAges2) {
		    	sum += age;
		    	}
		    
		    double ages2Average = sum / newAges2.length;
		        System.out.println(ages2Average);
		        
		        
		System.out.println("---------- #2 Names ----------");
        //2. Create a String array called "names" and list the names
		        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		        
		//2a. for loop to calculate the average number of letters in the names. (double is used for accuracy)
				double averageSum = 0;
				
				for (int i = 0; i < names.length; i++) {
					averageSum += names[i].length();
				}
				double average = averageSum / names.length;
			      System.out.println(average);
				
				
		//2b. Concatenate the names together with each separated by a space
				String allNames = "";
			       for (int i = 0; i < names.length; i++) {
			           allNames += names[i] + " ";
				}
				System.out.println(allNames);
				
				
		System.out.println("---------- #3 Last Element of Array ----------");
		//3. Access the last element of an array
			System.out.println("array[arr.length - 1]");
			
			
		System.out.println("---------- #4 First Element of Array ----------");
		//4. Access the first element of an array
			System.out.println("array[0]");
			
			
		System.out.println("---------- #5 Name Lengths ----------");
		//5. Create an int array called "nameLengths."
		int[] nameLengths = new int[names.length];
		
		// for loop to show the lengths of the previous names
		for(int i =0; i <= names.length-1; i++) 
			nameLengths[i] = names[i].length();
		
		for (int lengths : nameLengths) 
			System.out.println(lengths);
		
		
		System.out.println("---------- #6 Sum of Name Lengths ----------");
		//6. Calculate the sum of the "nameLengths" elements
		int lengthsSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			lengthsSum += nameLengths[i];
		}
	       System.out.println(lengthsSum);
	
	       
	       
	    System.out.println("---------- #7 Word x Times ----------"); }
		//7. Method to concatenate words a variable amount of times
	   	public static String concatenateWord(String word, int num) {
		
	   	//String variable to hold the result
			String result = "";
			
		
		//Looping through the word x times
			for(int i = 0; i < num ; i++) {
				result += word;
			}
			return result;
	   	}
	   
	   
		//---------- #8 Full Name ----------//
		//8. Method to combine firstName and lastName, separated by a space.
		public static String fullName(String firstName, String lastName) {
			
			String fullName = firstName + " " + lastName;
			
			return fullName;
	   	}
		
		
		//---------- #9 Greater Than 100 ----------//
		//9. Create a method to determine if the sum of variable integers are greater than 100
		public static boolean greaterThan100(int[] num) {
			
			int sum = 0;
			
			for(int i: num) {
				sum += i;
			}
			if(sum > 100) {
				return true;
			} else {

			return false;
			}
		}

		
		//---------- #10 Double Average ----------//
		//10. Create a method that averages all of the elements in a double array.
		public static double doubleAverage(double[] n) {
			
			double sum = 0;
			double average = 0;
			
			for(double i : n) {
				sum += i;
			}
			
			average = sum / n.length;
			
			return average;
		}
		
		
		//---------- #11 First > Second Array ----------//
		//11. Create a method to return true if the first double is greater than the second double
		public static boolean firstGreater(int one, int two) {
			
			double[] firstDouble = new double[one];
			double[] secondDouble = new double[two];
			
			double firstAverage = 0;
			double secondAverage = 0;
			
			for (int i = 0; i < firstDouble.length; i++) {
				firstAverage += firstDouble[i];
			}
			double averageOne = firstAverage / firstDouble.length;
			
			for (int i = 0; i < secondDouble.length; i++) {
				secondAverage += secondDouble[i];
			}
			
			double averageTwo = secondAverage / secondDouble.length;
			
			return averageOne > averageTwo;
		}
			
		
			//---------- #12 Will Buy Drink ----------//
			//12. Create a method that will return true if it is hot outside and money is greater than $10.50
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside && moneyInPocket > 10.50) {
				return true;
			} else {
			return false;
			}
		}
			
		
		//---------- #13 My Method ----------//
		//13. Create a method of your own
		// Method to add 2 numbers together
		// I chose this one because it is simplistic and I am very tired after coding all of this
		    public static int add(int num1, int num2) {

		        return num1 + num2;

		    }

		    public static void finalAnswer(String[] args) {

		        int result = add(9, 7);

		        System.out.println("Answer = " + result);
		    }

		}