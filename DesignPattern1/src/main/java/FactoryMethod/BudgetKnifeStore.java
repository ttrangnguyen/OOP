package FactoryMethod;

public class BudgetKnifeStore extends KnifeStore{
    Knife createKnife(String knifeType){
        if(knifeType.equals("steak"))
            return new BudgetSteakKnife();
        else if(knifeType.equals("chefs"))
            return new BudgetChefsKnife();
        return null;
    }
}
