public abstract class UIControl {

    public abstract void draw();
    public abstract void handleEvent(String event);
    public abstract String getName();

}


class Button extends UIControl{
    public void draw(){

    }
    public void handleEvent(String event){
        
    }
}
class TextBox extends UIControl{

}
class ColorPicker extends UIControl{

}