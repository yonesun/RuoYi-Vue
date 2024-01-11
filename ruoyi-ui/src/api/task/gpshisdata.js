import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listGpshisdata(query) {
  return request({
    url: '/system/gpshisdata/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getGpshisdata(VEHICLENO) {
  return request({
    url: '/system/gpshisdata/' + VEHICLENO,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addGpshisdata(data) {
  return request({
    url: '/system/gpshisdata',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateGpshisdata(data) {
  return request({
    url: '/system/gpshisdata',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delGpshisdata(VEHICLENO) {
  return request({
    url: '/system/gpshisdata/' + VEHICLENO,
    method: 'delete'
  })
}
