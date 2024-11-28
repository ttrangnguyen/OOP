package FactoryMethod;

public class QualityKnifeStore {
    Knife createKnife(String knifeType){
        if(knifeType.equals("steak"))
            return new QualitySteakKnife();
        else if(knifeType.equals("chefs"))
            return new QualityChefsKnife();
        return null;
    }
}
