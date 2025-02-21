class Solution {
    public int solution(String[] order) {
        int americano = 0;
        int cafelatte = 0;
        
        for(String str : order){
            if(str.contains("americano")){
                americano++;
            }else if(str.contains("cafelatte")){
                cafelatte++;
            }else{ // 아무거나 = 아메리카노
                americano++;
            }
        }
        
        return (americano*4500) + (cafelatte*5000);
    }
}

// 옵션: hot or ice
// 메뉴: 아메리카노(4500) or 카페 라떼(5000)
// anything = 아이스 아메리카노