public class Demo2 {
    //viết phương thức thêm mới phần tử vào mảng
    //kiểu dữ liệu trả về phải là mảng
    //tham số: 1 mảng và 1 số mới
    // tên phương thức: addElement
    //phần thân
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5};
        a = addElement(a, 100);

        for (int element:a
             ) {
            element =100;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static int[] addElement(int[] arr, int newE){
        int newArr[] =  new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = newE;
        return newArr;
    }
}
