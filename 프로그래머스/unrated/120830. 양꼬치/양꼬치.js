function solution(n, k) {
    var answer = 12000 * n + (k - parseInt(n / 10)) * 2000;
    return answer;
}