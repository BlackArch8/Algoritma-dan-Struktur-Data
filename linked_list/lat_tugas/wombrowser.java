package lat_tugas;
import java.util.Scanner;
import java.util.Stack;
public class wombrowser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String temp = input;
        Stack <String> stack_back = new Stack<String>();
        Stack <String> stack_forward = new Stack<String>();
        String url = "";
        String halsekarang = "";
       
        
        while(!temp.equals("end")){
            
            if(temp.equals("browse")){
                url = sc.next();
            }
            if(temp.equals("back") || temp.equals("forward")){
                if(temp.equals("back" )){
                    if((stack_back.isEmpty() ||stack_back.size()<2)){
                        System.out.println("gagal");
    
                    }else {
                        stack_forward.push(halsekarang);
                        stack_back.pop();
                        halsekarang = stack_back.peek();
                        System.out.println(halsekarang);
                    }

                }else if(temp.equals("forward")){
                    if(stack_forward.isEmpty()){
                        System.out.println("gagal");
                    }else{
                        halsekarang = stack_forward.peek();
                        System.out.println(halsekarang);
                        stack_back.push(halsekarang);
                        stack_forward.pop();
                        
                    }
                }
              
                

            }else if(temp.equals("browse")){
                stack_back.push(url);
                halsekarang = url;
                stack_forward.clear();
                System.out.println(halsekarang);
            }
            temp = sc.next();

            

        }
    }
   
        
    
    
}
