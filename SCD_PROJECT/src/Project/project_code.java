package Project;

import java.util.Scanner;


public class project_code{
    private double num1;
    private double num2;
    private boolean isOn;

    public project_code() {
        this.isOn = false;
    }

    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }

    public double percentage() {
        return (num1 / 100) * num2;
    }

    // ON/OFF methods
    public void turnOn() {
        this.isOn = true;
        System.out.println("Calculator is ON");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Calculator is OFF");
    }

    public boolean isOn() {
        return isOn;
    }

    // Main method to run the calculator
    public static void main(String[] args) {
    	project_code calc = new project_code();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Calculator!");
        System.out.println("Type 'on' to turn on the calculator and 'off' to turn it off.");

        while (true) {
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("on")) {
                calc.turnOn();
            } else if (command.equalsIgnoreCase("off")) {
                calc.turnOff();
                break;
            }

            if (calc.isOn()) {
                System.out.println("Enter the first number:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();
                calc.setNumbers(num1, num2);

                System.out.println("Choose an operation: add, subtract, multiply, divide, percentage");
                String operation = scanner.next();

                switch (operation.toLowerCase()) {
                    case "add":
                        System.out.println("Result: " + calc.add());
                        break;
                    case "subtract":
                        System.out.println("Result: " + calc.subtract());
                        break;
                    case "multiply":
                        System.out.println("Result: " + calc.multiply());
                        break;
                    case "divide":
                        System.out.println("Result: " + calc.divide());
                        break;
                    case "percentage":
                        System.out.println("Result: " + calc.percentage());
                        break;
                    default:
                        System.out.println("Invalid operation");
                }
                System.out.println("Type 'on' to continue or 'off' to turn off the calculator.");
            }
        }

        scanner.close();
    }
}
