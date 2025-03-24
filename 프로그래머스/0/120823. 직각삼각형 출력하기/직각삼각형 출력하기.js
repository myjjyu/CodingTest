const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', function (line) {
    let n = Number(line); // 입력값을 숫자로 변환
    for (let i = 1; i <= n; i++) {
        console.log('*'.repeat(i)); // i개의 '*'을 출력
    }
    rl.close(); // 입력 종료
});