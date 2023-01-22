document.getElementById("GenerateButton").addEventListener("click", function(){
    var password = generatePassword();
    document.getElementById("myTextbox").value = password;
 });

 function generatePassword() {
    var length = 15,
        charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()",
        retVal = "";
    for (var i = 0, n = charset.length; i < length; ++i) {
        retVal += charset.charAt(Math.floor(Math.random() * n));
    }
    return retVal;
  }

  var unhideButton = document.getElementById("unhideButton");
unhideButton.addEventListener("click", function(){
  var textbox = document.getElementById("myTextbox");
  if (textbox.type === "password") {
    textbox.type = "text";
    unhideButton.innerHTML = "Hide Password";
  } else {
    textbox.type = "password";
    unhideButton.innerHTML = "Unhide Password";
  }
});

  var gridContainer = document.getElementById("gridContainer");
document.getElementById("GearButton").addEventListener("click", function(){
  if (gridContainer.style.display === "none") {
    gridContainer.style.display = "block"; /* show the grid */  
  } else {
    gridContainer.style.display = "none"; /* hide the grid */
  }
});
  var button1 = document.getElementById("CapButton");

  button1.addEventListener("click", function() {
    button1.classList.toggle("glow");
  });
  var button2 = document.getElementById("SymButton");

  button2.addEventListener("click", function() {
    button2.classList.toggle("glow");
  });
  var button3 = document.getElementById("Button");

  button3.addEventListener("click", function() {
    button3.classList.toggle("glow");
  });
  var button4 = document.getElementById("ButtonOne");

  button4.addEventListener("click", function() {
    button4.classList.toggle("glow");
  });
  var button5 = document.getElementById("ButtonTwo");

  button5.addEventListener("click", function() {
    button5.classList.toggle("glow");
  });
  var button6 = document.getElementById("ButtonThree");

  button6.addEventListener("click", function() {
    button6.classList.toggle("glow");
  });
  var button7 = document.getElementById("ButtonFour");

  button7.addEventListener("click", function() {
    button7.classList.toggle("glow");
  });
  var button8 = document.getElementById("ButtonFive");

  button8.addEventListener("click", function() {
    button8.classList.toggle("glow");
  });
  var button9 = document.getElementById("ButtonSix");

  button9.addEventListener("click", function() {
    button9.classList.toggle("glow");
  });


