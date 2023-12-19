import java.util.ArrayList;
import java.util.List;
//���������� ������� "�����" ��� ������� ���������� �������� � ��������-��������, ����������� ����������� ������������� ������, ��������� �� � ������� � ��������� �����
public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        Product product1 = new Product("�������", 500.0);
        Product product2 = new Product("�������", 1000.0);

        orderFacade.addProductToCart(product1);
        orderFacade.addProductToCart(product2);

        List<Product> cartProducts = orderFacade.getCartProducts();
        System.out.println("������ � �������: " + cartProducts.size());

        orderFacade.placeOrder();
    }
}