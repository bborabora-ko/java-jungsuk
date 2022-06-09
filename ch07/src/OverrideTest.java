class MyPoint3 {
    int x;
    int y;
    
    MyPoint3(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // Object클래스의 toString() 오버라이딩 
    public String toString() {
        return "x:"+ x +", y:" + y;
    }
}
 
public class OverrideTest {
 
    public static void main(String[] args) {
 
        Point p = new Point(1,2);   // 매개변수가 있는 생성자를 통해 초기화 간편화 
        System.out.println(p);            // toString() 오버라이딩으로 간편하게 출력가능  
        
        // 기존코드
//        MyPoint3 p = new MyPoint3();    //생성자 초기화 
//        p.x = 1;                            
//        p.y = 2;           
//        System.out.println("p.x= " +p.x );
//        System.out.println("p.y= " +p.y );
    }
 
}

