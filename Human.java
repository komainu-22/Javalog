package jp.techacademy.akatsuki.hajime.javalog;

import android.util.Log;

public class Human extends Animal {

  /*  //メンバ変数
    String name; //名前
    int age; //年齢
  */

    String hobby;

    //コンストラクタ
    public Human(String name,int age,String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }


    @Override
    public void say(){
        Log.d("javatest","私の名前は" + this.name + "です。年は"+ this.age + "歳です。");
    }


    public void think(){
        Log.d("javatest","私は" + this.hobby + "について考える。");
    }

}
