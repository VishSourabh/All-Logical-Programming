/*9)Write a Java program to find element Pairs in given Array whose sum is equal to given number

	Input Array :  {3, 6, 8, -8, 10, 8 } 
	Sum : 16
	Output :  Pairs with sum 16 are (6, 10) and (8, 8)*/



class PairsSumOfGivenNo{
	public static void main(String[] args){
      //Given Array
	  int a[]={3, 6, 8, -8, 10, 8} ;
      int sum=16;

	  //traverse the array
	  for (int i=0;i<a.length;i++){
		  for (int j=i+1;j<a.length;j++){
			  if(a[i]+a[j]==sum){
				  System.out.println(a[i]+" ,"+a[j]);
			  }//if
		  }//for
	  }//for
	}//main
}//class
