//Huo chen
//Last modified 5/10/2022
//This program will check for the following:
//1. Creating an LinkedList object
//2. add() and size() method

public class LinkedListTestDay1 {
    public static void main(String args[]) {
      System.out.println("Day 1: Testing Starts");
      System.out.print("1. Creating a LinkedList... ");
      LinkedList l = new LinkedList<String>();
      System.out.println("Passed");
      
      System.out.print("2. Adding two elements... ");
      l.add("A");
      l.add("B");
      System.out.println("Passed");
      
      System.out.print("3. Checking the size() method... ");
      if(l.size()==2){
          System.out.println("Passed");
      }else{
          System.out.println("Failed\tCorrect Answer: 2;\tYour Answer:" + l.size());
      }
    }
}

