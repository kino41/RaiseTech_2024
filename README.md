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
