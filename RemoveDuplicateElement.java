/*Write a program to remove dupliacate element from Array[Sorted Array] this concept applicable only sorted array*/

class RemoveDuplicateElement{
	public static void main(String[] args){
		//this is my Array which is sorted
		int a[]={1, 2, 5, 5, 6, 6, 7, 2};
        int j=0;
		//create temp array
		int temp[]=new int[a.length];


        //i need to traverse that array and compare   a[i] with a[i+1] element
		for(int i=0;i<a.length-1;i++){

			//compare the element  a[i] with a[i+1] element
			if(a[i]!=a[i+1]){
				temp[j]=a[i];
				j++;
			}

            temp[j]=a[a.length-1];
           }
		   
		  /* //print temp array which contain uniq element
		   for(int s=0;s<temp.length;s++){
		    System.out.print(temp[s]+ "  ");
		
		   }*/

          //solution 2]  
         //print temp array which contain uniq element
		   for(int s=0;s<j+1;s++){//up to j position
		    System.out.print(temp[s]+ "  ");
		
		   }


		}
}
/*Here i am taking a temp[] for storing uniqe value and   the input value stored in int a[] . In this appraoch i am comparing int a[] values to next element(a[i] with a[i+1] element) so in this approach some drowback
1] Array must be in sorted manner
2] while printing tempm array it is printing at last default values like 0,0,0 
3] We need to take additional temp[] array 


We can solve 2]  problem in this program by traversing temp[] for printng up to j position then it will not print default values like 0,0,0
We can solve 3] store element same array only no need to take temp[] in line 17 take a[i]


*/

