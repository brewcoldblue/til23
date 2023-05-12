<template>
  <div class="about">
    <h1>This is an about page</h1>
    <button @click="moveToHome">홈으로 가용</button>
  </div>
</template>

<script>
export default {
  methods: {
    moveToHome() {
      this.$router.push("/");
      //이거 지금 '/'
      //라는 경로를 라우터에 밀어넣은거고
      //라우터는 HTML 히스토리 스택으로 구현되어 있기 때문에
      //만약 뒤로 가기를 누른다면 HTML 히스토리 스택에서 정상적으로 뒤로 가짐
    },
  },
};
</script>

<style scoped></style>
