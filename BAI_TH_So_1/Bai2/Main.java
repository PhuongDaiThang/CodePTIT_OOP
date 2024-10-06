package Bai2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> defective = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            defective.add(sc.nextInt());
        }
        sc.close();

        List<Integer> allProducts = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            allProducts.add(i);
        }

        List<Integer> nonDefective = new ArrayList<>(allProducts);
        nonDefective.removeAll(defective);

        System.out.println("Errors: " + formatRanges(defective));
        System.out.println("Correct: " + formatRanges(nonDefective));
    }

    private static String formatRanges(List<Integer> list) {
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int start = list.get(0);
        int end = start;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == end + 1) {
                end = list.get(i);
            } else {
                appendRange(sb, start, end);
                start = list.get(i);
                end = start;
            }
        }
        appendRange(sb, start, end);

        return sb.toString().replaceAll(",([^,]*)$", " and$1");
    }

    private static void appendRange(StringBuilder sb, int start, int end) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
        if (start == end) {
            sb.append(start);
        } else {
            sb.append(start).append("-").append(end);
        }
    }
}