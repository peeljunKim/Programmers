class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length;
        int col1 = arr1[0].length; 
        
        int row2 = arr2.length;
        int col2 = arr2[0].length; 
        
        int[][] answer = new int[row1][col2];
        
        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                for (int z = 0; z < col1; z++) { 
                    answer[i][j] += arr1[i][z] * arr2[z][j];
                    // System.out.println(arr1[i][z] * arr2[z][j]);
                }
            }
        }
        
        
        return answer;
    }
}
// -10 이상 20 이하인 자연수
// arr1이 m행 k열이고 arr2가 k행2 n열2 이면 == m행 n열