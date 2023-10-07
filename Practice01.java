package Interfaces;

interface Resizable{
    public void resizeWidth(int width);
    public void resizeHeight(int height);
}

class Rectangle implements Resizable{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    @Override
    public void resizeWidth(int width){
        this.width=width;
    }
    @Override
    public void resizeHeight(int height){
        this.height=height;
    }
    public void printSize(){
        System.out.println("Width of the rectangle: "+ width+" Height of the rectangle: "+height);

    }
}

public class Practice01 {
    public static void main(String[] args) {
        Rectangle rec1= new Rectangle(100,150);
        rec1.printSize();

        rec1.resizeWidth(80);
        rec1.resizeHeight(120);
        System.out.println("After Resize: ");
        rec1.printSize();
    }


}
