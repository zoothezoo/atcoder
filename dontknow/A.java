import java.io.File;
import java.io.FileReader;
import java.io.*;

class A{
    public static void main(String[] args){
        // 引数のチェック
        if(args.length <= 0){
            System.out.println("書き出すファイル名を引数に与えてください");
            System.exit(1);
        }
        try {
            // テキストファイルから読み取る入力ストリームの生成
            FileReader file = new FileReader(args[0]);
            // ファイルに入力ストリームを接続
            BufferedReader br = new BufferedReader(file);

            String[] input1 = br.readLine().split(" ");

            int a = Integer.parseInt(input1[0]);
            int b = Integer.parseInt(input1[1]);


            System.out.println("a: " + a + ",b: " + b);

            br.close();



        }
        catch(FileNotFoundException e){
            System.err.println("指定したファイルがありません");
            System.exit(1);
        }
        catch(IOException e){
            System.err.println("ファイルエラーが発生しました");
            System.exit(1);
        }
    }
}