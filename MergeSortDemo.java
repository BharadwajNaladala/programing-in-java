import  java.util.*;
public  class  MergeSortDemo{
	void  merge(int  a[],  int  p,  int  q,  int  r){
		int  n1=q-p+1;
		int  n2=r-q;
		int  L[ ]=new  int[n1];
		int  M[ ]=new  int[n2];
		for(int  i=0;i<n1;i++)
			L[i]=a[p+i];
		for(int  j=0;j<n2;j++)
			M[j]=a[q+1+j];
		int  i,j,k;
		i=0;
		j=0;
		k=p;
		while(i<n1 && j<n2){
			if(L[i]<=M[j]){
				a[k]=L[i];
				i++;
			}
			else{
				a[k]=M[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k]=M[j];
			j++;
			k++;
		}
	}
	void  mergeSort(int  a[ ], int  left, int  right){
		if(left<right){
			int  mid=(left+right)/2;
			mergeSort(a,left,mid);
			mergeSort(a,mid+1,right);
			merge(a,left,mid,right);
		}
	}
	public  static  void  main(String  args[]){
		int[ ]  a={6,5,12,10,9,1};
		MergeSortDemo  ob=new  MergeSortDemo();
		ob.mergeSort(a,0,a.length-1);
		System.out.println("Sorted  Array : ");
		for(int  i=0;  i<a.length;  i++)
			System.out.print(a[i]+"  ");
	}
