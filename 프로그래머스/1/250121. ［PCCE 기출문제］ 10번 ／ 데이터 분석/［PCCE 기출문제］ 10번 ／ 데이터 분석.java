import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // ext 값이 val_ext보다 작은 데이터만 추출
        ArrayList<int[]> list = new ArrayList<>();
        
        int extIndex = getIndex(ext);
        for(int[] arr : data) {
            if (arr[extIndex] < val_ext) {
                list.add(arr);
            }
        }
        
        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
    
        // sort_by에 해당하는 값을 기준으로 오름차순 정렬
        int sortIndex = getIndex(sort_by);
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[i][sortIndex] > answer[j][sortIndex]) {
                    int[] tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
        }
        return answer;
    }
    
    public int getIndex(String str) {
        int index = 0;
        switch(str) {
            case "code" : 
                index = 0;
                break;
            case "date" :
                index = 1;
                break;
            case "maximum" :
                index = 2;
                break;
            case "remain" :
                index = 3;
                break;
        }
        return index;
    }
}