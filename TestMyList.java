public class TestMyList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Da Nang");
        myList.add("Ha Noi");
        myList.add("Sai Gon");
        myList.add("Nha Trang");
        myList.add("Gia Lai");
        System.out.println(myList.size());
        for (int i=0; i < myList.size(); i++)
        {
            System.out.print(myList.get(i)+" ");
        }
        System.out.println();
        System.out.println("Đã xóa: " + myList.remove(2));
        for (int i=0; i<myList.size(); i++)
        {
            System.out.print(myList.get(i)+" ");
        }
    }
}
