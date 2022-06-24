import java.util.Scanner;
import java.util.Arrays;

public class rapat2 {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int masukan = in.nextInt();

    while(masukan != 0)
    {
    String jam[] = new String[masukan];
    String wkt[] = new String[masukan];
    int point[] = new int [masukan];
    
        
        for(int i = 0; i< masukan ; i++)
        {
            jam[i] = in.next();
            wkt[i] = in.next();
            int temp_poin = 0;
            int hour = Integer.parseInt(jam[i].substring(0,2));
            int min = Integer.parseInt(jam[i].substring(3,5));
            
            
            if((wkt[i].charAt(0))=='a')
            {
                if(hour == 12)
                {
                    temp_poin = min;
                }
                else
                {
                    temp_poin = hour * 60 + min;
                }
            }
            else if((wkt[i].charAt(0))=='p')
            {
                if(hour == 12)
                {
                    temp_poin = min + 720;
                }
                else
                {
                    temp_poin = hour * 60 + min + 720;
                }
            }
            point[i] = temp_poin;
        }
        
            int temp = 0;
            String temp2;
            String temp3;
            
        for(int i = 0; i < masukan; i++)
        {
            for(int j = 1; j < (masukan-i); j++)
            {
                if(point[j-1] > point[j])
                {
                    temp = point[j-1];
                    point[j-1] = point[j];
                    point[j] = temp;
                
                    temp2 = jam[j-1];
                    jam[j-1] = jam[j];
                    jam[j] =  temp2;
                        
                    temp3 = wkt[j-1];
                    wkt[j-1] = wkt[j];
                    wkt[j] = temp3;
                }
            }

        System.out.println(jam[i] + " " + wkt[i]);
        }
        
    System.out.println();
    masukan = in.nextInt();
    }
}
}
