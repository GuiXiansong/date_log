package com.log.demo_log.controller;

import com.log.demo_log.LogList;
import com.log.demo_log.entity.Log;
import com.log.demo_log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    private LogService logService;

    /**
     * 获取所有的日期和工作:当只有一条数据时成功
     */
    @RequestMapping("/getLogInfo")
    public Log getLogInfo(){
        return logService.getLogInfo();
    }

    /**
     * 失败
     * @param date_log
     * @return
     */
    @RequestMapping("/getLogInfoByDate")
    public LogList getLogInfoByDate(String date_log){
        return logService.getLogInfoByDate(date_log);
    }

    /**
     * 可以获取所有的日志工作信息
     * @return
     */
    @RequestMapping("/getLogList")
    public List<Log> getLogList(){
        return logService.getLogList();
    }

    /**
     * 根据日期获取工作信息
     */
    @RequestMapping("/getLogListByDate")
    public List<Log> getLogListByDate(String logDate){
        return logService.getLogListByDate(logDate);
    }

    /**
     * 添加日志信息
     * */
    @RequestMapping("/addLog")
    public void addLog(String logDate,String work){
        logService.addLog(logDate,work);
    }
}
