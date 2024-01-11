package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GpshisdataMapper;
import com.ruoyi.system.domain.Gpshisdata;
import com.ruoyi.system.service.IGpshisdataService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
@Service
public class GpshisdataServiceImpl implements IGpshisdataService 
{
    @Autowired
    private GpshisdataMapper gpshisdataMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param VEHICLENO 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Gpshisdata selectGpshisdataByVEHICLENO(String VEHICLENO)
    {
        return gpshisdataMapper.selectGpshisdataByVEHICLENO(VEHICLENO);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param gpshisdata 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Gpshisdata> selectGpshisdataList(Gpshisdata gpshisdata)
    {
        return gpshisdataMapper.selectGpshisdataList(gpshisdata);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param gpshisdata 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertGpshisdata(Gpshisdata gpshisdata)
    {
        gpshisdata.setCreateTime(DateUtils.getNowDate());
        return gpshisdataMapper.insertGpshisdata(gpshisdata);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param gpshisdata 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateGpshisdata(Gpshisdata gpshisdata)
    {
        return gpshisdataMapper.updateGpshisdata(gpshisdata);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param VEHICLENOs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteGpshisdataByVEHICLENOs(String[] VEHICLENOs)
    {
        return gpshisdataMapper.deleteGpshisdataByVEHICLENOs(VEHICLENOs);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param VEHICLENO 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteGpshisdataByVEHICLENO(String VEHICLENO)
    {
        return gpshisdataMapper.deleteGpshisdataByVEHICLENO(VEHICLENO);
    }
}
