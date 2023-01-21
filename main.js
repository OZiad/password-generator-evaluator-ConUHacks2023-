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