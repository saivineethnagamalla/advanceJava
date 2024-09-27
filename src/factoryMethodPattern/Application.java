package factoryMethodPattern;
// Creator Class 
public abstract class Application {
    // Factory method
    protected abstract Document createDocument();

    // Other methods using the product
    public void newDocument() {
        Document doc = createDocument();
        doc.open();
        // More operations...
    }
}