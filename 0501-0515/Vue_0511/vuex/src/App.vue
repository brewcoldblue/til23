<template>
  <div id="app">
    <!-- <ResultView :total="total"></ResultView> 
    pass prop 하지 않음-->
    <HelloWorld />
    <ResultView />
  </div>
</template>

<script>
import HelloWorld from "./components/HelloWorld.vue";
import ResultView from "./components/ResultView.vue";

export default {
  name: "App",
  components: {
    HelloWorld,
    ResultView,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
