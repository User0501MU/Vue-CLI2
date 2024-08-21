//「baseURL:」の部分で、Spring側のホストを指定しています。
//これにより、Springから出力されたJSONをVueでも受け取れることになります。
import axios from "axios";

export default axios.create({
  baseURL: "http://localhost:8080/",
  headers: {
    "Content-type": "application/json"
  }
});