class ComplexNums{

    double real,imag; 

    ComplexNums()
    {
        this.real = 0;
        this.imag = 0;
    }
    ComplexNums(double real , double imag)
    {
        this.real = real;
        this.imag = imag;
    }
    ComplexNums add(ComplexNums c1, ComplexNums c2)
    {
        ComplexNums c3 = new ComplexNums();
        c3.real = c1.real + c2.real;
        c3.imag = c1.imag + c2.imag;
        return c3;
    }

    ComplexNums sub(ComplexNums c1, ComplexNums c2)
    {
        ComplexNums c3 = new ComplexNums();
        c3.real = c1.real - c2.real;
        c3.imag = c1.imag - c3.imag;
        return c3;
    }
    void show()
    {
        System.out.println("Addition of two complex numbers is : "+real+" "+imag);
    }

}