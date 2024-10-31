package org.example;

public class Animal implements Comparable{
    public String name;
    public int age;
    public Animal(){}
    public Animal(String _s, int _a){
        name = _s;
        age = _a;
    }

    @Override
    public String toString(){

        return name + "_" + age;
    }

    @Override
    public int compareTo(Object o) {
        Animal a = (Animal) o;
        if(age > a.age)
            return 1;
        if(age < a.age)
            return -1;
        return name.compareTo(a.name);
    }
}
