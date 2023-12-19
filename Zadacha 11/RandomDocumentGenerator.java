//���������� �� ��������� �������� "��������" ��������� ��������� ��������� ����������, ������� ��������� ������������ ��������� � ������ ��������� �����������
public class RandomDocumentGenerator {
    private DocumentPrototype prototype;

    public RandomDocumentGenerator(DocumentPrototype prototype) {
        this.prototype = prototype;
    }

    public DocumentPrototype generateRandomDocument() {
        DocumentPrototype newDocument = prototype.clone();
        // ��������� ���������� ���������� ���������
        String randomContent = generateRandomContent();
        newDocument.setContent(randomContent);
        return newDocument;
    }

    private String generateRandomContent() {
        // ��������� ���������� ���������� ����������
        // � ���� ������ ����� ������������ ��������� ������ ��� ��������� ���������� ������, ��������, ���������� ��������� ����, ����������� � �.�.
        return "Random content";
    }

    public static void main(String[] args) {
        // ������������� ���������� ��������� ��������� ����������
        TextDocument prototype = new TextDocument("���������� ���������");
        RandomDocumentGenerator generator = new RandomDocumentGenerator(prototype);

        // ��������� ���������� ���������
        DocumentPrototype randomDocument = generator.generateRandomDocument();
        System.out.println(randomDocument.getContent());
    }
}