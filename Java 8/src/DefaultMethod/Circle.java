package src.DefaultMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
một class triển khai 2 interface chứa default method cùng tên sẽ xảy ra xung đột.
-giải pháp :
Gọi default method của một interface cụ thể bằng cách sử dụng từ khóa super.
Override lại phương thức từ lớp con.
 */
public class Circle implements Shape,Shape2,Shape3{
    @Override
    public void draw() {
        List a = new ArrayList<>();
        List b = new ArrayList<>();
        for (int i=0;i<10;i++){
            a.add(i);
        }
        Collections.reverse(a);
        a.forEach(o->b.add(o));
//        b.forEach(System.out::println);
        for (Object c:b) {
            System.out.println(c);
        }




    }

    //Gọi default method của một interface cụ thể bằng cách sử dụng từ khóa super.
    @Override
    public void setColor(String color) {
        Shape.super.setColor(color);
    }
}
