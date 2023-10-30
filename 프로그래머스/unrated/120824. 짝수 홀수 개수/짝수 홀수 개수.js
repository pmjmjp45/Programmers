function solution(num_list) {
    var even = 0;
    var odd = 0;
    
    num_list.forEach (function(num) {
        if (num % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    })
    var answer = [even, odd];
    return answer;
}