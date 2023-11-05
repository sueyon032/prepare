document.addEventListener("DOMContentLoaded",function(){
   var loginButton= document.getElementById("joinBtn");
   loginButton.onclick=function(){
    alert("회원가입이 완료되었습니다.");
    window.location.href="index";
   };
});