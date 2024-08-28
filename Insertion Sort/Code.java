import java.util.*;

// Insertion sort

public class Main {
  
  public static void Insrt(int a[]){
    
    for(int i=1; i<a.length; i++){
      
      int val = a[i];
      int j = i-1;
      while(j>=0 && val<=a[j]){
          a[j+1] = a[j];
          j--;
      }
      a[j+1] = val;
  
    }
  }
    public static void main(String[] args) {
      
      int a[] = {20,200,400,300,10,5,500};
      
      Insrt(a);
      
      for(int k: a){
        System.out.print(k+" ");
      }
  }
}
