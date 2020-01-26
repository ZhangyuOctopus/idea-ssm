package com.ssm.utils;
import org.springframework.core.convert.converter.Converter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDateConverter implements Converter<String, Date>{
    /*自定义类型转换器需要实现*/
    @Override
    public Date convert(String s) {
        //s表示传进来的字符串
        if (s == null){
            throw new RuntimeException("请你传入数据");
        }else{
            DateFormat dateFormat = null;
            if(s.matches("^[0-9]{4}/[0-9]{2}/[0-9]{2}$")){
                dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            }else if (s.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$")){
                dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            try {
                return dateFormat.parse(s);
            } catch (ParseException e) {
                System.out.println("数据转换异常");
                throw new RuntimeException("数据转换出现了异常");
            }
        }
    }
}
