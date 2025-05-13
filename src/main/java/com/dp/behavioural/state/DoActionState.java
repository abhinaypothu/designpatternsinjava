package com.dp.behavioural.state;

public class DoActionState implements State{
    WorkFlow workflow;
    DoActionState(WorkFlow workflow){
        this.workflow = workflow;
    }
    @Override
    public void init() {
        System.out.println("Progress cannot init here");
    }

    @Override
    public void doAction() {
        System.out.println("Progress is doing action");
        workflow.setState(workflow.getCompleteState());
    }

    @Override
    public void completed() {
        System.out.println("Progress cannot complete here");
    }
}
