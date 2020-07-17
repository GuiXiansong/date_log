package com.log.demo_log.service;

import com.log.demo_log.LogList;
import com.log.demo_log.entity.Log;

import java.util.List;

/**
 * @author 皮皮桂
 * @site guixiansong.com
 * @company 皮皮桂软件开发科技有限公司
 * @create 2020-07-16 16:40
 */
public interface LogService {
    Log getLogInfo();

    LogList getLogInfoByDate(String date_log);

    List<Log> getLogList();

    List<Log> getLogListByDate(String logDate);

    void addLog(String logDate, String work);
}
