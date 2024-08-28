import java.util.*;

public class Main {
  
  public static void Quick(int a[], int start, int end){
    
    int i=start;
    int j = end;
    
    if(i>=j){
      return;
    }
    
    while(i<j){
      int pt = i+1;
      
      while(a[i]<a[pt]){
        i++;
      } 
      while(a[j]>a[pt]){
        j--;
      }
      
      if(i<=j){
        int tp = a[i];
        a[i] = a[j];
        a[j] = tp;
        i++;
        j--;
      }
    }
    
    if(start<j){
      Quick(a, start, j);
    }
    
    if(i<end){
      Quick(a, i, end);
    }
  }
    public static void main(String[] args) {
      
      int a[] = {20,200,400,300,10,5,500};
      
      Quick(a, 0, a.length-1);
      
      for(int u: a){
        System.out.print(u+" ");
      }
  }
}
