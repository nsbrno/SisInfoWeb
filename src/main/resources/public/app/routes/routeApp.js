import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../pages/Home/Home";
import About from "../pages/About/About";
import Login from "../pages/Login/Login";


Vue.use(VueRouter);

export default new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes: [
    {
      path: "/",
      name: "home",
      component: Home
    },
    {
      path: "/About",
      name: "about",
      component: About
    },
    {
      path: "/Login",
      name: "Autienticação de Usuário",
      component: Login
    }
  ]
});
