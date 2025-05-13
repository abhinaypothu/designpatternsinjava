package com.dp.behavioural.state;

public class CompleteState implements State{
    WorkFlow workflow;
    CompleteState(WorkFlow workflow){
        this.workflow = workflow;
    }
    @Override
    public void init() {
        System.out.println( "Progress cannot init here");
    }

    @Override
    public void doAction() {
        System.out.println( "Progress cannot doAction here");
    }

    @Override
    public void completed() {
        System.out.println("Progress is completed");
        workflow.setState(workflow.getInitState());
    }
}
