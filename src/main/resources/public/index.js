/*
 * Document   : index
 * Created on : 27/10/2019, 17:47:43
 * Author     : Bruno Nogueira Silva
 */
import Vue from 'vue';
import App from './App.vue';
import vuetify from './app/plugins/vuetify';
import routeApp from './app/routes/routeApp';
import MyComponentVuejs from 'mycomponentvuejs';
import 'vuetify/dist/vuetify.min.css';
import 'material-design-icons-iconfont/dist/material-design-icons.css';
import '@mdi/font/css/materialdesignicons.css';


Vue.use(MyComponentVuejs);

Vue.config.productionTip = false;

new Vue({
  el: '#app',
  router: routeApp,
  vuetify,
  render: h => h(App)
});

