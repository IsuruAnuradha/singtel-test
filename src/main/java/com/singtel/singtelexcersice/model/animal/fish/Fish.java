package com.singtel.singtelexcersice.model.animal.fish;

import com.singtel.singtelexcersice.model.animal.Animal;

public class Fish extends Animal {

    public void swim(){
        System.out.println("fish can swim");
    }

    public String getBodyColor(String color){
        return color ;
    }

    public String getSize(String size){
        return size;
    }

}
