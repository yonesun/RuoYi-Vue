import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listNetwork(query) {
  return request({
    url: '/system/network/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getNetwork(id) {
  return request({
    url: '/system/network/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addNetwork(data) {
  return request({
    url: '/system/network',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateNetwork(data) {
  return request({
    url: '/system/network',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delNetwork(id) {
  return request({
    url: '/system/network/' + id,
    method: 'delete'
  })
}
