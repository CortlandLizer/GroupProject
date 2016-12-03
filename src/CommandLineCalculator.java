
// TODO: Auto-generated Javadoc
/**
 * The Class CommandLineCalculator.
 */
public class CommandLineCalculator {
    private Double answer;
    private String calculatedAnswer;

    /**
     * this method checks that if the string submitted is a valid option, it
     * checks if it is a variable that needs to be stored if it is it stores it
     * and returns "variable stored" and if neither of those conditions are hit
     * it uses all the other methods in this program to perform the required
     * operations in the order of Parentheses, Multiplication, Division,
     * Addition, Subtraction (PMDAS) and returns the final answer
     * 
     * @param str
     *            the string inputed by the user
     * @return calculatedAnswer the completed answer of the entered equation, if
     *         it was a variable return "variable stored", if it was an invalid
     *         entry return "invalid entry"
     */
    public String calculator(String str) {

        /*
         * - call the private method storeVariable return “variable stored”
         * 
         * -replace all variable with numbers using call getVariable - look in
         * string for the operators and do the operations in pairs calling the
         * methods in order, Parentheses Multiplication Division Addition
         * Subtraction (PMDAS) example:
         */
        return calculatedAnswer;
    }

    /**
     * this method checks if the inputed method is a string is meant to be
     * stored as a variable which is determined by the use of a single "="
     * symbol if it is meant to be a variable the it stores the solved equation
     * and corresponding variable in a hash table.
     * 
     * @param str
     *            the string inputed by the user
     */
    private void storeVariable(String str) {
        // - look in string for “=” to separate variables from equations if
        // there is one “=”store
        // the variables and the equation

        // -Save the variable and the answer to the corresponding equation in a
        // hash table
    }

    /**
     * this method takes the given string and returns the answer to that given
     * variable, if the string is not a stored variable it returns "variable not
     * found"
     * 
     * @param str
     *            the string to be checked if it is a variable and then found in
     *            the hash table
     * @return getVar the variables corresponding answer that was in the has
     *         table
     */

    private String getVariable(String str) {
        String getVar = "";

        return getVar;
    }

    /**
     * this method subtracts the second variable given from the first variable
     *
     * @param x
     *            the number that you will subtract from
     * @param y
     *            the number that you will subtract from x
     * @return answer the value of (x-y)
     */
    private double subtraction(String x, String y) {
        // - convert strings to doubles and perform the operation for
        // subtraction

        return answer;
        // - return the double
    }

    /**
     * this method adds the first number to the second number.
     *
     * @param x
     *            the first number to be added
     * @param y
     *            the second number to be added
     * @return answer of the first number added to the second number (x+y)
     */
    private double addition(String x, String y) {
        // - convert strings to doubles and perform the operation for addition

        return answer;
        // - return the double
    }

    /**
     * this method divides the first number by the second number.
     *
     * @param x
     *            the number that is being divided
     * @param y
     *            the number that you are dividing by
     * @return answer the first number divided by the second number (x/y)
     */
    private double division(String x, String y) {
        // - convert strings to doubles and perform the operation for division

        return answer;
        // - return the double
    }

    /**
     * this method multiplies the first number by the second number
     *
     * @param x
     *            the first number to be multiplied
     * @param y
     *            the second number to be multiplied
     * @return answer the first number multiplied by the second number (x/y)
     */
    private double multiplication(String x, String y) {
        // - convert strings to doubles and perform the operation for
        // multiplication

        return answer;
    }

    /**
     * takes in the given subStrings that is between the two parentheses and
     * sends it back through method and converts that answer to a string
     * 
     * @param str
     *            the string inside the parentheses
     * @return strPar value of the substring converted back to a string 
     */
    private String parentheses(String str) {
        String strPar = "";
        

        return strPar;
    }

}
