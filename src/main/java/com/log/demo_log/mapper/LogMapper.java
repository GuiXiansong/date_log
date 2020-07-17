package com.log.demo_log.mapper;

import com.log.demo_log.LogList;
import com.log.demo_log.entity.Log;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 皮皮桂
 * @site guixiansong.com
 * @company 皮皮桂软件开发科技有限公司
 * @create 2020-07-16 16:42
 */
@Repository
public interface LogMapper {
    Log getLogInfo();

    LogList getLogInfoByDate(@Param(value = "date_log") String date_log);

    List<Log> getLogList();

    List<Log> getLogListByDate(String logDate);

    void addLog(@Param(value = "logDate") String logDate,@Param(value = "work") String work);
}
