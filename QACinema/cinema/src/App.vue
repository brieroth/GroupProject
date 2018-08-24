<template>
  <div id="app">
   <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', "Segoe UI", Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin:0;
  height: 100;
}
html, body {
  margin: 0;
  height: 100%;
}
.parallax {
  background-image: url('https://d2v9y0dukr6mq2.cloudfront.net/video/thumbnail/jHiLTrq/cinematic-plexus-background_r3g1l8q4__F0008.png');
  height: 100%;
  background-blend-mode: soft-light;
  background-attachment: fixed;
  background-position: center;
  background-repeat: repeat;
  background-size: cover;

}
</style>
