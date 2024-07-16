public class Complex {
    float real;
    float image;
    public Complex()  //空构造方法
    {
        ;
    }
    public Complex(float real,float image)  //含参构造方法
    {
        this.real = real;
        this.image = image;
    }
    public void ComplexAdd(float real)
    {
        this.real = this.real + real;
    }
    public void ComplexAdd(float real,float image)
    {
        this.real = this.real + real;
        this.image = this.image + image;
    }
    public void ComplexSub(float real)
    {
        this.real = this.real - real;
    }
    public void ComplexSub(float real,float image)
    {
        this.real = this.real - real;
        this.image = this.image - image;
    }
    public void ComplexMul(float real)
    {
        this.real = this.real * real;
        this.image = this.image * real;
    }
    public void ComplexMul(float real,float image)
    {
        float tempreal = this.real;
        float tempimage = this.image;
        this.real = tempreal * real - tempimage * image;
        this.image = tempreal * image + tempimage * real;
    }
    public String toString()
    {
        if(this.image >= 0)
        {
            System.out.println(this.real+"+"+this.image+"i");
            return this.real+"+"+this.image+"i";
        }
        else
        {
            System.out.println(this.real+""+this.image+"i");
            return this.real+"-"+this.image+"i";
        }

    }
}
