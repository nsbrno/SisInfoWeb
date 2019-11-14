<template>
  <v-container fluid>
    <h2>Página Sobre o SisInfo</h2>
    <my-text-field
        mylabel="Default"
    ></my-text-field>

    <my-text-field
        mylabel="Outro Campo"
        :myoutlined=true
    ></my-text-field>

    <br>
    <v-toolbar>
      <v-toolbar-title>{{textoTeste}}</v-toolbar-title>

      <v-spacer></v-spacer>

      <v-toolbar-items>
        <v-btn text>Link 1</v-btn>
        <v-btn text>Link 2</v-btn>
        <v-btn text>Link 3</v-btn>
      </v-toolbar-items>

      <template>
        <v-btn icon>
          <v-icon>mdi-export-variant</v-icon>
        </v-btn>
        <v-btn icon>
          <v-icon>mdi-delete-circle</v-icon>
        </v-btn>
        <v-btn icon>
          <v-icon>mdi-plus-circle</v-icon>
        </v-btn>
      </template>
    </v-toolbar>
  </v-container>
</template>

<script>
//import MyTextField from 'mycomponentvuejs';

export default {
  name: "about",
  components: {
    //MyTextField
  },
  data() {
    return {
        textoTeste: "Mensagem teste"
    };
  },
};
</script>