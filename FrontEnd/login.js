
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
    window.onload = function(){
      for(spanText of spanTexts){
        spanText.classList.add("active");
      }
    }
