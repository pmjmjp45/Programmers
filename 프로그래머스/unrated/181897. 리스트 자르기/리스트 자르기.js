function solution(n, slicer, num_list) {
    var start = 0;
    var end = 0;
    var answer = [];
    if (n == 1) {
        end = slicer.at(1) + 1;
        num_list.slice(start, end);
        answer = num_list.slice(start, end);
    } else if (n == 2) {
        start = slicer.at(0);;
        end = slicer.at(num_list.length - 1);
        answer = num_list.slice(start, end);
    } else if (n == 3) {
        start = slicer.at(0);
        end = slicer.at(1) + 1;
        answer = num_list.slice(start, end);
    } else {
        start = slicer.at(0);
        end = slicer.at(1) + 1;
        var gap = slicer.at(2);
        
        answer = num_list.slice(start, end).filter((element, idx) => idx % gap == 0);
        console.log(gap);
    }
    return answer;
}