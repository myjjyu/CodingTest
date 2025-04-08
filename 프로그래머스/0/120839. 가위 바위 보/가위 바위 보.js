function solution(rsp) {
    const win = {
        '2': '0',
        '0': '5',
        '5': '2'
    };

    let answer = '';
    for (let ch of rsp) {
        answer += win[ch];
    }

    return answer;
}
