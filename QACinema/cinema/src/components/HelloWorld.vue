<template>
  <div class="parallax">
    <head>
      <title>QA Cinema</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
        <navigation/>
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <!-- Wrapper for slides -->
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img src="https://iamyourtargetdemographic.files.wordpress.com/2018/06/oceans-8-header.png" width="100%" height="100px">
        </div>
        <div class="item">
          <img src="http://s3.foxmovies.com/foxmovies/production/films/132/images/feature/logan-film-header-front-main-stage.jpg" width="100%" height="100px">
        </div>
        <div class="item">
          <img src="http://www.twitrcovers.com/wp-content/uploads/2014/09/Godzilla-l.jpg" width="100%" height="100px">
        </div>
      </div>
      <!-- Left and right controls -->
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
      <div class="Middle">
        <section id="mid1">
          <div id="Test1">
            <h2>TESTIMONIALS</h2>
              "I Love Video Making And I Love To Be A Videographer"
                <small> -From Myself </small>
              "Overall Very Pleased By Your Work Love All The Videos"
          </div>
        </section>
      </div>
    </div>
    <Footer/>
  </div>
</template>

<script>
import Navigation from './navigation'
import Footer from './footer'
/* eslint-disable */
export default {
  name: 'HelloWorld',
  components: {Navigation, Footer},
  data() {
    return {
      movies: [],
      imageURL: 'https://image.tmdb.org/t/p/w342',
      loaded: true

    }
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  {
    box-sizing: border-box;
  }

  body {
    font-family: Arial, Helvetica, sans-serif;
    /*background-image: url("../assets/maxresdefault.jpg");*/
    background-blend-mode: lighten;
  }
  /* Style the header */
  .header {
    background-color: #f1f1f1;
    padding: 30px;
    text-align: center;
    font-size: 35px;
  }

  /* Create three equal columns that floats next to each other */
  .column {
    float: left;
    width: 33.33%;
    padding: 10px;
    height: 300px; /* Should be removed. Only for demonstration */
  }

  /* Clear floats after the columns */
  .row:after {
    content: "";
    display: table;
    clear: both;
  }

  /* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
  @media (max-width: 600px) {
    .column {
      width: 100%;
    }
  }
</style>
