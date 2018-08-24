<template>
  <div class ="parallax">
    <head>
      <title>QA Cinema</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <navigation/>

    <body>
    <div class="main" style="padding:5%">
      <h1>Booking</h1>
      <form name="bookto" id="test" action="#">
        <h3>Personal details</h3>
        Name of person booking: <input type="text" name="name" v-model ="details.name" ><br>
        <h3> Film details</h3>
        <p>Film to watch:</p>

        <select id ="selectbox" name="booking_movie" class="form-control" v-model ="details.booking_movie">
          <option>Select</option>
          <option value="Avengers: Infinity wars">Avengers: Infinity wars</option>
          <option value="Deadpool">Deadpool</option>
          <option value="Mission: Impossible - Fallout">Mission: Impossible - Fallout</option>
          <option value="The Meg">The Meg</option>
          <option value="Jurassic World">Jurassic World</option>
          <option value="Antman and the wasp">Antman and the wasp</option>
        </select> <br>

        <p>Date and time</p>
        <label for="bookingTime">Enter time: </label>
        <input id="bookingTime" type="time" name="time" min="08:00" max="23:00" required v-model ="details.time">
        <span class="validity"></span><br>
        <label for="bookingDate">Enter date: </label>
        <input type="date" id="bookingDate" name="booking_date" min="2018-01-01" max="2019-01-01" required v-model ="details.booking_date">
        <span class="validity"></span><br>
        <button type="submit" name="submit" value="Submit" v-on:click="addBooking()"></button>
      </form>
          </div>
    </body>
  </div>
</template>

<script>
import Navigation from './navigation'
import axios from 'axios'
/* eslint-disable */
export default {
  name: 'ListingsGallery',
  components: {Navigation},
  data() {
    return {
      details: {name: '', time: '', booking_date: '',booking_movie: ''}
    }
  },
  methods: {
    addBooking() {
    let url = 'http://localhost:8080/booking/book';
    axios.post(url, this.details).then((response) => {
      console.log(response)
    })}
  }
  }

</script>

<style scoped>

</style>
