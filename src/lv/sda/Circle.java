package lv.sda;

public class Circle {

    private float radius;
    private float pi =(float) Math.PI;

    public Circle(){

    }
    public Circle(float radius){
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public float getCircumference(){
        return 2 * this.pi * this.radius;
    }

    public double getArea(){
        return this.pi * Math.pow(this.radius,2);
    }
}
