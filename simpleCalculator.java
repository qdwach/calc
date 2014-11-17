//TODO: Take 2 values
//TODO: Ask what to do with them 
//TODO: And how many times
//TODO: Print out result

import java.util.Scanner; 

class simpleCalculator{
	//declare array of values for calculations
	float[] values = new float[2];
	//declare new scanner object
	Scanner input = new Scanner(System.in);
	public void calculate(){
		//Ask for input of first value
		//Change value to float and place in array
		System.out.println("Please input the first number");
		String userInput = input.nextLine();
		values[0] = Float.parseFloat(userInput);
		//If first value is still default ask for it again
		//If it isn't ask for second value
		if(values[0] != 0.0f){
			System.out.println("Please input the second number");
			userInput = input.nextLine();
			values[1] = Float.parseFloat(userInput);
		}
		else{
			while(values[0] == 0.0f){
				System.out.println("Please input the first number");
				userInput = input.nextLine();
				values[0] = Float.parseFloat(userInput);
			}
			System.out.println("Please input the second number");
			userInput = input.nextLine();
			values[1] = Float.parseFloat(userInput);
		}
		// Ask for operation to be performed
		System.out.println("Please select action to be performed");
		System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division");
		String operator = input.nextLine();
		int operatorInt = Integer.parseInt(operator);
		switch(operatorInt){
			case 1: values[2] = values[0] + values[1];
				break;
			case 2: values[2] = values[0] - values[1];
				break;
			case 3: values[2] = values[0] * values[1];
				break;
			case 4: values[2] = values[0] / values[1];
				break;
		}
		System.out.println("The result of your calculation is: " + values[2]);
	}

	public static void main (String[] args){
	simpleCalculator progInst = new simpleCalculator();
	progInst.calculate();
	}
}
