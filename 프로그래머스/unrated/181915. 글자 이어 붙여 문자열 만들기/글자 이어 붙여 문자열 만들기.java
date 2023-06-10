class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for (int index : index_list) {
            if (index >= 0 && index < my_string.length()) {
                sb.append(my_string.charAt(index));
            }
        }
        return sb.toString();
    }
}