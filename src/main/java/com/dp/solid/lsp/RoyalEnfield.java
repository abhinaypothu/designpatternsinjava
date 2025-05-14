package com.dp.solid.lsp;

public class RoyalEnfield extends Vehicle{
    RoyalEnfield(int numberOfWheels) {
        super(numberOfWheels);
    }
    @Override
    public void engineNoise() {
        System.out.println("Duku Duku Duku");
    }
}
