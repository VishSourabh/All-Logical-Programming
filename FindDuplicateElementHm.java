/*1)Write a Java Program to find duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  2, 5, 6
*/
import java.util.*;
class FindDuplicateElementHm{
	public static void main(String[] args){
		int a[]={1, 2, 5, 5, 6, 6, 7, 2,9,9};
	    Map<Integer,Integer> hm=new HashMap<Integer,Integer>();	
        Integer no=null,number=null;
		for (int i=0;i<a.length;i++){
			no=hm.get(a[i]);
			/*if (no==null){
				hm.put(a[i],1);
			}else
				hm.put(a[i],2);*/

            if (no!=null){
				hm.put(a[i],2);
			}else
				hm.put(a[i],1);
            number=hm.get(a[i]);
			 if (number>1){
		 System.out.println(a[i]);
     }
			 
        }//for
    
       
	}//main
}//class
