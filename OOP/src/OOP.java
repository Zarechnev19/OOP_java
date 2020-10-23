import java.util.Scanner;

class Circle {
    Scanner in = new Scanner(System .in);
    private double x, y, R;
    
    public final void InputInfoCircle (){

        System.out.printf("Input the data center circle x and y:\n");
        this.x = in.nextDouble();
        this.y = in.nextDouble();
        System.out.printf("Input the data radius: ");
        this.R = in.nextDouble();
    }
    
    public final void displayInfoCircle(){
        if (this.R > 0)
            System.out.printf("Your circle: (%.2f; %.2f), R = %.2f\n---------------------------\n", this.x, this.y, this.R);
        else 
            System.out.printf("Entered a radius less than zero!\n---------------------------\n");    
    }
    
    public final void setCoordX(){
        System.out.printf("Change your coordinate X: ");
        this.x = in.nextDouble();
    }
    
    public final void setCoordY(){
        System.out.printf("Change your coordinate Y: ");
        this.y = in.nextDouble();
    }
    
    public final void setRadCircle(){
        System.out.printf("Change your radius: ");
        this.R = in.nextDouble();
    }
}
    
class Rectangle {
    Scanner in = new Scanner(System .in);
    private double x_1, y_1, x_2, y_2;
    
    public void InputInfoRect (){
        System.out.printf("Input x_1 and y_1 for rectangle:\n");
        this.x_1 = in.nextDouble();
        this.y_1 = in.nextDouble();
        
        System.out.printf("Input x_2 and y_2 for rectangle:\n");
        this.x_2 = in.nextDouble();
        this.y_2 = in.nextDouble();
    }
    
    void displayInfoRect(){
        System.out.printf("Your rectangle: (%.2f; %.2f), (%.2f; %.2f)\n", this.x_1, this.y_1, this.x_2, this.y_2);
    } 
    public double setCoordX_1Rect(){
        System.out.printf("Change your coordinate X_1: ");
        return this.x_1 = in.nextDouble();
    }
    
    public double setCoordY_1Rect(){
        System.out.printf("Change your coordinate Y_1: ");
        return this.y_1 = in.nextDouble();
    }
    
    public double setCoordX_2Rect(){
        System.out.printf("Change your coordinate X_2: ");
        return this.x_2 = in.nextDouble();
    }
    
    public double setCoordY_2Rect(){
        System.out.printf("Change your coordinate Y_2: ");
        return this.y_2 = in.nextDouble();
    }
}

class Square extends Rectangle {
    private double x_1, y_1, x_2, y_2;
    
    @Override
    public final void InputInfoRect(){
        
        System.out.printf("Input x_1 and y_1 for cube:\n"); 
        this.x_1 = in.nextDouble();
        this.y_1 = in.nextDouble();
        
        System.out.printf("Input x_2 and y_2 for cube:\n");
        this.x_2 = in.nextDouble();
        this.y_2 = in.nextDouble();
    }
    
    @Override
    public final void displayInfoRect(){
        
        if (Math.abs(this.x_1 - this.x_2) == Math.abs(this.y_1 - this.y_2))
            System.out.printf("Your square: (%.2f; %.2f), (%.2f; %.2f)\n---------------------------\n", this.x_1, this.y_1, this.x_2, this.y_2);
        else
            System.out.printf("Not a square entered!\n---------------------------\n");
    }
    
    @Override
    public final double setCoordX_1Rect(){
        
        return this.x_1 = super.setCoordX_1Rect();
    }
    
    @Override
    public final double setCoordY_1Rect(){
        
        return this.y_1 = super.setCoordY_1Rect();
    }
    
    @Override
    public final double setCoordX_2Rect(){
        
        return this.x_2 = super.setCoordX_2Rect();
    }
    
    @Override
    public final double setCoordY_2Rect(){
        
        return this.y_2 = super.setCoordY_2Rect();
    }
}
public class OOP {
    
    public static void main(String[] args) {      
        
        Circle circle_1 = new Circle();
        
        circle_1.InputInfoCircle();
        circle_1.displayInfoCircle();
        circle_1.setRadCircle(); //Изменю радиус
        circle_1.displayInfoCircle();
         
        Rectangle square_1 = new Square();
        square_1.InputInfoRect();
        square_1.displayInfoRect();//Полиморфный вызов метода displayInfoRect()
        square_1.setCoordX_1Rect();//Изменю X_1
        square_1.setCoordY_1Rect();//Изменю Y_1
        square_1.displayInfoRect();//Полиморфный вызов метода displayInfoRect() 
                                    
        Rectangle rect_1 = new Rectangle();
        rect_1.InputInfoRect ();
        rect_1.displayInfoRect();//Полиморфный вызов метода displayInfoRect()
        rect_1.setCoordX_2Rect();//Изменю X_2
        rect_1.displayInfoRect();//Полиморфный вызов метода displayInfoRect() 
    }
}
