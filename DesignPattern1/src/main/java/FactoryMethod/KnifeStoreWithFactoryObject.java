package FactoryMethod;

public class KnifeStoreWithFactoryObject {
    private KnifeFactory factory;

    public KnifeStoreWithFactoryObject(KnifeFactory _factory){
        factory = _factory;
    }

    public Knife orderKnife(String knifeType){
        Knife knife = factory.createKnife(knifeType);
        if(knife != null) {
            knife._sharpen();
            knife._polish();
            knife._package();
        }
        return knife;
    }
}
