function solution(hp) {
    let generals = Math.floor(hp / 5);
    hp %= 5;
    
    let soldiers = Math.floor(hp / 3);
    hp %= 3;
    
    let workers = hp; // 1의 공격력으로 남은 체력을 맞춤

    return generals + soldiers + workers;
}
