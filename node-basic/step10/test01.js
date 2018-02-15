// JSON(JavaScript Object Notation)
// => 자바 스크립트의 객체 정보를 문자열로 표현하는 방법

// 1) 자바 스크립트 닽축 문법을 사용하여 객체를 만들기
var obj = {
    name:"홍길동",
    "age": 20,
    'tel': '1111-1111'
};

console.log(obj);

var jsonStr = '{"name":"홍길동","age":20,"tel":"1111-1111"}';

// => JSON.stingify(obj);
var jsonStr2 = JSON.stringify(obj);

console.log(jsonStr);
console.log(jsonStr2);


