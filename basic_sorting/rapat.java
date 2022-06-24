
import java.util.Scanner;
public class rapat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int temp = n;
        while (temp!=0){
            String jam[] = new String [temp];
            String waktu[] = new String [temp];
            for(int i = 0;i<temp;i++){
                jam[i] = sc.next();
                waktu [i]= sc.next();
           }
           urutwaktu(jam, waktu);
           System.out.println();
           temp = sc.nextInt();

           }
           
           

        }
        


        
    
    private static void urutwaktu(String jam[],String waktu[]){
        int total[] = new int [jam.length];
        for(int i = 0;i<jam.length;i++){
            if(jam[i].length() == 5){
                if(waktu[i].equals("a.m.") && jam[i].substring(0,2).equals("12")){
            
                    total[i] = Integer.parseInt(jam[i].substring(3,5));
                


            }else if(waktu[i].equals("a.m.")){
                total[i] = Integer.parseInt(jam[i].substring(0,2))*60+Integer.parseInt(jam[i].substring(3,5));

            }else if(waktu[i].equals("p.m.") && jam[i].substring(0,2).equals("12")){
                total[i] = Integer.parseInt(jam[i].substring(0,2))*60+Integer.parseInt(jam[i].substring(3,5));
            

            }else if(waktu[i].equals("p.m.")){
                total[i] = (Integer.parseInt(jam[i].substring(0,2))+12)*60+Integer.parseInt(jam[i].substring(3,5));
            }

            }else{
                if(waktu[i].equals("a.m.")){
                total[i] = Integer.parseInt(jam[i].substring(0,1))*60+Integer.parseInt(jam[i].substring(2,4));

            }else if(waktu[i].equals("p.m.")){
                total[i] = (Integer.parseInt(jam[i].substring(0,1))+12)*60+Integer.parseInt(jam[i].substring(2,4));
            }
            }
            
     }
        int n = total.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(total[j]<total[min]){
                    min = j;
                }
            }
            int temp = total[min];
            total[min]=total[i];
            total[i]=temp;

            String temp2 = jam[min];
            jam[min]=jam[i];
            jam[i]=temp2;

            String temp3 = waktu[min];
            waktu[min]=waktu[i];
            waktu[i]=temp3;

        }
        for(int i = 0;i<jam.length;i++){
            System.out.println(jam[i] + " " + waktu[i]);

        }
        
        



   
}
    
}

