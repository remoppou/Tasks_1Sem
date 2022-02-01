package ru.vsu.cs.vvp2021.g82.voronezhskij_n_m.task_13_n_8;

import ru.vsu.cs.vvp2021.g82.voronezhskij_n_m.task_13_n_8.util.ArrayUtils;
import java.io.PrintStream;
import java.util.*;


public class Program {

    public static class CmdParams {
        public String inputFile;
        public String outputFile;
        public boolean error;
        public boolean help;
        public boolean window;
    }

    public static CmdParams parseArgs(String[] args) {
        CmdParams params = new CmdParams();
        if (args.length > 0) {
            if (args[0].equals("--help")) {
                params.help = true;
                return params;
            }
            if (args[0].equals("--window")) {
                params.window = true;
                return params;
            }

            params.inputFile = args[0];
            if (args.length > 1) {
                params.outputFile = args[1];
            }
        } else {
            params.help = true;
            params.error = true;
        }
        return params;
    }


    public static void winMain() throws Exception {
        Locale.setDefault(Locale.ROOT);

    }

    public static void main (String[]args) throws Exception {
        CmdParams params = parseArgs(args);
        if (params.help) {
            PrintStream out = params.error ? System.err : System.out;
            out.println("Usage:");
            out.println("  <cmd> args  <input-file> (<output-file>)");
            out.println("  <cmd> --help");
            out.println("  <cmd> --window  // show window");
            System.exit(params.error ? 1 : 0);
        }
        if (params.window) {
            winMain();
        } else {
            int[] arr = ArrayUtils.readIntArrayFromConsole();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            System.out.println("n = " + arr.length);
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите k (0 < k < " + (arr.length + 1) + "): ");
            int k = sc.nextInt();
            System.out.println("k = " + k);
            List<List<Integer>> ansList = new ArrayList<>();
            Task12.genAll(list, k,  (List<Integer> current) -> {
                List<Integer> cur = new ArrayList<>(current);
                ansList.add(cur);
            });
            for (List<Integer> elements : ansList) {
                System.out.println("Очередной вариант: " + elements + " ");

            }
            System.out.println("Количество перестановок = " + ansList.size());
            PrintStream out = (params.outputFile != null) ? new PrintStream(params.outputFile) : System.out;
            out.close();
        }
    }
}