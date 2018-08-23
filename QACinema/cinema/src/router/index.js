import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import OpeningTimes from '@/components/OpeningTimes'
import ListingsGallery from '@/components/ListingsGallery'
import NewListings from '@/components/NewListings'
import Classification from '@/components/Classification'
import Bookings from '@/components/Bookings'
import Payment from '@/components/Payment'
import Login from '@/components/Login'
import AboutUs from '@/components/AboutUS'
import Screens from '@/components/Screens'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/opening',
      name: 'OpeningTimes',
      component: OpeningTimes
    },
    {
      path: '/listing',
      name: 'ListingsGallery',
      component: ListingsGallery
    },
    {
      path: '/newlisting',
      name: 'NewListings',
      component: NewListings
    },
    {
      path: '/classification',
      name: 'Classification',
      component: Classification
    },
    {
      path: '/booking',
      name: 'Bookings',
      component: Bookings
    },
    {
      path: '/booking/payment',
      name: 'Payment',
      component: Payment
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/aboutus',
      name: 'AboutUs',
      component: AboutUs

    },
    {
      path: '/screens',
      name: 'Screens',
      component: Screens

    }
  ]
})
