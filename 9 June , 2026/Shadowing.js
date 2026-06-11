/* Shadowing in JavaScript occurs when a variable declared within a certain scope (e.g., a function or block) has the same name as a variable declared in an outer scope. The inner variable "shadows" the outer variable, meaning that within the inner scope, references to that variable name will refer to the inner variable rather than the outer one.

Here's an example to illustrate shadowing:
 */
let number = 10; // This is the outer variable

function shadowingExample() {
    let number = 20; // This variable shadows the outer variable
    console.log("Inner number:", number); // This will log 20
}