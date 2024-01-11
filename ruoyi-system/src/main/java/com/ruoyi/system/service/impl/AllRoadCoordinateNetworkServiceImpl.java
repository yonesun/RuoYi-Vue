package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AllRoadCoordinateNetworkMapper;
import com.ruoyi.system.domain.AllRoadCoordinateNetwork;
import com.ruoyi.system.service.IAllRoadCoordinateNetworkService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-12-18
 */
@Service
public class AllRoadCoordinateNetworkServiceImpl implements IAllRoadCoordinateNetworkService 
{
    @Autowired
    private AllRoadCoordinateNetworkMapper allRoadCoordinateNetworkMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public AllRoadCoordinateNetwork selectAllRoadCoordinateNetworkById(Long id)
    {
        return allRoadCoordinateNetworkMapper.selectAllRoadCoordinateNetworkById(id);
    }

    @Override
    public List<AllRoadCoordinateNetwork> selectAllRoadCoordinateNetworkBydataflag(Long dataflag)
    {
        return allRoadCoordinateNetworkMapper.selectAllRoadCoordinateNetworkBydataflag(dataflag);
    }
    /**
     * 查询【请填写功能名称】列表
     * 
     * @param allRoadCoordinateNetwork 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AllRoadCoordinateNetwork> selectAllRoadCoordinateNetworkList(AllRoadCoordinateNetwork allRoadCoordinateNetwork)
    {
        return allRoadCoordinateNetworkMapper.selectAllRoadCoordinateNetworkList(allRoadCoordinateNetwork);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param allRoadCoordinateNetwork 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAllRoadCoordinateNetwork(AllRoadCoordinateNetwork allRoadCoordinateNetwork)
    {
        return allRoadCoordinateNetworkMapper.insertAllRoadCoordinateNetwork(allRoadCoordinateNetwork);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param allRoadCoordinateNetwork 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAllRoadCoordinateNetwork(AllRoadCoordinateNetwork allRoadCoordinateNetwork)
    {
        return allRoadCoordinateNetworkMapper.updateAllRoadCoordinateNetwork(allRoadCoordinateNetwork);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAllRoadCoordinateNetworkByIds(Long[] ids)
    {
        return allRoadCoordinateNetworkMapper.deleteAllRoadCoordinateNetworkByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAllRoadCoordinateNetworkById(Long id)
    {
        return allRoadCoordinateNetworkMapper.deleteAllRoadCoordinateNetworkById(id);
    }
}
