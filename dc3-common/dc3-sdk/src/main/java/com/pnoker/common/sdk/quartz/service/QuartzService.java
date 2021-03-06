package com.pnoker.common.sdk.quartz.service;

import com.pnoker.common.model.Schedule;

/**
 * @author pnoker
 */
public interface QuartzService {
    /**
     * 初始化调度任务
     */
    void initial();

    /**
     * 批量 启动调度（重新启动）
     *
     * @param group
     * @param schedule
     */
    void startJob(String group, Schedule schedule);

    /**
     * 批量 移除调度
     *
     * @param group
     * @param schedule
     */
    void deleteJob(String group, Schedule schedule);

    /**
     * 更新调度任务
     *
     * @param group
     * @param schedule
     */
    void update(String group, Schedule schedule);

    /**
     * 批量 暂停调度
     *
     * @param group
     * @param schedule
     */
    void pauseJob(String group, Schedule schedule);

    /**
     * 批量 恢复调度
     *
     * @param group
     * @param schedule
     */
    void resumeJob(String group, Schedule schedule);
}
