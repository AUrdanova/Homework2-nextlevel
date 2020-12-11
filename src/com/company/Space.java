package com.company;

public class Space <T extends Number> implements Grey <T>{
    private String name;
    T residents;

    public Space(String name, T residents) {
        this.name = name;
        this.residents = residents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getResidents() {
        return residents;
    }

    public void setResidents(T residents) {
        this.residents = residents;
    }

    @Override
    public void Color(T t) {
        System.out.println("Name of Planet:" +name+ "  residents: "+t+"");

    }
}
