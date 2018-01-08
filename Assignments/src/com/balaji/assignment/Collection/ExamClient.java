/**
 * 
 */
package com.balaji.assignment.Collection;

import com.balaji.assignment.utill.UserInputValidations;

/**
 * @author spaneos
 *
 */
public class ExamClient {
	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
        QuestionContainer container = null;
        int ch = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter 1 to begin test");
            System.out.println("Enter 2 to show result");
            System.out.println("Enter 3 to exit");
            ch = UserInputValidations.validateInteger();
            switch (ch) {
                case 1:
                    container = new QuestionContainer();
                    container.beginTest();
                    System.out.println("Test has been finished.");
                    flag = true;
                    break;
                case 2:
                    if (container != null) {
                        container.showResult();
                    } else {
                        System.out.println("First take test and then see result.");
                    }
                    flag = true;
                    break;
                case 3:
                    System.out.println("Thank you!!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter only 1 to 3");
                    flag = true;
                    break;
            }

        }
    }
}
