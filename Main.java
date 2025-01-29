import java.util.Arrays;

public class Main {
    static class UIPanel {
        private UIControl[] controls;

        public UIPanel(UIControl[] controls) {
            this.controls = Arrays.copyOf(controls, controls.length);
        }

        public void drawAll() {
            for (UIControl control : controls) {
                control.draw();
            }
        }
    }

    public static void main(String[] args) {
        UIControl[] controls = {
            new Button(),
            new TextBox(),
            new ColorPicker()
        };

        UIPanel panel = new UIPanel(controls);
        panel.drawAll();

        // Simulate handling events
        controls[0].handleEvent("click");
        controls[1].handleEvent("textChange");
        controls[2].handleEvent("colorSelected");
    }
}

