/*Task-04  
Write  a program to find 3rd largest number of the given Array|List*/
class FindThiredLargestNumber{
	public static void main(String[] args){
         System.out.println("Program to find thired largest number  :: ");
		 int a[]={ 6};//given array
		 int max=a[0];
          int temp=0;

		  if (a.length<=3){
			  System.out.println("Invalid Input, array size is less than 3");
		  }else{
		 //travers the array
		 for (int i=0;i<a.length ;i++ ){
			  for (int j=i+1;j<a.length ;j++ ){
				  if(a[i]<a[j]){
                   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				  }
			  }//for

			  if (i==3){//reduce unnecessary traverse after 3rd
				  break;
			  }
		 }//for
		  }//else
		 System.out.println("Thired higest number  :: "+ a[2]);
	}//main
}//class
