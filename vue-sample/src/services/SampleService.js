//axiosによってHTTP通信されているものに対する処理を定義します。
import http from "../http-common";

class SampleService {
    getAll() {
        return http.get("/sample");
    }

    findByUserName(userName) {
        return http.get(`/sample?userName=${userName}`);
    }
}

export default new SampleService();