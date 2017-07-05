package builder;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Person {
    private String name;//姓名必填
    private String eyeSize;//眼睛大小
    private String eyeColor;//眼睛颜色
    private String hairStyle;//发型
    private String hairColor;//头发颜色
    private String face;//脸型

    private Person(Builder builder) {  //1............
        initialize(builder);
    }

    private void initialize(final Builder builder) {
        name = builder.name;
        eyeSize = builder.eyeSize;
        eyeColor = builder.eyeColor;
        hairStyle = builder.hairStyle;
        hairColor = builder.hairColor;
        face = builder.face;
    }


    public static class Builder {
        private String name;//姓名必填
        private String eyeSize = "大";//眼睛大小
        private String eyeColor = "绿色";//眼睛颜色
        private String hairStyle = "中分";//发型
        private String hairColor = "红色";//头发颜色
        private String face = "鞋拔子脸";//脸型

        public Builder(String name) {
            this.name = name;
        }

        public Builder setEyeSize(String eyeSize) {
            this.eyeSize = eyeSize;
            return this;
        }

        public Builder setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public Builder setHairStyle(String hairStyle) {
            this.hairStyle = hairStyle;
            return this;
        }

        public Builder setHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder setFace(String face) {
            this.face = face;
            return this;
        }

        public Person create() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        String s = "姓名:" + name + "\n"
                + "眼睛:" + eyeSize + "\n"
                + "眼睛颜色:" + eyeColor + "\n"
                + "发型:" + hairStyle + "\n"
                + "头发颜色:" + hairColor + "\n"
                + "脸型:" + face;
        return s;
    }
}
