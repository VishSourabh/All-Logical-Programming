/*8)Write a Java Program to find common elements among below 3 Arrays?

Input: 

ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}

Output: 20, 80*/
import java.util.*;
class  FindCommonElementInArray{
	public static void main(String[] args){
       //given Array
	   int ar1[] = {1, 5, 10, 20, 40, 80};
       int ar2[] = {6, 7, 20, 80, 100};
       int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
	   
	   //Store all array element in set collection
	   Set<Integer> hs=new HashSet<Integer>();

	   //inhanced for loop for traverse the array
	   for (int no:ar1){
		   hs.add(no);//suppose first array coantain uniq element
	   }
	   for (int no :ar2){
		   boolean b=hs.add(no);
		   if (b==false){
			   System.out.println(no);
		   }
	   }//for
	   for (int no :ar3){
		   boolean b1=hs.add(no);

		   if(b1==false){
			System.out.println(no);
		   }
	   }


	}
}
