public class Mergesort {

    static void displayArr(int[] a){

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static  void merge(int[] arr , int l , int mid , int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];


        for (int i=0;i<n1;i++) {
            left[i] = arr[l+i];
        }
        for (int j=0;j<n2;j++) {
            right[j] = arr[mid+1+j];
        }
       int i = 0;
        int j= 0;
        int k= l;

        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];

            }
            else{
                arr[k++] = right[j++];

            }


        }

        while (i<n1){
            arr[k++] = left[i++];

        }
        while (j<n2){
            arr[k++] = right[j++];
        }

    }

    static void mergeSort(int[]arr,int l , int r){

        if(l >= r) return;

        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        merge(arr,l,mid,r);



    }

    public static void main(String[] args) {

        int [] arr = {4,1,3,5,2};
        int n = arr.length;
        System.out.println("Array before sorting");
        displayArr(arr); // 4 1 3 5 2
        mergeSort(arr,0,n-1);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(arr); // 1 2 3 4 5


    }
}
