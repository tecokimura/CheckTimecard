/**
 * Created by kimura on 2016/10/13.
 * とりあえず汚くていいからScalaとしておかしくても書いてみる
 * @author tecokimura
 */
object CheckTimeCard {
  def main(args: Array[String]) {

    // 実行時の引数を取得する
    args.foreach(arg => println("%s: %s".format("arg2",arg)))

    args.filter(n => n.indexOf("a")==0).foreach(arg => println("%s: %s".format("arg3",arg)))
    println("===========");

    for(str <- args) {
      println("args: "+str)
    }

    // とりあえず出力のサンプル
    val str = "Start line is here"
    println(str)



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
    for(str <- aryStr) {
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
  val AIUEO:String = "Hello"


}