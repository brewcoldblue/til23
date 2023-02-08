function foo() {
  console.log("foo");
}

function sleep(delay) {
  var start = new Date().getTime();
  while (new Date().getTime() < start + delay);
}

function bar() {
  console.log("bar");
}

sleep(3000);
foo();
sleep(3000);
bar();
