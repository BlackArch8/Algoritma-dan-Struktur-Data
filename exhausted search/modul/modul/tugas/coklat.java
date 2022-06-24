
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class coklat{
    protected static int hasil = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        LinkedList <Integer> panjangcoklat = new LinkedList <Integer>();
        for (int i = 0; i < n; i++){
            int coklat = sc.nextInt();
            panjangcoklat.add(coklat);
            sum += coklat;
        }
        int ratacoklat = sum/2;
        if(sum%2!=0){
            System.out.println("coklat tidak dapat dibagi 2");
        }else{
            kombinasi(panjangcoklat,ratacoklat);
            if(hasil==2){
                System.out.println ("coklat dapat dibagi sama rata");
            }else{
                System.out.println("coklat tidak dapat dibagi 2");
            }
        }



    }
    public static void kombinasi(LinkedList<Integer>panjangcoklat,int ratacoklat){
        Collections.sort(panjangcoklat);
        LinkedList<Integer> temp = new LinkedList<Integer>();
        isikombinasi(0,0,ratacoklat,temp,panjangcoklat);
    }
    public static void isikombinasi(int p,int tot,int ratacoklat,LinkedList<Integer> temp,LinkedList <Integer> panjangcoklat){
        if(tot == ratacoklat){
            
            hasil++;
            return;
           
            
        }
        
        for(int i = p;i<panjangcoklat.size();i++){
            if(tot + panjangcoklat.get(i) > ratacoklat){
                continue;
            }
            if(i>p && panjangcoklat.get(i) == panjangcoklat.get(i-1)){
                continue;

            }
            temp.add(panjangcoklat.get(i));
            isikombinasi(i+1,tot+panjangcoklat.get(i),ratacoklat,temp,panjangcoklat);
            temp.remove(temp.size()-1);
        }

    }
    
}