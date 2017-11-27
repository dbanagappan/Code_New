
import java.io.IOException;
import java.util.*;

public class BalancedNot  
{
  public static int[] balancedOrNot(String[] expressions, int[] maxReplacements)
  {
    int[] results = new int[expressions.length];
    for(int i = 0; i < expressions.length; i++){
      results[i] = helper(expressions[i], maxReplacements[i]);
    }
    return results;
  }
  
  public static int helper(String expression, int maxReplacement) 
  {
    Stack<Character> stack = new Stack<Character>();
    int count = 0;
    for(char ch : expression.toCharArray()){
      if(ch == '<'){
        stack.push('>');
      }
      else if(stack.isEmpty()){
        count++;
      }
      else{
        stack.pop();
      }
    }
    
    if(!stack.isEmpty()){
      count += stack.size();
    }
    return count <= maxReplacement ? 1 : 0; 
  }
  
  public static void main(String[] args) throws IOException 
  {
    String[] input = {"<<<><><>", "<><>>"};  
    int[] in = {2, 2};
    int[] res = balancedOrNot(input, in);
    for(int i : res){
      System.out.println(i);
    }
  }
  
 }