package mergeSort;

public class MergeSort {
    void merge (int arr[],int l,int mid, int r) {
    	int n1 = mid - l +1;
    	int n2 = r - mid;
    	
    	int L[]=new int[n1];
    	int R[]=new int[n2];
    	
    	for (int i = 0; i < n1; ++i)
    		L[i]= arr[l + i];
    	for(int j= 0; j< n2; ++j)
    		R[j]=arr[mid + 1+ j];
    	
    	int i=0, j=0;
    	
    	int k=l;
    	while(i< n1 && j<n2) {
    		if(L[i] <= R[j]) {
    			arr[k]= L[i];
    			i++;
    		}
    		else {
    			arr[k]= R[j];
    			j++;
    		}
    		k++;
    	}
    	
    	while(i<n1) {
    		arr[k] =L[i];
    		i++;
    		k++;
    	}
    	while(i<n2) {
    		arr[k] = R[j];
    		j++;
    		k++;
    	}
    }
    
    void sort(int arr[],int l,int r) {
    	if(l<r) {
    		int mid = (l + r) /2;
    		
    		sort(arr, l, mid);
    		sort(arr, mid + 1, r);
    		
    		merge(arr, l, mid, r);
    	}
    }
    
   
    static void printArray(int arr[]) {
    	int n = arr.length;
    	for(int i=0 ; i<n ; ++i)
    		System.out.print(arr[i]+ " ");
    	System.out.println();
    }
		
	

	public static void main (String args[]) {
		int arr[]= {24, 10, 5, 9, 3, 7};
		
		System.out.println("Given array is");
		printArray(arr);
		
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length -1);
		
		System.out.println("\nSorted array is");
		printArray(arr);

    }
}