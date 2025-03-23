function solution(money) {
    const price = 5500; // 아이스 아메리카노 한 잔 가격
    const maxAmericano = Math.floor(money / price); // 마실 수 있는 최대 잔 수
    const remainingMoney = money % price; // 남은 돈
    return [maxAmericano, remainingMoney];
}
