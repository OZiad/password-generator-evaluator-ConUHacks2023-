
const passwordInput = document.getElementById('password-input');
const meter = document.getElementById('password-strength-meter');
const text = document.getElementById('password-strength-text');

passwordInput.addEventListener('input', function () {
  const password = passwordInput.value;
  const strength = calculatePasswordStrength(password);
  meter.value = strength;
  text.innerText = 'Password strength: ' + getPasswordStrengthText(strength);
});

function calculatePasswordStrength(password) {
  let strength = 0;
  if (password.match(/[a-z]+/)) {
    strength++;
  }
  if (password.match(/[A-Z]+/)) {
    strength++;
  }
  if (password.match(/[0-9]+/)) {
    strength++;
  }
  if (password.match(/[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]+/)) {
    strength++;
  }
  return strength;
}

function getPasswordStrengthText(strength) {
  switch (strength) {
    case 0:
      return '';
    case 1:
      return 'Weak';
    case 2:
      return 'Moderate';
    case 3:
      return 'Strong';
    case 4:
      return 'Very strong';
    default:
      return '';
  }
}

let spanTexts = document.getElementsByTagName("span");
window.onload = function () {
  for (spanText of spanTexts) {
    spanText.classList.add("active");
  }
}

// Check box logic
const uppercaseCheckbox = document.getElementById('uppercase');
const lowercaseCheckbox = document.getElementById('lowercase');
const symbolsCheckbox = document.getElementById('symbols');
const numbersCheckbox = document.getElementById('numbers');

// Variables to store the checkbox values
let uppercaseValue = 0;
let lowercaseValue = 0;
let symbolsValue = 0;
let numbersValue = 0;

// Add event listeners to checkboxes
uppercaseCheckbox.addEventListener('change', function () {
  uppercaseValue = uppercaseCheckbox.checked ? 1 : 0;
  printCheckboxValues();
});

lowercaseCheckbox.addEventListener('change', function () {
  lowercaseValue = lowercaseCheckbox.checked ? 1 : 0;
  printCheckboxValues();
});

symbolsCheckbox.addEventListener('change', function () {
  symbolsValue = symbolsCheckbox.checked ? 1 : 0;
  printCheckboxValues();
});

numbersCheckbox.addEventListener('change', function () {
  numbersValue = numbersCheckbox.checked ? 1 : 0;
  printCheckboxValues();
});

// Example usage: printing the checkbox values
function printCheckboxValues() {
  console.log('Uppercase:', uppercaseValue);
  console.log('Lowercase:', lowercaseValue);
  console.log('Symbols:', symbolsValue);
  console.log('Numbers:', numbersValue);
}

// Generate Button logic

// Get references to the elements
const generateButton = document.getElementById('generate-button');
const generatedPasswordInput = document.getElementById('password');

// Add event listener to the button
generateButton.addEventListener('click', function () {
  const password = generatePassword();
  console.log(sliderInput.value);
  /**
   * 
   * Insert password generation logic
   * 
   */



  generatedPasswordInput.value = password;
});

// Function to generate a password
function generatePassword() {
  // Retrieve the values of the checkboxes
  const uppercaseCheckbox = document.getElementById('uppercase');
  const lowercaseCheckbox = document.getElementById('lowercase');
  const symbolsCheckbox = document.getElementById('symbols');
  const numbersCheckbox = document.getElementById('numbers');

  // Define the character sets
  const uppercaseChars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
  const lowercaseChars = 'abcdefghijklmnopqrstuvwxyz';
  const symbols = '!@#$%^&*()';
  const numbers = '0123456789';

  // Initialize the password string
  let password = '';

  // Generate the password based on the checkbox values
  if (uppercaseCheckbox.checked) {
    password += getRandomCharacter(uppercaseChars);
  }
  if (lowercaseCheckbox.checked) {
    password += getRandomCharacter(lowercaseChars);
  }
  if (symbolsCheckbox.checked) {
    password += getRandomCharacter(symbols);
  }
  if (numbersCheckbox.checked) {
    password += getRandomCharacter(numbers);
  }

  return password;
}

// Function to get a random character from a given string
function getRandomCharacter(str) {
  const randomIndex = Math.floor(Math.random() * str.length);
  return str.charAt(randomIndex);
}

// Slider logic

// Get the slider input element
const sliderInput = document.getElementById('slider-input');

// Get the slider value element
const sliderValue = document.getElementById('slider-value');

// Add an event listener to the slider input
sliderInput.addEventListener('input', () => {
  // Update the value displayed next to the slider
  sliderValue.textContent = sliderInput.value;
  console.log(sliderInput.value);
});

// Set the initial value displayed next to the slider
sliderValue.textContent = sliderInput.value;

