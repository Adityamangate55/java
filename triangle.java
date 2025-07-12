class triangle_fun{
    int b,h;
    void setdata(int x, int y){
        b=x;
        h=y;
    }
    void calculate(){
        double area;
        area=0.5*b*h;
        System.out.println("area of triangle is "+area);
    }   
}
class triangle{
    public static void main(String args[]) {
        triangle_fun t1=new triangle_fun();
        t1.setdata(4,5);
        t1.calculate();
    }
}