# 第9回課題

## 目的

---

- 前回の課題に Service を実装して、存在しないパスを指定した時にエラーをレスポンスさせる。
- 個別に例外ハンドリング処理を行うクラスを作成して、カスタマイズしたエラー表示をレスポンスさせる。

## 動作確認

---

- DBのnameカラムとの紐付けを行なった Mapper を受け付ける Service クラスを作成しました。
- Service を呼び出す Controller の内容を対応させたものに変更しました。
- 例外ハンドリングを行うための ExceptionHandler クラスを作成しました。

### GETでリクエスト

- http://localhost:8080/national-flowers/マリモ でリクエストした場合
  ![スクリーンショット 2024-03-09 13 14 44](https://github.com/kino41/RaiseTech_2024/assets/155221768/cccc6a1f-4516-4369-a4f0-e6a367fcbe96)

- [x] HTTPステータスコード404(リソース・ページが存在しない)を確認
- [x] リクエストボディに存在しないパスを指定した時のエラーがカスタマイズされた形式で表示されていることを確認
  ![スクリーンショット 2024-03-09 13 14 49](https://github.com/kino41/RaiseTech_2024/assets/155221768/22ddef17-6481-4f27-a0ff-b58038d4199f)

- レスポンスヘッダーのContent-Typeがapplication/jsonであることを確認

---

- http://localhost:8080/national-flowers/薔薇 でリクエストした場合
  ![スクリーンショット 2024-03-09 13 14 06](https://github.com/kino41/RaiseTech_2024/assets/155221768/e99f1265-cc44-4472-802c-3d8530bcef6c)

- [x] HTTPステータスコード200(リクエスト成功)を確認
- [x] リクエストボディに指定したパスのレコードが表示されていることを確認

  ![スクリーンショット 2024-03-09 13 14 32](https://github.com/kino41/RaiseTech_2024/assets/155221768/ed0e5c24-e912-48b6-94b6-7c462b5618c0)

- レスポンスヘッダーのContent-Typeがapplication/jsonであることを確認

---

<details><summary>前回の課題内容</summary>

# 第8回課題

## 目的

---

- MyBatisを使ったデータベースの構築
- Read処理の実装

## 動作確認

---

- MapperにSQLを記述して、テーブルからレコードを全件取得するAPIを作成しました。
- /national_flowerを受け付けるControllerを作成しました。

### GETでリクエスト

![picture1](https://github.com/kino41/RaiseTech_2024_No.4-3/assets/155221768/2453bf4c-7808-445d-927a-08582e49bfdc)

- [x] HTTPステータスコード200(リクエスト成功)を確認
- [x] レスポンスボディに全件のレコードが表示されていることを確認

![picture2](https://github.com/kino41/RaiseTech_2024_No.4-3/assets/155221768/85054e82-cdaf-4f5d-820d-ab436cee40ed)

- [x] レスポンスヘッダーのContent-Typeがapplication/jsonであることを確認

</details>
