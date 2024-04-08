package arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlternativeSolution {
    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        String[] arrTemp = bufferedReader.readLine().split("\\s+");

        List<Integer> arr = new ArrayList<>();

        for(String s : arrTemp){
            arr.add(Integer.parseInt(s));
        }

        List<Integer> res = Result.alternativeReverseArray(arr);

        for (int i = 0; i < res.size();++i){
            bufferedWriter.write(String.valueOf(res.get(i)));
            if (i != arr.size() -1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();

    }
}
