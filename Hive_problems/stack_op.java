import java.util.*;
class stack_op {
  public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    String st[] = sc.nextLine().split(",\\s*");
    Stack<Integer> stk = new Stack<>();
    for(String s : st){
        if(s.toLowerCase().startsWith("push")) {
          String sub = s.substring(s.indexOf("(")+1,s.indexOf(")"));
          int number = Integer.parseInt(sub);
          stk.push(number);
        } else if(s.equalsIgnoreCase("pop")) {
            if(!stk.empty()){
              stk.pop();
            } else {
              System.out.println("Stack is empty");
            }
        } 
    } System.out.println("Stack : "+stk);
    
  }
}