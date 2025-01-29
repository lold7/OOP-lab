abstract class UIControl {
    public abstract void draw();
    public abstract void handleEvent(String event);
    public abstract String getName();
}

class Button extends UIControl {
    @Override
    public void draw() {
        System.out.println("Drawing Button with label \"Draw\"");
    }

    @Override
    public void handleEvent(String event) {
        if ("click".equals(event)) {
            System.out.println("Button handled click event.");
        }
    }

    @Override
    public String getName() {
        return "Button";
    }
}

class TextBox extends UIControl {
    @Override
    public void draw() {
        System.out.println("Drawing TextBox with current text \"\"");
    }

    @Override
    public void handleEvent(String event) {
        if ("textChange".equals(event)) {
            System.out.println("TextBox handled textChange event.");
        }
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}

class ColorPicker extends UIControl {
    @Override
    public void draw() {
        System.out.println("Drawing ColorPicker with selected color \"Black\"");
    }

    @Override
    public void handleEvent(String event) {
        if ("colorSelected".equals(event)) {
            System.out.println("ColorPicker handled colorSelected event.");
        }
    }

    @Override
    public String getName() {
        return "ColorPicker";
    }
}
