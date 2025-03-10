import java.lang.Math;

class Solution {
    public int solution(int n, int t) {
        double answer = n*Math.pow(2, t);
        return (int)answer;
    }
}