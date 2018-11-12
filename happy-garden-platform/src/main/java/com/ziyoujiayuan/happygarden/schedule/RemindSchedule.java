package com.ziyoujiayuan.happygarden.schedule;

import com.hbxhx.runtime.notify.NotifyMeta;
import com.hbxhx.runtime.notify.email.EmailNotifier;
import com.hbxhx.utils.date.DateUtils;
import com.ziyoujiayuan.happygarden.dao.auto.*;
import com.ziyoujiayuan.happygarden.entity.auto.*;
import com.ziyoujiayuan.happygarden.entity.def.RemindRecordDefPO;
import com.ziyoujiayuan.happygarden.enums.RemindStatusEnum;
import com.ziyoujiayuan.happygarden.enums.RemindTypeEnum;
import com.ziyoujiayuan.happygarden.enums.RemindUnitEnum;
import com.ziyoujiayuan.happygarden.param.RemindQueryParam;
import com.ziyoujiayuan.happygarden.schedule.base.BaseSchedule;
import com.ziyoujiayuan.happygarden.service.RemindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/10
 */
@Component
@Configurable
@EnableScheduling
@Slf4j
public class RemindSchedule extends BaseSchedule{

    @Resource
    private RemindService remindService;
    @Resource
    private RemindRecordDAO remindRecordDAO;
    @Resource
    private ApplyFertilizerRecordDAO applyFertilizerRecordDAO;
    @Resource
    private ReplaceSoilRecordDAO replaceSoilRecordDAO;
    @Resource
    private SprayWaterRecordDAO sprayWaterRecordDAO;
    @Resource
    private WateringRecordDAO wateringRecordDAO;
    @Resource
    private FlowerDAO flowerDAO;
    @Resource
    private AccountDAO accountDAO;

    /**
     * 提醒策略
     */
    @Scheduled(cron = "0 */1 * * * *")
    public void toRemind() {

        RemindQueryParam remindQueryParam = new RemindQueryParam();
        remindQueryParam.setStart(0);
        // 临时解决方案
        remindQueryParam.setLength(10000);
        remindQueryParam.setStatus(RemindStatusEnum.ENABLE.getCode());
        List<RemindRecordDefPO> remindRecordDefPOList = remindService.query(remindQueryParam).getList();

        log.info("toRemind-remindRecordDefPOList.size:{};", remindRecordDefPOList.size());

        remindRecordDefPOList.forEach(item -> {

            try {
                String creatorId = item.getCreator();
                String entityId = item.getEntityId();
                Integer emailNotifyCnt = new Integer(item.getEmailNotifyCnt());
                Date currentNextTime = item.getNextTime();

                if (emailNotifyCnt.intValue() == 0) {
                    Date recordTime;
                    boolean isNotify = false;
                    int recordCnt = 0;

                    switch (RemindTypeEnum.getEnumByCode(item.getType())) {
                        case APPLY_FERTILIZER:
                            ApplyFertilizerRecordPOExample applyFertilizerRecordPOExample = new ApplyFertilizerRecordPOExample();
                            applyFertilizerRecordPOExample.setDistinct(true);
                            applyFertilizerRecordPOExample.setOrderByClause("update_time desc");
                            applyFertilizerRecordPOExample.createCriteria().andFlowerIdEqualTo(entityId).andCreatorEqualTo(creatorId);

                            List<ApplyFertilizerRecordPO> applyFertilizerRecordPOList = applyFertilizerRecordDAO.selectByExample(applyFertilizerRecordPOExample);
                            recordCnt = applyFertilizerRecordPOList.size();
                            if (recordCnt > 0) {
                                ApplyFertilizerRecordPO applyFertilizerRecordPO = applyFertilizerRecordPOList.get(0);
                                recordTime = applyFertilizerRecordPO.getCreateTime();
                            } else {
                                recordTime = new Date();
                            }

                            isNotify = false;
                            if (isTimeOut(currentNextTime, recordTime)) {
                                doNotify(RemindTypeEnum.APPLY_FERTILIZER.getRemark(), entityId, RemindTypeEnum.APPLY_FERTILIZER.getRemark());
                                isNotify = true;
                            }

                            log.info("Remind-happened:type-{}, isNotify-{}, recordCnt-{};", RemindTypeEnum.APPLY_FERTILIZER.getCode(), isNotify, recordCnt);
                            break;
                        case REPLACE_SOIL:
                            ReplaceSoilRecordPOExample replaceSoilRecordPOExample = new ReplaceSoilRecordPOExample();
                            replaceSoilRecordPOExample.setDistinct(true);
                            replaceSoilRecordPOExample.setOrderByClause("update_time desc");
                            replaceSoilRecordPOExample.createCriteria().andFlowerIdEqualTo(entityId).andCreatorEqualTo(creatorId);

                            List<ReplaceSoilRecordPO> replaceSoilRecordPOList = replaceSoilRecordDAO.selectByExample(replaceSoilRecordPOExample);
                            recordCnt = replaceSoilRecordPOList.size();
                            if (recordCnt > 0) {
                                ReplaceSoilRecordPO replaceSoilRecordPO = replaceSoilRecordPOList.get(0);
                                recordTime = replaceSoilRecordPO.getCreateTime();
                            } else {
                                recordTime = new Date();
                            }

                            isNotify = false;
                            if (isTimeOut(currentNextTime, recordTime)) {
                                doNotify(RemindTypeEnum.REPLACE_SOIL.getRemark(), entityId, RemindTypeEnum.REPLACE_SOIL.getRemark());
                                isNotify = true;
                            }

                            log.info("Remind-happened:type-{}, isNotify-{}, recordCnt-{};", RemindTypeEnum.REPLACE_SOIL.getCode(), isNotify, recordCnt);
                            break;
                        case SPRAY_WATER:
                            SprayWaterRecordPOExample sprayWaterRecordPOExample = new SprayWaterRecordPOExample();
                            sprayWaterRecordPOExample.setDistinct(true);
                            sprayWaterRecordPOExample.setOrderByClause("update_time desc");
                            sprayWaterRecordPOExample.createCriteria().andFlowerIdEqualTo(entityId).andCreatorEqualTo(creatorId);

                            List<SprayWaterRecordPO> sprayWaterRecordPOList = sprayWaterRecordDAO.selectByExample(sprayWaterRecordPOExample);
                            recordCnt = sprayWaterRecordPOList.size();
                            if (recordCnt > 0) {
                                SprayWaterRecordPO sprayWaterRecordPO = sprayWaterRecordPOList.get(0);
                                recordTime = sprayWaterRecordPO.getCreateTime();
                            } else {
                                recordTime = new Date();
                            }

                            isNotify = false;
                            if (isTimeOut(currentNextTime, recordTime)) {
                                doNotify(RemindTypeEnum.SPRAY_WATER.getRemark(), entityId, RemindTypeEnum.SPRAY_WATER.getRemark());
                                isNotify = true;
                            }

                            log.info("Remind-happened:type-{}, isNotify-{}, recordCnt-{};", RemindTypeEnum.SPRAY_WATER.getCode(), isNotify, recordCnt);
                            break;
                        case WATERING:
                            WateringRecordPOExample wateringRecordPOExample = new WateringRecordPOExample();
                            wateringRecordPOExample.setDistinct(true);
                            wateringRecordPOExample.setOrderByClause("update_time desc");
                            wateringRecordPOExample.createCriteria().andFlowerIdEqualTo(entityId).andCreatorEqualTo(creatorId);

                            List<WateringRecordPO> wateringRecordPOList = wateringRecordDAO.selectByExample(wateringRecordPOExample);
                            recordCnt = wateringRecordPOList.size();
                            if (recordCnt > 0) {
                                WateringRecordPO wateringRecordPO = wateringRecordPOList.get(0);
                                recordTime = wateringRecordPO.getCreateTime();
                            } else {
                                recordTime = new Date();
                            }

                            isNotify = false;
                            if (isTimeOut(currentNextTime, recordTime)) {
                                doNotify(RemindTypeEnum.WATERING.getRemark(), entityId, RemindTypeEnum.WATERING.getRemark());
                                isNotify = true;
                            }

                            log.info("Remind-happened:type-{}, isNotify-{}, recordCnt-{};", RemindTypeEnum.WATERING.getCode(), isNotify, recordCnt);
                            break;
                        default:
                            log.info("无法正常匹配,操作失败");
                    }

                    //TODO 批量更新
                    if (isNotify) {
                        RemindRecordPO remindRecordPO = new RemindRecordPO();
                        BeanUtils.copyProperties(item, remindRecordPO);
                        remindRecordPO.setEmailNotifyCnt(tinyIntToByte(1));

                        log.info("sendNotify-update-cnt:{};", remindRecordDAO.updateByPrimaryKeySelective(remindRecordPO));
                    }
                }
            } catch (Exception e) {
                log.info("remindRecordDefPOList-exception", e);
            }

            doUpdateNext(item);
        });
    }

    /**
     * 计算next
     *
     * @param originTime
     * @param unit
     * @return
     */
    private Date doCalculateNext(Date originTime, Integer unit) {
        Date result = null;
        switch (RemindUnitEnum.getEnumByCode(unit)) {
            case AT:
                result = originTime;
                break;
            case YEAR:
                result = DateUtils.addOneYear(originTime);
                break;
            case MONTH:
                result = DateUtils.addOneMonth(originTime);
                break;
            case DAY:
                result = DateUtils.addOneDay(originTime);
                break;
            default:
        }
        return result;
    }

    /**
     * 更新Next时间
     *
     * @param remindRecordDefPO
     */
    private void doUpdateNext(RemindRecordDefPO remindRecordDefPO) {
        Date currentTime = new Date();
        Date currentNextTime = remindRecordDefPO.getNextTime();
        if (currentTime.after(currentNextTime)) {
            Integer unit = new Integer(remindRecordDefPO.getUnit());
            Date nextTime = doCalculateNext(currentNextTime, unit);

            RemindRecordPO remindRecordPO = new RemindRecordPO();
            BeanUtils.copyProperties(remindRecordDefPO, remindRecordPO);
            remindRecordPO.setNextTime(nextTime);
            remindRecordPO.setEmailNotifyCnt(tinyIntToByte(0));

            log.info("doNext-update-cnt:{};", remindRecordDAO.updateByPrimaryKeySelective(remindRecordPO));
        }
    }

    /**
     * 是否超时
     *
     * @param originTime
     * @param recordTime
     * @return
     */
    private boolean isTimeOut(Date originTime, Date recordTime) {
        boolean result = false;

        if (recordTime.before(originTime)) {
            result = true;
        }
        return result;
    }

    /**
     * 通知操作
     *
     * @param title
     * @param flowerId
     * @param typeRemark
     */
    private void doNotify(String title, String flowerId, String typeRemark) {
        log.info("email-send-start, titile:{}, flowerId:{}, typeRemark:{};", title, flowerId, typeRemark);
        try {
            EmailNotifier emailNotifier = new EmailNotifier();

            NotifyMeta notifyMeta = new NotifyMeta();
            notifyMeta.setHost("smtp.mxhichina.com");
            notifyMeta.setPort(25);
            notifyMeta.setAuth(false);
            notifyMeta.setIsSsl(false);
            notifyMeta.setUsername("wanghuanjie@jxiaolan.com");
            notifyMeta.setPassword("Jxl625660.");

            FlowerPO flowerPO = flowerDAO.selectByPrimaryKey(flowerId);
            String flowerNickName = flowerPO.getNickName();
            String accountId = flowerPO.getCreator();

            AccountPO accountPO = accountDAO.selectByPrimaryKey(accountId);
            String accountName = accountPO.getAccountName();
            String email = accountPO.getEmail();

            List<String> receivers = new ArrayList<>();
            receivers.add(email);

            String content = new StringBuffer("尊敬的").append(accountName).append(";您的爱花:").append(flowerNickName).append(";周期内未").append(typeRemark).append(";请及时处理。(").append(new Date()).append(")").toString();

            emailNotifier.sendMessage(notifyMeta, receivers, title, content);

            //TODO toDb

            log.info("email-send-finish, content:{};", content);
        } catch (Exception e) {
            log.info("send-email-notify-system-error;", e);
        }
    }
}
