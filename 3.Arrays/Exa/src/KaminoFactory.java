import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DNALength = Integer.parseInt(scanner.nextLine());
        String comand = scanner.nextLine();
        int[] bestDna = new int[DNALength];
        int bestLengthLast = 0;
        int bestIndexLast = 0;
        int bestSumLast = 0;
        int count = 0;
        int bestDnaSimple = 0;
        while (!comand.equals("Clone them!")) {
            boolean clone = false;
            count++;
            int[] dna = Arrays.stream(comand.split("\\!+")).mapToInt(Integer::parseInt).toArray();
            int bestLength = 0;
            int bestIndex = 0;
            int bestSum = 0;
            int moment = 0;
            for (int i = dna.length - 1; i >= 0; i--) {
                if (dna[i] == 1) {
                    bestSum += 1;
                    if (i == dna.length - 1) {
                        moment += 1;
                        bestLength = moment;
                        bestIndex = i;
                    } else if (dna[i] == dna[i + 1]) {
                        moment += 1;
                        bestIndex = i;
                        if (moment > bestLength) {
                            bestLength = moment;
                        }
                    } else {
                        moment = 1;
                    }
                } else {
                    moment = 0;
                }
            }
            if (bestLength > bestLengthLast) {
                clone = true;
            } else if (bestLength == bestLengthLast) {
                if (bestIndex < bestIndexLast) {
                    clone = true;
                } else if (bestIndex == bestIndexLast) {
                    if (bestSum > bestSumLast) {
                        clone = true;
                    }

                }

            }
            if (clone) {
                for (int i = 0; i <= dna.length - 1; i++) {
                    bestDna[i] = dna[i];
                }
                bestIndexLast = bestIndex;
                bestLengthLast = bestLength;
                bestSumLast = bestSum;
                bestDnaSimple = count;

            }
            comand = scanner.nextLine();
        }
        if (bestDnaSimple==0){
            bestDnaSimple=1;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestDnaSimple, bestSumLast);
        for (int i = 0; i <= bestDna.length - 1; i++) {
            System.out.print(bestDna[i]);
            System.out.print(" ");
        }
    }

}
//length
//indexLeftMost
//sum