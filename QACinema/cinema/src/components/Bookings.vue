<template>
  <div class ="parallax">
    <head>
      <title>QA Cinema</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <navigation/>
  <body>
  <div></div>
    <div class="main" style="padding:5% 0 17% 0; background-color: white">
      <h1>Booking</h1>
      <form name="bookto" id="test" action="#">
        <h3>Personal details</h3>
        Name of person booking: <input type="text" name="name" v-model ="details.name" ><br>
        <h3> Film details</h3>
        <p>Film to watch:</p>
        <select id ="selectbox" name="booking_movie" class="form-control" v-model ="details.booking_movie" width="30px">
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
      </form><br>
       <button type="button" class="submit">Check Booking Availability</button>
      <button type="button" class="submit" v-on:click="addBooking()">Submit</button>

          </div>
  </body>
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
  data() {
    return {
      details: {name: '', time: '', booking_date: '',booking_movie: ''}
    }
  },
  methods: {
    addBooking() {
    let url = 'http://localhost:8080/booking/book';
    axios.post(url, {
        name: this.details.name,
        time: this.details.time,
        booking_date: this.details.booking_date,
        booking_movie: this.details.booking_movie
    }
      // this.details).then((response) => {
    //   console.log(response)
    //   console.log(details)
    // }
       )},
  }
  }

</script>

<style scoped>
  body {
    margin: 60px;
    background: #111;
  }
  .theatre {
    display: flex;
    position: absolute;
    top: 70%;
    left: 50%;
    transform: translate(-50%, -50%);
  }
  .cinema-seats {
    display: flex;
  }
  .cinema-seats .seat {
    cursor: pointer;
  }
  .cinema-seats .seat:hover:before {
    content: '';
    position: absolute;
    top: 0;
    width: 100%;
    height: 100%;
    background: rgba(0, 0, 0, 0.5);
    border-radius: 7px;
  }
  .cinema-seats .seat.active:before {
    content: '';
    position: absolute;
    top: 0;
    width: 100%;
    height: 100%;
    background: rgba(255, 255, 255, 0.6);
    border-radius: 7px;
  }
  .left .cinema-row {
    transform: skew(-15deg);
    margin: 0 6px;
  }
  .left .seat {
    width: 35px;
    height: 50px;
    border-radius: 7px;
    background: linear-gradient(to top, #761818, #761818, #761818, #761818, #761818, #b54041, #f3686a);
    margin-bottom: 10px;
    transform: skew(20deg);
    margin-top: -32px;
    box-shadow: 0 0 5px rgba(0, 0, 0, 0.5);
  }
  .left .row-2 {
    transform: skew(-13deg);
  }
  .left .row-2 .seat {
    transform: skew(18deg);
  }
  .left .row-3 {
    transform: skew(-12deg);
  }
  .left .row-3 .seat {
    transform: skew(16deg);
  }
  .left .row-4 {
    transform: skew(-11deg);
  }
  .left .row-4 .seat {
    transform: skew(15deg);
  }
  .left .row-5 {
    transform: skew(-10deg);
  }
  .left .row-5 .seat {
    transform: skew(12deg);
  }
  .left .row-6 {
    transform: skew(-9deg);
  }
  .left .row-6 .seat {
    transform: skew(10deg);
  }
  .left .row-7 {
    transform: skew(-7deg);
  }
  .left .row-7 .seat {
    transform: skew(8deg);
  }
  .right {
    margin-left: 70px;
  }
  .right .cinema-row {
    transform: skew(7deg);
    margin: 0 6px;
  }
  .right .seat {
    width: 35px;
    height: 50px;
    border-radius: 7px;
    background: linear-gradient(to top, #761818, #761818, #761818, #761818, #761818, #b54041, #f3686a);
    margin-bottom: 10px;
    transform: skew(-8deg);
    margin-top: -32px;
    box-shadow: 0 0 5px rgba(0, 0, 0, 0.5);
  }
  .right .row-2 {
    transform: skew(9deg);
  }
  .right .row-2 .seat {
    transform: skew(-10deg);
  }
  .right .row-3 {
    transform: skew(10deg);
  }
  .right .row-3 .seat {
    transform: skew(-12deg);
  }
  .right .row-4 {
    transform: skew(11deg);
  }
  .right .row-4 .seat {
    transform: skew(-15deg);
  }
  .right .row-5 {
    transform: skew(12deg);
  }
  .right .row-5 .seat {
    transform: skew(-16deg);
  }
  .right .row-6 {
    transform: skew(13deg);
  }
  .right .row-6 .seat {
    transform: skew(-18deg);
  }
  .right .row-7 {
    transform: skew(15deg);
  }
  .right .row-7 .seat {
    transform: skew(-20deg);
  }

</style>
