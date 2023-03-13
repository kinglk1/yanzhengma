package level2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

public class number {
public static void main(String[] args) {//    需求：
//    定义方法使产生随机五位数
//    大小写随机，前四位为字母，最后一位位数字
    //1.把大写字母和小写字母放到一个数组当中
    char []chs = new char[52];
    for(int i= 0;i < chs.length;i++){
        if(i <= 25) {
            chs[i] = (char)(97+i);
        }else{
            chs[i] = (char)(65+i-26);
        }
    }
    //2.随机取四位

    //定义一个字符串类型变量，
    String result = "";

    Random r = new Random();
    for (int i = 0; i < 4; i++) {
        int randomindex = r.nextInt(chs.length);
        result = result + chs[randomindex];
    }
    //System.out.println(result);
    //3.抽一个数字
    int number = r.nextInt(10);
    //生成最终验证码
    result = result + number;

    System.out.println(result);
}
}
