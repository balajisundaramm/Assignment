package com.balaji.assignment.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.balaji.assignment.utill.UserInputValidations;
/**
 * 
 * @author spaneos
 *
 */
public class QuestionContainer {
	 private List list = new ArrayList<Question>();
	    private int ccount;
	    private int wcount;
	    /**
	     * 
	     * @return the Question's list
	     */
	    public List<Question> listOfQuestions() {
	        String q = "Which of these keyword must be used to inherit a class?";
	        String o1 = "super";
	        String o2 = "this";
	        String o3 = "extent";
	        String o4 = "extends";
	        Question q1 = new Question(q, o1, o2, o3, o4, o4);
	        q = "Using which of the following, multiple inheritance in Java can be implemented?";
	        o1 = "Interfaces";
	        o2 = "Multithreading";
	        o3 = "Protected methods";
	        o4 = "Private methods";
	        Question q2 = new Question(q, o1, o2, o3, o4, o1);
	        q = "All classes in Java are inherited from which class?";
	        o1 = "java.lang.class";
	        o2 = "java.class.inherited";
	        o3 = "java.class.object";
	        o4 = "java.lang.Object";
	        Question q3 = new Question(q, o1, o2, o3, o4, o4);
	        q = "Which of these keywords can be used to prevent Method overriding?";
	        o1 = "static";
	        o2 = "constant";
	        o3 = "protected";
	        o4 = "final";
	        Question q4 = new Question(q, o1, o2, o3, o4, o4);
	        q = "Which of these packages contains abstract keyword?";
	        o1 = "java.lang";
	        o2 = "java.util";
	        o3 = "java.io";
	        o4 = "java.system";
	        Question q5 = new Question(q, o1, o2, o3, o4, o1);
	        list.add(q1);
	        list.add(q2);
	        list.add(q3);
	        list.add(q4);
	        list.add(q5);
	        return list;
	    }
	    /**
	     * 
	     * @return the result of the test
	     */
	    public int beginTest() {
	        int ch = 0;
	        for (Question question : listOfQuestions()) {
	            boolean flag = true;
	            while (flag) {
	                System.out.println("Question : " + question.getQuestion());
	                System.out.println("A) " + question.getOption1());
	                System.out.println("B) " + question.getOption2());
	                System.out.println("C) " + question.getOption3());
	                System.out.println("D) " + question.getOption4());
	                System.out.println("Enter Your Option");
	                Scanner scanner = new Scanner(System.in);
	                char option = UserInputValidations.validateChar();
	                switch (option) {
	                    case 'A':
	                        if(question.getOption1().equals(question.getAnswer()))
	                            ccount++;
	                        else
	                            wcount++;
	                    flag = false;
	                    break;
	                    case 'B':
	                        if (question.getOption2().equals(question.getAnswer()))
	                            ccount++;
	                        else
	                            wcount++;
	                    flag = false;
	                    break;
	                    case 'C':
	                        if(question.getOption3().equals(question.getAnswer()))
	                            ccount++;
	                        else
	                            wcount++;
	                    flag = false;
	                    break;
	                    case 'D':
	                        if(question.getOption4().equals(question.getAnswer()))
	                            ccount++;
	                        else
	                            wcount++;
	                    flag = false;
	                    break;
	                    default:
	                        System.out.println("Enter only A or B or C or D");
	                        flag = true;
	                        break;
	                }
	            }
	        }
	        return ccount;
	    }
	    /**
	     * 
	     */
	    public void showResult(){
	        System.out.println("Test Result");
	        System.out.println("Total number of question : 5");
	        System.out.println("Correct : "+ccount);
	        System.out.println("Wrong : "+wcount);
	        System.out.println("Result : "+((ccount>2)?"Pass":"Fail"));
	    }
}
