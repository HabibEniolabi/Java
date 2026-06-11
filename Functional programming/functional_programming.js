// Declartative vs Imperative proggraming
// Declarative programming: Only show the logic of computation without showing ho it's done.
const a = [1, 2, 3, 4, 5, 6]
for(let element in a) {
    console.log(element);
}

// Imperative programming: Shows how it is done through the use of codes
for(let i = 0; i < a.length; i++) {
    element = a[i];
    console.log(element);
}

array2 = a.map(element => element * 2);
console.log(array2);

const add = (a, b) => {
    return a + b;    
}

let random = Math.random();

const addany = (c , d) => {
    return c + d;
}

const bankContainer = {
    firstName: "John",
    lastName: "Doe",
    balance: 3403,
    makePayment: function pay( amount ) {
        this.balance -= amount;
        console.log("Payed ",amount, ", balance remaining: ", this.balance);
    }
}; // This repersentsm a class and object but does not support its pillars (i.e abstraction, encapsulation, polymorphism, inheritance etc.)

console.log(add(5, 4)); //This is a pure function, it returns the same value if the same values are used as args
console.log(addany(5, random)); //This is an impure function. It returns a different value despite the same paremetrs being added. This is dune to the existence of a global var 'random'.

