import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      
      int a[] = {20,200,400,300,10,5,500,25};
      
      
      for(int i=0; i<a.length; i++){
        
        int min = i;
        
        for(int j=i+1; j<a.length; j++){
          
          if(a[min]>a[j]){
            min = j;
          }
          
        }
        
        int tp = a[i];
        a[i] = a[min];
        a[min] = tp;
        
      }
      
      for (int k: a){
        System.out.print(k+" ");
      } 
  }
}
