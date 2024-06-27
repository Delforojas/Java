package Factorial;



public class factorial {

	double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
    
    double sum = 0;
    {
    for (double x:revenue)
    {
        sum+=x/revenue.length;
    }
    System.out.println(sum);
    }
}