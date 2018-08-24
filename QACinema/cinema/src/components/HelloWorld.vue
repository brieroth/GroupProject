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
        <div class="item active" align="center">
          <img src="https://iamyourtargetdemographic.files.wordpress.com/2018/06/oceans-8-header.png" width="90%" height="100px">
        </div>
        <div class="item" align="center">
          <img src="http://s3.foxmovies.com/foxmovies/production/films/132/images/feature/logan-film-header-front-main-stage.jpg" width="90%" height="100px">
        </div>
        <div class="item" align="center">
          <img src="http://www.twitrcovers.com/wp-content/uploads/2014/09/Godzilla-l.jpg" width="90%" height="100px">
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
    </div>
      <div class="Middle">
        <section id="mid1">
          <div id="Test1">
            <table style="background-color: transparent; color: white" align="center">
            <h2>CINEMATIC EXPERIENCE</h2>
              <i>Take a seat in one of our many screens, designed for your comfort.</i>

            <div class="accordian" style="height: 100%; width: 100%">
              <ul>
                <li>
                  <div class="image_title" >
                    <a >Standard Screen</a>
                  </div>
                    <img src="https://www.qapfistudios.com/qapfi_admin/photos/production/film.jpg"/>
                </li>
                <li>
                  <div class="image_title">
                    <a >Standard Screen</a>
                  </div>
                    <img src="http://strongmdi.com/medias/images/specific/caseStudies/_thumbnailDesktop/Joliette-cinema.jpg"/>
                </li>
                <li>
                  <div class="image_title">
                    <a >Delux Screen</a>
                  </div>
                    <img src="http://www.ukcinemascreens.co.uk/art/gal1.jpg"/>
                </li>
                <li>
                  <div class="image_title">
                    <a>Delux Screen</a>
                  </div>
                    <img src="https://res.cloudinary.com/jpress/image/fetch/w_620,f_auto,ar_3:2,q_auto:low,c_fill/if_h_lte_200,c_mfit,h_201/https://www.morleyobserver.co.uk/webimage/1.7497183.1444047128!/image/1675265390.jpg"/>
                </li>
                <li>
                  <div class="image_title">
                    <a>Directors Box</a>
                  </div>
                    <img src="https://www.electriccinema.co.uk/images/shoreditch/shoreditch_1.jpg"/>
                </li>
              </ul>
            </div>
            </table>
          </div>
        </section>
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

  .accordian {
    width: 805px; height: 320px;
    overflow: hidden;

    /*Time for some styling*/
    margin: 100px auto;
    box-shadow: 0 0 10px 1px rgba(0, 0, 0, 0.35);
    -webkit-box-shadow: 0 0 10px 1px rgba(0, 0, 0, 0.35);
    -moz-box-shadow: 0 0 10px 1px rgba(0, 0, 0, 0.35);
  }

  /*A small hack to prevent flickering on some browsers*/
  .accordian ul {
    width: 1200px;
    /*This will give ample space to the last item to move
      instead of falling down/flickering during hovers.*/
  }

  .accordian li {
    position: relative;
    display: block;
    width: 160px;
    float: left;

    border-left: 1px solid #888;

    box-shadow: 0 0 25px 10px rgba(0, 0, 0, 0.5);
    -webkit-box-shadow: 0 0 25px 10px rgba(0, 0, 0, 0.5);
    -moz-box-shadow: 0 0 25px 10px rgba(0, 0, 0, 0.5);

    /*Transitions to give animation effect*/
    transition: all 0.5s;
    -webkit-transition: all 0.5s;
    -moz-transition: all 0.5s;
    /*If you hover on the images now you should be able to
      see the basic accordian*/
  }

  /*Reduce with of un-hovered elements*/
  .accordian ul:hover li {width: 40px;}
  /*Lets apply hover effects now*/
  /*The LI hover style should override the UL hover style*/
  .accordian ul li:hover {width: 640px;}


  .accordian li img {
    display: block;
  }

  /*Image title styles*/
  .image_title {
    background: rgba(0, 0, 0, 0.5);
    position: absolute;
    left: 0; bottom: 0;
    width: 640px;

  }
  .image_title a {
    display: block;
    color: #fff;
    text-decoration: none;
    padding: 20px;
    font-size: 16px;
  }
</style>

