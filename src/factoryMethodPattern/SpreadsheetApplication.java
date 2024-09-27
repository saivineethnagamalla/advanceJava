package factoryMethodPattern;
public class SpreadsheetApplication extends Application {
    @Override
    protected Document createDocument() {
        return new SpreadsheetDocument();
    }
}
