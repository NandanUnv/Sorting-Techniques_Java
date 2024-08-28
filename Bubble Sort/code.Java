import java.util.*;

// bubble sort

public class Main {
    public static void main(String[] args) {
      
      int a[] = {20,200,400,300,10,5,500};
      
      for(int i=0; i<a.length-1; i++){
        
        
        for(int j=i+1; j<a.length; j++){
          if(a[i]>a[j]){
            int tp = a[i];
            a[i] = a[j];
            a[j] = tp;
          }
        }
      }
      
      for(int k: a){
        System.out.print(k+" ");
      }
  }
}
