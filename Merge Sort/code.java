import java.util.*;

// merge sort

public class Main {
  
  public static void mergsrt(int a[]){
    if(a.length<=1){
      return;
    }
  
      
      int mid = a.length/2;
      
      int l[] = new int[mid];
      
      int r[] = new int[a.length-mid];
      
      for(int i=0; i<mid; i++){
        l[i] = a[i];
      }
      
      for(int j=mid; j<a.length; j++){
        r[j-mid] = a[j];
      }
      
      mergsrt(l);
      mergsrt(r);
      merge(a,l,r);
    
  }
  
  public static void merge(int a[], int l[], int r[]){
    int i=0;
    int j= 0;
    int k = 0;
    
    while(j<l.length && k<r.length){
      if(l[j]<r[k]){
        a[i++] = l[j++];
      }
      else{
        a[i++] = r[k++];
      }
    }
    
    while(j<l.length){
      a[i++] = l[j++];
    }
    
    while(k<r.length){
      a[i++] = r[k++];
    }
  }
    public static void main(String[] args) {
      
      int a[] = {20,200,400,300,10,5,500};
      
      mergsrt(a);
      
      for(int g: a){
        System.out.print(g+" ");
      }
      
  }
}
