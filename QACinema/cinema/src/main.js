import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
import VueAxios from 'vue-axios'

Vue.config.productionTip = false
Vue.use(VueAxios, axios);
/* eslint-disable no-new */
new Vue({
  el: '#includeMenuBar',
  router,
  components: { App },
  template: '<App/>'
})
