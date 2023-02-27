var a = 0;

function f() {
  console.log(a);
  var a = 1;
  console.log(a);
}
f();
