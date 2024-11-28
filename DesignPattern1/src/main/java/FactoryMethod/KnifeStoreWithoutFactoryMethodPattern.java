package FactoryMethod;

public class KnifeStoreWithoutFactoryMethodPattern {
    public Knife orderKnife(String knifeType){
        Knife knife = null;
        if(knifeType.equals("steak")){
            knife = new SteakKnife();
        }else if(knifeType.equals("chefs")){
            knife = new ChefsKnife();
        }else if(knifeType.equals("bread")){
            knife = new BreadKnife();
        }
        if(knife != null) {
            knife._sharpen();
            knife._polish();
            knife._package();
        }
        return knife;
    }
}


