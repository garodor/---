// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book = new Book.BookBuilder()
                .setTitle("����������� �����")
                .setAuthor("�.�.������")
                .setGenre("������������ �����")
                .setPageCount(320)
                .build();
        System.out.println("��������:" + book.getTitle());
        System.out.println("�����:" + book.getAuthor());
        System.out.println("����:" + book.getGenre());
        System.out.println("���������� �������:" + book.getPageCount());
    }
}