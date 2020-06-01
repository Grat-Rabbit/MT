package com.mt.schedule.service;

import com.mt.schedule.pojo.Schedule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Yeung on 2020/5/27.
 */
public interface ScheduleService {
    /**
     * 查询出所有场次
     */
    List<Schedule> selectAllSchedule();

    /**
     * 通过电影院ID以及电影ID查询场次
     */
    Schedule selectScheduleById(String fId, String cId);

    /**
     * 新增场次
     */
    boolean insertSchedule(Schedule schedule);

    /**
     * 更新场次信息
     */
    boolean updateSchedule(Schedule schedule);

    /**
     * 删除场次
     */
    boolean deleteScheduleById(String id);
}