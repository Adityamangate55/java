class even extends Thread{
    public void run(){
        int a,i;
        for(i=1;i<=10;i++){
            a=i%2;
            System.out.println(a+"");
        }
    }
}
class odd extends Thread{
    public void run(){
        int a,i;
        for(i=1;i<=20;i++){
            a=2%i;
            if(a!=0){
            System.out.println(a+"");
            }
        }
    }
}
class evenodd{
    public static void main(String[] args) {
        even a=new even();
        odd b=new odd();
        a.start();
        b.start();
    }
}