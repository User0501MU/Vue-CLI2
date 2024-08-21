<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png"><!--HelloWordをSearchUserに変更-->
    <!--<HelloWorld msg="Welcome to Your Vue.js App"/>-->
	<SearchUser />
  </div>
</template>

<script>
import SearchUser from './components/SearchUser.vue'

export default {
  name: 'App',
  components: {
    SearchUser
  }
}
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
