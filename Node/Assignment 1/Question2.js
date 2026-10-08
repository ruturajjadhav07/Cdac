// Q2)
// Write a JavaScript program that declares two variables, n and m, and initializes them with integer
// values.

// Write a loop that iterates from n to m (inclusive).
// refer https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Loops_and_iteration
// i) On each iteration, print the current value.
// ii) If the current value is a multiple of 7, call a function named displayMessage().
// iii) Define the function displayMessage() to display the message The number is a multiple of 7.
// iv) try to delete the displayMessage() function and run the same program and observe th the
// changes to the output

let n = 1;
let m = 20;

for (let i = n; i < m; i++) {
  if (i % 7 == 0) {
    displayMessage();
  } else {
    console.log(i);
  }
}

function displayMessage() {
  console.log("The number is multiple of 7");
}
