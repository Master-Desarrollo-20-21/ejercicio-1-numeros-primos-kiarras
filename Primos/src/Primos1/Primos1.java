package Primos1;


public class Primos1 {
    static final int MAXNUMBERS  =10;
    public static void main(String[] args) {
        primosUntilMaxnumbers();
        first50prime();
    }

    private static void primosUntilMaxnumbers() {
        int[] pNumbers = new int[MAXNUMBERS];
        int index = 0;
        for (int i = 2; i < pNumbers.length; i++) {
            if(isPrime(i)){
                pNumbers[index]=i;
                index++;
            }
        }
        printSum("Suma entre los " + MAXNUMBERS +" primeros primos: ", pNumbers);
    }

    private static void first50prime() {
        int[] pNumbers = new int[MAXNUMBERS];
        int index = 0;
        int i=2;
        do {
            if(isPrime(i)){
                pNumbers[index]=i;
                index++;
            }
            i++;
        } while (index < pNumbers.length);

        printSum("Suma de los " + MAXNUMBERS +" primeros: ", pNumbers);
    }
    
    private static boolean isPrime(int i) {
        int j=2;
        while (i%j != 0) {
            j++;
        }
        if (i==j) {
            return true;
        }
        return false;
    }

    private static void printSum(String title, int[] pNumbers) {
        int sum=0;
        for (int j = 0; j < pNumbers.length; j++) {
            if(pNumbers[j]!=0) System.out.println(pNumbers[j]);
            sum += pNumbers[j];
        }
            System.out.println(title + sum);
    }
}
