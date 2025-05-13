package com.dp.behavioural.state;

public class StateDemo {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlowimpl();
        workFlow.init();
        workFlow.doAction();
        workFlow.completed();


    }
}
