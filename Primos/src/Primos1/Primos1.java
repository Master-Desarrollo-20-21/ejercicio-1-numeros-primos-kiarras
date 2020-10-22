package Primos1;

public class Primos1 {
    public static void main(String[] args) {
        primosUntil50();
        first50prime();
    }

    private static void primosUntil50() {
        int[] pNumbers = new int[50];
        int index = 0;
        for (int i = 2; i < pNumbers.length; i++) {
            int j=2;
            while (i%j != 0) {
                j++;
            }
            if (i==j) {
                pNumbers[index]=i;
                index++;
            }
        }
        int sum=0;
        for (int i = 0; i < pNumbers.length; i++) {
            if(pNumbers[i]!=0) System.out.println(pNumbers[i]);
            sum += pNumbers[i];
        }
            System.out.println("Suma entre los 50 primeros: " + sum);
    }
    private static void first50prime() {
        int[] pNumbers = new int[50];
        int index = 0;
        int i=2;
        do {
            int j=2;
            while (i%j != 0) {
                j++;
            }
            if (i==j) {
                pNumbers[index]=i;
                index++;
            }
            i++;
        } while (index < pNumbers.length);

        int sum=0;
        for (int j = 0; j < pNumbers.length; j++) {
            if(pNumbers[j]!=0) System.out.println(pNumbers[j]);
            sum += pNumbers[j];
        }
            System.out.println("Suma de los 50 primeros: " + sum);
    }
}
