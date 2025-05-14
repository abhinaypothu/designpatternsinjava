package com.dp.solid.lsp;

public class Lamborgini extends Vehicle{
    public Lamborgini(int numberOfWheels) {
        super(numberOfWheels);
    }
    @Override
    public void engineNoise() {
        System.out.println("Wroom Wroom");
    }
}
