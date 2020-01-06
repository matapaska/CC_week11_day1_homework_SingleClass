public class Calculator {

    private double numOne;
    private double numTwo;

    public Calculator(double numOne, double numTwo){
        this.numOne = numOne;
        this.numTwo = numTwo;

    }

    public double getNumOne(){
        return  this.numOne;
    }

    public double getNumTwo(){
        return  this.numTwo;
    }

    public double addNums(){
        return this.numOne + this.numTwo;
    }

    public double subtractNums(){
        return this.numTwo - this.numOne;
    }
    public double multiplyNums(){
        return this.numOne * this.numTwo;
    }

    public double divideNums(){
        return this.numTwo/this.numOne;
    }
}
