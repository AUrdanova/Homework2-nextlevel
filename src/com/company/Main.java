package com.company;

public class Main {

    public static void main(String[] args) {
	Space <Number> Earth = new Space<>("Earth",8);
	Space <Number> Mars = new Space<>("Mars",4);
	Earth.Color(Earth.residents);
	Mars.Color(Mars.residents);
    }
}
