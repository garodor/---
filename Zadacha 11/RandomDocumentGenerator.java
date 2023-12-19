//–еализуйте на основании паттерна "ѕрототип" генератор случайных текстовых документов, который клонирует существующие документы с разным текстовым содержанием
public class RandomDocumentGenerator {
    private DocumentPrototype prototype;

    public RandomDocumentGenerator(DocumentPrototype prototype) {
        this.prototype = prototype;
    }

    public DocumentPrototype generateRandomDocument() {
        DocumentPrototype newDocument = prototype.clone();
        // √енераци€ случайного содержани€ документа
        String randomContent = generateRandomContent();
        newDocument.setContent(randomContent);
        return newDocument;
    }

    private String generateRandomContent() {
        // √енераци€ случайного текстового содержани€
        // ¬ этом методе можно использовать различные методы дл€ генерации случайного текста, например, генераторы случайных слов, предложений и т.д.
        return "Random content";
    }

    public static void main(String[] args) {
        // »спользование генератора случайных текстовых документов
        TextDocument prototype = new TextDocument("—одержание прототипа");
        RandomDocumentGenerator generator = new RandomDocumentGenerator(prototype);

        // √енераци€ случайного документа
        DocumentPrototype randomDocument = generator.generateRandomDocument();
        System.out.println(randomDocument.getContent());
    }
}