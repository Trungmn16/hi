package src.DefaultMethod;

import com.sun.org.apache.xpath.internal.operations.String;

public class Shap3D extends String implements Shape{
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void draw() {

    }



    @Override
    public int codePointAt(int i) {
        return Shape.super.codePointAt(i);
    }
}
