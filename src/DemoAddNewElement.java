public class DemoAddNewElement {
    public static void main(String[] args) {
        int a[] = {3, 4, 5, 5, 6};
//        B1: Khai báo 1 vùng nhớ mới (biến mảng mới, có số lượng phần tử lớn hơn mảng cũ 1)
        int a1[] = new int[a.length +1];
//        B2: Sao chép các phần tử của mảng cũ sang mảng mới
        for (int i = 0; i < a.length; i++) {
            a1[i] = a[i];
        }
//        B3: Gán phần tử cuối cùng bằng giá trị mới
        a1[a1.length-1] = 34;
        // gan lai tham chieu cho a
        a = a1;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
