// Write a JavaScript program that declares two variables and initializes them with values.
// Use typeof to determine the data type of the variables and perform the following operations:
// 1. If both variables are numbers, calculate and display the difference between the two numbers.
// 2. If both variables are strings, convert both strings to uppercase and concatenate (merge) them.
// 3. If the variables are of any other type, display an appropriate error message.

let a;
let b;

a = 10;
b = 20;

if (typeof a === "number" && typeof b === "number") {
  console.log("The difference between the two numbers is " + (a - b));
} else if (typeof a === "string" && typeof b === "string") {
  console.log(a.toUpperCase() + b.toUpperCase());
} else {
  console.log("Error");
}

a = "rutu";
b = " jadhav";

if (typeof a === "number" && typeof b === "number") {
  console.log("The difference between the two numbers is " + (a - b));
} else if (typeof a === "string" && typeof b === "string") {
  console.log(a.toUpperCase() + b.toUpperCase());
} else {
  console.log("Error");
}


a = "rutu";
b = 8;

if (typeof a === "number" && typeof b === "number") {
  console.log("The difference between the two numbers is " + (a - b));
} else if (typeof a === "string" && typeof b === "string") {
  console.log(a.toUpperCase() + b.toUpperCase());
} else {
  console.log("Error");
}