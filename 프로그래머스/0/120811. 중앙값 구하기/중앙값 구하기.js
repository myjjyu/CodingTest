function solution(array) {
    array.sort((a, b) => a - b); // 배열을 오름차순으로 정렬
    return array[Math.floor(array.length / 2)]; // 중앙값 반환
}