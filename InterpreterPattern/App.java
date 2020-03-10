package com.IntrepreterPattern.IntrepreterPattern;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    { 
    	Expression person1 = new TerminalExpression("Mopidevi"); 
    Expression person2 = new TerminalExpression("Purna"); 
    Expression isSingle = new OR(person1, person2); 
      
    Expression purna= new TerminalExpression("purna"); 
    Expression committed = new TerminalExpression("Committed"); 
    Expression isCommitted = new AND(purna, committed);     

    System.out.println(isSingle.interpreter("Deepika")); 
    System.out.println(isSingle.interpreter("Mani")); 
    System.out.println(isSingle.interpreter("Kusu")); 
      
    System.out.println(isCommitted.interpreter("Committed, purna")); 
     
    }
}