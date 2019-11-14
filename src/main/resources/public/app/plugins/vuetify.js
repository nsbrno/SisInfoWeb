import Vue from "vue";
import Vuetify from "vuetify/lib";

Vue.use(Vuetify);

export default new Vuetify({
  icons: {
    iconfont: "mdi"
  },
  theme: {
    //dark: true,
    themes: {
      light: {
        primary: "#1B5E20",
        secondary: "#009688",
        accent: "#9c27b0",
        error: "#f44336",
        warning: "#ffc107",
        info: "#03a9f4",
        success: "#4caf50"
      }
    }
  }
});