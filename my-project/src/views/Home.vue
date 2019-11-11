<template>
  <v-container>
    <v-card>
      <v-toolbar color="cyan" dark flat>
        <v-app-bar-nav-icon></v-app-bar-nav-icon>

        <v-toolbar-title>용트폴리오</v-toolbar-title>

        <v-spacer></v-spacer>

        <template v-slot:extension>
          <v-tabs v-model="tab" align-with-title background-color="transparent">
            <v-tabs-slider color="yellow"></v-tabs-slider>

            <v-tab v-for="item in items" :key="item">{{ item }}</v-tab>
          </v-tabs>
        </template>
      </v-toolbar>

      <v-tabs-items v-model="tab">
        <v-tab-item v-for="item in items" :key="item">
          <v-card flat>
            <v-card-text v-text="text"></v-card-text>
          </v-card>
        </v-tab-item>
      </v-tabs-items>
    </v-card>
    <v-btn v-on:click="searchTerm">searchTerm</v-btn>
    <v-btn v-on:click="checking">checking</v-btn>
  </v-container>
</template>

<script>
export default {
  name: "Home",
  data() {
    return {
      tab: null,
      items: ["web", "shopping", "videos", "images", "news"],
      text:
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
    };
  },
  methods: {
    searchTerm: function() {
      this.$http.get("http://localhost:8080/portfolio/hello2").then(result => {
        // console.log("h2");
        this.posts = result.data;
      });
    },
    checking: function() {
       
    }
  }
};
</script>


  