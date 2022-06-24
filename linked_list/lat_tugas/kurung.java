package lat_tugas;
import java.util.Scanner;
import java.util.Stack;
public class kurung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String kurung = sc.next();
            System.out.println(cekkurung(kurung));
        }
    }
    private static boolean cekkurung(String kurung){
        Stack <Character>stack = new Stack<>();
        
        for(int i = 0; i<kurung.length(); i++){
            if(kurung.charAt(i)=='['|| kurung.charAt(i)=='('||kurung.charAt(i)=='{'){
                 stack.push(kurung.charAt(i));


            }else{
                
                if(stack.isEmpty()){ 
                    return false;
                   
                }else if(!stack.isEmpty()){
                   Character temp = stack.pop();
                   if((temp == '(' && kurung.charAt(i)!=')' || temp == '{' && kurung.charAt(i)!='}'|| temp == '[' && kurung.charAt(i)!=']')){
                       return false;
                   }

                }
                
                

                }
            }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
  
            
        }
    }

