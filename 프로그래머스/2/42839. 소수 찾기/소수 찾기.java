import java.util.*;

class Solution {
    Set<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {
        // 1. 숫자 조합 만들기
        char[] digits = numbers.toCharArray();
        boolean[] visited = new boolean[digits.length];
        generatePermutations(digits, "", visited);

        // 2. 최대 숫자까지 에라토스테네스의 체
        int max = Collections.max(numberSet);
        boolean[] isPrime = sieve(max);

        // 3. 소수 개수 세기
        int count = 0;
        for (int num : numberSet) {
            if (isPrime[num]) count++;
        }
        return count;
    }

    // 모든 자리 수 조합 생성 (순열)
    void generatePermutations(char[] digits, String current, boolean[] visited) {
        if (!current.isEmpty()) {
            numberSet.add(Integer.parseInt(current));
        }

        for (int i = 0; i < digits.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                generatePermutations(digits, current + digits[i], visited);
                visited[i] = false;
            }
        }
    }

    // 에라토스테네스의 체
    boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        if (n > 0) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
