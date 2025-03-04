class Solution {
    public int solution(int M, int N) {

        if(M == 1 && N == 1){
            return 0;
        }else {
            return (M * N) -1;
        }

    }
}

// M == x, N == y
// 1. 4cm == 3번
// 2. 10cm == 9번
// 3. 1cm == 1번