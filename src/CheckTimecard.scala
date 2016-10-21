import scala.io._

/**
 * Created by kimura on 2016/10/13.
 * とりあえず汚くていいからScalaとしておかしくても書いてみる
 * @author tecokimura
 */
object CheckTimeCard {
  def main(args: Array[String]) {

    // 実行時の引数を取得する
    args.foreach(arg => println("%s: %s".format("arg2", arg)))

    args.filter(n => n.indexOf("a") == 0).foreach(arg => println("%s: %s".format("arg3", arg)))
    println("===========");

    for (str <- args) println("args: " + str)

    // とりあえず出力のサンプル
    val str = "Start line is here"
    println(str)

    // ファイルを読み込む
    val FNAME = "timecards.csv"
    val source = Source.fromFile(FNAME, "UTF-8")
    try {
      // 1行ごとの文字列を返すIteratorを取得して表示
      source.getLines().foreach { line: String =>

        // そのまま表示
        println(line)

        //
        line.replaceAll("\"*", "").split(",").foreach(println(_))

        // CSVを分割してから””を消して表示
        val lineSplit = line.split(",")
        lineSplit.foreach { value:String =>
          println(value.replaceAll("\"*", ""))
        }

        // 配列の変数に入れる方法を調べる

        //
      }

      source.getLines().foreach { line: String =>
          {
            line.split(",")
          }
        }
    } finally {
      // close
      source.close();
    }



    // http通信してデータを取ってくるセッションをつなぐ必要あり
    // もしくはファイル読み込み

    // 正規表現でデータを抜く

    // 日付の操作、比較、変換
    "1".toInt

    // 配列にしまう
    // val list: List[String] =

    // 画面に結果出力
    //StringBuilder


  }


  def output(aryStr: Array[String]): Unit = {
    for (str <- aryStr) {
      println(str)
    }
  }
}


/**
 * 動作に必要な設定値
 * @author tecokimura
 */
object Settings {

  val Num = 10
  val AIUEO: String = "Hello"
}