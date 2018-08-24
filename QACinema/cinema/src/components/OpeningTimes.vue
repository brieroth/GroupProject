<template>
  <div class="parallax">
    <head>
      <title>QA Cinema</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <navigation/>
    <!--<body>-->
 <h1 style="color: honeydew">Opening times</h1>
<p style="color: honeydew">Opening times for the cinemas are shown below.</p>
    <h3 style="color: honeydew">Standard hours</h3>
    <TABLE width="50%" border="0" align=center style="background-color:white" >
      <TR style="font-weight:bold">
        <TD> Day</TD>
        <TD> Times </TD>
      </TR>
      <TR>
        <TD>Monday-Thursday</TD>
        <TD>9 am - 10pm </TD>
      </TR>
      <TR>
        <TD>Friday-Saturday</TD>
        <TD>9 am - 11pm </TD>
      </TR>
      <TR>
        <TD>Sunday</TD>
        <TD>10 am - 10pm </TD>
      </TR>
    </TABLE><br>
    <h3 style="color: honeydew">Special days</h3>
     <p style="color: honeydew">QA cinemas are still open in certain holiday periods, with special hours.</p>
      <TABLE width="50%" border="0" align="center" style="background-color:white">
        <TR style="font-weight:bold">
          <TD> Day</TD>
          <TD> Times </TD>
        </TR>
        <TR>
          <TD>Bank holidays</TD>
          <TD>10 am - 10pm </TD>
        </TR>
        <TR>
          <TD>Easter Friday/sunday</TD>
          <TD>10 am - 10pm </TD>
        </TR>
        <TR>
          <TD>Christmas eve</TD>
          <TD>10 am - 10pm </TD>
        </TR>
        <TR>
          <TD>New years eve</TD>
          <TD>10 am - 10pm </TD>
        </TR>
      </TABLE>
    <p style="color: honeydew">Subject to updates, all times apply throughout the year.</p>
<TABLE width="50%" border="0" align="center">
 <div class="row">
   <div class="column" style="background-color:#b7b3bb;">
       <h1>Contact Us</h1>
       <h4>Address</h4>
       2 Anchorage Road<br>
       Manchester<br>
       M12 3AB<br>
       <h4>Phone</h4>
       0161 123 4567
       <h4>Email</h4>
       qac-support@ac.com
   </div>
   <div class="column" style="background-color:#b7b3bb;">
     <h2>Enquiries</h2>
     <form name="emailto" action="/action_page.php"
           onsubmit="return ValidateEmail(document.emailto.formEmail) &&  validateForm() " method="post">
       Name <input type="text" name="formName"><br>
       Subject <input type="text" name="formSubject"><br>
       E-mail <input type='text' name='formEmail'/><br>
       Comments <input type="text" name="formComments"><br>
       <input type="submit" name="submit" value="submit">

     </form>
   </div>

    <div class="main" style="padding:5%" >
      <h3 style="color: honeydew">Find us</h3>
      <p style="color: honeydew"> Find us here. <br>
        QA cinemas can be accessed by any national or private transport. </p>
      <h3 style="color: honeydew">Motorway</h3>
      <p style="color: honeydew">Motorways A57(M), M602</p>
      <h3 style="color: honeydew">Coaches</h3>
      <p style="color: honeydew">Manchester central coach station</p>
      <h3 style="color: honeydew">National rail</h3>
      <p style="color: honeydew">Manchester piccadilly station</p>
      <div class="mapouter" align="center">
        <div class="gmap_canvas" align="center">
          <div style="color: honeydew">Search and navigate. Click on the map to access Google maps.</div><br>
          <iframe width="800" height="600" id="gmap_canvas"
                  src="https://maps.google.com/maps?q=manchester&t=&z=13&ie=UTF8&iwloc=&output=embed"
                  frameborder="0" scrolling="no" marginheight="0" marginwidth="0" align="right"></iframe>
        </div>
      </div>
    </div>
   <div class="main" style="padding:5%; color:white;">

     <h1>Nearby conveniences</h1>
     <p>Surrounding the cinema are numerous other places to take advantage of. </p>
     <h3>Shopping</h3>
     <p>Manchester Arndale </p>
     <h3>Eating, drinking</h3>
     <p>No shortage of city cafes and restaurants, especially Costa. </p>


   </div>
    </div>
      </TABLE><br>
    <!--</body>-->
    <Footer/>
  </div>
</template>

<script>
import Navigation from './navigation'
import Footer from './footer'
export default {
  name: 'HelloWorld',
  components: {Navigation, Footer},
  data () {
    return {}
  }
//   },
//   methods: {
//
//    ValidateEmail(inputEmail)
//    {
//      var emailformat = /\S+@\S+\.\S+/;
//    if (inputEmail.value.match(emailformat)) {
//     document.emailto.formEmail.focus();
//     return true;
//   }
//   else {
//     alert("Please enter an email address in the correct format.");
//     document.emailto.formEmail.focus();
//     return false;
//   }
// },
//
//  validateForm () {
//      var nameformat = document.forms["emailto"]["formName"].value;
//      var subjectformat = document.forms["emailto"]["formSubject"].value;
//      var commentsformat = document.forms["emailto"]["formComments"].value;
//      if (nameformat == "" || subjectformat == "" || commentsformat == "") {
//        alert("Please enter your details fully.");
//      }
//     return false;
//   }
// }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 50%;
  }
  td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
  }

  tr:nth-child(even) {
    background-color: #dddddd;
  }
  .mapouter{
    text-align:right;height:600px;width:800px;
  }
  .gmap_canvas {
    align : center;
    overflow:hidden;
    background:none!important;
    height:600px;width:800px;
  }
  * {
    box-sizing: border-box;
  }

  /* Create two equal columns that floats next to each other */
  .column {
    float: left;
    width: 50%;
    padding: 10px;
    height: 300px; /* Should be removed. Only for demonstration */
  }

  /* Clear floats after the columns */
  .row:after {
    content: "";
    display: table;
    clear: both;
  }
</style>
