function solution(numbers) {
    // numbers 배열의 합을 구한 뒤 요소의 개수로 나누어 평균 계산
    const sum = numbers.reduce((acc, num) => acc + num, 0);
    const average = sum / numbers.length;
    return average;
}
