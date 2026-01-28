class Solution {
    public int solution(int a, int b) {
        int len = (Integer.toString(b)).length();
        int total= a*(int)Math.pow(10,len)+b;
        int answer = (total>=2*a*b)? total : 2*a*b;
        return answer;
    }
}