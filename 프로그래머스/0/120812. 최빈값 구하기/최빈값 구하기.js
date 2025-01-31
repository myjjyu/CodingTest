function solution(array) {
    let counts = {};
    
    // 1. 등장 횟수 카운트
    array.forEach(num => counts[num] = (counts[num] || 0) + 1);

    // 2. 최빈값 찾기
    let maxCount = Math.max(...Object.values(counts));
    let modes = Object.keys(counts).filter(num => counts[num] === maxCount);

    // 3. 최빈값이 여러 개면 -1 반환, 아니면 최빈값 반환
    return modes.length > 1 ? -1 : Number(modes[0]);
}
