import java.util.Scanner;

// Triangles
/*
#
#       #
#       #       #
#       #       #       #
#       #       #       #       #
*/

public class Pattern1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            // ? Pattern 1
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print("#\t");
            // }
            // System.out.println();
            // }

            // ? Pattern 2
            // for (int i = n; i >= 1; i--) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print("#\t");
            // }
            // System.out.println();
            // }

            // ? Pattern 3
            // int space = 0;
            // int star = 0;
            // for (int i = 1; i <= 5; i++) {
            // space = n - i;
            // star = i;
            // for (int j = 0 ; j < space; j++) {
            // System.out.print("\t");
            // }
            // for (int j = 0 ; j < star; j++) {
            // System.out.print("#\t");
            // }
            // System.out.println();
            // }
            // ? Pattern 4
            // int space = 0;
            // int star = n;
            // for (int i = 1; i <= n; i++) {

            // for (int j = 0 ; j < space; j++) {
            // System.out.print("\t");
            // }
            // for (int j = 0 ; j < star; j++) {
            // System.out.print("#\t");
            // }

            // System.out.println();
            // space ++;
            // star --;
            // }
            // ? Pattern 5
            // int space = n / 2;
            // int star = 1;
            // for (int i = 1; i <= n; i++) {

            // for (int j = 0; j < space; j++) {
            // System.out.print("\t");
            // }
            // for (int j = 0; j < star; j++) {
            // System.out.print("#\t");
            // }

            // System.out.println();

            // if (i <= n / 2) {
            // space--;
            // star += 2;
            // } else {
            // space++;
            // star -= 2;
            // }

            // }
            // ? Pattern 6
            // int space = 1;
            // int star = ((n / 2) + 1);

            // for (int i = 1; i <= n; i++) {
            // for (int j = 0; j < star; j++) {
            // System.out.print("#\t");
            // }
            // for (int j = 0; j < space; j++) {
            // System.out.print("\t");
            // }
            // for (int j = 0; j < star; j++) {
            // System.out.print("#\t");
            // }

            // System.out.println();

            // if (i <= n / 2) {
            // space += 2;
            // star--;
            // } else {
            // space -= 2;
            // star++;
            // }
            // }
            // ? Pattern 7
            // int space = 0;
            // int star = 1;

            // for (int i = 1; i <= n; i++) {
            // for (int j = 0; j < space; j++) {
            // System.out.print("\t");
            // }
            // for (int j = 0; j < star; j++) {
            // System.out.print("#\t");
            // }
            // space ++;
            // System.out.println();
            // }
            // ? Pattern 8
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= n; j++) {
            // if ((i + j) == (n + 1)) {
            // System.out.print("#\t");
            // }
            // System.out.print("\t");
            // }
            // System.out.println();
            // }
            // ? Pattern 9
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= n; j++) {
            // if ((i == j) || ((i + j) == (n + 1))) {
            // System.out.print("#\t");
            // } else {
            // System.out.print("\t");
            // }
            // }
            // System.out.println();
            // }
            // ? Pattern 10
            // int iSpace = -1;
            // int oSpace = n / 2;

            // for (int i = 1; i <= n; i++) {

            // for (int j = 0; j < oSpace; j++) {
            // System.out.print("\t");
            // }
            // System.out.print("#\t");
            // for (int j = 0; j < iSpace; j++) {
            // System.out.print("\t");
            // }
            // if (i > 1 && i < n) {
            // System.out.print("#\t");

            // }

            // if (i <= n / 2) {
            // oSpace--;
            // iSpace += 2;
            // } else {
            // oSpace++;
            // iSpace -= 2;
            // }

            // System.out.println();
            // }
            // ? Pattern 11
            // int counter = 1;
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print(counter+"\t");
            // counter++;
            // }
            // System.out.println();
            // }
            // ? Pattern 12
            // int a = 0;
            // int b = 1;
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print(a+"\t");
            // int c = a + b;
            // a = b;
            // b = c;
            // }
            // System.out.println();
            // }
            // ? Pattern 13
            // for (int i = 0; i < n; i++) {
            // int icj = 1; // nC0 = 1;
            // for (int j = 0; j <= i; j++) {
            // System.out.print(icj+"\t");
            // int icj1 = (icj * (i-j)) / (j+1);
            // icj = icj1;
            // }
            // System.out.println();
            // }
            // ? Pattern 14
            // for (int i = 1; i <= 10; i++) {
            // System.out.println(n + " * " + i + " = " + (n*i));
            // }
            // ? Pattern 15 * (Column Counter Logic)
            // int space = n / 2;
            // int star = 1;
            // int counter = 1;

            // for (int i = 1; i <= n; i++) {
            // for (int j = 0; j < space; j++) {
            // System.out.print("\t");
            // }
            // int colCounter = counter;
            // for (int j = 0; j < star; j++) {
            // System.out.print(colCounter + "\t");
            // if (j < star / 2) {
            // colCounter++;
            // } else {
            // colCounter--;
            // }
            // }

            // if (i <= n / 2) {
            // space--;
            // star += 2;
            // counter++;
            // } else {
            // space++;
            // star -= 2;
            // counter--;
            // }
            // System.out.println();
            // }
            // ? Pattern 16
            // int space = (2 * n) - 3;
            // int star = 1;

            // for (int i = 1; i <= n; i++) {
            // int counter = 1;
            // for (int j = 0; j < star; j++) {
            // System.out.print(counter + "\t");
            // counter++;
            // }
            // for (int j = 0; j < space; j++) {
            // System.out.print("\t");
            // }
            // if (i == n) {
            // star--;
            // counter--;
            // }
            // for (int j = 0; j < star; j++) {
            // counter--;
            // System.out.print(counter + "\t");

            // }
            // star++;
            // space -= 2;
            // System.err.println();
            // }
            // ? Pattern 17
            // int space = n / 2;
            // int star = 1;

            // for (int i = 0; i < n; i++) {
            // for (int j = 0; j < space; j++) {
            // if (i == n / 2) {
            // System.out.print("*\t");
            // } else {

            // System.out.print("\t");
            // }
            // }
            // for (int j = 0; j < star; j++) {
            // System.out.print("*\t");
            // }
            // if (i < n / 2) {
            // star++;
            // } else {
            // star--;
            // }
            // System.out.println();

            // }
            // ? Pattern 18
            int space = 0;
            int star = n;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= space; j++) {

                    System.out.print("\t");
                }
                for (int j = 1; j <= star; j++) {
                    if ((i > 1 && i <= n / 2) && (j > 1 && j < star)) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                }

                if (i <= n / 2) {
                    space++;
                    star -= 2;
                } else {
                    space--;
                    star += 2;
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}