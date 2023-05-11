<template>
  <div class="hello">
    <h1>ㅎㅎ</h1>
    <div>{{ msg }}</div>
    <button type="button" @click="addOneCount">+1</button>
    <button type="button" @click="addTenCounts">+10</button>
    <button type="button" @click="addRandomCounts">+?</button>
    <button type="button" @click="asyncCount">+1 at random</button>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "HelloWorld",
  // props: {
  //   msg: String,
  // },
  computed: {
    // viewMsg() {
    //   return this.$store.getters.viewMsg;
    // }, //이렇게 가져올 수 있지만

    // ...mapGetters(
    //   ['viewMsg'],
    // ) //mapGetters라는 helper를 import해서 getter을 이렇게 가져올 수 있다

    ...mapGetters({
      msg: "viewMsg",
    }), //다른 이름으로 쓰고싶으면 객체로 가져올 수 있다
    //mapState로 state도 그대로 가져다 쓸 수 있다
  },
  methods: {
    // addCount() {
    //   this.total++;
    // }, 메서드도 필요 업슴
    // prop, emit도 필요 없음
    addOneCount() {
      //대신 mutation을 사용해서 변형시켜야함
      //commit('메서드명', ...넘기고 싶은 인자)으로 mutation 호출
      //원래는 action을 써서 mutation을 호출해야하는데
      //필요에 따라서 action과 mutation의 메서드명이 다를 수 있음
      //action은 camel case, mutation은 pascal case
      // this.$store.commit("ADD_ONE");
      //정석: 여기서는 dispatch로 actions만 호출함
      this.$store.dispatch("addOne");
    },
    addTenCounts() {
      //대신 mutation을 사용해서 변형시켜야함
      //commit('메서드명', ...넘기고 싶은 인자)으로 mutation 호출
      this.$store.commit("ADD_TEN", 10);
      // this.$store.dispatch("addTen");
    },
    addRandomCounts() {
      //대신 mutation을 사용해서 변형시켜야함
      //객체를 넘기는 경우
      let num = Math.round(Math.random() * 100);
      this.$store.commit("ADD_RANDOM", { num });

      // this.$store.dispatch("addRandom");
    },
    asyncCount() {
      //비동기로 actions를 호출할 수 있지만 권장X
      this.$store.dispatch("asyncAddOne");
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
