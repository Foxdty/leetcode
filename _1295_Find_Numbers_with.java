/**
 * _1295_Find_Numbers_with
 */
public class _1295_Find_Numbers_with { // kiếmr tra số chữ số là chẵn (even number)

    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println("Số: "+ findNumbers(nums));

    }
    // hàm tìm số
    public static int findNumbers(int[] nums) {
        int cout = 0; // tạo biến điếm tổng số even number
        for (int i = 0; i < nums.length; i++) { // duyệt mảng từ vị trí 0 -> vị trí cuối trong mảng nums
            if (ktraso(nums[i]) % 2 == 0) {  // kiểm tra xem nums[i] có phải even number k?
                cout++; // Phải thì biến count + 1
            }
        }
        return cout;
    }

    private static int ktraso(int i) { // hàm ktra giá trj đưa vào có bao nhiêu chữ số
        int cout=0,kq = i; // cho kq bằng giá trị của i đưa vào
        while (kq!=0) { // khi kq khác 0 thì kq chia cho 10 và biến đếm + 1, chia đến khi nào kq = 0 
            kq/=10; // vd số 1994 thì chia 4 lần kq sẽ = 0 -> count = 4
            cout++;
        }
        return cout;
    }

}