<template>
  <div class="hello">
    <body style="background-color: #ccc">
    <head>
      <title>QA Cinema</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <navigation/>
    <div class="responsive" >
      <body style="background-color: #ccc" class="w3-container w3-padding-64 w3-center">
      <center><img src="../assets/XXI-header.jpg" alt="Screen" class="center" style="width:100%;" width="500" height="300"></center>
      <br>
      <h1>About Us</h1>
      <p style="background-color: white">The QA Cinema is the UK purpose-built, continuously operating cinema. QA Cinema in Manchester opened in 2018
        and established the brand as not only somewhere to watch films, but somewhere to experience them too. Iconic art deco architecture and the very ;
        latest technology became synonymous with QA Cinema where you didn’t just go to see a film, you went to the cinema. QA Cinema around the UK offers a range of content, ;
        in addition to highly anticipated blockbusters with event cinema titles including latest realises and forthcoming movies.;
        Committed to continued growth and development of its premium entertainment ‘big screen’ experience, QA Cinema delivers the best choice of content,;
        combined with the best technology in the best environment. We pride ourselves in the very best cinema experience: cutting-edge technology and the widest choice of experiences ;
        (this extends way beyond the box office – we also screen live sports and cultural events and special screenings for specific groups too). Everyone that should be at QA cinema is empowered ;
        to tackle the really important things like being Fanatical About Film and providing the best guest experience. Sociable and inclusive sums QA cinema up nicely.</p>
      <h2>The Team</h2>
      <ul style="background-color: white">
        <h4>Adam Afzal</h4>
        <p><i>Backend Developer</i></p>
        <p>Adam.Afzal@AcademyTraainee.com</p>
        <h4>Syed Ahmed</h4>
        <p><i>Backend Developer</i></p>
        <p>Syed.Ahmed@AcademyTraainee.com</p>
        <h4>Daniel Osagie</h4>
        <p><i>Backend Developer</i></p>
        <p>Daniel.Osagie@AcademyTraainee.com</p>
        <h4>Brigitte Roth </h4>
        <p><i>Vue.js Frontend Developer</i></p>
        <p>Brigitte.Roth@AcademyTraainee.com</p>
        <h4>Saad Israr</h4>
        <p><i>HTML Frontend Developer</i></p>
        <p>Saad.Israr@AcademyTraainee.com</p>
        <h4>Satwant Birdi</h4>
        <p><i>HTML Frontend Developer</i></p>
        <p>Satwant.Birdi@AcademyTraainee.com</p>
      </ul>
      </body>
    </div>
    <Footer/>
    </body>
  </div>
</template>

<script>
import Navigation from './navigation'
import Footer from './footer'
export default {
  name: 'AboutUs',
  components: {Navigation, Footer},
  data () {
    return {
    }
  }
}
</script>

<style scoped>

</style>
