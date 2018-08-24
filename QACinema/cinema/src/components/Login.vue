<template>
<div class="parallax">
  <navigation/>
  <div style="padding: 5% 0 17% 0">
  <table width="60%" border="0" align="center">
    <div class="row">
      <div id="login_div" class="main-div" style="background-color:#b7b3bb;" >
        <h3>Log In</h3>
        <input type="email" placeholder="Email..." id="email_field" />
        <input type="password" placeholder="Password..." id="password_field" />
        <button v-on:click="loginA()" >Login to Account</button>
        <div id="user_div" class="loggedin-div" style="background-color:#b7b3bb;">
          <h3>Welcome User</h3>
          <p id="user_para">Welcome. You're currently logged in.</p>
          <button onclick="logout()">Logout</button>
        </div>
      </div>

      <table width="60%" border="0" align="center">
        <div id="login_div1" class="main-div" style="background-color:#b7b3bb;">
          <h3>Sign Up</h3>
          <input type="email" placeholder="Email..." id="email_field1" />
          <input type="password" placeholder="Password..." id="password_field1" />
          <button onclick="createAccount()">Create an Account</button>
        </div>
      </table>
    </div>
  </table>
</div>

  <Footer/>
</div>
</template>
<script>
import Navigation from './navigation'
import Footer from './footer'
/* eslint-disable */
export default {
  name: 'Login',
  components: {Navigation, Footer}
}

let config = {
  apiKey: "AIzaSyB0BtIZPmTa0kcvLFs4LDprzOsmUgLde6A",
  authDomain: "qa-cinema-bd460.firebaseapp.com",
  databaseURL: "https://qa-cinema-bd460.firebaseio.com",
  projectId: "qa-cinema-bd460",
  storageBucket: "qa-cinema-bd460.appspot.com",
  messagingSenderId: "353566967987"
};
firebase.initializeApp(config);

firebase.auth().onAuthStateChanged(function(user) {
  if (user) {
    // User is signed in.
      document.getElementById("user_div").style.display = "block";
    document.getElementById("login_div").style.display = "none";
    //if user is logged in send back to homepage
      var user = firebase.auth().currentUser;
    if(user != null){
      window.alert("Hello");
      var email_id = user.email;
      document.getElementById("user_para").innerHTML = "Welcome User : " + email_id;
    }
  } else {
    // No user is signed in.
    document.getElementById("user_div").style.display = "none";
    document.getElementById("login_div").style.display = "block";
  }
});
function loginA(){
  // var userEmail = document.getElementById("email_field").value;
  // var userPass = document.getElementById("password_field").value;
  window.location.href ="http://localhost:8081"
  firebase.auth().signInWithEmailAndPassword(userEmail, userPass).catch(function(error) {
    // Handle Errors here.
    var errorCode = error.code;
    var errorMessage = error.message;
    window.alert("Error : " + errorMessage);
  })
}
function logout(){
  firebase.auth().signOut();
}
function createAccount(){
  let email = document.getElementById("email_field1").value;
  let password = document.getElementById("password_field1").value;

  firebase.auth().createUserWithEmailAndPassword(email, password).catch(function(error) {
    // Handle Errors here.
    var errorCode = error.code;
    var errorMessage = error.message;
    // ...
    window.alert("Error : " + errorMessage);

  });

  firebase.auth().signInWithEmailAndPassword(email, password).catch(function(error) {
    // Handle Errors here.
    var errorCode = error.code;
    var errorMessage = error.message;
    // ...
  });

}

firebase.auth().onAuthStateChanged(function(user) {
  if (user) {
    // User is signed in.

    var user = firebase.auth().currentUser;

    if(user != null){

      var email_id = user.email;
      // add in what the next page should be once logged in

      //window.location("add the html page location");
    }

  } else {
    // No user is signed in.

  }
});

</script>
<style scoped>
</style>
