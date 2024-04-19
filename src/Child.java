public class Child extends Parent{
    public void print(){
        super.print();
        System.out.println("자식클래스의 프린트 메소드");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.print();
    }
}