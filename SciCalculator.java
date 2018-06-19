import java.util.Scanner;
import java.lang.Math;

public class SciCalculator {

    public static void main(String args[]) {

        Scanner myScnr = new Scanner(System.in);

        double currentResult = 0.0;
        double operand1;
        double operand2;
        double calcSum;
        double calcSub;
        double calcMultiply;
        double calcDivide;
        double calcExp;
        double calcLog;
        double sumCalculations = 0.0;
        double avgCalculations;
        double roundAvg;
        int numCalculations = 0;
        int menuSelection;
        boolean calculator = true;


        while (calculator) {
            // Displaying Result
            System.out.println("Current Result: " + currentResult + "\n");

            boolean menu = true;

            while (menu) {
                // Displaying the Menu
                System.out.println("Calculator Menu\n---------------");
                System.out.println("0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");

                boolean selection = true;

                while (selection) {

                    System.out.print("Enter Menu Selection: ");
                    menuSelection = myScnr.nextInt();

                    // Exiting the Program
                    if (menuSelection == 0) {
                        System.out.println("\nThanks for using this calculator. Goodbye!");
                        selection = false;
                        menu = false;
                        calculator = false;

                    } else if (menuSelection >= 1 && menuSelection < 8) {


                        switch (menuSelection) {
                            // Adding
                            case 1:
                                System.out.print("Enter first operand: ");
                                operand1 = myScnr.nextDouble();
                                System.out.print("Enter second operand: ");
                                operand2 = myScnr.nextDouble();
                                calcSum = operand1 + operand2;
                                currentResult = calcSum;
                                System.out.println("");
                                numCalculations++;
                                sumCalculations = sumCalculations + currentResult;
                                selection = false;
                                menu = false;
                                break;
                            // Subtracting
                            case 2:
                                System.out.print("Enter first operand: ");
                                operand1 = myScnr.nextDouble();
                                System.out.print("Enter second operand: ");
                                operand2 = myScnr.nextDouble();
                                calcSub = operand1 - operand2;
                                currentResult = calcSub;
                                System.out.println("");
                                numCalculations++;
                                sumCalculations = sumCalculations + currentResult;
                                selection = false;
                                menu = false;
                                break;
                            // Multiplying
                            case 3:
                                System.out.print("Enter first operand: ");
                                operand1 = myScnr.nextDouble();
                                System.out.print("Enter second operand: ");
                                operand2 = myScnr.nextDouble();
                                calcMultiply = operand1 * operand2;
                                currentResult = calcMultiply;
                                System.out.println("");
                                numCalculations++;
                                sumCalculations = sumCalculations + currentResult;
                                selection = false;
                                menu = false;
                                break;
                            // Dividing
                            case 4:
                                System.out.print("Enter first operand: ");
                                operand1 = myScnr.nextDouble();
                                System.out.print("Enter second operand: ");
                                operand2 = myScnr.nextDouble();
                                calcDivide = operand1 / operand2;
                                currentResult = calcDivide;
                                System.out.println("");
                                numCalculations++;
                                sumCalculations = sumCalculations + currentResult;
                                selection = false;
                                menu = false;
                                break;
                            // Exponential
                            case 5:
                                System.out.print("Enter first operand: ");
                                operand1 = myScnr.nextDouble();
                                System.out.print("Enter second operand: ");
                                operand2 = myScnr.nextDouble();
                                calcExp = Math.pow(operand1, operand2);
                                currentResult = calcExp;
                                System.out.println("");
                                numCalculations++;
                                sumCalculations = sumCalculations + currentResult;
                                selection = false;
                                menu = false;
                                break;
                            // Logarithm
                            case 6:
                                System.out.print("Enter first operand: ");
                                operand1 = myScnr.nextDouble();
                                System.out.print("Enter second operand: ");
                                operand2 = myScnr.nextDouble();
                                calcLog = Math.log(operand2) / Math.log(operand1);
                                currentResult = calcLog;
                                System.out.println("");
                                numCalculations++;
                                sumCalculations = sumCalculations + currentResult;
                                selection = false;
                                menu = false;
                                break;

                            case 7:
                                // Calculating the average
                                if (menuSelection == 7 && numCalculations == 0) {
                                    System.out.println("\nError: No calculations yet to average!\n");

                                } else if (menuSelection == 7 && numCalculations >= 1) {
                                    System.out.println("\nSum of calculations: " + sumCalculations);
                                    System.out.println("Number of calculations: " + numCalculations);
                                    avgCalculations = sumCalculations / numCalculations;
                                    roundAvg = Math.round(avgCalculations * 100.0) / 100.0;
                                    System.out.println("Average of calculations: " + roundAvg + "\n");
                                }


                        }

                    }

                    // Invalid Selection
                    else {
                        System.out.println("\nError: Invalid selection!\n");
                    }


                }


            }

        }

    }

}
