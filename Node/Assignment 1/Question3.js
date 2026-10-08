// Q3) check the output of the below program and justify the received output
// function changeValue() {
// setTimeout(function() { return 50; }, 2000);
// }
// let num = 10;
// console.log(&quot;Before function call:&quot;, num);
// num = changeValue();
// console.log(&quot;After function call:&quot;, num);

function changeValue() {
  setTimeout(function () {
    return 50;
  }, 2000);
}
let num = 10;
console.log("Before function call:", num);
num = changeValue();
console.log("After function call:", num);
