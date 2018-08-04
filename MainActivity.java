package jp.techacademy.akatsuki.hajime.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Dog dog = new Dog("ポチ",3); //名前をポチ、年齢３歳で、Dogのインスタンスを作る。
        dog.move();

        Human human = new Human("Hajime",27,"料理");
        human.say();
        human.think();





    }
}
