package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.AllRoadCoordinateNetwork;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-12-18
 */
public interface IAllRoadCoordinateNetworkService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public AllRoadCoordinateNetwork selectAllRoadCoordinateNetworkById(Long id);

    public List<AllRoadCoordinateNetwork> selectAllRoadCoordinateNetworkBydataflag(Long dataflag);
    /**
     * 查询【请填写功能名称】列表
     * 
     * @param allRoadCoordinateNetwork 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AllRoadCoordinateNetwork> selectAllRoadCoordinateNetworkList(AllRoadCoordinateNetwork allRoadCoordinateNetwork);

    /**
     * 新增【请填写功能名称】
     * 
     * @param allRoadCoordinateNetwork 【请填写功能名称】
     * @return 结果
     */
    public int insertAllRoadCoordinateNetwork(AllRoadCoordinateNetwork allRoadCoordinateNetwork);

    /**
     * 修改【请填写功能名称】
     * 
     * @param allRoadCoordinateNetwork 【请填写功能名称】
     * @return 结果
     */
    public int updateAllRoadCoordinateNetwork(AllRoadCoordinateNetwork allRoadCoordinateNetwork);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteAllRoadCoordinateNetworkByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAllRoadCoordinateNetworkById(Long id);
}
