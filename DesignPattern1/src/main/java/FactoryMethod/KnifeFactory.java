package FactoryMethod;

public class KnifeFactory {
    public Knife createKnife(String knifeType){
        Knife knife = null;
        if(knifeType.equals("steak")){
            knife = new SteakKnife();
        }else if(knifeType.equals("chefs")){
            knife = new ChefsKnife();
        } else if (knifeType.equals("bread")){
            knife = new BreadKnife();
        }else if(knifeType.equals("paring")){
            knife = new ParingKnife();
        }
        return knife;
    }
}
