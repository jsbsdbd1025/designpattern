package builder;

/**
 * Created by lenovo on 2017/7/5.
 */
public class PersonCommon {
    private String name;//姓名必填
    private String eyeSize;//眼睛大小
    private String eyeColor;//眼睛颜色
    private String hairStyle;//发型
    private String hairColor;//头发颜色
    private String face;//脸型

    public PersonCommon(String name, String eyeSize, String eyeColor, String hairStyle, String hairColor, String face) {
        this.name = name;
        this.eyeSize = eyeSize;
        this.eyeColor = eyeColor;
        this.hairStyle = hairStyle;
        this.hairColor = hairColor;
        this.face = face;
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
