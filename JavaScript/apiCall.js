let response = await fetch("http://localhost:8080/products");
let data = await response.json();
console.log(data);