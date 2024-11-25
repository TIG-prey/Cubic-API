# TIG-API-Management

## 分支 frontend

Cubic云API的前端项目

使用 Ant Design Pro 构建

Ant Design Pro ：[开箱即用的中台前端/设计解决方案 - Ant Design Pro](https://pro.ant.design/zh-CN)

ProComponents：[ProComponents (ant.design)](https://procomponents.ant.design/)

UmiJS：[UmiJS - 插件化的企业级前端应用框架](https://umijs.org/)

##  backend

Cubic 云API的后端主程序

技术栈：springboot + Redis + Mybatis-Plus + Dubbo + Nacos + SpringCloudGateway

定义了 **接口管理**、**接口分析**、**接口测试**以及**登录注册**等主要功能；

## Master

Cubic 云API的Gateway项目

配合Nacos注册服务

用于转发由主程序发出的请求到指定的url路径，实现中转；

##  interface

Cubic 云API的接口项目

用于定义接口，接收由Gateway发送的请求；

##  common

common定义了公共类；
