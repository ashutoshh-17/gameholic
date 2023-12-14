public class ComplexNumber {
    int real, img;

    ComplexNumber(int r, int i) {
        this.real = r;
        this.img = i;
    }

    public void show() {
        System.out.println(this.real + "+" + this.img + "i");
    }

    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber add = new ComplexNumber(0, 0);
        add.real = n1.real + n2.real;
        add.img = n1.img + n2.img;
        return add;
    }

    public static ComplexNumber sub(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber sub = new ComplexNumber(0, 0);
        sub.real = n1.real - n2.real;
        sub.img = n1.img - n2.img;
        return sub;
    }

    public static ComplexNumber mul(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber mul = new ComplexNumber(0, 0);
        mul.real = n1.real * n2.real - n1.img * n2.img;
        mul.img = n1.real * n2.img + n1.img * n2.real;
        return mul;
    }

    public static ComplexNumber div(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber div = new ComplexNumber(0, 0);
        int denominator = n2.real * n2.real + n2.img * n2.img;
        div.real = (n1.real * n2.real + n1.img * n2.img) / denominator;
        div.img = (n1.img * n2.real - n1.real * n2.img) / denominator;
        return div;
    }

    public static void main(String args[]) {
        ComplexNumber c1 = new ComplexNumber(10, 5);
        ComplexNumber c2 = new ComplexNumber(2, 5);

        System.out.println("First Complex Number ");
        c1.show();

        System.out.println("Second Complex Number ");
        c2.show();

        ComplexNumber add = add(c1, c2);
        System.out.println("Addition of Complex Number ");
        add.show();

        ComplexNumber sub = sub(c1, c2);
        System.out.println("Subtraction of Complex Number ");
        sub.show();

        ComplexNumber mul = mul(c1, c2);
        System.out.println("Multiplication of Complex Number ");
        mul.show();

        ComplexNumber div = div(c1, c2);
        System.out.println("Division of Complex Number ");
        div.show();
    }
}

/* Output : -
-cp' 'C:\Users\Administrator\AppData\Local\Temp\vscodesws_69a0a\jdt_ws\jdt.ls-java-project\bin' 'ComplexNumber'
First Complex Number 10r5i
Second Complex Number 2r5i
Addition of Complex Number 12r10i
Subtraction of Complex Number 8r0i
Multiplication of Complex Number -5r60i
Division of Complex Number 1r-1i
*/
