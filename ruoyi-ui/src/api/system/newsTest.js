import request from '@/utils/request'

// 查询新闻公告管理列表
export function listNewsTest(query) {
  return request({
    url: '/system/newsTest/list',
    method: 'get',
    params: query
  })
}

// 查询新闻公告管理详细
export function getNewsTest(id) {
  return request({
    url: '/system/newsTest/' + id,
    method: 'get'
  })
}

// 新增新闻公告管理
export function addNewsTest(data) {
  return request({
    url: '/system/newsTest',
    method: 'post',
    data: data
  })
}

// 修改新闻公告管理
export function updateNewsTest(data) {
  return request({
    url: '/system/newsTest',
    method: 'put',
    data: data
  })
}

// 删除新闻公告管理
export function delNewsTest(id) {
  return request({
    url: '/system/newsTest/' + id,
    method: 'delete'
  })
}
