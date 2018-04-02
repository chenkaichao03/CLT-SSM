package cn.clt.core.params;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.Date;

/**
 * @Description 基础查询集
 * @Aouthor CLT
 * @Date 2018/04/02 18:25
 */
public class BaseSearch extends Pagination{
    private String startTime;
    private String endTime;
    private Date startDate;
    private Date endDate;
    /**查询字段**/
    private String filter;

    /**开始时间--补充 时：分：秒**/
    public String getStartTime() {
        if (!StringUtils.isEmpty(this.getStartTime())){
            return this.getStartTime() + "00:00:00";
        }
        return null;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**结束时间--补充 时：分：秒**/
    public String getEndTime() {
        if (!StringUtils.isEmpty(this.getEndTime())){
            return this.getEndTime() + "23:59:59";
        }
        return null;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**开始时间--字符串日期转Date类型**/
    public Date getStartDate() {
        if (!StringUtils.isEmpty(this.getStartTime())){
            try {
                startDate = DateUtils.parseDate(this.getStartTime(), new String[]{"yyyy-MM-dd"});
            } catch (ParseException e) {
                return null;
            }
        }
        return null;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        if (!StringUtils.isEmpty(this.getEndTime())){
            try {
                endDate = DateUtils.parseDate(this.getEndTime(), new String[]{"yyyy-MM-dd"});
            } catch (ParseException e) {
                return null;
            }
        }
        return null;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
