public class myMergeSortDemo {

    public static void main(String[] args) {

        int[] arr = {99, 7, 4, 5, 19, 78, 2};
        System.out.println("here's my unsorted array: ");
        printArray(arr);

        goMergeSort myMS = new goMergeSort();
        myMS.sort(arr, 0, arr.length-1);
        System.out.println(" ");
        System.out.println("here's my merge sorted array: ");
        printArray(arr);

    }

    public static void printArray(int[] arr){
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
}
