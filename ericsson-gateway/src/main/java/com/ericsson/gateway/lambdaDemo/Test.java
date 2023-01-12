package com.ericsson.gateway.lambdaDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

public class Test {
    public static void main(String[] args) throws ParseException {

 /*       String birthday = "1991-10-16 00:00:00";
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = parser.parse(birthday);
        System.out.println(date.getTime());*/


        /*int result = 50 + calculate(50);
        System.out.println(result);*/


//        Date date = new Date(1503544630000L);  // 对应的北京时间是2017-08-24 11:17:10

/*        String bjTime = "2014-11-11 08:00:00";

        SimpleDateFormat bjSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");     // 北京
        Date date = bjSdf.parse(bjTime);
        bjSdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));  // 设置北京时区

        SimpleDateFormat tokyoSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // 东京
        tokyoSdf.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));  // 设置东京时区

        SimpleDateFormat londonSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 伦敦
        londonSdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));  // 设置伦敦时区

        System.out.println("毫秒数:" + date.getTime() + ", 北京时间:" + bjSdf.format(date));
        System.out.println("毫秒数:" + date.getTime() + ", 东京时间:" + tokyoSdf.format(date));
        System.out.println("毫秒数:" + date.getTime() + ", 伦敦时间:" + londonSdf.format(date));*/
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid + "length: " + uuid.toString().length());


    }

    public static int calculate(int cnt){
        if(cnt < 3)
            return 0;

        int sum = 0;
        for (int i=1; i<=cnt;i++){
            if(i%3 == 0){
                sum++;
            }
        }
        return sum + calculate(sum);

    }

}
