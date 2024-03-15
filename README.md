## 目的

- Read処理の実装を行なったものに Service を実装して、存在しないパスを指定した時にエラーをレスポンスさせる。
- 個別に例外ハンドリング処理を行うクラスを作成して、カスタマイズしたエラー表示をレスポンスさせる。

## 動作確認

DBのnameとidの紐付けを行なった Mapper を受け付ける Service クラスを作成しました。  
指定したidが存在しない場合に例外ハンドリングを行うための ExceptionHandler クラスを作成しました。

### http://localhost:8080/national-flowers?name=薔薇 でリクエスト

![スクリーンショット 2024-03-13 21 49 14](https://github.com/kino41/Task/assets/155221768/8ebffaa2-f652-4b45-930a-b1e87a4bac3e)

- ステータスコード200を確認
- nameで指定したパラメータ値のデータが表示されていることを確認

![2024-03-14 19 51の画像](https://github.com/kino41/Task/assets/155221768/bd2654c1-7452-4b9c-935b-47eec01c463e)

- レスポンスヘッダーのContent-Typeがapplication/jsonであることを確認

## http://localhost:8080/national-flowers?name=rose でリクエスト

![スクリーンショット 2024-03-13 21 49 26](https://github.com/kino41/Task/assets/155221768/9e91030a-e6f1-40c9-9a89-2fdf0209a44e)

- ステータスコード200を確認
- 検索結果がない場合で空配列が表示されていることを確認

![2024-03-14 19 51の画像](https://github.com/kino41/Task/assets/155221768/0dd37d6e-0e1d-4844-afc4-c6d6f7b8f468)

- レスポンスヘッダーのContent-Typeがapplication/jsonであることを確認

## http://localhost:8080/national-flowers/6 でリクエスト

![スクリーンショット 2024-03-13 21 49 42](https://github.com/kino41/Task/assets/155221768/2b52600f-fd67-4e4b-ae12-eadc249dc104)

- ステータスコード404を確認
- 指定したidが存在せず、カスタマイズされたエラー内容が表示されていることを確認

![2024-03-14 19 52の画像](https://github.com/kino41/Task/assets/155221768/60f149d9-39de-4205-9e1b-79dc22a855b3)

- レスポンスヘッダーのContent-Typeがapplication/jsonであることを確認
