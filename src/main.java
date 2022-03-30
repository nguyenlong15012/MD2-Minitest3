public class main {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        Book[] book = new Book[10];
        book[0] = new ProgrammingBook(1,"Lập trình hướng đối tượng", 99000, "Nguyễn Bá Long", "Java", "Swing");
        book[1] = new ProgrammingBook(2,"Tớ Học Lập Trình", 100000.0, "Vũ Thị Trang", "JavaScript", "Struts");
        book[2] = new ProgrammingBook(3,"Code Dạo Kí Sự", 50000, "Phạm Huy Hoàng", "PHP", "Hibernate");
        book[3] = new ProgrammingBook(4,"Giáo Trình Kỹ Thuật Lập Trình C Căn Bản Và Nâng Cao", 86000, "Phạm Văn Ất", "Java", "GWT");
        book[4] = new ProgrammingBook(5,"Lập Trình C", 78000, "Hùng Minh & Mạnh Hùng", "C", "Vaadin");
        book[5] = new FictionBook(6,"Lập Trình Với C#", 20000, "Nhiều tác giả","Sách Khoa Học");
        book[6] = new FictionBook(7,"Sách dạy lập trình Tiếng anh", 25000, "Anh","Sách Khoa Học");
        book[7] = new FictionBook(8,"The pragmatic programmer", 49000, "Journeyman ","Sách Khoa Học");
        book[8] = new FictionBook(9,"Code complete", 50000, "Steve McConnell ","Sách Khoa Học");
        book[9] = new FictionBook(10,"Don’t Make Me Think, Revisited", 88000, "Steve Krug ","Sách Khoa Học");

        for (Book tong : book){
            sum += tong.getPrice();
        }System.out.println("Tổng tiền 10 cuốn sách bằng " + sum + " VNĐ");

        for (Book dem : book){
            if (dem instanceof ProgrammingBook){
                if (((ProgrammingBook) dem).getLanguage().equals("Java")){
                    count++;
                }
            }
        }
        System.out.println("Số quyển sách có ngôn ngữ là Java là: " + count);
    }
}
