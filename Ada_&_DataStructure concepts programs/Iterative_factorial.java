package neet;
  class Iterative_factorial { 
    static int factorial(int n) 
    { 
        if(n == 0) 
           return 1; 
        int i = n, fact = 1; 
        while (n / i != n) { 
            fact = fact * i; 
            i--; 
        } 
        return fact; 
    }
    public static void main(String[] args) 
    { 
        int num = 5; 
        System.out.println( 
            "Factorial of " + num 
            + " is " + factorial(5)); 
    } 
} 

 