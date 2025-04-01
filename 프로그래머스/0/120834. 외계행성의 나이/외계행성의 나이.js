function solution(age) {
    return String(age).split('').map(num => String.fromCharCode(97 + Number(num))).join('');
}