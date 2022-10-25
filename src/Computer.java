public class Computer {

    private Mouse mouse;

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void click(Mouse mouse){
        mouse.click();
    }
}
