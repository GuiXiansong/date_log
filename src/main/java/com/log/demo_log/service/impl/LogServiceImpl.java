package com.log.demo_log.service.impl;

import com.log.demo_log.LogList;
import com.log.demo_log.entity.Log;
import com.log.demo_log.mapper.LogMapper;
import com.log.demo_log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 皮皮桂
 * @site guixiansong.com
 * @company 皮皮桂软件开发科技有限公司
 * @create 2020-07-16 16:41
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;
    @Override
    public Log getLogInfo() {
        return logMapper.getLogInfo();
    }

    @Override
    public LogList getLogInfoByDate(String date_log) {
        return logMapper.getLogInfoByDate(date_log);
    }

    @Override
    public List<Log> getLogList() {
        return logMapper.getLogList();
    }

    @Override
    public List<Log> getLogListByDate(String logDate) {
        return logMapper.getLogListByDate(logDate);
    }

    @Override
    public void addLog(String logDate, String work) {
        logMapper.addLog(logDate,work);
    }
}
