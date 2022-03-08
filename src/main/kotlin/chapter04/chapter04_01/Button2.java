package chapter04.chapter04_01;


public class Button2 implements View {

    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) { }

    public class ButtonState implements State{}
}


