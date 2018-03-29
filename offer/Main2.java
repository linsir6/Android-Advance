package offer;

public class Main2 {

    public String replaceSpace(StringBuffer str) {

        String temp = str.toString();
        temp = temp.replaceAll(" ","%20");
        return temp;

    }

}
