package com.dp.behavioural.state;

public interface WorkFlow {
    public State getInitState();
    public State getDoActionState();
    public State getCompleteState();
    public void setState(State state);
    public void init();
    public void doAction();
    public void completed();
}
