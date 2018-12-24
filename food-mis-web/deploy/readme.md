
描述文件: demo-api/deploy/manifest.yml

**参考 [【服务手册】Hulk-容器发布](https://wiki.sankuai.com/pages/viewpage.action?pageId=994701938)**

* 使用Plus系统进行容器发布
* 部署目标: HulkPlus（可同时发vm和hulk机器）

部署环境变量:
* ENV : prod、stage、test
* MODULE : 项目appkey
* LOG_PATH : 默认使用 /opt/logs/$MODULE
* TEST_URL : http://localhost:8510/api/monitor/alive
* WORK_PATH : 默认使用 /opt/meituan/meishi/$MODULE
* JAVA_VERSION : 默认使用系统java，填写java7、java8等，需确认/usr/local/$JAVA_VERSION存在

check.sh: 测试TEST_URL是否能正常访问
compile.sh: 按照 ENV 选择 profile 打包工程
manifest.yml: 定义构建、部署所需的工具和环境
run.sh:
* 运行启动流程
* 生成删除历史日志的crontab(见 run.sh 内 init)
* 加载jvm参数，如果项目中 resources/xxx/jetty/boot.ini 有则使用 boot.ini的配置
