package Oct_4;

public class QuickSort {
    // 범위, 기준, 비교, 스왑
    private static void quickSort(int[] arr, int start, int end){
        if(start < end) { // start = end || start >end
            int p = partition(arr, start, end);

            quickSort(arr, start, p - 1);
            quickSort(arr, p+1, end);
        }
    }

    private static int partition(int[] arr, int l, int r){
        int pivot = arr[r]; // 가장 오른쪽에 있는 친구를 pivot으로 설정

        int i = (l - 1);
        int temp;

        for (int j = l; j <= r-1; j++){
            if(arr[j] <= pivot){ // pivot 보다 작거나 같은가
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i+1];
        arr[i+1] = arr[r]; // pivot이 원래자리로 감.
        arr[r] = temp; // pivot이 변경됨.

        return (i +1); // pivot 현재 자리를 알려줌.
    }

    public static void main(String[] args) {
        int[] arr = {9, 10, 6, 8, 4, 3, 23, 1};

        quickSort(arr, 0, arr.length-1);

        for (int j : arr) {
            System.out.print(j + ", ");

        }
    }
}
