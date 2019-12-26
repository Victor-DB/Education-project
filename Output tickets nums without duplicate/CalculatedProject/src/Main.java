import java.util.*;

/**
 * Output numbers of loto tickets without duplicates
 */
public class Main {

    static int sort(String str) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            int n1 = Integer.parseInt(s);
            list.add(n1);
        }

        Collections.sort(list);
        String stroka ="";
        for(int j = 0; j < list.size(); j++) { stroka = stroka + list.get(j)+ "";}
        stroka.trim();
        return Integer.parseInt(stroka);
    }

    public static void main(String[] args) {
        int n = 5;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        String cash = null;

        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    for (int m = 1; m <= n; m++) {
                        for (int l = 1; l <= n; l++) {
                            cash = i + "" + j + "" + k + "" + m + "" + l;
                            cash.trim();
                            int x = sort(cash);
                            map.put(x, x);
                        }
                    }
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { System.out.println(entry.getKey());}
    }
}



