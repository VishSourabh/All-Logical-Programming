/*7)Write Java Program to find second Min and Second Max elements in given Array ?

Input: 1, 2, 5, 9, 6, 4, 7, 2
Output: Second Min-2  Second Max-7*/

class  SecondMinAndSeconMaxElement{
	public static void main(String[] args){
		int a[]={1, 2, 5, 9, 6, 4, 7, 2};
        int temp=0;
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
		System.out.println("Second Min - "+a[a.length-2]+"  Second Max - "+a[1]);
	}
}
