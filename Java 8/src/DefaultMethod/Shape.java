package src.DefaultMethod;
import  java.lang.String;
public interface Shape {
    void draw();

    default void setColor(String color) {
        Object a = "1234";
        System.out.println(a.equals("123"));
    }
    //phương thức default sẽ không thể override một phương thức từ java.lang.Object
    //vd java.lang.string
    default int codePointAt(int i) {
        Object a = "1234";
        System.out.println(a.equals("123"));
        return Integer.parseInt(null);
    }
   //java.lang.Object
//    default void equals(Object obj) {
//        Object a = "1234";
//        System.out.println(a.equals("123"));
//    }
}
interface Shape2 {
    //cac class implement bắt buộc phải override abstract method
    void draw();

    /* Với default method thì hoàn toàn linh hoạt(không bắt buộc phải override), giúp mở rộng thêm interface mà không sợ
    ảnh hưởng tới các class đã implement trước đó
    * */

    default void setColor2(String color) {
        System.out.println("Draw2 shape with color " + color);
    }
}

interface Shape3 {
    void draw();

    default void setColor(String color) {
        System.out.println("Draw3 shape with color " + color);
    }
}
