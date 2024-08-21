<template>
	<div>
		<!--<input type="text">-->
		<input type="text" v-model="userName">
		<!--<button type="submit">Search</button>-->
		<!--<button type="submit" @click="showCurrentUser()">Search</button>-->
		<button type="submit" @click="searchUserInfo()">Search</button>
		<!--【Search】ボタンを押すと、searchUserInfo()メソッドの処理を実行します。-->

		<!--<div v-if="currentUser">
			<div>{{ currentUser }}</div>
		</div>-->
		<div v-for="(info, i) in userInfo" :key="i">
			ユーザー名：{{ info.userName }}
			<br />
			趣味：{{ info.hobby }}
		</div>
	</div>
</template>

<script>
import SampleService from "../services/SampleService";

export default {
	name: 'search-user',
	/*data() {
		return {
			userName: '',
			currentUser: '',
		};
	},*/
	data() {
		return {
			userInfo: [],
			userName: "",
		};
	},
	methods: {
		/*showCurrentUser() {
			this.currentUser = this.userName
		}
	}
}*/
		searchUserInfo() {
			SampleService.findByUserName(this.userName).then(response => {
				this.userInfo = response.data
			}).catch(e => {
				console.log(e);
			});
		}
	},
}
</script>

