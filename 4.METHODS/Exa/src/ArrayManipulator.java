import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] theArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("exchange")) {
                if (Integer.parseInt(tokens[1]) < 0 || Integer.parseInt(tokens[1]) > theArray.length - 1) {
                    System.out.println("Invalid index");
                } else {
                    theArray = exchangeArray(theArray, Integer.parseInt(tokens[1]));
                }
            } else if (tokens[0].equals("max")) {
                if (tokens[1].equals("even")) {
                    System.out.println(findMaxEven(theArray));
                } else {
                    System.out.println(findMaxOdd(theArray));
                }
            } else if (tokens[0].equals("min")) {
                if (tokens[1].equals("even")) {
                    System.out.println(findMinEven(theArray));
                } else {
                    System.out.println(findMinOdd(theArray));
                }
            } else if (tokens[0].equals("first")) {
                if (Integer.parseInt(tokens[1]) > theArray.length ) {
                    System.out.println("Invalid count");
                } else {
                    if (tokens[2].equals("even")) {
                        System.out.println(findFirstEven(theArray, Integer.parseInt(tokens[1])));
                    } else if (tokens[2].equals("odd")) {
                        System.out.println(findFirstOdd(theArray, Integer.parseInt(tokens[1])));
                    }
                }
            } else if (tokens[0].equals("last")) {
                if (Integer.parseInt(tokens[1]) > theArray.length ) {
                    System.out.println("Invalid count");
                } else {
                    if (tokens[2].equals("even")) {
                        System.out.println(findLastEven(theArray, Integer.parseInt(tokens[1])));
                    } else if (tokens[2].equals("odd")) {
                        System.out.println(findLastOdd(theArray, Integer.parseInt(tokens[1])));
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(theArray));
    }

    private static String findLastEven(int[] theArray, int count) {
        StringBuilder print = new StringBuilder("[");
        int foundCount = 0;
        for (int i = theArray.length - 1; i >= 0; i--) {
            if ((theArray[i] % 2 == 0||theArray[i]==0) && foundCount < count) {
                print.insert(1,theArray[i] + ", ");
                foundCount++;
            }
        }
        if (print.length()!=1) {
            print.delete(print.length() - 2, print.length());
        }
        print.append("]");
        return print.toString();
    }

    private static String findLastOdd(int[] theArray, int count) {
        StringBuilder print = new StringBuilder("[");
        int foundCount = 0;
        for (int i = theArray.length - 1; i >= 0; i--) {
            if (theArray[i] % 2 == 1 && foundCount < count) {
                print.insert(1,theArray[i] + ", ");
                foundCount++;
            }
        }
        if (print.length()!=1) {
            print.delete(print.length() - 2, print.length());
        }
        print.append("]");
        return print.toString();
    }

    private static String findFirstOdd(int[] theArray, int count) {
        StringBuilder print = new StringBuilder("[");
        int foundCount = 0;
        for (int i = 0; i <= theArray.length - 1; i++) {
            if (theArray[i] % 2 == 1 && foundCount < count) {
                print.append(theArray[i] + ", ");
                foundCount++;
            }
        }
        if (print.length()!=1) {
            print.delete(print.length() - 2, print.length());
        }
        print.append("]");
        return print.toString();
    }

    private static String findFirstEven(int[] theArray, int count) {
        StringBuilder print = new StringBuilder("[");
        int foundCount = 0;
        for (int i = 0; i <= theArray.length - 1; i++) {
            if ((theArray[i] % 2 == 0||theArray[i]==0) && foundCount < count) {
                print.append(theArray[i] + ", ");
                foundCount++;
            }
        }
        if (print.length()!=1) {
            print.delete(print.length() - 2, print.length());
        }
        print.append("]");
        return print.toString();
    }

    private static String findMinOdd(int[] theArray) {
        int index = -1;
        int min = 1001;
        for (int i = 0; i <= theArray.length - 1; i++) {
            if (theArray[i] <= min && theArray[i] % 2 == 1) {
                index = i;
                min = theArray[i];
            }
        }
        if (index == -1) {
            return "No matches";
        }
        return String.valueOf(index);
    }

    private static String findMinEven(int[] theArray) {
        int index = -1;
        int min = 1001;
        for (int i = 0; i <= theArray.length - 1; i++) {
            if (theArray[i] <= min && (theArray[i] % 2 == 0||theArray[i]==0)) {
                index = i;
                min = theArray[i];
            }
        }
        if (index == -1) {
            return "No matches";
        }
        return String.valueOf(index);
    }

    private static String findMaxOdd(int[] theArray) {
        int index = -1;
        int max = -1;
        for (int i = 0; i <= theArray.length - 1; i++) {
            if (theArray[i] >= max && theArray[i] % 2 == 1) {
                index = i;
                max = theArray[i];
            }
        }
        if (index == -1) {
            return "No matches";
        }
        return String.valueOf(index);
    }

    private static String findMaxEven(int[] theArray) {
        int index = -1;
        int max = -1;
        for (int i = 0; i <= theArray.length - 1; i++) {
            if (theArray[i] >= max && (theArray[i] % 2 == 0||theArray[i]==0)) {
                max = theArray[i];
                index = i;
            }
        }
        if (index == -1) {
            return "No matches";
        }
        return String.valueOf(index);
    }

    private static int[] exchangeArray(int[] theArray, int i) {
        for (int a = 0; a <= i; a++) {
            int firstNum = theArray[0];
            for (int j = 0; j <= theArray.length - 2; j++) {
                theArray[j] = theArray[j + 1];
            }
            theArray[theArray.length - 1] = firstNum;
        }


        return theArray;
    }
}
