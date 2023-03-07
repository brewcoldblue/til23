let task1 = false;
let task2 = true;

function task1(successCallback, failureCallback) {
  if (task1) {
    successCallback();
  } else {
    failureCallback();
  }
}

function onTask1Success(successCallback, failureCallback) {
  console.log("task1 작업이 성공했습니다.");
  if (task2) {
    successCallback();
  } else {
    failureCallback();
  }
}

function onTask1Failure() {
  console.log("task1 작업이 실패했습니다.");
  if (task2) {
    successCallback();
  } else {
    failureCallback();
  }
}

function onTask2Success() {
  console.log("task2 작업이 성공했습니다");
}

function onTask2Failure() {
  console.log("task2 작업이 실패했습니다");
}

task1(() => onTask1Success(onTask2Success, onTask2Failure), onTask1Failure);
