package builder;

/**
 * Created by lenovo on 2017/7/5.
 */
public class MainBuilder {

    public static void main(String[] args) {
//        Person xiaoming = new Person.Builder("小明").create();

//        System.out.println(xiaoming.toString());

        Person xiaohong = new Person.Builder("小红")
                .setEyeColor("蓝色")
                .setEyeSize("大")
                .setFace("鹅蛋脸")
                .setHairStyle("大波浪")
                .setHairColor("褐色")
                .create();

        System.out.println(xiaohong.toString());
    }
}
