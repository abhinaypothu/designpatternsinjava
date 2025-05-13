package com.dp.behavioural.state;

public class WorkFlowimpl implements WorkFlow{
    State initState;
    State doActionState;
    State completeState;
    State currentState;
    public WorkFlowimpl(){
        initState = new InitState(this);
        doActionState = new DoActionState(this);
        completeState = new CompleteState(this);
        currentState = initState;
    }

    @Override
    public State getInitState() {
        return initState;
    }

    @Override
    public State getDoActionState() {
        return doActionState;
    }

    @Override
    public State getCompleteState() {
        return completeState;
    }

    public void setState(State state)
    {
        currentState = state;
    }
    @Override
    public void init() {
        currentState.init();
    }

    @Override
    public void doAction() {
        currentState.doAction();
    }

    @Override
    public void completed() {
        currentState.completed();
    }
}
