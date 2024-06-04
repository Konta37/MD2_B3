package TT.TTB4;

public class Caculator {
    double a;
    double b;

    public Caculator(){}

    public Caculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }

    //Tính tổng
    public double add(){
        return a + b;
    }
    //hiệu
    public double sub(){
        return a - b;
    }
    //tích
    public double multi(){
        return a * b;
    }
    //chia
    public double div(){
        return a / b;
    }
}
