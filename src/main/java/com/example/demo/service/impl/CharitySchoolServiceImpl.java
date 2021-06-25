package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.CharitySchool;
import com.example.demo.mapper.CharitySchoolMapper;
import com.example.demo.request.DemoReq;
import com.example.demo.service.ICharitySchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 公益学堂 服务实现类
 * </p>
 *
 * @author qianzz
 * @since 2021-06-25
 */
@Service
public class CharitySchoolServiceImpl extends ServiceImpl<CharitySchoolMapper, CharitySchool> implements ICharitySchoolService {

    @Resource
    private CharitySchoolMapper charitySchoolMapper;

    @Override
    public List<CharitySchool> queryCharitySchoolList(DemoReq req) {
//        CharitySchool charitySchool = new CharitySchool();
//        LocalDateTime now = LocalDateTime.now();
//        charitySchool.setClassDate("2021-01-01至2022-10-10");
//        charitySchool.setClassDetail("学习潜水");
//        charitySchool.setClassLocation("杭州大厦501");
//        charitySchool.setClassName("潜水");
//        charitySchool.setClassTime("周一 8:30-11:30");
//        charitySchool.setImageUrl("www.baidu.com");
//        charitySchool.setStatus("1");
//        charitySchool.setStartTime(now);
//        charitySchool.setEndTime(now);
//        charitySchool.setGmtCreate(now);
//        charitySchool.setGmtModify(now);
//        this.save(charitySchool);

        LambdaQueryWrapper<CharitySchool> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(CharitySchool::getId, 104);
        this.getOne(wrapper);

        return charitySchoolMapper.selectList(wrapper);
    }
}
