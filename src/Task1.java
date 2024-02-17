public class Task1 {
public int dev(int a, int b){
    return a+b;
}

public  int substract(int a, int b){
    return a-b;
}

public int multiply(int a, int b){
    return a*b;
}

public int divide(int a, int b){
    return a/b;
}

public double power(double a, double b){
    if (b==0){
        return 1;
    }else if (b<0){
        return ( 1 / Math.pow(a,(-1 * b)));
    }
    for (int i = 1; i < b; i++) {
        a *=b;
    }return a;
}
public int factorial(int a) {
    if (a<0){
        throw new  ArithmeticException();
    }
    if (a==0 || a == 1){
        return 1;
    }else {
        return a * factorial(a-1);
    }
}

public int absolut(int a){
    if (a<0){
        return a * -1;
    }else {
        return a;
    }
}
public double sqrt(int a){
    if (a== 0){
        return 1;
    }else if (a<0){
        throw new ArithmeticException();
    }return Math.sqrt(a);
}

public double logarithm(int a){
    if (a == 0 || a < 0){
        throw new ArithmeticException();
    }else if (a==1){
        return 0;
    }return Math.pow(a, 0.5);
}


public static double sin(double angleInRadians) {
    if (angleInRadians == 0 || angleInRadians < 0) {
        throw new ArithmeticException();
    }return Math.sin(angleInRadians);
}
}
