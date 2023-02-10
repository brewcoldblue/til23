var arr = [1, 2, 3, 4];

arr.forEach((v, i, arr)=>{
    console.log(v, i, arr);
})

var arr2 = arr.map((v) => 3 * v);
console.log(arr2);

var arr3 = arr.filter((v) => v % 2 === 0);
console.log(arr3);

var num = arr.find((v) => v % 2 === 0);
console.log(num);

console.log(arr.pop());
console.log(arr);

arr.unshift(5);
console.log(arr);
