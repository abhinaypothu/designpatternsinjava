package com.dp.behavioural.state;

public class InitState implements State{
    WorkFlow workflow;
    InitState(WorkFlow workflow){
        this.workflow = workflow;
    }
    @Override
    public void init() {
        System.out.println("Progress init successful");
        workflow.setState(workflow.getDoActionState());
    }

    @Override
    public void doAction() {
        System.out.println("Progress cannot go further");

    }

    @Override
    public void completed() {
        System.out.println("Progress cannot complete here");

    }
}
