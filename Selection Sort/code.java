import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      
      int a[] = {20,200,400,300,10,5,500,25};
      
      
      for(int i=0; i<a.length; i++){
        
        int min = i;
        
        int min_v = a[i];
        
        for(int j=i+1; j<a.length; j++){
          
          if(a[min]>a[j]){
            min = j;
            min_v = a[j];
          }
          
        }
        
        int tp = a[i];
        a[i] = min_v;
        a[min] = tp;
        
      }
      
      for (int k: a){
        System.out.print(k+" ");
      } 
  }
}
