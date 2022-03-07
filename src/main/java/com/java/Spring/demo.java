package com.java.Spring;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static javafx.scene.input.KeyCode.L;

/**
 * @ClassName:demo
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/6/18 18:59
 **/
public class demo {
    public static void main(String[] args) throws ParseException {
        String text = "Sat Jun 13 23:00:00 CST 2020";
        DateFormat formate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat formate2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",Locale.ENGLISH);
        Date date = formate2.parse(text);
        String dateString = formate1.format(date);
        System.out.println(dateString);

        BigDecimal a = new BigDecimal("43995.9583333333");
        BigDecimal b = a.multiply(new BigDecimal("86400000"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        date.setTime(b.longValue());//java里面应该是按毫秒
        System.out.println(sdf.format(date));


        Calendar calendar = Calendar.getInstance();
// 设置为1900年1月1日
        calendar.set(Calendar.YEAR, 1900);
        calendar.set(Calendar.DAY_OF_YEAR, 1);

        Double dateNumber = 43995.9583333333D;

// 天数减了2，一个1是指起点是1，另一个1是指 Excel 将天数多算了1
        calendar.add(Calendar.DAY_OF_YEAR, dateNumber.intValue() - 2);

// 小数部分乘以24后向下取整，是为小时
        dateNumber = (dateNumber - dateNumber.intValue()) * 24;
        calendar.set(Calendar.HOUR_OF_DAY, dateNumber.intValue());

// 上一步所的积的小数部分乘以60后向下取整，是为分钟
        dateNumber = (dateNumber - dateNumber.intValue()) * 60;
        calendar.set(Calendar.MINUTE, dateNumber.intValue());

// 上一步所得积的小数部分乘以60后向上取整，是为秒
        dateNumber = (dateNumber - dateNumber.intValue()) * 60;
        calendar.set(Calendar.SECOND, (int) Math.round(dateNumber));

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(calendar.getTime()));
// 结果为 2013-03-23 21:37:01


    }
}
