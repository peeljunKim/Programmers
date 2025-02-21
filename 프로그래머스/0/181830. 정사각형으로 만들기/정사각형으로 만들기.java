import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        
        int row = arr.length; // 행
        int column = arr[0].length; // 열
        
        
        // 행4 열3 각 행의 끝에 0 추가
        if(row > column){
            for(int i = 0; i < row;i++){
                int[] newRow = new int[row]; 
                System.arraycopy(arr[i], 0, newRow, 0, column); 
                newRow[column] = 0; 
                arr[i] = newRow;
            }
        // 행2 열4    
        }else if (column > row) {
            int[][] newArr = new int[column][column]; 
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < column; j++) {
                    
                    if (i < row && j < arr[i].length) {
                        newArr[i][j] = arr[i][j]; 
                    } else {
                        newArr[i][j] = 0; 
                    }
                }
            }
            arr = newArr;
        } else{
            return arr;
        }
        
        return arr;
    }
}

// 1차 배열 갯수가 행
// 1차 배열안에 있는 원소 갯수가 열