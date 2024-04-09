package arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SolutionHourGlass {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH_HOUR_GLASS")));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i=0;i<6;i++){
            String [] arrRowTempItens = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j=0;j < 6;j++){
                int arrItem = Integer.parseInt(arrRowTempItens[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

            int result = ResultHourGlass.hourglassSum(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
            bufferedReader.close();
            bufferedWriter.close();
    }
}
