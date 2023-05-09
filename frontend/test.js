//Test run
console.log("http request:")
const password = "testing123"
axios.get(`http://localhost:8080/api/${password}`).then((response) => console.log(`response: ${response.data}`));

// Test run
const includeUpperCase = 1;
const length = 10;
const includeLowerCase = 0;
axios.get(`http://localhost:8080/api/passwordGenerator?length=${length}&includeUpperCase=${includeUpperCase}&includeLowerCase=${includeLowerCase}`).then((response) => console.log(`Response: ${response.data}`));