var params = ["hello", true, 7];
var other = [1, 2, ...params]; // [ 1, 2, "hello", true, 7 ]
console.log(other);

function foo(...args) {
  console.log(args);
}
foo(1, 2, 3, 4, 5);

function bar(first, ...rest) {
  console.log(first);
  console.log(rest);
}
bar(1, 2, 3, 4, 5);

function f(x, y, ...a) {
  return (x + y) * a.length;
}
console.log(f(1, 2, ...params));
console.log(f(1, 2, ...other));

var str = "foo";
var chars = [...str]; // [ "f", "o", "o" ]
console.log(chars);

var arr = [1, 2, 3, 4];
var arr2 = [...arr];
arr.shift();
console.log(arr);
console.log(arr2);

var obj = {
  name: "haha",
  age: 33,
};
var obj2 = { ...obj };
obj.name = "hoho";
console.log(obj);
console.log(obj2);
