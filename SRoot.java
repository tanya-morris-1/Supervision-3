class NegativeRoot extends Exception{
    public NegativeRoot() {
        System.out.println("Cannot find negative root");
    }
}

public class SRoot {
    private double input;
    private double accuracy = 1E-5;

    SRoot(double inputted){
        input = inputted;
    }

    private double calculate() throws NegativeRoot {
        if (input < 0) {
            throw new NegativeRoot();
        }
        double x1 = 0;
        double x0 = input;
        while (Math.abs(input-(x1*x1))>accuracy){
            x1 = (x0 - input/x1)/2;
        }
        return x1;
    }

    public static void main(String[] args) throws NegativeRoot {
        SRoot test = new SRoot(-4);
        double result = test.calculate();
        System.out.println(result);
    }
}
