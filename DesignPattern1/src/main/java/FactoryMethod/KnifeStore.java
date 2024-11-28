package FactoryMethod;

public abstract class KnifeStore {
    public Knife orderKnife(String knifeType){
        Knife knife = createKnife(knifeType);
        if(knife != null) {
            knife._sharpen();
            knife._polish();
            knife._package();
        }
        return knife;
    }
    abstract Knife createKnife(String type);
}
