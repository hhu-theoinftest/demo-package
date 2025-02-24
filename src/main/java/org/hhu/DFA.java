package org.hhu;

public class DFA {
    private final String startState;

    public DFA(String startState) {
        this.startState = startState;
    }

    public String getStartState() {
        return "Dies ist ein DFA State: " + startState;
    }
}
