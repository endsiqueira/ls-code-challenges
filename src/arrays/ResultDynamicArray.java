package arrays;

import java.util.ArrayList;
import java.util.List;

class ResultDynamicArray {
public static List<Integer> dynamicArray (int n, List<List<Integer>> queries){

    int lastAnswer = 0;
    List<List<Integer>> arr = new ArrayList<>();
    List<Integer> result = new ArrayList<>();

    for (int i =0;i < n; i++){
        arr.add(new ArrayList<>());
    }

    for (List<Integer> query: queries){
        int type = query.get(0);
        int x = query.get(1);
        int y = query.get(2);
        int index = (x ^ lastAnswer) % n;
        List<Integer> seq = arr.get(index);

        if (type == 1) {
            seq.add(y);
        } if (type == 2){
            lastAnswer = seq.get(y % seq.size());
            result.add(lastAnswer);
        }
    }
        return result;
    }
}
