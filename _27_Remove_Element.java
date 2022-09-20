public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2};
        System.out.println(removeElement(nums, 2));
        
        System.out.println(removeElement1(nums, 3));
        System.out.println("DONE");
        

    }
    private static int removeElement(int[] nums, int val) { // kỹ thuật 2 con trỏ
        int k = 0;
        for (int index = 0; index < nums.length; index++) {  // duyệt mảng
            if (nums[index] != val) { // nếu ptu index khác với val
                nums[k] = nums[index]; // gán giá 
                k++; // tăng k lên 1
            } // nếu bằng thì không làm gì
        }
        return k;
    }



    public static int removeElement1(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; ) {
            if (nums[i] == val) {
                for (int j = i; j < n-1; j++) {  // duyệt từ vị trí bằng đén vị trí cuối cùng -1 vì khi xóa thì mảng giảm 1
                    nums[j] = nums[j+1]; // dịch chuyển các phần tử lên 1 khi đã xóa
                }
                n--;
            }else i++;
        }
        return n;
    }
}
