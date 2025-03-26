function solution(n, k) {
    const lambPrice = 12000; // 양꼬치 1인분 가격
    const drinkPrice = 2000; // 음료수 1개 가격
    const serviceDrinks = Math.floor(n / 10); // 서비스로 제공되는 음료수 개수
    
    return (n * lambPrice) + ((k - serviceDrinks) * drinkPrice);
}