//Huo chen
//Last modified 5/10/2022
//This program will check for the following:
//1. Creating an LinkedList object
//2. toString method (example [A,B])
//3. two different types of add methods
//4. size(),clear(),equals(), isEmpty(), indexOf()

public class LinkedListTestDay2 {
  public static void main(String args[]) {
    String answerS, correctAnswerS;
    int answerI, correctAnswerI;
    System.out.println("Day 1: Testing Starts");
    System.out.print("1. Creating a LinkedList... ");
    LinkedList l = new LinkedList<String>();
    System.out.println("Passed");
      
    System.out.print("2. Adding two elements... ");
    l.add("A");
    l.add("B");
    System.out.println("Passed");
      
    System.out.print("3. Checking the size() method... ");
    answerI = l.size();
    correctAnswerI = 2;
    if(answerI==correctAnswerI){
      System.out.println("Passed");
    }else{
      System.out.println("Failed\tCorrect Answer: " + correctAnswerI + ";\tYour Answer:" + answerI);
    }

    System.out.print("4. Checking the toString() method... ");
    answerS = l.toString();
    correctAnswerS = "[A,B]";
    if(answerS.equals(correctAnswerS)){
      System.out.println("Passed");
    }else{
      System.out.println("Failed\tCorrect Answer: " + correctAnswerS + ";\tYour Answer:" + answerS);
    }

    System.out.print("5. Adding another element at index 1... ");
    l.add(1,"M");
    answerS=l.toString();
    correctAnswerS = "[A,M,B]";
    if(answerS.equals(correctAnswerS)){
      System.out.println("Passed");
    }else{
      System.out.println("Failed\tCorrect Answer: " + correctAnswerS + ";\tYour Answer:" + answerS);
    }
      
    System.out.print("6. Checking equals to... ");
    LinkedList l1 = new LinkedList<String>();
    LinkedList l2 = new LinkedList<String>();
    l2.add("A");
    l2.add("M");
    l2.add("B");
      
    if(!l.equals(l1) && l.equals(l2)){
      System.out.println("Passed");
    }else{
      System.out.println("Failed");
    }
    
    System.out.print("7. Checking indexOf()... ");
    if(l2.indexOf("M")==1 && l2.indexOf("J")==-1){
      System.out.println("Passed");
    }else{
      System.out.println("Failed");
    }
  
    System.out.print("8. Checking the clear() method... ");
    l2.clear();
    if(l2.size()==0){
      System.out.println("Passed");
    }else{
      System.out.println("Failed");
    }
    
    System.out.print("9. Checking the isEmpty() method... ");
    if(l2.isEmpty()){
      System.out.println("Passed");
    }else{
      System.out.println("Failed");
    }
}
