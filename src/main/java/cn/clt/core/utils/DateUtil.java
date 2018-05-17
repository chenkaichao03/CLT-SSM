package cn.clt.core.utils;

import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 日期
 * @Aouthor CLT
 * @Date 2018/05/15 14:06
 */
public class DateUtil {

    public static final String[] DATE_FORMATS = new String[]{"yyyy-MM-dd","yyyy-MM-dd HH:mm:ss","yyyy-MM-dd hh:mm"};


    /**
     * @Title formatDate
     * @Description 将传入的日期以指定格式转成字符串
     * @Author CLT
     * @Date 2018/5/15 14:09
     * @param format
     * @param date
     * @return
     */
    public static String formatDate(String format, Date date) {
        if (date == null) {
            return "";
        }
        if(StringUtils.isEmpty(format)){
            format = "yyyy-MM-dd";
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    /**
     * @Title getTimeDifference
     * @Description 获取时间差 (小时)
     * @Author CLT
     * @Date 2018/5/15 15:20
     * @param beginDate
     * @param endDate
     * @return
     * @throws ParseException
     */
    public static Integer getTimeDifference(Long beginDate,Long endDate) {
        return  (int)((beginDate-endDate)/(1000*60*60));
    }

    /**
     * @Title getDayDifference
     * @Description 获取时间差 (天数)
     * @Author CLT
     * @Date 2018/5/17 11:43
     * @param beginDate
     * @param endDate
     * @return
     */
    public static Integer getDayDifference(Long beginDate,Long endDate){
        return  (int)((beginDate-endDate)/(1000*60*60*24));
    }
}
