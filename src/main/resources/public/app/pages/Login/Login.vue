<template>
  <v-container fluid fill-height>
    <v-layout align-center justify-center>
      <v-flex xs12 sm8 md4>
        <my-user-authentication
          @input-my-user-authentication="getUser"
        ></my-user-authentication>
      </v-flex>

      <my-dialog-message
        v-model="dialogError"
        @click-close-my-dialog-message="dialogError = false"
        :myDataDialog="returnWebservice"
        type="error"
      ></my-dialog-message>
    </v-layout>
  </v-container>
</template>

<script>
import CryptoJS from "crypto-js";

export default {
  data() {
    return {
      returnWebservice: {
        idReturn: 0,
        msg: "",
        msgExtra: ""
      }
    };
  },
  methods: {
    getUser(user, password) {
      try {
        this.conectWebserviceJson(
          "./v1/Smausuar/Authentication", // URL
          this.POST, // Metodo
          { username: user, password: password }, // {username: user, password: pass}
          null, // Dados
          null // Parametros URL
        )
          .then(retorno => {
            console.log("Vai para outra tela");
            this.returnWebservice = retorno.content;
            console.log(this.returnWebservice);
            let dataAuth = { username: user, password: password };
            sessionStorage.setItem(
              "SI_AUTH",
              CryptoJS.enc.Base64.stringify(
                CryptoJS.enc.Base64.stringify(dataAuth.toString())
              )
            );
            console.log(sessionStorage.getItem("SI_AUTH"));
          })
          .catch(error => {
            //console.log('log encription do catch response: ' + JSON.stringify(error));
            if (error.statusReturn) {
              if (error.statusReturn.idReturn != 0) {
                this.returnWebservice.idReturn = error.statusReturn.idReturn;
              }
              if (error.statusReturn.msg) {
                this.returnWebservice.msg = error.statusReturn.msg;
              } else {
                this.returnWebservice.msg = JSON.stringify(error);
              }
              if (error.statusReturn.msgExtra) {
                this.returnWebservice.msgExtra = error.statusReturn.msgExtra;
              }
            } else {
              if (error.message) {
                this.returnWebservice.msg = error.message;
              }
              if (error.stack) {
                this.returnWebservice.msgExtra = error.stack;
              }
            }
            this.dialogError = true;
          });
      } catch (error) {
        if (error.message) {
          this.returnWebservice.msg = error.message;
        } else {
          this.returnWebservice.msg = error.toString();
        }
        if (error.stack) {
          this.returnWebservice.msgExtra = error.stack;
        }
        this.dialogError = true;
      }
    }
  }
};
</script>
