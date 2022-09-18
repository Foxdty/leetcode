public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[]  nums1 = {1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        merge(nums1,m,nums2,n);
        for (int i : nums1) {
            System.out.println(i);
        }
        
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {  //duyệt các phần tử từ nums2
            chen(nums1,m,i); // function kiểm tra 
            m++;
        }
        
       
    }
    private static void chen(int[] nums1, int m, int i) {
        boolean check= false;
        for (int j = 0; j < m; j++) { // duyệt từng phần tử trong nums1
            if (nums1[j] > i) {  // kiểm tra phần tử vị trí nums1[j] có lớn hơn gía trị i(giá trị nums2 đưa vào)
               
                check = true;
                for (int k = m-1; k >= j; k--) {  // chạy từ cuối mảng nums1 đến vị trí lớn hơn i
                    nums1[k+1] = nums1[k]; // lùi các phần tử về sau 1 đơn vị để thêm phần tử i vào trước.
                }
                nums1[j] = i;
                break;
            }

        }
        if (check == false) {
            nums1[m] = i;
        }
    }

}
