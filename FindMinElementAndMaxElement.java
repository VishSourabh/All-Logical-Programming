/*6)Write a Java Program to find Min and Max elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:   Min : 1  Max : 7*/
class FindMinElementAndMaxElement{
	public static void main(String[] args){

		int a[]={1, 2, 5, 5, 6, 6, 7, 2};
        int temp=0;
        int max=a[0]; 
		for (int i=0;i<=a.length ;i++){
			for (int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
                 }//if
			}//for
		}//for
		System.out.println("Min  : "+a[a.length-1]+"  Max  : "+a[0]);
	}
}
