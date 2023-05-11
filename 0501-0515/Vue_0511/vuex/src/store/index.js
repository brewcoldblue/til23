import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    //공통의 데이터(상태) 저장
    total: 0,
    msg: "ㅎㅎ",
  },
  getters: {
    //state를 이용해서, 원본 데이터를 수정하지 않은 상태로 새로운 값 뿌릴 때
    //==computed
    countMsg(state) {
      let msg = "10회 ";
      if (state.total > 10) msg += "초과";
      else msg += "이하";

      return `${msg} 호출됨`;
    },
    viewMsg(state) {
      return state.msg;
    },
  },
  mutations: {
    //state를 변경하는 유일한 방법, 첫 번째 인자로 state가 들어옴
    //동기적으로!
    ADD_ONE(state) {
      state.total += 1;
    },
    ADD_TEN(state, ten) {
      //payloads들이 들어옵니다
      state.total += ten;
    },
    ADD_RANDOM(state, payload) {
      state.total += payload.num;
    },
    ASYNC_ADD_ONE(state, payload) {
      state.total += payload.num;
    },
  },
  actions: {
    //mutations를 호출함
    //backend API와 통신하는 곳임, context라고 하는 만능 객체가 인자로 들어옴
    //context는 위에 있는 모든 요소를 죄다 가지고 있지만 여기서 접근하지마!
    //여기서 커밋하는게 아주아주 정석이다.
    // addOne(context) {
    //   context.commit("ADD_ONE");
    // },
    addOne({ commit }) {
      commit("ADD_ONE");
    },
    asyncAddOne({ commit }) {
      setTimeout(() => {
        commit("ADD_ONE");
      }, 2000);
    },
  },
  modules: {
    //여러 개로 쪼개놓고 관리함
  },
});
