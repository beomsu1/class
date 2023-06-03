// 1. string concatenation
console.log('my'+'cat');
console.log('1'+2);
console.log(`string literals:

1 +2 = ${1+2}`);

console.log("ellie's book");

// 2. Numeric operators
console.log(1+1) ; //add
console.log(1-1); // substract
console.log(1/1); // divide
console.log(1*1); // multiply
console.log(5%2); // remainder
console.log(2 ** 3); // exponentiation 제곱

// 3. Increment and decrement operators
let counter = 2;
const preIncrement = ++counter;
// counter = counter + 1;
// preIncrement = counter;
console.log(`preIncrement: ${preIncrement}, counter: ${counter}`);
const postIncrement = counter++;
// postIncrement = counter;
// counter = counter +1;

// 4. Assignmnet operators
let x = 3;
let y = 6;
x += y ; // x = x + y
x -= y ;
x *= y;
x /= y;

// 5. Comparison operators
console.log(10<6);
console.log(10 <= 6);
console.log(10>6);
console.log(10 >= 6);

for(let i = 0; i<11 ; i++){
    if ( i % 2 !== 0 ){
        continue;
    }
    console.log(`q1. ${i}`)
}

