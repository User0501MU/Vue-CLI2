参考先：https://yoshida-no-atama.com/java-vue-mysql/

Springboot、STS上でVue.jsを使う

本書②：Vueプロジェクトをディレクトリ内に格納する Vue CLIをインストールする※Vue.jsを使うにはNode.jsのインストールが必要であった。

～～～～～～～～～～～～～～～～～～～～～～

【補足CLI　コマンドラインインターフェイスであり、コマンド開発を効率的にするツール】

コマンドプロンプトでVue CLI のバージョンを確認する vue –versionではなくvue --version @vue/cli 5.0.8

Vueプロジェクトを作成する ①vue create vue-sample ②キーボードの下矢印でカーソルを動かし、「Default ([ Vue 2] babel, eslint)」を選択します。Enterを押すとプロジェクトの作成が始まります。

個人的ミス※Cドライブのユーザーの直下に作成してしまったのでSTSのオブジェクトへ移動 　→STSのオブジェクトを右クリックしリフレッシュしたら表示された。

③コマンドプロンプトでvue-sample直下へ移動します。 C:\Users\任意user\Documents\workspace0701\sample_project\vue-sample ④移動したら、以下のコマンド「npm run serve」を入力し「localhost:8081」にアクセス

～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～

ビルドとは？一つの最終的な成果物に「統合」すること。 【作成したプロジェクトを Springで確認する】 ・SQLユーザー情報登録をして、MYSQLからVue.jsで情報を呼び出す 「INSERT INTO sample_project (id,hobby,user_name) VALUES (1, "baseball","Tom"); SELECT*FROM テーブル名;

ビルド：する際はコマンドプロンプトでVue.jsのディレクトリ先まで移動してから実行する ※STSプロジェクトを停止状態で行う cd C:\Users\ユーザー名任意\Documents\workspace0701\sample_project\vue-sample npm run build
