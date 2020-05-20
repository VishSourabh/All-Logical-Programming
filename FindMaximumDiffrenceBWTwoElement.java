/*5)Write a java program to find maximum difference between two elements in given Array?
Input = { 2, 5, 1, 7, 3, 9, 5}
Output = 8  

Explanation : The maximum difference is between 1 and 9

Input = { 9, 2, 12, 5, 4, 7, 3, 19, 5}
Output: 17

Explanation : The maximum difference is between 19 and 2
   */
class FindMaximumDiffrenceBWTwoElement{
	public static void main(String[] args){
		int a[]={ 9, 2, 12, 5, 4, 7, 3, 19, 5};
        int temp=0;
		int diffrence=0;
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
        diffrence= a[0]-a[a.length-1];
		System.out.println("The maximum difference is  "+diffrence);

		
	}
}
