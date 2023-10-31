function solution(n, slicer, num_list) {
    const [a, b, c] = slicer;
    var answer = [];
    
    if (n == 1) {
        answer = num_list.slice(0, b + 1);
    } else if (n == 2) {
        answer = num_list.slice(a, num_list.length);
    } else if (n == 3) {
        answer = num_list.slice(a, b + 1);
    } else {
        answer = num_list.slice(a, b + 1).filter((element, idx) => idx % c == 0);
    }
    return answer;
}