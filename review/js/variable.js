
'use strict';

// 2. Variable, rw(read,write) , 읽고 쓰기 가능
// 변수 선언 할때 let 사용

let name = 'beomsu';
console.log(name);
name = 'hello';
console.log(name);

// 3. Constants - const , r (read only)
// 거의 바뀌지 않는 값을 const를 사용 해서 변수 생성
// - security
// - thread safety

const daysInweeks = 7;
const maxNumber = 5;

// 4. variable types
// primitive, single item : number, string, boolean, null, undefinded, symbol
// object , box container

const count = 17; // integer
const size = 17.1; // demical number
console.log(`value: ${count}, type: ${typeof count}`);
console.log(`value: ${size} , typeof ${size}`);

// number
const infinity = 1/0;
const negativeInfinity = -1/0;
const nAn = 'not a number' / 2;
console.log(infinity);
console.log(negativeInfinity);
console.log(nAn)

// bigInt
const bigInt = 1234562315132489126745981265971263789126348712n;
console.log(`value: ${bigInt} , type: ${typeof bigInt}`);
Number.MAX_SAFE_INTEGER;

// String
const char = 'c';
const brendan = 'brendan';
const greeting = 'hello' + brendan;
console.log(`vlaue: ${greeting}, type: ${typeof greeting}`)
const helloBob = `hi ${brendan}!` ; // template literals (string)
console.log(`vlaue: ${helloBob}, type: ${typeof helloBob}`)

// boolean
const canRead = true;
const test = 3<1; // false
console.log(`value: ${canRead}, type: ${typeof canRead}`)
console.log(`value: ${test}, type: ${typeof test}`)

// null
let nothing = null;
console.log(`value: ${nothing}, type: ${typeof nothing}`);

// undefined
let x;
console.log(`value: ${x}, type: ${typeof x}`);

// symbol. create, unique identifiers for objects
const symbol1 = Symbol('id');
const symbol2 = Symbol('id');
console.log(symbol1 === symbol2);
const gSymbol1 = Symbol.for('id');
const gSymbol2 = Symbol.for('id');
console.log(gSymbol1 === gSymbol2); // true
console.log(`value: ${symbol1.description}, type:${typeof symbol1.description}`);

// 5. Dynamic typing
let text = 'hello';
console.log(`value: ${text}, type:${typeof type}`);
text =1;
console.log(`value: ${text}, type : ${typeof text}`);
text = '7'+5;
console.log(`value: ${text}, type : ${typeof text}`);
text = '8'/ '2';
console.log(`value: ${text}, type : ${typeof text}`);

