
/*10)Write a Java Program to find smallest pair sum in given Array?

Input: arr[] = {1, 7, 2, 9, 6}
Output: 3

The pair (1, 2) will have the minimum sum pair i.e. 1 + 2 = 3*/
class SmallestPairSum{
	public static void main(String[] args){
		int a[]={1, 7, 2, 9, 6};
        int temp=0;
		int Sum=0;
		int max=a[0];
		for (int i=0;i<a.length ;i++){
			for (int j=i+1;j<a.length;j++){
               if (a[i]<a[j]){
                   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
               }
			}//for
		}//for
        Sum= a[a.length-1]+a[a.length-2];
		System.out.println("The smallest pair sum is  "+Sum);
	}
}
