package chapter04.one;


public class Button2 implements View {

    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) { }

    public class ButtonState implements State{}
}


