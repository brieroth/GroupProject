<template>
  <div class="parallax">
    <navigation/>
    <h1 style="color: white">New Releases Gallery</h1>
    <div class="responsive" align="center">
      <div class="gallery">
        <div id="app">
          <div v-show="loaded" class="loader"></div>

          <ul id="list">
            <li v-for="movie in moviesA.results" :key="movie.id">
              <div class="container">
                <img :src="imageURL + movie.poster_path" alt="Avatar" class="image">
                <div class="overlay">
                  <div class="text"><h3> {{ movie.title }}</h3><br>
                    <p style="width: 250px;font-size: 15px"> {{ movie.release_date }}</p>
                    <p style="width: 250px;font-size: 15px"> {{ movie.overview }}</p>
                  </div>
                </div>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
    <div>
    </div>
    <Footer/>
  </div>
</template>
<script>
import Navigation from './navigation'
import Footer from './footer'
import axios from 'axios'

/* eslint-disable */
export default {
  name: 'ListingsGallery',
  components: {Navigation, Footer},
  data () {
    return {
      moviesA: [],
      imageURL: 'https://image.tmdb.org/t/p/w342',
      loaded: true
    }
  },
  mounted() {
    var reqURL = 'http://localhost:8080/movie/upcoming-movies/'
    axios.get(reqURL)
      .then(response => {
          this.moviesA = response.data;
          console.log(response.data)
        }
      )
      .catch((err) => {
        console.log(err);
      });
  }

}
</script>
<style scoped>
  #list {
    width: 100%;
  }
  #list li {
    list-style:none;
    display: inline-block;
    padding: 20px;
    width: 600px;
  }
  #list li:hover {
    opacity: 0.7;
  }
  .image {

  }

  .responsive {
    position: relative;
    width: 100%;
  }

  .gallery {
    opacity: 1;
    display: block;
    width: 100%;
    height: auto;
    transition: .5s ease;
    backface-visibility: hidden;
  }

  .loader {
    transition: .5s ease;
    opacity: 0;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    text-align: center;
  }
  .text {
    color: white;
    font-size: 20px;
    position: absolute;
    top: 50%;
    left: 50%;
    -webkit-transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    transform: translate(-50%, -50%);
    text-align: center;
  }

  .container {
    position: relative;
    width: 80%;
  }

  .image {
    display: block;
    width: 100%;
    height: auto;
  }

  .overlay {
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    height: 100%;
    width: 100%;
    opacity: 0;
    transition: .5s ease;
    background-color: #008CBA;
  }

  .container:hover .overlay {
    opacity: 1;
  }

  .text {
    color: white;
    font-size: 20px;
    position: absolute;
    top: 50%;
    left: 50%;
    -webkit-transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    transform: translate(-50%, -50%);
    text-align: center;
  }
</style>
