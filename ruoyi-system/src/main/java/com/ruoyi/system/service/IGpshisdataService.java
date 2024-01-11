package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Gpshisdata;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
public interface IGpshisdataService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param VEHICLENO 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Gpshisdata selectGpshisdataByVEHICLENO(String VEHICLENO);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param gpshisdata 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Gpshisdata> selectGpshisdataList(Gpshisdata gpshisdata);

    /**
     * 新增【请填写功能名称】
     * 
     * @param gpshisdata 【请填写功能名称】
     * @return 结果
     */
    public int insertGpshisdata(Gpshisdata gpshisdata);

    /**
     * 修改【请填写功能名称】
     * 
     * @param gpshisdata 【请填写功能名称】
     * @return 结果
     */
    public int updateGpshisdata(Gpshisdata gpshisdata);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param VEHICLENOs 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteGpshisdataByVEHICLENOs(String[] VEHICLENOs);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param VEHICLENO 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteGpshisdataByVEHICLENO(String VEHICLENO);
}
