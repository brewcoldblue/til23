<template>
  <div class="hello">
    <h1>이건 prop으로 내린게 아니야</h1>
    <div>total : {{ total }}</div>
    <div>{{ countMsg1 }}</div>
  </div>
</template>

<script>
export default {
  name: "ResultView",
  // props: {
  //   total: Number,
  // }, props 필요 없음
  computed: {
    total() {
      return this.$store.state.total;
    }, //state 직접 쓰기
    countMsg1() {
      //getters 사용하기
      return this.$store.getters.countMsg;
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
